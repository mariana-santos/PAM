package com.example.gastos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Conexao extends SQLiteOpenHelper {

    private static final String name = "bdControleDeGasto.db";
    private static final int version = 1;

    public Conexao(@Nullable Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE tbGasto (" +
                "idGasto integer primary key autoincrement, " +
                "tituloGasto Varchar(40) not null, " +
                "descGasto Varchar(60) not null," +
                "valorGasto varchar (30) not null," +
                "dataGasto varchar (10) not null) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
