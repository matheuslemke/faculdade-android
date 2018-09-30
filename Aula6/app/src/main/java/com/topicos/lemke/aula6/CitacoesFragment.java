package com.topicos.lemke.aula6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class CitacoesFragment extends Fragment
{
    public static final String[] citacoes = {"A imaginação é mais importante que o conhecimento",
            "A compreensão mutua seria enormemente facilitada pelo uso de uma língua universal",
            "Hmmmmmmmmmmmmmmmmmmmm",
            "Deve-se aprender sempre, até mesmo com um inimigo",
            "Talento é 1% inspiração e 99% transpiração",
            "Posso jogar em qualquer uma das onze posições, pois um bom jogador joga em qualquer lugar",
            "Vamos saudar a mandioca"};

    private int selecionado;

    public CitacoesFragment()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_citacoes, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null)
        {
            this.selecionado = savedInstanceState.getInt("selecionado", 0);
            TextView textView = (TextView) getActivity().findViewById(R.id.text_citacoes);
            textView.setText(citacoes[selecionado]);
        }
    }

    public int getSelecionado()
    {
        return selecionado;
    }

    public void setSelecionado(int selecionado)
    {
        this.selecionado = selecionado;
        TextView textView = (TextView) getActivity().findViewById(R.id.text_citacoes);
        textView.setText(citacoes[selecionado]);
    }
}
