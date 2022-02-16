package com.aplicacion.pm01_ejercicio12_monicarebecaramosflores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombres, txtApellidos, txtEdad, txtCorreo;
    private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombres = findViewById(R.id.txtNombres);
        txtApellidos = findViewById(R.id.txtApellidos);
        txtEdad = findViewById(R.id.txtEdad);
        txtCorreo = findViewById(R.id.txtCorreo);
        enviar = findViewById(R.id.btnEnviar);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String data1 = txtNombres.getText().toString();
                String data2 = txtApellidos.getText().toString();
                String data3 = txtEdad.getText().toString();
                String data4 = txtCorreo.getText().toString();

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("keyname",data1);
                intent.putExtra("keyfirstname",data2);
                intent.putExtra("keyage",data3);
                intent.putExtra("keyemail",data4);
                startActivity(intent);
            }
        });
    }
}