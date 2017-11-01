package com.example.gabrielvinicius.calculoarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Bundle mochila = getIntent().getExtras();

        setTitle("Resultado - " + mochila.getString("forma"));

        TextView resultado = (TextView) findViewById(R.id.textViewResultado);
        ImageView image = (ImageView) findViewById(R.id.imageViewForma);

        switch (mochila.getString("forma")) {
            case "Circulo":
                image.setImageResource(R.drawable.circle);
                break;
            case "Retângulo":
                image.setImageResource(R.drawable.rectangle);
                break;
            case "Triângulo":
                image.setImageResource(R.drawable.triangle);
                break;
        }

        resultado.setText(resultado.getText() + " " + String.format("%.2f", mochila.getDouble("area")) + " cm²");
    }

    public void comecarNovamente(View view) {
        Intent intencao = new Intent(getApplicationContext(), MainActivity.class);
        intencao.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intencao);
    }

}
