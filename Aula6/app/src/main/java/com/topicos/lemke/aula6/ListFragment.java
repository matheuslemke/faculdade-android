package com.topicos.lemke.aula6;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment
{
    private static final String[] nomes = {"Einstein", "Tesla", "Turing", "Newton", "Edison", "Ibrahimovic", "Dilma"};

    public interface NameSelectedListener
    {
        public void OnNameSelected(int selecionado);
    }

    NameSelectedListener listener;

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            listener = (NameSelectedListener) activity;
        }
        catch (Exception e)
        {
            Log.e("Erro", "A atividade deve implementar NameSelectedListener");
        }
    }

    public ListFragment()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        final ListView listView = (ListView) getActivity().findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_expandable_list_item_1, nomes);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(getContext(), nomes[position], Toast.LENGTH_SHORT).show();
                listener.OnNameSelected(position);
            }
        });
    }
}