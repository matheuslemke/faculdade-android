// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.support.v4.app.ai;
import android.support.v4.app.u;
import android.view.View;
import com.clawdyvan.agendaestudantepro.c.cj;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            p

class x
    implements android.view.View.OnClickListener
{

    final u a;
    final p b;

    x(p p1, u u1)
    {
        b = p1;
        a = u1;
        super();
    }

    public void onClick(View view)
    {
        p.a(b, (cj)a.a("SobreDialogFragment"));
        if (p.b(b) != null)
        {
            a.a().a(p.b(b)).b();
        }
        p.a(b, new cj());
        p.b(b).a(a, "SobreDialogFragment");
    }
}
