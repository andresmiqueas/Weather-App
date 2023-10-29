package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {


    private TextView cityNameTextView;
    private TextView currentTemperatureTextView;
    private TextView descriptionClimaTextView;
    private TextView minTemperatureTextView;
    private TextView maxTemperatureTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Intent intent = getIntent();
        String cityName = intent.getStringExtra("cityName");
        String currentTemperature = "20ºC";
        String weatherDescription = "Soleado";
        String minTemperature = "15ºC";
        String maxTemperature = "25ºC";



        cityNameTextView = findViewById(R.id.NombreCiudad);
        currentTemperatureTextView = findViewById(R.id.TemperaturaActual);
        descriptionClimaTextView = findViewById(R.id.DescripcionClima);
        minTemperatureTextView = findViewById(R.id.TemperaturaMinima);
        maxTemperatureTextView = findViewById(R.id.TemperaturaMaxima);


        cityNameTextView.setText("Nombre de la ciudad: " + cityName);
        currentTemperatureTextView.setText("Temperatura actual: " + currentTemperature);
        descriptionClimaTextView.setText("Descripcion del clima: " + weatherDescription);
        minTemperatureTextView.setText("Temperatura Minima: " + minTemperature);
        maxTemperatureTextView.setText("Temperatura Maxima: " + maxTemperature);


    }
}