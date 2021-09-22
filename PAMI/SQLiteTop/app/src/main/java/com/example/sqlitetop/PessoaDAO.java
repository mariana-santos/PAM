package com.example.sqlitetop;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class PessoaDAO {

    private Conexao c;
    private SQLiteDatabase banco;

    public PessoaDAO(Context context){
        c = new Conexao(context);
        banco = c.getWritableDatabase();
    }
    public long insert(Pessoa p){
        ContentValues inserindo = new ContentValues();

        inserindo.put("nomePessoa", p.getNome());
        inserindo.put("emailPessoa", p.getEmail());
        inserindo.put("telefonePessoa", p.getTelefone());
        inserindo.put("assuntoPessoa", p.getAssunto());
        inserindo.put("MensagemPessoa", p.getMensagem());


        return banco.insert("tbPessoa", null, inserindo);

    }
}
