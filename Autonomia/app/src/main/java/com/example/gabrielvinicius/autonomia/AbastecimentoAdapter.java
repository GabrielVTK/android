package com.example.gabrielvinicius.autonomia;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Gabriel Vinicius on 26/11/2017.
 */

public class AbastecimentoAdapter extends RecyclerView.Adapter {

    private ArrayList<Abastecimento> lista;

    public void setLista(ArrayList<Abastecimento> lista) {
        this.lista = lista;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista, parent, false);
        AbastecimentoHolder gaveta = new AbastecimentoHolder(layoutView);
        return gaveta;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        AbastecimentoHolder gaveta = (AbastecimentoHolder) holder;
        Abastecimento atual = this.lista.get(position);
        gaveta.atualizaOVeiculoQueVoceEstaApresentando( atual );
    }

    @Override
    public int getItemCount() {
        return this.lista.size();
    }
}
