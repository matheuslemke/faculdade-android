package com.topicos.lemke.trabalho;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class ScrollingActivity extends AppCompatActivity
{
    private String studentId;
    private DBController crud;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        init();
    }

    private void init()
    {
        defineToolbar();
        initializeEditTexts();
        defineFAO();
    }

    private void deleteButtonClick()
    {
        createDialog().show();
    }

    private Dialog createDialog()
    {
        final String studentId = this.studentId;
        crud = new DBController(getBaseContext());
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.dialog_delete_message)
                .setPositiveButton(R.string.dialog_delete_ok, new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        crud = new DBController(getBaseContext());
                        crud.deleteStudent(Integer.parseInt(studentId));
                        dialog.dismiss();
                        onBackPressed();
                    }
                })
                .setNegativeButton(R.string.dialog_delete_cancel, new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        dialog.dismiss();
                    }
                });
        return builder.create();
    }

    private void defineFAO()
    {
        final String studentId = this.studentId;
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        assert fab != null;
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                /*
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
                */
                assert getSupportActionBar() != null;
                assert getSupportActionBar().getTitle() != null;
                String studentName = getSupportActionBar().getTitle().toString();

                TextView textView_Ra = (TextView) findViewById(R.id.content_textView_ra);
                assert textView_Ra != null;
                String studentRA = textView_Ra.getText().toString();

                TextView textView_Standard = (TextView) findViewById(R.id.content_textView_standard);
                assert textView_Standard != null;
                String studentStandard = textView_Standard.getText().toString();

                Intent intent = new Intent(getApplicationContext(), EditStudentActivity.class);
                intent.putExtra("ID", studentId);
                intent.putExtra("Name", studentName);
                intent.putExtra("RA", studentRA);
                intent.putExtra("Standard", studentStandard);
                startActivity(intent);
            }
        });
    }

    private void initializeEditTexts()
    {
        DBController crud = new DBController(getBaseContext());
        Cursor cursor = crud.readStudents();

        studentId = getIntent().getStringExtra("ID");

        while (!cursor.getString(cursor.getColumnIndex(CreateDB.ID)).matches(studentId))
            if (!cursor.moveToNext())
            {
                Toast.makeText(this, "Registro não encontrado", Toast.LENGTH_SHORT).show();
                finish();
            }

        String studentRA = cursor.getString(cursor.getColumnIndex(CreateDB.RA));
        String studentStandard = cursor.getString(cursor.getColumnIndex(CreateDB.STANDARD));

        TextView textView_Ra = (TextView) findViewById(R.id.content_textView_ra);
        assert textView_Ra != null;
        textView_Ra.setText(studentRA);

        TextView textView_Standard = (TextView) findViewById(R.id.content_textView_standard);
        assert textView_Standard != null;
        textView_Standard.setText(studentStandard);
    }

    private void defineToolbar()
    {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Definindo o título da Toolbar
        String studentName = getIntent().getStringExtra("Name");
        assert getSupportActionBar() != null;
        getSupportActionBar().setTitle(studentName);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_delete)
        {
            deleteButtonClick();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        finish();
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }
}
