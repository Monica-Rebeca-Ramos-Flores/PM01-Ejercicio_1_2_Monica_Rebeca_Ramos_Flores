package com.aplicacion.pm01_ejercicio12_monicarebecaramosflores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView txtNombres, txtApellidos, txtEdad, txtCorreo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtNombres = findViewById(R.id.text_nombres);
        txtApellidos = findViewById(R.id.text_apellidos);
        txtEdad = findViewById(R.id.text_edad);
        txtCorreo = findViewById(R.id.text_correo);

        String data1 = getIntent().getStringExtra("keyname");
        String data2 = getIntent().getStringExtra("keyfirstname");
        String data3 = getIntent().getStringExtra("keyage");
        String data4 = getIntent().getStringExtra("keyemail");

        txtNombres.setText(data1);
        txtApellidos.setText(data2);
        txtEdad.setText(data3);
        txtCorreo.setText(data4);
    }
    //Metodo para el boton Regresar
    public void Regresar(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}