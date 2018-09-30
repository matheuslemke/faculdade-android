// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Util;

import android.content.DialogInterface;
import com.clawdyvan.agendaestudantepro.a.b;
import com.clawdyvan.agendaestudantepro.b.d;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Util:
//            j, i, g

class k
    implements android.content.DialogInterface.OnClickListener
{

    final d a;
    final b b;
    final j c;

    k(j j1, d d1, b b1)
    {
        c = j1;
        a = d1;
        b = b1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int l)
    {
        a.a(false);
        com.clawdyvan.agendaestudantepro.Util.g.b(i.a(c.a), a);
        b.b(a);
    }
}
