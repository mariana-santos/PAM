package com.mariana.exercicio01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void btnMaisOnClick(View view) {
        EditText etPrimeiroValor = (EditText) findViewById(R.id.etPrimeiroValor);
        double primeiroValor = Double.parseDouble(etPrimeiroValor.getText().toString());
        EditText etSegundoValor = (EditText) findViewById(R.id.etSegundoValor);
        double segundoValor = Double.parseDouble(etSegundoValor.getText().toString());
        AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
        dialogo.setTitle("Resultado: ");
        dialogo.setMessage(primeiroValor + " + " + segundoValor + " = " + (primeiroValor + segundoValor));
        dialogo.setNeutralButton("OK", null);

        dialogo.show();
    }

    public void btnMenosOnClick(View view) {
        EditText etPrimeiroValor = (EditText) findViewById(R.id.etPrimeiroValor);
        double primeiroValor = Double.parseDouble(etPrimeiroValor.getText().toString());
        EditText etSegundoValor = (EditText) findViewById(R.id.etSegundoValor);
        double segundoValor = Double.parseDouble(etSegundoValor.getText().toString());
        AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
        dialogo.setTitle("Resultado: ");
        dialogo.setMessage(primeiroValor + " - " + segundoValor + " = " + (primeiroValor - segundoValor));
        dialogo.setNeutralButton("OK", null);

        dialogo.show();
    }

    public void btnVezesOnClick(View view) {
        EditText etPrimeiroValor = (EditText) findViewById(R.id.etPrimeiroValor);
        double primeiroValor = Double.parseDouble(etPrimeiroValor.getText().toString());
        EditText etSegundoValor = (EditText) findViewById(R.id.etSegundoValor);
        double segundoValor = Double.parseDouble(etSegundoValor.getText().toString());
        AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
        dialogo.setTitle("Resultado: ");
        dialogo.setMessage(primeiroValor + " x " + segundoValor + " = " + (primeiroValor * segundoValor));
        dialogo.setNeutralButton("OK", null);

        dialogo.show();
    }

    public void btnDividirOnClick(View view) {
        EditText etPrimeiroValor = (EditText) findViewById(R.id.etPrimeiroValor);
        double primeiroValor = Double.parseDouble(etPrimeiroValor.getText().toString());
        EditText etSegundoValor = (EditText) findViewById(R.id.etSegundoValor);
        double segundoValor = Double.parseDouble(etSegundoValor.getText().toString());
        AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
        dialogo.setTitle("Resultado: ");
        dialogo.setMessage(primeiroValor + " / " + segundoValor + " = " + (primeiroValor / segundoValor));
        dialogo.setNeutralButton("OK", null);

        dialogo.show();
    }
}
