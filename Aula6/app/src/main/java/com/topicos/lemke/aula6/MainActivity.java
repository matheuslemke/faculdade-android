package com.topicos.lemke.aula6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ListFragment.NameSelectedListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void OnNameSelected(int selecionado)
    {
        Intent intent = new Intent(this, CitacoesActivity.class);
        intent.putExtra("selecionado", selecionado);
        startActivity(intent);
    }
}
