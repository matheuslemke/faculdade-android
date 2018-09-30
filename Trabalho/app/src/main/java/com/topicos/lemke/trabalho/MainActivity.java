package com.topicos.lemke.trabalho;

import android.content.Intent;
import android.database.Cursor;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init()
    {
        populateListView();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.main_fab_addStudent);
        assert fab != null;
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), AddStudentActivity.class);
                startActivity(intent);
            }
        });
    }

    private void populateListView()
    {
        DBController crud = new DBController(getBaseContext());
        Cursor cursor = crud.readStudents();

        // Definindo os campos de cada estudante
        String[] fieldNames = new String[]{CreateDB.NAME, CreateDB.ID};
        int[] idViews = new int[]{R.id.read_textView_studentName, R.id.read_textView_id};

        // Inserindo os dados no adapter
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(getBaseContext(),
                R.layout.activity_read_student, cursor, fieldNames, idViews, 0);

        // Definindo a listView
        final ListView listView = (ListView) findViewById(R.id.main_listView_studentNames);
        assert listView != null;
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent intent = new Intent(getApplicationContext(), ScrollingActivity.class);
                String nameFromList = ((TextView) view.findViewById(R.id.read_textView_studentName)).getText().toString();
                intent.putExtra("Name", nameFromList);
                String idFromList = ((TextView) view.findViewById(R.id.read_textView_id)).getText().toString();
                intent.putExtra("ID", idFromList);
                startActivity(intent);
            }
        });

    }
}
