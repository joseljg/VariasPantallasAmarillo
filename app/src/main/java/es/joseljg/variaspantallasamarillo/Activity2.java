package es.joseljg.variaspantallasamarillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import es.joseljg.variaspantallasamarillo.clases.Ciudad;

public class Activity2 extends AppCompatActivity {

    TextView txt_recibido = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        //------------------------------------------------------------
        txt_recibido = (TextView) findViewById(R.id.txt_recibido);
        //------------------------------------------------------------
        Intent intent = getIntent();
      //  String nombre = intent.getStringExtra(MainActivity.EXTRA_NOMBRE);
      //  int habitantes = intent.getIntExtra(MainActivity.EXTRA_HABITANTES, 0);
    //  Bundle extras = intent.getExtras();
     // String nombre = extras.getString(MainActivity.EXTRA_NOMBRE);
    // int habitantes = extras.getInt(MainActivity.EXTRA_HABITANTES);
        Ciudad c = (Ciudad) intent.getSerializableExtra(MainActivity.EXTRA_OBJETO_CIUDAD);
        String nombre = c.getNombre();
        int habitantes = c.getHabitantes();
        //----------------------------------------------------------------
        String textorecibido = "nombre: " + nombre + "\n" + "habitantes" + String.valueOf(habitantes);
        txt_recibido.setText(textorecibido);
    }

    public void cerrar(View view) {
        finish();
    }
}