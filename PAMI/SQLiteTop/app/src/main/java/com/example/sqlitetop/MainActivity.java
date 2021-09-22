package com.example.sqlitetop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edNome = (EditText) findViewById(R.id.edtNome);
    EditText edEmail = (EditText) findViewById(R.id.edtEmail);
    EditText edTelefone = (EditText) findViewById(R.id.edtTelefone);
    EditText edAssunto = (EditText) findViewById(R.id.edtAssunto);
    EditText edMsg = (EditText) findViewById(R.id.edtMsg);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviar(View view) {

        Pessoa people = new Pessoa();
        PessoaDAO PDAO = new PessoaDAO(this);

        people.setNome(edNome.getText().toString());
        people.setEmail(edEmail.getText().toString());
        people.setTelefone(edTelefone.getText().toString());
        people.setAssunto(edAssunto.getText().toString());
        people.setMensagem(edMsg.getText().toString());

        long getId = PDAO.insert(people);
        Toast.makeText(this, (int) getId, Toast.LENGTH_LONG).show();
    }
}