# Ud4_Ejemplo1
_Ejemplo 1 de la Unidad 4._ 

Vamos a realizar _View Recycling_ haciendo uso de _ListView_ y _ArrayAdapter_ para mostrar una lista de  _Strings_ con algunos de los vehículos
 (coches, naves, etc.) más famosos de películas y series.

Para ello sólo hemos de ver los ficheros _activity_main.xml_ y _MainActivity.java_.

## _activity_main.xml_
Creamos el ListView y le asignamos su _id_:
```
<ListView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/lista"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp"
    tools:context=".MainActivity">

</ListView>
```

## _MainActivity.java_
Creamos un ArrayList de Strings para mostrar el nombre de los vehículos y posteriormente creamos el ArrayAdapter, al que le pasamos
el contexto, el _layout_ que ofrece Android para mostrar un solo elemento en cada posición de la lista: _R.layout.simple_list_item_1_ 
y el ArrayList de vehículos.

Finalmente buscamos la lista y le asignamos el Arrayadapter creado.

```
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
```
