// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.clawdyvan.agendaestudantepro.b.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.a:
//            e

public class a extends e
{

    private static final String a[] = {
        "_id", "Nome", "Abreviacao", "NomeProfessor", "EmailProfessor", "Cor"
    };

    public a(Context context)
    {
        super(context);
    }

    private c a(Cursor cursor)
    {
        c c1 = new c(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4));
        if (!cursor.isNull(5))
        {
            c1.a(cursor.getInt(5));
        }
        return c1;
    }

    private ContentValues c(c c1)
    {
        ContentValues contentvalues = new ContentValues();
        if (!c1.a().equals(""))
        {
            contentvalues.put("_id", c1.a());
        }
        contentvalues.put("Nome", c1.b());
        contentvalues.put("Abreviacao", c1.c());
        contentvalues.put("NomeProfessor", c1.d());
        contentvalues.put("EmailProfessor", c1.e());
        contentvalues.put("Cor", Integer.valueOf(c1.f()));
        return contentvalues;
    }

    public long a(c c1)
    {
        c1 = c(c1);
        d();
        long l = b.insert("Disciplina", null, c1);
        e();
        return l;
    }

    public void a()
    {
        d();
        b.delete("Disciplina", null, null);
        e();
    }

    public void a(String s)
    {
        d();
        b.delete("Disciplina", (new StringBuilder()).append("_id=").append(s).toString(), null);
        e();
    }

    public c b(String s)
    {
        d();
        s = b.query("Disciplina", a, (new StringBuilder()).append("_id=").append(s).toString(), null, null, null, null);
        s.moveToFirst();
        c c1 = a(s);
        s.close();
        e();
        return c1;
    }

    public List b()
    {
        ArrayList arraylist = new ArrayList();
        d();
        Cursor cursor = b.query("Disciplina", a, null, null, null, null, null);
        cursor.moveToFirst();
        for (; !cursor.isAfterLast(); cursor.moveToNext())
        {
            arraylist.add(a(cursor));
        }

        cursor.close();
        e();
        return arraylist;
    }

    public void b(c c1)
    {
        ContentValues contentvalues = c(c1);
        d();
        b.update("Disciplina", contentvalues, (new StringBuilder()).append("_id=").append(c1.a()).toString(), null);
        e();
    }

}
