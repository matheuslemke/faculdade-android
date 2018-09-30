// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.DialogInterface;
import com.clawdyvan.agendaestudantepro.Util.g;
import com.clawdyvan.agendaestudantepro.d.a;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            cq

class cu
    implements android.content.DialogInterface.OnClickListener
{

    final cq a;

    cu(cq cq1)
    {
        a = cq1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        g.a(com.clawdyvan.agendaestudantepro.c.cq.a(a), a.k());
        ((a)a.k()).j();
    }
}
