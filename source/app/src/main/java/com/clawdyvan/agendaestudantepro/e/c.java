// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.os.AsyncTask;
import android.view.View;
import com.clawdyvan.agendaestudantepro.Util.b;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            a

class c
    implements android.view.View.OnClickListener
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public void onClick(View view)
    {
        if (com.clawdyvan.agendaestudantepro.e.a.a(a) != null)
        {
            com.clawdyvan.agendaestudantepro.e.a.a(a).cancel(true);
        }
        com.clawdyvan.agendaestudantepro.e.a.b(a).c();
        com.clawdyvan.agendaestudantepro.e.a.b(a).g();
        com.clawdyvan.agendaestudantepro.e.a.c(a);
    }
}
