package com.mariana.uri_1164;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void calcular(View view) {

        EditText txtNumero = (EditText) findViewById(R.id.edtNumero);

        TextView txtResultado = (TextView) findViewById(R.id.txtResultado);

        String resultado;

        double numero = Double.parseDouble(txtNumero.getText().toString());

        int soma = 0;

        for(int j = 1; j < numero; j++) {
            if(numero % j == 0) {
                soma += j;
            }
        }
            if(numero == soma) {
                resultado = ("É perfeito");
            }else {
                resultado = ("Não é perfeito");
            }

            txtResultado.setText(resultado);
        }
    }

