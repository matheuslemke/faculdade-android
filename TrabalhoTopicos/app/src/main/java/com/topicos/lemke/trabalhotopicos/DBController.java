package com.topicos.lemke.trabalhotopicos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by ander on 19/07/2016.
 */
public class DBController
{
    private SQLiteDatabase db;
    private CreateDB banco;

    public DBController(Context context)
    {
        banco = new CreateDB(context);
    }

    public String createStudent(String name, String ra, String standard)
    {
        ContentValues values;
        long result;

        db = banco.getWritableDatabase();
        values = new ContentValues();
        values.put(CreateDB.NAME, name);
        values.put(CreateDB.RA, ra);
        values.put(CreateDB.STANDARD, standard);

        result = db.insert(CreateDB.TABLE, null, values);
        db.close();

        if (result == -1)
            return "Erro ao inserir registro";
        else
            return "Registro Inserido com sucesso";

    }

    public Cursor readStudents()
    {
        Cursor cursor;
        String[] fields = {banco.ID, banco.NAME};
        db = banco.getReadableDatabase();
        cursor = db.query(banco.TABLE, fields, null, null, null, null, null, null);

        if (cursor != null)
        {
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }
}

