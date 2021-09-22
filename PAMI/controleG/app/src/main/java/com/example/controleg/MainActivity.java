package com.example.controleg;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static Spinner spinner;
//    static List<String> categorias;

    public static ArrayList<String> listaCategorias = new ArrayList<>();
    public static String[] categorias;
    public static ArrayList<String> arrayList;
    public static int i = 7;

    EditText edTitulo;
    EditText edDescricao;
    EditText edValor;
    EditText edData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edTitulo = findViewById(R.id.edtTit);
        edDescricao = findViewById(R.id.edtDesc);
        edValor = findViewById(R.id.edtValor);
        edData = findViewById(R.id.edtData);

        spinner = (Spinner) findViewById(R.id.spnCategoria);
        categorias = new String[]{"Moradia", "Alimentação", "Saúde", "Educação", "Transporte", "Lazer", "Celular/TV/Internet"};
        //categorias = new String[]{, , , , , , };
//
//        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categorias );
//        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//        spinner.setAdapter(dataAdapter);

        arrayList = new ArrayList<>();
        arrayList.add("Moradia");
        arrayList.add("Alimentação");
        arrayList.add("Saúde");
        arrayList.add("Educação");
        arrayList.add("Transporte");
        arrayList.add("Lazer");
        arrayList.add("Celular/TV/Internet");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
    }

    public void addDespesa(View view) {

        Gasto gasto = new Gasto();
        GastoDAO GDAO = new GastoDAO(this);

        gasto.setTitulo(edTitulo.getText().toString());
        gasto.setDescricao(edDescricao.getText().toString());
        gasto.setValor(edValor.getText().toString());
        gasto.setData(edData.getText().toString());

        long getId = GDAO.insert(gasto);
        Toast.makeText(this, String.valueOf(getId), Toast.LENGTH_LONG).show();

    }

    public void goHome(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void goAdd(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void goConfig(View view) {
        Intent intent = new Intent(this, Config.class);
        startActivity(intent);
    }
}