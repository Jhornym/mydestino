package com.example.midestino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registro_google extends AppCompatActivity {
Button resgistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_google);
        resgistrar=(Button)findViewById(R.id.buttonR);

        resgistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(registro_google.this, plantilla_tour.class);
                startActivity(intent);
            }
        });
    }
}
