// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.clawdyvan.agendaestudantepro.Util.n;
import com.clawdyvan.agendaestudantepro.b.d;
import com.clawdyvan.agendaestudantepro.b.g;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.a:
//            e

public class b extends e
{

    public static final String a[] = {
        "_id", "Tipo", "Data", "Hora", "Titulo", "Descricao", "Foto", "LembreteMs", "LembreteAtivado", "eventoConcluido"
    };

    public b(Context context)
    {
        super(context);
    }

    private d a(Cursor cursor)
    {
        boolean flag1 = true;
        d d1 = new d();
        d1.a(cursor.getString(0));
        d1.a(cursor.getInt(1));
        d1.a(new com.clawdyvan.agendaestudantepro.b.b(cursor.getString(2)));
        boolean flag;
        if (!cursor.isNull(3))
        {
            d1.a(new g(cursor.getString(3)));
        } else
        {
            d1.a(null);
        }
        d1.b(cursor.getString(4));
        d1.c(cursor.getString(5));
        d1.d(cursor.getString(6));
        d1.a(cursor.getLong(7));
        if (cursor.getInt(8) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d1.a(flag);
        if (cursor.getInt(9) == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        d1.b(flag);
        return d1;
    }

    private ContentValues c(d d1)
    {
        ContentValues contentvalues = new ContentValues();
        if (!d1.b().equals(""))
        {
            contentvalues.put("_id", d1.b());
        }
        contentvalues.put("Tipo", Integer.valueOf(d1.a()));
        contentvalues.put("Data", d1.e().d());
        if (d1.f() != null)
        {
            contentvalues.put("Hora", d1.f().d());
        }
        contentvalues.put("Titulo", d1.c());
        contentvalues.put("Descricao", d1.d());
        contentvalues.put("Foto", d1.g());
        contentvalues.put("LembreteMs", Long.valueOf(d1.h()));
        contentvalues.put("LembreteAtivado", Boolean.valueOf(d1.i()));
        contentvalues.put("eventoConcluido", Boolean.valueOf(d1.j()));
        return contentvalues;
    }

    public long a(d d1)
    {
        d1 = c(d1);
        d();
        long l = b.insert("Evento", null, d1);
        e();
        return l;
    }

    public List a()
    {
        ArrayList arraylist = new ArrayList();
        d();
        Cursor cursor = b.query("Evento", a, null, null, null, null, "Data,Hora");
        cursor.moveToFirst();
        for (; !cursor.isAfterLast(); cursor.moveToNext())
        {
            arraylist.add(a(cursor));
        }

        cursor.close();
        e();
        return arraylist;
    }

    public List a(com.clawdyvan.agendaestudantepro.b.b b1)
    {
        ArrayList arraylist = new ArrayList();
        d();
        b1 = b.query("Evento", a, "Data=?", new String[] {
            b1.d()
        }, null, null, "Hora");
        b1.moveToFirst();
        for (; !b1.isAfterLast(); b1.moveToNext())
        {
            arraylist.add(a(((Cursor) (b1))));
        }

        b1.close();
        e();
        return arraylist;
    }

    public void a(String s)
    {
        d();
        b.delete("Evento", (new StringBuilder()).append("_id=").append(s).toString(), null);
        e();
    }

    public d b(String s)
    {
        d();
        s = b.query("Evento", a, (new StringBuilder()).append("_id=").append(s).toString(), null, null, null, null);
        s.moveToFirst();
        s = a(s);
        e();
        return s;
    }

    public List b()
    {
        ArrayList arraylist = new ArrayList();
        d();
        Cursor cursor = b.query("Evento", a, "LembreteAtivado=1", null, null, null, null);
        cursor.moveToFirst();
        for (; !cursor.isAfterLast(); cursor.moveToNext())
        {
            arraylist.add(a(cursor));
        }

        cursor.close();
        e();
        return arraylist;
    }

    public List b(com.clawdyvan.agendaestudantepro.b.b b1)
    {
        n n1 = new n(b1);
        n1.g(6);
        ArrayList arraylist = new ArrayList();
        d();
        b1 = b.query("Evento", a, "Data BETWEEN ? AND ?", new String[] {
            b1.d(), n1.i().d()
        }, null, null, "Data,Hora");
        b1.moveToFirst();
        for (; !b1.isAfterLast(); b1.moveToNext())
        {
            arraylist.add(a(b1));
        }

        b1.close();
        e();
        return arraylist;
    }

    public void b(d d1)
    {
        ContentValues contentvalues = c(d1);
        d();
        b.update("Evento", contentvalues, (new StringBuilder()).append("_id=").append(d1.b()).toString(), null);
        e();
    }

    public List c(com.clawdyvan.agendaestudantepro.b.b b1)
    {
        ArrayList arraylist = new ArrayList();
        b1 = String.format("STRFTIME('%%m', %s) = '%02d' AND STRFTIME('%%Y', %s) = '%04d'", new Object[] {
            "Data", Integer.valueOf(b1.b()), "Data", Integer.valueOf(b1.a())
        });
        d();
        b1 = b.query("Evento", a, b1, null, null, null, "Data,Hora");
        b1.moveToFirst();
        for (; !b1.isAfterLast(); b1.moveToNext())
        {
            arraylist.add(a(b1));
        }

        b1.close();
        e();
        return arraylist;
    }

    public long d(com.clawdyvan.agendaestudantepro.b.b b1)
    {
        b1 = String.format("SELECT COUNT(*) FROM %s WHERE %s = '%s' AND %s = 0", new Object[] {
            "Evento", "Data", b1.d(), "eventoConcluido"
        });
        d();
        b1 = b.rawQuery(b1, null);
        b1.moveToFirst();
        long l = b1.getLong(0);
        b1.close();
        e();
        return l;
    }

}
