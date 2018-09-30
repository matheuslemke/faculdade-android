// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

// Referenced classes of package com.clawdyvan.agendaestudantepro.a:
//            e

class f extends SQLiteOpenHelper
{

    final e a;

    public f(e e, Context context, String s, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory, int i)
    {
        a = e;
        super(context, s, cursorfactory, i);
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE 'Disciplina'('_id' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,'Nome' TEXT,'Abreviacao' TEXT NOT NULL,'NomeProfessor' TEXT,'EmailProfessor' TEXT,'Cor' INTEGER);");
        sqlitedatabase.execSQL("CREATE TABLE 'Horario'('_id' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,'DiaSemana' INTEGER NOT NULL,'HoraInicio' TIME NOT NULL,'HoraFim' TIME,'Sala' TEXT,'idDisciplina' INTEGER NOT NULL,CONSTRAINT 'idDisciplina'FOREIGN KEY('idDisciplina')REFERENCES 'Disciplina'('_id')ON DELETE CASCADE);");
        sqlitedatabase.execSQL("CREATE TABLE 'Nota'('_id' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,'NotaObtida' FLOAT NOT NULL,'Peso' FLOAT NOT NULL,'Titulo' TEXT,'Descricao' TEXT,'idDisciplina' INTEGER NOT NULL,CONSTRAINT 'idDisciplina'FOREIGN KEY('idDisciplina')REFERENCES 'Disciplina'('_id')ON DELETE CASCADE);");
        sqlitedatabase.execSQL("CREATE TABLE 'Evento'('_id' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,'Tipo' INTEGER NOT NULL,'Data' DATE NOT NULL,'Hora' TIME,'Titulo' TEXT NOT NULL,'Descricao' TEXT,'Foto' TEXT,'eventoConcluido' BOOLEAN,'LembreteMs' INTEGER,'LembreteAtivado' BOOLEAN NOT NULL);");
    }

    public void onOpen(SQLiteDatabase sqlitedatabase)
    {
        super.onOpen(sqlitedatabase);
        if (!sqlitedatabase.isReadOnly())
        {
            sqlitedatabase.execSQL("PRAGMA foreign_keys=ON;");
        }
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            sqlitedatabase.execSQL("ALTER TABLE Disciplina ADD Cor INTEGER");
            break;
        }
    }
}
