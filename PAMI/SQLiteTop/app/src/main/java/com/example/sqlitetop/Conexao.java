package com.example.sqlitetop;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Conexao extends SQLiteOpenHelper {

    public static final String name = "bdPessoa.db";
    public static final int version = 1;

    public Conexao(@Nullable Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("" +
                "CREATE TABLE tbPessoa (" +
                    "idPessoa integer primary key autoincrement," +
                    "nomePessoa Varchar(40) not null," +
                    "emailPessoa Varchar(60) not null," +
                    "telefonePessoa Varchar(14) not null," +
                    "assuntoPessoa Varchar(50) not null," +
                    "mensagemPessoa Varchar(30) not null" +
                    ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
