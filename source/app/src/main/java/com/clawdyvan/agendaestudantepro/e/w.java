// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.support.v4.app.ai;
import android.support.v4.app.u;
import android.view.View;
import com.clawdyvan.agendaestudantepro.c.ce;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            p

class w
    implements android.view.View.OnClickListener
{

    final u a;
    final p b;

    w(p p1, u u1)
    {
        b = p1;
        a = u1;
        super();
    }

    public void onClick(View view)
    {
        p.a(b, (ce)a.a("ProDialogFragment"));
        if (p.a(b) != null)
        {
            a.a().a(p.a(b)).b();
        }
        p.a(b, new ce());
        p.a(b).a(a, "ProDialogFragment");
    }
}
