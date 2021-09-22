package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Usuarios extends AppCompatActivity {

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuarios);

        TextView txvNome = (TextView) findViewById(R.id.nome);
        TextView txvEmail = (TextView) findViewById(R.id.email);
        TextView txvTelefone = (TextView) findViewById(R.id.telefone);
        TextView txvAssunto = (TextView) findViewById(R.id.assunto);
        TextView txvMensagem = (TextView) findViewById(R.id.mensagem);

        txvNome.setText(getIntent().getStringExtra("nome"));
        txvEmail.setText(getIntent().getStringExtra("email"));
        txvTelefone.setText(getIntent().getStringExtra("telefone"));
        txvAssunto.setText(getIntent().getStringExtra("assunto"));
        txvMensagem.setText(getIntent().getStringExtra("mensagem"));
    }

    public void voltar(View view) {
        finish();
    }
}
