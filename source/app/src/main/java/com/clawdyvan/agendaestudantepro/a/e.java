// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

// Referenced classes of package com.clawdyvan.agendaestudantepro.a:
//            f

public class e
{

    private f a;
    protected SQLiteDatabase b;
    private Context c;

    public e(Context context)
    {
        a = new f(this, context, "agenda_aluno.db", null, 2);
        c = context;
    }

    public Context c()
    {
        return c;
    }

    public void d()
    {
        b = a.getWritableDatabase();
    }

    public void e()
    {
        if (b != null)
        {
            b.close();
        }
    }
}
