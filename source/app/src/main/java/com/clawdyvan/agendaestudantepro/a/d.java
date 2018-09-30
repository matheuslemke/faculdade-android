// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.clawdyvan.agendaestudantepro.b.c;
import com.clawdyvan.agendaestudantepro.b.f;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.a:
//            e

public class d extends e
{

    private static final String a[] = {
        "_id", "NotaObtida", "Peso", "Titulo", "Descricao", "idDisciplina"
    };

    public d(Context context)
    {
        super(context);
    }

    private f a(Cursor cursor)
    {
        f f1 = new f();
        f1.a(cursor.getString(0));
        f1.a(cursor.getFloat(1));
        f1.b(cursor.getFloat(2));
        f1.b(cursor.getString(3));
        f1.c(cursor.getString(4));
        return f1;
    }

    private ContentValues c(f f1)
    {
        ContentValues contentvalues = new ContentValues();
        if (!f1.a().equals(""))
        {
            contentvalues.put("_id", f1.a());
        }
        contentvalues.put("NotaObtida", Float.valueOf(f1.b()));
        contentvalues.put("Peso", Float.valueOf(f1.c()));
        contentvalues.put("Titulo", f1.d());
        contentvalues.put("Descricao", f1.e());
        contentvalues.put("idDisciplina", f1.f().a());
        return contentvalues;
    }

    public long a(f f1)
    {
        f1 = c(f1);
        d();
        long l = b.insert("Nota", null, f1);
        e();
        return l;
    }

    public List a(c c1)
    {
        ArrayList arraylist = new ArrayList();
        d();
        Cursor cursor = b.query("Nota", a, (new StringBuilder()).append("idDisciplina=").append(c1.a()).toString(), null, null, null, null);
        cursor.moveToFirst();
        for (; !cursor.isAfterLast(); cursor.moveToNext())
        {
            f f1 = a(cursor);
            f1.a(c1);
            arraylist.add(f1);
        }

        cursor.close();
        e();
        return arraylist;
    }

    public void a()
    {
        d();
        b.delete("Nota", null, null);
        e();
    }

    public void a(String s)
    {
        d();
        b.delete("Nota", (new StringBuilder()).append("_id=").append(s).toString(), null);
        e();
    }

    public f b(String s)
    {
        d();
        s = b.query("Nota", a, (new StringBuilder()).append("_id=").append(s).toString(), null, null, null, null);
        s.moveToFirst();
        s = a(s);
        e();
        return s;
    }

    public void b(f f1)
    {
        ContentValues contentvalues = c(f1);
        d();
        b.update("Nota", contentvalues, (new StringBuilder()).append("_id=").append(f1.a()).toString(), null);
        e();
    }

}
