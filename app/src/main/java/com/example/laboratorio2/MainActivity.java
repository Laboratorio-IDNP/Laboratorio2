package com.example.laboratorio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText pa, ma, nom, fec, col, carr;
    String pos;
    ArrayList<String>array = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registrar(View v){
        pa = (EditText) findViewById(R.id.paterno);
        ma = (EditText) findViewById(R.id.materno);
        nom = (EditText) findViewById(R.id.nombres);
        fec = (EditText) findViewById(R.id.fecha);
        col = (EditText) findViewById(R.id.colegio);
        carr = (EditText) findViewById(R.id.carrera);

        pos = pa.getText().toString().trim()+" "+ma.getText().toString().trim()+" "+nom.getText().toString().trim()+" "+fec.getText().toString().trim()+" "+col.getText().toString().trim()+" "+carr.getText().toString().trim();
        array.add(pos);

        Toast toast = Toast.makeText(this, "Registro guardado", Toast.LENGTH_LONG);
        toast.show();

        pa.setText("");
        ma.setText("");
        nom.setText("");
        fec.setText("");
        col.setText("");
        carr.setText("");
    }

    public void listar(View v){
        for(int i=0;i<array.size();i++) {
            Log.i("Postulante "+(i+1)+": ", (String) array.get(i).toString());
        }
    }
}