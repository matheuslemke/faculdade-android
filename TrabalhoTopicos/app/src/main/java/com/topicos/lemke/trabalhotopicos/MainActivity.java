package com.topicos.lemke.trabalhotopicos;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
//        populateListView();
    }

    private void populateListView()
    {
        DBController crud = new DBController(getBaseContext());
        Cursor cursor = crud.readStudents();

        String[] fieldNames = new String[]{CreateDB.NAME};
        int[] idViews = new int[]{R.id.read_textView_studentName};

        SimpleCursorAdapter adapter = new SimpleCursorAdapter(getBaseContext(),
                R.layout.activity_read_students, cursor, fieldNames, idViews, 0);

        ListView listView = (ListView) findViewById(R.id.main_listView_studentNames);

        assert listView != null;
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.action_save:
                Toast.makeText(this, "Opa", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

    public void addStudent(View view)
    {

    }
}
