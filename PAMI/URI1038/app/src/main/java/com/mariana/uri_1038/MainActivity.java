package com.mariana.uri_1038;

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

        EditText edtQtd = (EditText) findViewById(R.id.edtQuantidade);
        EditText edtCod = (EditText) findViewById(R.id.edtCod);

        int qtd = Integer.parseInt(edtQtd.getText().toString());
        int cod = Integer.parseInt(edtCod.getText().toString());

        double total;
        String valorFinal;
        switch (cod){
            case 1:
                total = qtd * 4;
                valorFinal = String.format("Total: R$ %.2f\n", total);
                break;

            case 2:
                total = qtd * 4.5;
                valorFinal = String.format("Total: R$ %.2f\n", total);
                break;
            case 3:
                total = qtd * 5;
                valorFinal = String.format("Total: R$ %.2f\n", total);
                break;
            case 4:
                total = qtd * 2;
                valorFinal = String.format("Total: R$ %.2f\n", total);
                break;
            case 5:
                total = qtd * 1.5;
                valorFinal = String.format("Total: R$ %.2f\n", total);
                break;
            default:
                valorFinal = ("Código invalido");
                break;
        }

        TextView txtValorFinal = (TextView) findViewById(R.id.txtValorFinal);

        txtValorFinal.setText(valorFinal);
    }
}
