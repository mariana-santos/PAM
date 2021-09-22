package com.mariana.uri1012;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view) {
        EditText numeroA = (EditText) findViewById(R.id.numeroA);
        EditText numeroB = (EditText) findViewById(R.id.numeroB);
        EditText numeroC = (EditText) findViewById(R.id.numeroC);

        double a = Double.parseDouble(numeroA.getText().toString());
        double b = Double.parseDouble(numeroB.getText().toString());
        double c = Double.parseDouble(numeroC.getText().toString());

        double qua = b * b;
        double ret = a * b;
        double cir = 3.14159 * (c * c);
        double tri = (a * c)/2;
        double tra = (a + b) / 2 *  c;

        String trian = Double.toString(tri);
        String circ = Double.toString(cir);
        String trap = Double.toString(tra);
        String quad = Double.toString(qua);
        String retan = Double.toString(ret);

        trian = String.format("%.3f", (tri));
        circ = String.format("%.3f", (cir));
        trap = String.format("%.3f", (tra));
        quad = String.format("%.3f", (qua));
        retan = String.format("%.3f", (ret));

        TextView txtTri = (TextView) findViewById(R.id.txtTri);
        TextView txtCirc = (TextView) findViewById(R.id.txtCir);
        TextView txtTrap = (TextView) findViewById(R.id.txtTrap);
        TextView txtQuad = (TextView) findViewById(R.id.txtQuad);
        TextView txtRetan = (TextView) findViewById(R.id.txtRet);

        String Resultado = trian + circ + trap + quad + retan;

        txtTri.setText("Triângulo: " + trian);
        txtCirc.setText("Círculo: " + circ);
        txtTrap.setText("Trapézio: " + trap);
        txtQuad.setText("Quadrado: " + quad);
        txtRetan.setText("Retângulo: " + retan);

    }

    public void mostrar(View view) {
        TextView txtEnunciado = (TextView) findViewById(R.id.txtEnunciado);
        txtEnunciado.setText("Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:\n" +
                "a) a área do triângulo retângulo que tem A por base e C por altura.\n" +
                "b) a área do círculo de raio C. (pi = 3.14159)\n" +
                "c) a área do trapézio que tem A e B por bases e C por altura.\n" +
                "d) a área do quadrado que tem lado B.\n" +
                "e) a área do retângulo que tem lados A e B.");
    }
}
