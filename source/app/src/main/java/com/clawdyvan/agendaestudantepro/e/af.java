// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.content.DialogInterface;
import android.os.Bundle;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.Util.g;
import com.clawdyvan.agendaestudantepro.Util.n;
import com.clawdyvan.agendaestudantepro.c.cz;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            y

class af
    implements android.content.DialogInterface.OnClickListener
{

    final com.clawdyvan.agendaestudantepro.b.g a;
    final String b;
    final y c;

    af(y y1, com.clawdyvan.agendaestudantepro.b.g g1, String s)
    {
        c = y1;
        a = g1;
        b = s;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            g.a(c.k(), y.b(c).i(), a);
            return;

        case 1: // '\001'
            dialoginterface = new Bundle();
            break;
        }
        dialoginterface.putString("_id", b);
        ContainerFragmentsActivity.a(c.k(), com/clawdyvan/agendaestudantepro/c/cz, dialoginterface, false);
    }
}
