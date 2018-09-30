// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.DialogInterface;
import com.clawdyvan.agendaestudantepro.Util.g;
import com.clawdyvan.agendaestudantepro.a.b;
import com.clawdyvan.agendaestudantepro.b.d;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            cx, cq

class cy
    implements android.content.DialogInterface.OnClickListener
{

    final b a;
    final cx b;

    cy(cx cx1, b b1)
    {
        b = cx1;
        a = b1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        cq.a(b.a).a(false);
        g.b(cq.c(b.a), cq.a(b.a));
        a.b(cq.a(b.a));
        com.clawdyvan.agendaestudantepro.c.cq.d(b.a);
    }
}
