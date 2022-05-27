package com.example.midestino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Registro extends AppCompatActivity {
    Button iniciar_con_facebook;
    Button iniciar_con_google;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        iniciar_con_facebook = (Button) findViewById(R.id.buttonFac);

        iniciar_con_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Registro.this, segumiento_registro.class);
                startActivity(intent);
            }
        });
        iniciar_con_google = (Button) findViewById(R.id.buttonGoogle);

        iniciar_con_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Registro.this, registro_google.class);
                startActivity(intent);
            }
        });
    }
}


