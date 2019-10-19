package com.example.ejerciciopropuesto3activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btActivity1;
    private Button btActivity2;
    private TextView tvTexto;
    int requestCode = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        getSupportActionBar().hide();

        btActivity1 = (Button) findViewById(R.id.btActivity1);
        btActivity2 = (Button) findViewById(R.id.btActivity2);
        tvTexto = (TextView) findViewById(R.id.tvTexto);

        btActivity1.setOnClickListener(this); // Da de alta la clase en el Manifest
        btActivity2.setOnClickListener(this);
    }

    public void onClick(View view){
        if (view.getId() == R.id.btActivity1) {
            Intent intent = new Intent(this, Activity1.class);
            intent.putExtra("Salida", "Activity principal");
            startActivityForResult(intent, requestCode);
        } else{
            Intent intent = new Intent(this, Activity2.class);
            intent.putExtra("Salida", "Activity principal");
            startActivityForResult(intent, requestCode);
        }
    }

    public void onActivityResult (int codActividad, int codResultado, Intent datos) {
        super.onActivityResult(codActividad, codResultado, datos);
        if (codResultado == RESULT_OK){
            tvTexto.setVisibility(View.VISIBLE);
            tvTexto.setText("Volviendo de "+datos.getDataString() +
                    " con mensaje --> Finalizada " + datos.getDataString());
        }
    }
}
