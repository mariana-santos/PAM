package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText edNome;
    public EditText edEmail;
    public EditText edTelefone;
    public EditText edAssunto;
    public EditText edMsg;

    private PessoaDAO PDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PDAO = new PessoaDAO (this);
        edNome = (EditText) findViewById(R.id.edtNome);
        edEmail = (EditText) findViewById(R.id.edtEmail);
        edTelefone = (EditText) findViewById(R.id.edtTelefone);
        edAssunto = (EditText) findViewById(R.id.edtAssunto);
        edMsg = (EditText) findViewById(R.id.edtMsg);
    }

    public void usuarios(View view) {

        if((edNome.getText().toString()).isEmpty() || (edEmail.getText().toString()).isEmpty() ||
            (edAssunto.getText().toString()).isEmpty() || (edMsg.getText().toString()).isEmpty()){
            Toast.makeText(this, "Algum dado inválido. Tente novamente", Toast.LENGTH_LONG).show();
        }else {
            Pessoa people = new Pessoa();

            people.setNome(edNome.getText().toString());
            people.setEmail(edEmail.getText().toString());
            people.setTelefone(edTelefone.getText().toString());
            people.setAssunto(edAssunto.getText().toString());
            people.setMensagem(edMsg.getText().toString());

            long getId = PDAO.insert(people);
            Toast.makeText(this, "Usuário cadastrado com sucesso!", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(this, SelectDados.class);
            startActivity(intent);
        }
    }

    public void verDados(View view) {
        Intent intent = new Intent(this, SelectDados.class);
        startActivity(intent);
    }
}