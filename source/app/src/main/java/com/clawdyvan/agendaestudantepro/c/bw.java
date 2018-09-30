// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.DialogInterface;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.b.e;
import com.clawdyvan.agendaestudantepro.b.g;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            bv, bp, u

class bw
    implements android.content.DialogInterface.OnClickListener
{

    final int a;
    final bv b;

    bw(bv bv1, int i)
    {
        b = bv1;
        a = i;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new e();
        dialoginterface.a(a);
        dialoginterface.a(new g(9, 0));
        dialoginterface.b(null);
        dialoginterface = com.clawdyvan.agendaestudantepro.Util.e.a(dialoginterface);
        ContainerFragmentsActivity.a(b.a.k(), com/clawdyvan/agendaestudantepro/c/u, dialoginterface, true);
    }
}
