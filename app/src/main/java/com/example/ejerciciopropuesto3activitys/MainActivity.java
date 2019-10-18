package com.example.ejerciciopropuesto3activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btActivity1;
    private Button btActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btActivity1 = (Button) findViewById(R.id.btActivity1);
        btActivity2 = (Button) findViewById(R.id.btActivity2);

        btActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity1.class);
            }
        });
    }
}
