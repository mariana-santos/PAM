package com.example.gastos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    static double sal = 1500;
    static double saldo = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView txvSalario = (TextView) findViewById(R.id.salario);
        TextView txvSaldo = (TextView) findViewById(R.id.saldo);

        txvSalario.setText("R$ "+String.valueOf(sal) + "0");
        txvSaldo.setText("R$ "+String.valueOf(saldo) + "0");
    }

    public void goHome(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void goAdd(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void goConfig(View view) {
        Intent intent = new Intent(this, Config.class);
        startActivity(intent);
    }
}