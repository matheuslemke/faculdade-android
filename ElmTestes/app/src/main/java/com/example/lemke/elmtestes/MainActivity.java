package com.example.lemke.elmtestes;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Environment;
import android.support.annotation.NonNull;
//import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity
{

    //AlertDialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /*
    public void clickButtonDialog(View view)
    {
        //showAlertDialog4();
        //createCustomDialog(this,"Title");
        //showAlertDialog2();
        //showAlertDialog();
    }
*/
    private void showElmFodersTest()
    {
        AlertDialog.Builder builderSingle = new AlertDialog.Builder(this);
        //builderSingle.setIcon(R.drawable.ic_launcher);
        builderSingle.setTitle("Select One Name:-");

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                getBaseContext(),
                android.R.layout.select_dialog_singlechoice);
        arrayAdapter.add("Hardik");
        arrayAdapter.add("Archit");
        arrayAdapter.add("Jignesh");
        arrayAdapter.add("Umang");
        arrayAdapter.add("Gatti");

        builderSingle.setNegativeButton(
                "cancel",
                new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        dialog.dismiss();
                    }
                });

        builderSingle.setAdapter(
                arrayAdapter,
                new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        String strName = arrayAdapter.getItem(which);
                        AlertDialog.Builder builderInner = new AlertDialog.Builder(getBaseContext());
                        builderInner.setMessage(strName);
                        builderInner.setTitle("Your Selected Item is");
                        builderInner.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener()
                                {
                                    @Override
                                    public void onClick(
                                            DialogInterface dialog,
                                            int which)
                                    {
                                        dialog.dismiss();
                                    }
                                });
                        builderInner.show();
                    }
                });
        builderSingle.show();
    }

    private void showAlertDialog4()
    {
        FileChooseDialogFragment fileChooseDialogFragment = new FileChooseDialogFragment();
        fileChooseDialogFragment.show(getFragmentManager(), "fileChooseDialogFragment");
    }

    private void showAlertDialog3()
    {
        String[] MyStringArray = {"a", "b", "c"};

        AdapterView.OnItemClickListener MyListener = new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(getApplicationContext(), "item clicked at index " + position, Toast.LENGTH_SHORT).show();
                //MyStringArray[0] = "puf";
                //ListView list = instance.getListView();
            }
        };

        AlertDialog.Builder b = new AlertDialog.Builder(this);
        b.setItems(MyStringArray, (DialogInterface.OnClickListener) MyListener);
        AlertDialog instance = b.create();
        instance.show();

// Later when you need to update
        MyStringArray[0] = "puf";
        ListView list = instance.getListView();
// Now according to whether you used cursor or array for supplying items to the builder
// you have to cast adapter to either CursorAdapter or ArrayAdapter
        ArrayAdapter adapter = (ArrayAdapter) list.getAdapter();
        adapter.notifyDataSetChanged();
    }

    /*
        private void showAlertDialog2()
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            String[] items = {"a", "b", "c"};
            final ListView list = new ListView(this);
            list.setAdapter(new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, items));

            list.setOnItemClickListener(new AdapterView.OnItemClickListener()
            {
                public void onItemClick(AdapterView<?> arg0, View view, int pos, long id)
                {
                    Toast.makeText(getApplicationContext(), "item clicked at index " + pos, Toast.LENGTH_SHORT).show();
                    ListView list = mDialog.getListView();
                    ArrayAdapter adapter = (ArrayAdapter) list.getAdapter();
                    //adapter.insert("4",0);
                    //adapter.notifyDataSetChanged();
                }
            });
            builder.setView(list);

            builder.setPositiveButton("OK", null); // TODO
            builder.setNegativeButton("Cancel", null); // nothing simply dismiss

            mDialog = builder.show();
            //mDialog.dismiss();

        }
    */
    public void createCustomDialog(Context context, String title)
    {
        View dialogView = View.inflate(context, R.layout.dialog, null);
        final ListView lv = (ListView) dialogView.findViewById(R.id.listview);
        lv.setAdapter(new ArrayAdapter<String>(context, android.R.layout.simple_expandable_list_item_1, new String[]{"Item 1", "Item 2", "Item 3"}));
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(title)
                .setView(dialogView)
                .setPositiveButton("OK", new DialogInterface.OnClickListener()
                {

                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        // TODO do something
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener()
                {

                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        //TODO do something
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }

    private void showAlertDialog()
    {
        //ListView listView = (ListView) findViewById(R.id.your_list);
        //if (listView == null)
        ListView listView = new ListView(this);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item);
        arrayAdapter.add("a");
        arrayAdapter.add("b");
        arrayAdapter.add("c");

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> arg0, View view, int pos, long id)
            {
                Toast.makeText(getApplicationContext(), "item clicked at index " + pos, Toast.LENGTH_SHORT).show();
                // Here I call a method to update list?
            }
        });

        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        dialogBuilder.setTitle("My Dialog");

        dialogBuilder.setView(listView);

        //String strOkay = getString(R.string.okay);
        dialogBuilder.setPositiveButton("OK", null); // TODO
        dialogBuilder.setNegativeButton("Cancel", null); // nothing simply dismiss

        AlertDialog dialog = dialogBuilder.show();
        dialog.show();
    }

    private static AlertDialog.Builder builder;
    private static ArrayAdapter<String> arrayAdapter;

    public void buttonTestAdapterClick(View view)
    {
        builder = new AlertDialog.Builder(this);
        ArrayList<String> items = new ArrayList<>();
        items.add("a");
        items.add("b");
        items.add("c");

        ListView list = (ListView) new ListView(this);
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.select_dialog_item, items);

        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> arg0, View view, int pos, long id)
            {
                ArrayList<String> newItems = new ArrayList<>();
                newItems.add("d");
                newItems.add("e");
                newItems.add("f");
                ListView list = (ListView) new ListView(getBaseContext());
                arrayAdapter.clear();
                arrayAdapter.addAll(newItems);
                list.setAdapter(arrayAdapter);
                builder.setView(list);
                Toast.makeText(getBaseContext(), "opa", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setView(list);
        builder.setNegativeButton("cancel", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                dialog.dismiss();
            }
        });

        builder.show();
    }

    public static void builderSetView(ListView listView)
    {

    }

    public void buttonTestFieldsClick(View view)
    {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    SimpleAdapter adapter;
    List<Map<String, String>> data;

    /*
    public void buttonTestListViewClick(View view)
    {
        ListView itemList = (ListView) findViewById(R.id.listView_test);
        String[] one = {"aa", "bb", "cc", "dd", "ee"};
        String[] two = {"a", "b", "c", "d", "e"};
        data = new ArrayList<Map<String, String>>();
        for (int i = 0; i < one.length; i++)
        {
            Map<String, String> datum = new HashMap<String, String>(2);
            datum.put("title", one[i]);
            datum.put("date", two[i]);
            data.add(datum);
        }
        adapter = new SimpleAdapter(this, data,
                android.R.layout.simple_list_item_2,
                new String[]{"title", "date"},
                new int[]{android.R.id.text1,
                        android.R.id.text2});
        itemList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Map<String, String> datum = new HashMap<String, String>(2);
                datum.put("title", "44");
                datum.put("date", "4");
                data.add(datum);
                adapter.notifyDataSetChanged();
            }
        });
        itemList.setAdapter(adapter);

    }
*/
    public void buttonTestExpandableClick(View view)
    {
        Intent intent = new Intent(this, ExpandableTestActivity.class);
        startActivity(intent);
    }


/*
    public void buttonChooseClick(View view)
    {
        showDialog();
    }

    private void showDialog()
    {
        final DirectoryChooserConfig config = DirectoryChooserConfig.builder()
                .newDirectoryName("Nova Pasta")
                .allowNewDirectoryNameModification(true)
                .allowReadOnlyDirectory(true)
                .initialDirectory("/sdcard")
                .build();

        mDialog = DirectoryChooserFragment.newInstance(config);

        mDirectoryTextView = (TextView) findViewById(R.id.textDirectory);

        mDialog.show(getFragmentManager(), null);
    }

    @Override
    public void onSelectDirectory(@NonNull String path)
    {
        mDirectoryTextView.setText(path);
        mDialog.dismiss();
    }
*/
}
