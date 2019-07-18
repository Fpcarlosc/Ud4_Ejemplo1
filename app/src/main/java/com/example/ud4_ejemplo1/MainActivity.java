package com.example.ud4_ejemplo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creamos el array de vehiculos.
        ArrayList<String> vehiculos = new ArrayList<>();

        vehiculos.add("Ecto1");
        vehiculos.add("DeLorean");
        vehiculos.add("Kitt");
        vehiculos.add("Halcón Milenario");
        vehiculos.add("Planet Express");
        vehiculos.add("TARDIS");
        vehiculos.add("USS Enterprise");
        vehiculos.add("Nabucodonosor");
        vehiculos.add("Odiseus");
        vehiculos.add("Nostromo");

        // Creamos el ArrayAdapter de Strings en el que usamos el layout que ofrece Android para mostrar un solo elemento
        ArrayAdapter<String> elementos = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, vehiculos);

        // Buscamos la lista y le asignamos el ArrayAdapter
        ListView lista = findViewById(R.id.lista);

        lista.setAdapter(elementos);

    }
}
