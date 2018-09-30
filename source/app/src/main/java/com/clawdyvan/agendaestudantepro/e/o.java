// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.Util.n;
import com.clawdyvan.agendaestudantepro.b.g;
import com.clawdyvan.agendaestudantepro.c.cz;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            n, i

class o
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final View b;
    final com.clawdyvan.agendaestudantepro.e.n c;

    o(com.clawdyvan.agendaestudantepro.e.n n1, String s, View view)
    {
        c = n1;
        a = s;
        b = view;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int j)
    {
        switch (j)
        {
        default:
            return;

        case 0: // '\0'
            com.clawdyvan.agendaestudantepro.Util.g.a(c.a.k(), i.a(c.a).i(), new g(a));
            return;

        case 1: // '\001'
            dialoginterface = new Bundle();
            break;
        }
        dialoginterface.putString("_id", b.getTag().toString());
        ContainerFragmentsActivity.a(c.a.k(), com/clawdyvan/agendaestudantepro/c/cz, dialoginterface, false);
    }
}
