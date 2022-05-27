package com.example.midestino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class segumiento_registro extends AppCompatActivity {
Button seguir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segumiento_registro);
        seguir = (Button) findViewById(R.id.buttonR);

        seguir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(segumiento_registro.this, primer_pantalla.class);
                startActivity(intent);
            }
        });
    }
}

