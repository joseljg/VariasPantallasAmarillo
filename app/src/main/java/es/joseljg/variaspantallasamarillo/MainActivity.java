package es.joseljg.variaspantallasamarillo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NOMBRE = "es.joseljg.MainActivity.nombre" ;
    public static final String EXTRA_HABITANTES = "es.joselg.MainActivity.habitantes";
    EditText edtnombre = null;
    EditText edthabitantes = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtnombre = findViewById(R.id.edt_nombre);
        edthabitantes = findViewById(R.id.edt_habitantes);
    }

    public void irAlActivity2(View view) {

        String nombre = String.valueOf(edtnombre.getText());
        int habitantes = Integer.valueOf(String.valueOf(edthabitantes.getText()));

        Intent intent = new Intent(this,Activity2.class);
        intent.putExtra(EXTRA_NOMBRE, nombre);
        intent.putExtra(EXTRA_HABITANTES, habitantes);
        startActivity(intent);

    }
}