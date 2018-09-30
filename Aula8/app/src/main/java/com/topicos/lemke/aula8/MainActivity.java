package com.topicos.lemke.aula8;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListaFragment.OptionSelectedListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onOptionSelected(int selecionado)
    {
        Toast.makeText(this, "Opção selecionada = " + selecionado, Toast.LENGTH_SHORT).show();
        DetalheFragment detalhe = (DetalheFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_detalhe);
        detalhe.setSelecionado(selecionado);
    }
}
