// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.view.View;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.c.bh;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            i

class m
    implements android.view.View.OnClickListener
{

    final i a;

    m(i j)
    {
        a = j;
        super();
    }

    public void onClick(View view)
    {
        view = i.f(a);
        ContainerFragmentsActivity.a(a.k(), com/clawdyvan/agendaestudantepro/c/bh, view, true);
    }
}
