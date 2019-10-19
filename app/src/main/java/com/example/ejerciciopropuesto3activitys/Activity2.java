package com.example.ejerciciopropuesto3activitys;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Activity2 extends AppCompatActivity implements View.OnClickListener{

    private ImageButton btAtras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        getSupportActionBar().hide();

        btAtras = (ImageButton) findViewById(R.id.btAtras);
        btAtras.setOnClickListener(this);
        Toast.makeText(getApplicationContext(), "Activity 2 iniciada desde " + getIntent().getStringExtra("Salida"), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("Activity 2"));
        setResult(RESULT_OK, intent);
        this.finish();
    }
}
