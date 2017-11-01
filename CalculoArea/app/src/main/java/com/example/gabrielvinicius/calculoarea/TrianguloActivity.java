package com.example.gabrielvinicius.calculoarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TrianguloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);
        setTitle("Cálculo de Área do Triângulo");
    }

    public void calcularArea(View view) {

        EditText base = (EditText) findViewById(R.id.editTextRaio);
        EditText altura = (EditText) findViewById(R.id.editTextAltura);

        if(base.getText().toString().equals("") || altura.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Todos os campos devem ser preenchidos!", Toast.LENGTH_LONG).show();
            return;
        }

        Bundle mochila = new Bundle();

        try {

            mochila.putDouble("area", (Double.parseDouble(base.getText().toString()) * Double.parseDouble(altura.getText().toString()) / 2));

        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Erro  ao converter dados!", Toast.LENGTH_LONG).show();
            return;
        }

        mochila.putString("forma", "Triângulo");

        Intent intencao = new Intent(getApplicationContext(), ResultadoActivity.class);

        intencao.putExtras(mochila);

        startActivity(intencao);
    }

}
