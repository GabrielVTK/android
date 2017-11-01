package com.example.gabrielvinicius.calculoarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CirculoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);
        setTitle("Cálculo de Área do Círculo");
    }

    public void calcularArea(View view) {

        EditText raio = (EditText) findViewById(R.id.editTextRaio);

        if(raio.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Todos os campos devem ser preenchidos!", Toast.LENGTH_LONG).show();
            return;
        }

        Bundle mochila = new Bundle();

        try {

            double raioD = Double.parseDouble(raio.getText().toString());

            mochila.putDouble("area", (Math.PI * raioD * raioD));

        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Erro  ao converter dados!", Toast.LENGTH_LONG).show();
            return;
        }

        mochila.putString("forma", "Círculo");

        Intent intencao = new Intent(getApplicationContext(), ResultadoActivity.class);

        intencao.putExtras(mochila);

        startActivity(intencao);
    }

}
