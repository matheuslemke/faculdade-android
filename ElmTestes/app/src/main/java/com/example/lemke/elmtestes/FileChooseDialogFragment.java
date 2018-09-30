package com.example.lemke.elmtestes;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by lemke on 08/06/16.
 */
public class FileChooseDialogFragment extends DialogFragment
{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        final String[] data = {"s", "d", "f"};

        ArrayList<File> filesList = new ArrayList<>(data.length);

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_expandable_list_item_1, data);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Title")
        /*
                .setItems(file_names, new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int which)
                    {
                        // The 'which' argument contains the index position
                        // of the selected item


                    }
                });
        */
                .setAdapter(adapter, new DialogInterface.OnClickListener()
                        {
                            @Override
                            public void onClick(DialogInterface dialog, int which)
                            {
                                String selected = data[which];
                                adapter.add("ahduahsd");

                                adapter.notifyDataSetChanged();
                                Log.d("adapter", adapter.getItem(0));
                            }

                        }

                );
        return builder.create();
    }
}
