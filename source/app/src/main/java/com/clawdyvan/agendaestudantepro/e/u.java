// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.view.View;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.c.ai;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            p

class u
    implements android.view.View.OnClickListener
{

    final p a;

    u(p p1)
    {
        a = p1;
        super();
    }

    public void onClick(View view)
    {
        ContainerFragmentsActivity.a(a.k(), com/clawdyvan/agendaestudantepro/c/ai, null, false);
    }
}
