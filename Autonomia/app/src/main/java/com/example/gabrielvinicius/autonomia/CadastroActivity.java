package com.example.gabrielvinicius.autonomia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void cadastrar(View view) {

        EditText km = (EditText) findViewById(R.id.etKm);
        EditText litros = (EditText) findViewById(R.id.etLitros);
        EditText data = (EditText) findViewById(R.id.etData);
        Spinner posto = (Spinner) findViewById(R.id.spinner);

        if(km.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Digite a quantidade de quilometros percorridos!", Toast.LENGTH_LONG).show();
            return;
        }

        if(Abastecimento.lista.size() > 0 && Abastecimento.lista.get(Abastecimento.lista.size() - 1).getQuilometragem() >= Float.parseFloat(km.getText().toString())) {
            Toast.makeText(getApplicationContext(), "A quilometragem deve ser maior que a do último abastecimento!", Toast.LENGTH_LONG).show();
            return;
        }

        if(litros.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Digite a quantidade de litros abastecidos!", Toast.LENGTH_LONG).show();
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        try {
            sdf.parse(data.getText().toString());
        } catch(ParseException e) {
            Toast.makeText(getApplicationContext(), "Data invalida!", Toast.LENGTH_LONG).show();
            return;
        }

        if(posto.getSelectedItemId() == 0) {
            Toast.makeText(getApplicationContext(), "Selecione um posto para o cadastramento!", Toast.LENGTH_LONG).show();
            return;
        }

        Abastecimento abastecimento = new Abastecimento(data.getText().toString(), Float.parseFloat(km.getText().toString()), Float.parseFloat(litros.getText().toString()), posto.getSelectedItem().toString());

        Abastecimento.lista.add(abastecimento);
        finish();
    }

}
