package com.example.controleg;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class GastoDAO {

    private Conexao c;
    private SQLiteDatabase banco;

    public GastoDAO(Context context){
        c = new Conexao(context);
    }

    public long insert(Gasto gasto){
        banco = c.getWritableDatabase();

        ContentValues inserindo = new ContentValues();

        inserindo.put("tituloGasto", gasto.getTitulo());
        inserindo.put("descGasto", gasto.getDescricao());
        inserindo.put("valorGasto", gasto.getValor());
        inserindo.put("dataGasto", gasto.getData());

        return banco.insert("tbGasto", null, inserindo);

    }
}
