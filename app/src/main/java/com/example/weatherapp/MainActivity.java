package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button miBoton = findViewById(R.id.button);
        miBoton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "¡Botón presionado!", Toast.LENGTH_SHORT).show();
            }
        });


        Button miBoton2= findViewById(R.id.button2);
        miBoton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Crear un Intent para iniciar la nueva actividad
                Intent intent = new Intent(MainActivity.this, ListActivity.class);
                // Iniciar la nueva actividad
                startActivity(intent);
            }
        });

        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombreCiudad = "Ciudad de Prueba";
                abrirDetailActivity(nombreCiudad);
            }
        });
    }
    private void abrirDetailActivity(String nombreCiudad){
        Intent intent = new Intent(this,DetailActivity.class );
        intent.putExtra("cityName", nombreCiudad);
        startActivity(intent);
    }

}


