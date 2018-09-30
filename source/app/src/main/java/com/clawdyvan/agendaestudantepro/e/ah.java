// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.os.AsyncTask;
import com.clawdyvan.agendaestudantepro.Util.n;
import com.clawdyvan.agendaestudantepro.a.b;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            y

class ah extends AsyncTask
{

    final y a;

    ah(y y1)
    {
        a = y1;
        super();
    }

    protected transient List a(Void avoid[])
    {
        Object obj = a.k();
        if (obj != null)
        {
            com.clawdyvan.agendaestudantepro.e.y.b(a).f(1);
            avoid = com.clawdyvan.agendaestudantepro.e.y.b(a).i();
            obj = new b(((android.content.Context) (obj)));
            if (!isCancelled())
            {
                return ((b) (obj)).b(avoid);
            }
        }
        return null;
    }

    protected void a(List list)
    {
        super.onPostExecute(list);
        if (a.k() == null)
        {
            return;
        }
        if (!isCancelled())
        {
            try
            {
                y.g(a);
                y.h(a);
                y.a(a, y.i(a));
                y.j(a);
                y.a(a, list);
                com.clawdyvan.agendaestudantepro.e.y.b(a, list);
            }
            // Misplaced declaration of an exception variable
            catch (List list) { }
        }
        com.clawdyvan.agendaestudantepro.e.y.b(a, null);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((List)obj);
    }
}
