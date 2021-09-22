package com.example.login;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import
        android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Conexao extends SQLiteOpenHelper
{

    private static final String name = "bdPessoa.db";
    private static final int version = 7;

    public Conexao(@Nullable Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE tbPessoa (" +
                "idPessoa integer primary key autoincrement," +
                "nomePessoa Varchar(40) not null," +
                "emailPessoa Varchar(60) not null," +
                "telefonePessoa Varchar(14) not null," +
                "assuntoPessoa Varchar(50) not null," +
                "mensagemPessoa Varchar(30) not null" + ")");
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String sql = "drop table if exists tbPessoa";
        db.execSQL(sql);
        onCreate(db);
    }
}
