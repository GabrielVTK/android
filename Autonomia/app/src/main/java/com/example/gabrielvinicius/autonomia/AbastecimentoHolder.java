package com.example.gabrielvinicius.autonomia;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Gabriel Vinicius on 26/11/2017.
 */

public class AbastecimentoHolder extends RecyclerView.ViewHolder {

    private TextView tvData;
    private TextView tvKM;
    private TextView tvLitros;
    private ImageView ivIcone;

    public AbastecimentoHolder(View view) {
        super(view);

        this.tvData = view.findViewById(R.id.tvData);
        this.tvKM = view.findViewById(R.id.tvKM);
        this.tvLitros = view.findViewById(R.id.tvLitros);
        this.ivIcone = view.findViewById(R.id.ivIcone);
    }

    public void atualizaOVeiculoQueVoceEstaApresentando(Abastecimento item){
        tvData.setText( item.getData() );
        tvKM.setText( "KM: " + String.valueOf(item.getQuilometragem()) );
        tvLitros.setText( "Litros: " + String.valueOf(item.getLitros()) );
        ivIcone.setImageResource(item.getIcone());
    }

}
