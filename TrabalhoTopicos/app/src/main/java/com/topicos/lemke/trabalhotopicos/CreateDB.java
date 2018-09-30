package com.topicos.lemke.trabalhotopicos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ander on 19/07/2016.
 */
public class CreateDB extends SQLiteOpenHelper
{
    protected static final String NAME_DB = "banco.db";
    protected static final String TABLE = "students";
    protected static final String ID = "_id";
    protected static final String NAME = "name";
    protected static final String RA = "ra";
    protected static final String STANDARD = "standard";
    protected static final int VERSION = 1;


    public CreateDB(Context context)
    {
        super(context, NAME_DB, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String sql = "CREATE TABLE" + TABLE + "("
                + ID + "integer primary key autoincrement,"
                + NAME + "text,"
                + RA + "text,"
                + STANDARD + "text"
                + ")";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE);
        onCreate(db);
    }
}
