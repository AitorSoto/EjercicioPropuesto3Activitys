package com.example.ejerciciopropuesto3activitys;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity1 extends AppCompatActivity implements View.OnClickListener {

    private ImageButton btAtras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        getSupportActionBar().hide();

        btAtras = (ImageButton) findViewById(R.id.btAtras);
        btAtras.setOnClickListener(this);
        Toast.makeText(getApplicationContext(), "Activity iniciada desde "+getIntent().getStringExtra("Salida"), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        this.finish();
    }
}
