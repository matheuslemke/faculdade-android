package com.topicos.lemke.aula6;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CitacoesActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citacoes);

        CitacoesFragment fragment = (CitacoesFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentCitacoes);

        Intent intent = getIntent();
        fragment.setSelecionado(intent.getIntExtra("selecionado",0));
    }
}
