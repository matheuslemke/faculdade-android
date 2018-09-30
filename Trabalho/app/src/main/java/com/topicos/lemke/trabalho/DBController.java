package com.topicos.lemke.trabalho;


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
    private CreateDB createDB;

    public DBController(Context context)
    {
        createDB = new CreateDB(context);
    }

    public long createStudent(String name, String ra, String standard)
    {
        ContentValues values;
        long result;

        db = createDB.getWritableDatabase();
        values = new ContentValues();
        values.put(CreateDB.NAME, name);
        values.put(CreateDB.RA, ra);
        values.put(CreateDB.STANDARD, standard);

        result = db.insert(CreateDB.TABLE, null, values);
        db.close();
        return result;
    }

    public Cursor readStudents()
    {
        Cursor cursor;
        String[] fields = {createDB.ID, createDB.NAME, createDB.RA, createDB.STANDARD};
        db = createDB.getReadableDatabase();
        cursor = db.query(createDB.TABLE, fields, null, null, null, null, createDB.NAME + " ASC", null);

        if (cursor != null)
        {
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }

    public Cursor getById(int id)
    {
        Cursor cursor;
        String[] fields = {createDB.ID, createDB.NAME, createDB.RA, createDB.STANDARD};
        String where = CreateDB.ID + " = " + id;
        db = createDB.getReadableDatabase();
        cursor = db.query(CreateDB.TABLE, fields, where, null, null, null, null, null);

        if (cursor != null)
        {
            cursor.moveToFirst();
        }
        db.close();
        return cursor;
    }

    public void updateStudent(int id, String name, String ra, String standard)
    {
        ContentValues values;
        String where;

        db = createDB.getWritableDatabase();

        where = CreateDB.ID + " = " + id;

        values = new ContentValues();
        values.put(CreateDB.NAME, name);
        values.put(CreateDB.RA, ra);
        values.put(CreateDB.STANDARD, standard);

        db.update(CreateDB.TABLE, values, where, null);
        db.close();
    }

    public void deleteStudent(int id)
    {
        String where = CreateDB.ID + " = " + id;
        db = createDB.getReadableDatabase();
        db.delete(CreateDB.TABLE, where, null);
        db.close();
    }
}

