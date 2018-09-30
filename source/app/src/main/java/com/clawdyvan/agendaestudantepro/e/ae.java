// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.content.DialogInterface;
import android.os.Bundle;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.Util.g;
import com.clawdyvan.agendaestudantepro.Util.n;
import com.clawdyvan.agendaestudantepro.b.b;
import com.clawdyvan.agendaestudantepro.c.bh;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            y

class ae
    implements android.content.DialogInterface.OnClickListener
{

    final y a;

    ae(y y1)
    {
        a = y1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            g.a(a.k(), com.clawdyvan.agendaestudantepro.e.y.b(a).i());
            return;

        case 1: // '\001'
            dialoginterface = new Bundle();
            break;
        }
        dialoginterface.putString("Data", com.clawdyvan.agendaestudantepro.e.y.b(a).i().d());
        dialoginterface.putInt("TIPO_EVENTO", 1);
        ContainerFragmentsActivity.a(a.k(), com/clawdyvan/agendaestudantepro/c/bh, dialoginterface, true);
    }
}
