// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.view.View;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.c.bh;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            a

class e
    implements android.view.View.OnClickListener
{

    final a a;

    e(a a1)
    {
        a = a1;
        super();
    }

    public void onClick(View view)
    {
        view = com.clawdyvan.agendaestudantepro.e.a.f(a);
        ContainerFragmentsActivity.a(a.k(), com/clawdyvan/agendaestudantepro/c/bh, view, true);
    }
}
