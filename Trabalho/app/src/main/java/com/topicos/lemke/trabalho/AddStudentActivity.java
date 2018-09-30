package com.topicos.lemke.trabalho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddStudentActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
    }

    public void buttonSaveClick(View view)
    {
        EditText editText_Name = (EditText) findViewById(R.id.addStudent_editText_name);
        EditText editText_RA = (EditText) findViewById(R.id.addStudent_editText_ra);
        EditText editText_Standard = (EditText) findViewById(R.id.addStudent_editText_standard);

        assert editText_Name != null;
        String Name = editText_Name.getText().toString();
        assert editText_RA != null;
        String RA = editText_RA.getText().toString();
        assert editText_Standard != null;
        String Standard = editText_Standard.getText().toString();

        if (Name.matches(""))
        {
            editText_Name.setError("Não pode ser vazio");
            editText_Name.requestFocus();
        } else if (RA.matches(""))
        {
            editText_RA.setError("Não pode ser vazio");
            editText_RA.requestFocus();
        } else if (Standard.matches(""))
        {
            editText_Standard.setError("Não pode ser vazio");
            editText_Standard.requestFocus();
        } else
        {
            DBController crud = new DBController(getBaseContext());

            if (crud.createStudent(Name, RA, Standard) == -1)
            {
                Toast.makeText(this, R.string.insert_error, Toast.LENGTH_SHORT).show();
                finish();
                onBackPressed();
            } else
            {
                Toast.makeText(this, R.string.insert_success, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        }

    }
}
