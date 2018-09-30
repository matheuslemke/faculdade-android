package com.example.lemke.elmtestes;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by lemke on 08/06/16.
 */
public class CustomDialog extends Dialog
{

    private ListView listView;

    public CustomDialog(Context context)
    {
        super(context);
    }

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        listView = (ListView) findViewById(R.id.listView_lista);
    }
}
