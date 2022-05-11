package com.example.appvideojuegos;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Pant2Activity extends AppCompatActivity {
    private TextView txtDatos;
    private Videojuego objVideojuego;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pant2);
        txtDatos = findViewById(R.id.txtDatos);
        formarObjeto();
        mostrarDatos();
    }

    private void mostrarDatos() {
        txtDatos.setText(objVideojuego.toString());
    }

    private void formarObjeto() {
        objVideojuego = (Videojuego) this.getIntent().getExtras().getSerializable("videojuego_objeto");
    }
}
