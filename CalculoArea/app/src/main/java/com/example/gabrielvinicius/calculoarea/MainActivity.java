package com.example.gabrielvinicius.calculoarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirCalculo(View quemClicou) {

        RadioGroup rg = (RadioGroup) findViewById(R.id.rgFormas);

        Intent intencao = null;

        switch (rg.getCheckedRadioButtonId()) {
            case R.id.rbRetangulo:
                intencao = new Intent(getApplicationContext(), RetanguloActivity.class);
                break;
            case R.id.rbTriangulo:
                intencao = new Intent(getApplicationContext(), TrianguloActivity.class);
                break;
            case R.id.rbCirculo:
                intencao = new Intent(getApplicationContext(), CirculoActivity.class);
                break;
            default:
                Toast.makeText(getApplicationContext(), "Selecione uma forma", Toast.LENGTH_SHORT).show();
                return;
        }

        startActivity(intencao);
    }

}
