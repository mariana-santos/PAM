package com.mariana.exercicio05;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnVerificarOnClick(View view) {
        CheckBox cbPalmeiras = (CheckBox) findViewById(R.id.cbPalmeiras);
        CheckBox cbCorinthians = (CheckBox) findViewById(R.id.cbCorinthians);
        CheckBox cbSantoAndre = (CheckBox) findViewById(R.id.cbSantoAndre);
        CheckBox cbSantos = (CheckBox) findViewById(R.id.cbSantos);
        CheckBox cbFlamengo = (CheckBox) findViewById(R.id.cbFlamengo);
        String times = null;

        if(cbSantoAndre.isChecked()){
            times = "Santo André\n";
        }
        if(cbPalmeiras.isChecked()){
            times += "Palmeiras\n";
        }
        if(cbCorinthians.isChecked()){
            times += "Corinthians\n";
        }
        if(cbFlamengo.isChecked()){
            times += "Flamengo\n";
        }
        if(cbSantos.isChecked()){
            times += "Santos";
        }
        if(times == null){
            Toast.makeText(this, "Nenhum time selecionado",Toast.LENGTH_LONG).show();
        }else {
            AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
            dialogo.setTitle("Times Selecionados");
            dialogo.setMessage(times);
            dialogo.setNeutralButton("OK", null);
            dialogo.show();
        }
    }
}
