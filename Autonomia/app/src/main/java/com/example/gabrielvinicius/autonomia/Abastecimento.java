package com.example.gabrielvinicius.autonomia;

import java.util.ArrayList;

/**
 * Created by Gabriel Vinicius on 26/11/2017.
 */

public class Abastecimento {

    private String data;
    private float quilometragem;
    private float litros;
    private String posto;

    public static ArrayList<Abastecimento> lista = new ArrayList<>();

    public Abastecimento(String data, float quilometragem, float litros, String posto) {
        this.data = data;
        this.quilometragem = quilometragem;
        this.litros = litros;
        this.posto = posto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(float quilometragem) {
        this.quilometragem = quilometragem;
    }

    public float getLitros() {
        return litros;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public String getPosto() {
        return posto;
    }

    public void setPosto(String posto) {
        this.posto = posto;
    }

    public int getIcone() {

        switch (this.posto.toLowerCase()) {
            case "shell":
                return R.drawable.shell;
            case "ipiranga":
                return R.drawable.ipiranga;
            case "texaco":
                return R.drawable.texaco;
            case "petrobras":
                return R.drawable.petrobras;
        }

        return R.drawable.outros;
    }

}
