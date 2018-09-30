// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.content.DialogInterface;
import com.clawdyvan.agendaestudantepro.Util.g;
import com.clawdyvan.agendaestudantepro.b.b;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            g, a

class h
    implements android.content.DialogInterface.OnClickListener
{

    final b a;
    final com.clawdyvan.agendaestudantepro.e.g b;

    h(com.clawdyvan.agendaestudantepro.e.g g1, b b1)
    {
        b = g1;
        a = b1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            g.a(b.a.k(), a);
            return;

        case 1: // '\001'
            g.b(b.a.k(), a);
            break;
        }
    }
}
