// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.view.View;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.Util.n;
import com.clawdyvan.agendaestudantepro.c.bh;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            y

class ac
    implements android.view.View.OnClickListener
{

    final y a;

    ac(y y1)
    {
        a = y1;
        super();
    }

    public void onClick(View view)
    {
        y.b(a).f(1);
        view = y.f(a);
        ContainerFragmentsActivity.a(a.k(), com/clawdyvan/agendaestudantepro/c/bh, view, true);
    }
}
