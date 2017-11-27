package com.example.gabrielvinicius.autonomia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        RecyclerView rvLista = (RecyclerView) findViewById(R.id.rvLista);
        AbastecimentoAdapter adaptador = new AbastecimentoAdapter();
        adaptador.setLista( Abastecimento.lista );
        rvLista.setLayoutManager(new LinearLayoutManager(this.getApplicationContext()));
        rvLista.setAdapter( adaptador );
    }
}
