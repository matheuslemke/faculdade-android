// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.os.AsyncTask;
import com.clawdyvan.agendaestudantepro.Util.n;
import com.clawdyvan.agendaestudantepro.a.b;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            a

class f extends AsyncTask
{

    final a a;

    f(a a1)
    {
        a = a1;
        super();
    }

    protected transient List a(Void avoid[])
    {
        Object obj = a.k();
        if (obj != null)
        {
            avoid = com.clawdyvan.agendaestudantepro.e.a.g(a).i();
            obj = new b(((android.content.Context) (obj)));
            if (!isCancelled())
            {
                return ((b) (obj)).c(avoid);
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
                com.clawdyvan.agendaestudantepro.e.a.h(a);
                com.clawdyvan.agendaestudantepro.e.a.i(a);
                com.clawdyvan.agendaestudantepro.e.a.a(a, com.clawdyvan.agendaestudantepro.e.a.j(a));
                com.clawdyvan.agendaestudantepro.e.a.b(a).a(list);
                com.clawdyvan.agendaestudantepro.e.a.b(a).f();
                com.clawdyvan.agendaestudantepro.e.a.a(a, list);
            }
            // Misplaced declaration of an exception variable
            catch (List list) { }
        }
        com.clawdyvan.agendaestudantepro.e.a.a(a, null);
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
