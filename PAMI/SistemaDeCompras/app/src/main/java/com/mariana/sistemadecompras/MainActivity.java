package com.mariana.sistemadecompras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view) {

        CheckBox cbEmilia = (CheckBox) findViewById(R.id.cbEmilia);
        CheckBox cbXuxa= (CheckBox) findViewById(R.id.cbXuxa);
        CheckBox cbBola = (CheckBox) findViewById(R.id.cbBola);
        CheckBox cbCorda = (CheckBox) findViewById(R.id.cbCorda);
        CheckBox cbLego = (CheckBox) findViewById(R.id.cbLego);
        TextView txtResultado = (TextView) findViewById(R.id.Total);

        double total = 0;

        if(cbBola.isChecked()){
            total += 15.75;
        }
        if (cbCorda.isChecked()){
            total += 10.69;
        }
        if(cbEmilia.isChecked()){
            total += 39.99;
        }
        if(cbLego.isChecked()){
            total += 29.9;
        }
        if(cbXuxa.isChecked()){
            total += 27.5;
        }

        String valorTotal = String.format("Total: R$ %.2f", total);
        txtResultado.setText(valorTotal);
    }
}
