package com.topicos.lemke.aula8;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetalheFragment extends Fragment
{

    public DetalheFragment()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detalhe, container, false);
    }

    public void setSelecionado(int selecionado)
    {
        TextView textView = (TextView) getActivity().findViewById(R.id.text_view);
        textView.setText("O item selecionado foi: " + selecionado);
    }

}
