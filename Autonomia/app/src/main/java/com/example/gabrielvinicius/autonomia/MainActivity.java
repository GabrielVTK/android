package com.example.gabrielvinicius.autonomia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {

        if(Abastecimento.lista.size() > 0) {

            TextView tvAutonomia = (TextView) findViewById(R.id.tvAutonomia);

            float kmPercorrido = 0, litros = 0;

            for(Abastecimento a : Abastecimento.lista) {
                litros += a.getLitros();
            }

            kmPercorrido = Abastecimento.lista.get(Abastecimento.lista.size() - 1).getQuilometragem();

            float autonomia = kmPercorrido / litros;

            Log.d("RV", kmPercorrido + " - " + litros);

            tvAutonomia.setText(String.format("%.2f", autonomia));
        }

        super.onResume();
    }

    public void abrirCadastro(View quemClicou) {
        Intent intencao = new Intent(getApplicationContext(), CadastroActivity.class);
        startActivity(intencao);
    }

    public void abrirLista(View quemClicou) {
        Intent intencao = new Intent(getApplicationContext(), ListaActivity.class);
        startActivity(intencao);
    }

}
