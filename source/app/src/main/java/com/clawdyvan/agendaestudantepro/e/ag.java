// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.os.AsyncTask;
import com.clawdyvan.agendaestudantepro.a.c;
import java.util.Map;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            y

class ag extends AsyncTask
{

    final y a;

    ag(y y1)
    {
        a = y1;
        super();
    }

    protected transient Map a(Object aobj[])
    {
        aobj = a.k();
        if (aobj != null)
        {
            aobj = new c(((android.content.Context) (aobj)));
            if (!isCancelled())
            {
                return ((c) (aobj)).b();
            }
        }
        return null;
    }

    protected void a(Map map)
    {
        super.onPostExecute(map);
        if (a.k() == null)
        {
            return;
        }
        if (!isCancelled())
        {
            try
            {
                y.a(a, map);
                com.clawdyvan.agendaestudantepro.e.y.c(a);
            }
            // Misplaced declaration of an exception variable
            catch (Map map) { }
        }
        y.a(a, null);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Map)obj);
    }
}
