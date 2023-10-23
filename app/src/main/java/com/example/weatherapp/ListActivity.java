package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // Lista de ciudades
        String[] ciudades = {"Barcelona", "New York", "Buenos Aires", "Cairo", "Auckland"};

        // Crear un adaptador para la ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ciudades);

        // Obtener la referencia de la ListView desde el archivo XML
        ListView listView = findViewById(R.id.listView);

        // Configurar el adaptador para la ListView
        listView.setAdapter(adapter);
    }
}