package com.example.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class SelectDados extends AppCompatActivity {

    private ListView listview;
    private PessoaDAO dao;
    private List<Pessoa> pessoas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_dados);

        listview = findViewById(R.id.listView);
        dao = new PessoaDAO(this);

        pessoas = dao.listar();

        ArrayAdapter<Pessoa> adapter = new ArrayAdapter <Pessoa> (this, android.R.layout.simple_list_item_1, pessoas);

        listview.setAdapter(adapter);
    }

    public void voltar(View view) {
        finish();
    }

    public void deletar(View view) {
        AlertDialog.Builder mensagem = new AlertDialog.Builder(this);
        mensagem.setTitle("Deletar");
        mensagem.setMessage("Qual o id da linha que deseja deletar?");
        mensagem.setNeutralButton("Cancelar", null);
        final EditText input = new EditText(this);
        input.setRawInputType(InputType.TYPE_CLASS_NUMBER);
        mensagem.setView(input);

        mensagem.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String v = input.getText().toString();
                if(v.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Id informado inválido", Toast.LENGTH_SHORT).show();
                }else {
                    dao = new PessoaDAO(getApplicationContext());
                    int id = Integer.parseInt(input.getText().toString());
                    dao.deletar(id);
                    pessoas = dao.listar();
                    ArrayAdapter<Pessoa> adapter = new ArrayAdapter<Pessoa>(getApplicationContext(), android.R.layout.simple_list_item_1, pessoas);
                    listview.setAdapter(adapter);
                }
           }
        });
        mensagem.show();
    }
}