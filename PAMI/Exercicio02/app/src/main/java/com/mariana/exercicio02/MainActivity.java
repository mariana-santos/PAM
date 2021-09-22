package com.mariana.exercicio02;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnVerificarOnClick(View view) {
       EditText etNome = (EditText) findViewById(R.id.etNome);
       EditText etIdade = (EditText) findViewById(R.id.etIdade);
       RadioButton rbFeminino = (RadioButton) findViewById(R.id.rbFeminino);
       RadioButton rbMasculino = (RadioButton) findViewById(R.id.rbMasculino);
       String nome = etNome.getText().toString();
       int idade = Integer.parseInt(etIdade.getText().toString());
       String sexo;
       if(rbFeminino.isChecked()){
           sexo = "Feminino";
       }else if (rbMasculino.isChecked()){
           sexo = "Masculino";
       }else{
           sexo = "Não selecionado";
           Toast.makeText(this, "Selecione um sexo", Toast.LENGTH_LONG);
       }
       AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
       dialogo.setTitle("Suas informações: ");
       dialogo.setMessage("Nome: "+nome+"\nIdade: "+idade+"\nSexo: "+sexo);
       dialogo.setNeutralButton("OK", null);
       dialogo.show();
    }
}
