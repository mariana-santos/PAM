package com.mariana.exercicio03;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void verificar(View view) {
        RadioButton rdPotencia = (RadioButton) findViewById(R.id.rdPotencia);
        RadioButton rdFibonacci = (RadioButton) findViewById(R.id.rdFibonacci);
        RadioButton rdFatorial = (RadioButton) findViewById(R.id.rdFatorial);
        TextView txtResultado = (TextView) findViewById(R.id.txtResultado);
        String result = "";

        boolean fatorial = rdFatorial.isSelected();
        boolean potencia = rdPotencia.isSelected();
        boolean fibonacci = rdFibonacci.isSelected();

        if(rdFatorial.isChecked()){
            EditText edtPrimeiroValor = (EditText) findViewById(R.id.edtPrimeiroValor);
            EditText edtSegundoValor = (EditText) findViewById(R.id.edtSegundoValor);
            int n1 = Integer.parseInt(edtPrimeiroValor.getText().toString());
            int n2 = Integer.parseInt(edtSegundoValor.getText().toString());
            int fat = 1, fat2 = 1;
            for(int i = 1; i <= n1; i++){
                fat *= i;
            }
            for(int i = 1; i <= n2; i++){
                fat2 *= i;
            }
            result = "\nFatorial: " + Double.toString(fat)+"\n"+"Fatorial: " + Double.toString(fat2);


        }else if(rdPotencia.isChecked()){
            EditText edtPrimeiroValor = (EditText) findViewById(R.id.edtPrimeiroValor);
            EditText edtSegundoValor = (EditText) findViewById(R.id.edtSegundoValor);
            int n1 = Integer.parseInt(edtPrimeiroValor.getText().toString());
            int n2 = Integer.parseInt(edtSegundoValor.getText().toString());
            double res = Math.pow(n1, n2);
            result = "\nPotência: "+Double.toString(res);


        }else if(rdFibonacci.isChecked()) {
            EditText edtPrimeiroValor = (EditText) findViewById(R.id.edtPrimeiroValor);
            EditText edtSegundoValor = (EditText) findViewById(R.id.edtSegundoValor);
            int n1 = Integer.parseInt(edtPrimeiroValor.getText().toString());
            int n2 = Integer.parseInt(edtSegundoValor.getText().toString());
            int a1 = 0, a2 = 1, a3;
            int vetor[] = new int[n1];
            int vetor2[] = new int[n2];
            String r = "";
            result = "\nFibonacci: ";
            for (int i = 0; i < n1; i++) {
                vetor[i] = a1;
                a3 = a1 + a2;
                a1 = a2;
                a2 = a3;
            }
            a1 = 0; a2 = 1;
            for (int i = 0; i < n2; i++) {
                vetor2[i] = a1;
                a3 = a1 + a2;
                a1 = a2;
                a2 = a3;
            }
            for (int j = 0; j < n1; j++) {
                result += Integer.toString(vetor[j]) + " ";
            }
            result+="\nFibonacci: ";
            for (int j = 0; j < n2; j++) {
                result +=Integer.toString(vetor2[j]) + " ";
            }


        }
            txtResultado.append(result);


    }
}
