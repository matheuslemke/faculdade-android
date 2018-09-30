package com.topicos.lemke.trabalho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EditStudentActivity extends AppCompatActivity
{

    private String id;
    DBController crud;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_student);
        init();
        crud = new DBController(getBaseContext());
    }

    private void init()
    {
        id = getIntent().getStringExtra("ID");
        String name = getIntent().getStringExtra("Name");
        String ra = getIntent().getStringExtra("RA");
        String standard = getIntent().getStringExtra("Standard");

        EditText editText_name = (EditText) findViewById(R.id.editStudent_editText_name);
        assert editText_name != null;
        editText_name.setText(name);

        EditText editText_ra = (EditText) findViewById(R.id.editStudent_editText_ra);
        assert editText_ra != null;
        editText_ra.setText(ra);

        EditText editText_standard = (EditText) findViewById(R.id.editStudent_editText_standard);
        assert editText_standard != null;
        editText_standard.setText(standard);

    }

    public void buttonSaveClick(View view)
    {
        EditText editText_name = (EditText) findViewById(R.id.editStudent_editText_name);
        assert editText_name != null;
        String newStudentName = editText_name.getText().toString();

        EditText editText_ra = (EditText) findViewById(R.id.editStudent_editText_ra);
        assert editText_ra != null;
        String newStudentRa = editText_ra.getText().toString();

        EditText editText_standard = (EditText) findViewById(R.id.editStudent_editText_standard);
        assert editText_standard != null;
        String newStudentStandard = editText_standard.getText().toString();

        crud.updateStudent(Integer.parseInt(id), newStudentName, newStudentRa, newStudentStandard);

        Intent intent = new Intent(this, ScrollingActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);

        intent.putExtra("Name", newStudentName);
        intent.putExtra("ID", id);

        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed()
    {
        Toast.makeText(this, "As alterações não foram salvas", Toast.LENGTH_SHORT).show();
        super.onBackPressed();
    }
}
