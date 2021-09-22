package com.mariana.exercicio04;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void novoSalario(View view) {
        EditText edtSalario = (EditText) findViewById(R.id.edtSalario);
        RadioGroup rdgOpcao = (RadioGroup) findViewById(R.id.rdgOpcao);
        RadioButton rb40 = (RadioButton) findViewById(R.id.rb40);
        RadioButton rb45 = (RadioButton) findViewById(R.id.rb45);
        RadioButton rb50 = (RadioButton) findViewById(R.id.rb50);
        String sal = edtSalario.getText().toString();
        double salario = Double.parseDouble(edtSalario.getText().toString());
        double newSalario;

        if(sal.isEmpty()){
            AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
            dialogo.setNeutralButton("OK", null);
            dialogo.setMessage("Digite um salário antes");
            dialogo.show();
        }else{
            if(rb40.isChecked()){
                newSalario = salario + (salario * 0.4);
                String newSalarioStr = String.valueOf(newSalario);
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setNeutralButton("OK", null);
                dialogo.setTitle("Novo salário");
                dialogo.setMessage("Salário com acréscimo de 40%: "+newSalarioStr);
                dialogo.show();
            }else if(rb45.isChecked()){
                newSalario = salario + (salario * 0.45);
                String newSalarioStr = String.valueOf(newSalario);
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setNeutralButton("OK", null);
                dialogo.setTitle("Novo salário");
                dialogo.setMessage("Salário com acréscimo de 45%: "+newSalarioStr);
                dialogo.show();
            }else if(rb50.isChecked()){
                newSalario = salario + (salario * 0.5);
                String newSalarioStr = String.valueOf(newSalario);
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setNeutralButton("OK", null);
                dialogo.setTitle("Novo salário");
                dialogo.setMessage("Salário com acréscimo de 50%: "+newSalarioStr);
                dialogo.show();
            }else{
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setNeutralButton("OK", null);
                dialogo.setMessage("Selecione uma opção");
                dialogo.show();
            }
        }
    }
}
