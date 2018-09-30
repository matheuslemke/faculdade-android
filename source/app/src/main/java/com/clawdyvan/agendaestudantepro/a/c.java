// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.clawdyvan.agendaestudantepro.b.e;
import com.clawdyvan.agendaestudantepro.b.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.clawdyvan.agendaestudantepro.a:
//            e, a

public class c extends com.clawdyvan.agendaestudantepro.a.e
{

    private static final String a[] = {
        "_id", "DiaSemana", "HoraInicio", "HoraFim", "Sala", "idDisciplina"
    };

    public c(Context context)
    {
        super(context);
    }

    private e a(Cursor cursor)
    {
        e e1 = new e();
        e1.a(cursor.getString(0));
        e1.a(cursor.getInt(1));
        e1.a(new g(cursor.getString(2)));
        if (!cursor.isNull(3))
        {
            e1.b(new g(cursor.getString(3)));
        } else
        {
            e1.b(null);
        }
        e1.b(cursor.getString(4));
        e1.a((new a(c())).b(cursor.getString(5)));
        return e1;
    }

    private ContentValues c(e e1)
    {
        ContentValues contentvalues = new ContentValues();
        if (!e1.a().equals(""))
        {
            contentvalues.put("_id", e1.a());
        }
        contentvalues.put("DiaSemana", Integer.valueOf(e1.b()));
        contentvalues.put("HoraInicio", e1.d().d());
        if (e1.e() != null)
        {
            contentvalues.put("HoraFim", e1.e().d());
        }
        contentvalues.put("Sala", e1.f());
        contentvalues.put("idDisciplina", e1.c().a());
        return contentvalues;
    }

    public long a(e e1)
    {
        e1 = c(e1);
        d();
        long l = b.insert("Horario", null, e1);
        e();
        return l;
    }

    public List a(int i)
    {
        ArrayList arraylist = new ArrayList();
        d();
        Cursor cursor = b.query("Horario", a, (new StringBuilder()).append("DiaSemana=").append(i).toString(), null, null, null, "HoraInicio");
        cursor.moveToFirst();
        for (; !cursor.isAfterLast(); cursor.moveToNext())
        {
            arraylist.add(a(cursor));
        }

        cursor.close();
        e();
        return arraylist;
    }

    public void a()
    {
        d();
        b.delete("Horario", null, null);
        e();
    }

    public void a(String s)
    {
        d();
        b.delete("Horario", (new StringBuilder()).append("_id=").append(s).toString(), null);
        e();
    }

    public e b(String s)
    {
        d();
        s = b.query("Horario", a, (new StringBuilder()).append("_id=").append(s).toString(), null, null, null, null);
        s.moveToFirst();
        e e1 = a(s);
        s.close();
        e();
        return e1;
    }

    public Map b()
    {
        HashMap hashmap = new HashMap();
        d();
        Cursor cursor = b.query("Horario", a, null, null, null, null, "DiaSemana,HoraInicio");
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) 
        {
            e e1 = a(cursor);
            int i = e1.b();
            if (hashmap.containsKey(Integer.valueOf(i)))
            {
                ((List)hashmap.get(Integer.valueOf(i))).add(e1);
            } else
            {
                ArrayList arraylist = new ArrayList();
                arraylist.add(e1);
                hashmap.put(Integer.valueOf(i), arraylist);
            }
            cursor.moveToNext();
        }
        cursor.close();
        e();
        return hashmap;
    }

    public void b(e e1)
    {
        ContentValues contentvalues = c(e1);
        d();
        b.update("Horario", contentvalues, (new StringBuilder()).append("_id=").append(e1.a()).toString(), null);
        e();
    }

}
