package com.example.login;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

//Equivalente ao BancoController
public class PessoaDAO {

    private Conexao c;
    private SQLiteDatabase banco;

    public PessoaDAO(Context context){
        c = new Conexao(context);

    }

    public long insert(Pessoa p){
        banco = c.getWritableDatabase();

        ContentValues inserindo = new ContentValues();

        inserindo.put("nomePessoa", p.getNome());
        inserindo.put("emailPessoa", p.getEmail());
        inserindo.put("telefonePessoa", p.getTelefone());
        inserindo.put("assuntoPessoa", p.getAssunto());
        inserindo.put("MensagemPessoa", p.getMensagem());

        return banco.insert("tbPessoa", null, inserindo);
    }

    public List<Pessoa> listar() {
        banco = c.getWritableDatabase();
        List<Pessoa> pessoas = new ArrayList<>();
        Cursor cursor = banco.query("tbPessoa", new String[] {"idPessoa","nomePessoa", "emailPessoa", "telefonePessoa", "assuntoPessoa", "mensagemPessoa"},
                null, null, null, null, null);

        while (cursor.moveToNext()){
            Pessoa pessoa = new Pessoa();
            pessoa.setId(cursor.getInt(0));
            pessoa.setNome(cursor.getString(1));
            pessoa.setEmail(cursor.getString(2));
            pessoa.setTelefone(cursor.getString(3));
            pessoa.setAssunto(cursor.getString(4));
            pessoa.setMensagem(cursor.getString(5));

            pessoas.add(pessoa);
        }
        return pessoas;
    }

    public void deletar(int id){
        String where = "idPessoa = " + id;
        banco = c.getReadableDatabase();
        banco.delete("tbPessoa", where, null);
        banco.close();
    }
}
