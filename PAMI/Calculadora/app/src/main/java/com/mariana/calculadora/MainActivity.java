package com.mariana.calculadora;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void multiplicar(View view) {
        EditText PrimeiroValor = (EditText) findViewById(R.id.edtPrimeiroValor);
        EditText SegundoValor = (EditText) findViewById(R.id.edtSegundoValor);

        double v1 = Double.parseDouble(PrimeiroValor.getText().toString());
        double v2 = Double.parseDouble(SegundoValor.getText().toString());

        double r = v1 * v2;
        String resultado = String.format(v1 + " X " + v2 + " = " + "%.2f", r);

        AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
        dialogo.setTitle("Resultado");
        dialogo.setMessage(resultado);
        dialogo.setNeutralButton("OK", null);
        dialogo.show();
    }
    public void dividir(View view) {
        EditText PrimeiroValor = (EditText) findViewById(R.id.edtPrimeiroValor);
        EditText SegundoValor = (EditText) findViewById(R.id.edtSegundoValor);

        double v1 = Double.parseDouble(PrimeiroValor.getText().toString());
        double v2 = Double.parseDouble(SegundoValor.getText().toString());

        double r = v1 / v2;

        String resultado = String.format(v1 + " / " + v2 + " = " + "%.2f", r);

        AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
        dialogo.setTitle("Resultado");
        dialogo.setMessage(resultado);
        dialogo.setNeutralButton("OK", null);
        dialogo.show();
    }
    public void somar(View view) {
        EditText PrimeiroValor = (EditText) findViewById(R.id.edtPrimeiroValor);
        EditText SegundoValor = (EditText) findViewById(R.id.edtSegundoValor);

        double v1 = Double.parseDouble(PrimeiroValor.getText().toString());
        double v2 = Double.parseDouble(SegundoValor.getText().toString());

        double r = v1 + v2;
        String resultado = String.format(v1 + " + " + v2 + " = " + "%.2f", r);

        AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
        dialogo.setTitle("Resultado");
        dialogo.setMessage(resultado);
        dialogo.setNeutralButton("OK", null);
        dialogo.show();
    }
    public void subtrair(View view) {
        EditText PrimeiroValor = (EditText) findViewById(R.id.edtPrimeiroValor);
        EditText SegundoValor = (EditText) findViewById(R.id.edtSegundoValor);

        double v1 = Double.parseDouble(PrimeiroValor.getText().toString());
        double v2 = Double.parseDouble(SegundoValor.getText().toString());

        double r = v1 - v2;

        String resultado = String.format(v1 + " - " + v2 + " = " + "%.2f", r);

        AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
        dialogo.setTitle("Resultado");
        dialogo.setMessage(resultado);
        dialogo.setNeutralButton("OK", null);
        dialogo.show();

    }
}
