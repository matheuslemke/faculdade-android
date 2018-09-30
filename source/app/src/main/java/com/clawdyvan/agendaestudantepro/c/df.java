// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.DialogInterface;
import com.clawdyvan.agendaestudantepro.a.d;
import com.clawdyvan.agendaestudantepro.b.f;
import com.clawdyvan.agendaestudantepro.d.a;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            dc

class df
    implements android.content.DialogInterface.OnClickListener
{

    final dc a;

    df(dc dc1)
    {
        a = dc1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        (new d(a.k())).a(com.clawdyvan.agendaestudantepro.c.dc.a(a).a());
        ((a)a.k()).j();
    }
}
