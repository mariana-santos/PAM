package com.example.gastos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Config extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);
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

    public void Salvar(View view) {
        EditText cat = (EditText) findViewById(R.id.edtCategoria);
        EditText sal = (EditText) findViewById(R.id.edtSal);
        double salario = Double.parseDouble(sal.getText().toString());

        if(cat.getText().toString().trim().equals("")){
        }else{
            MainActivity.arrayList.add(cat.getText().toString());
        }

        if(salario != 1500 && salario >= 0){
            Home.sal = salario;
            Home.saldo = salario;
        }
    }
}