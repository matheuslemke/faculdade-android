// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.DialogInterface;
import android.view.View;
import com.clawdyvan.agendaestudantepro.a.c;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            bt, bs, bp

class bu
    implements android.content.DialogInterface.OnClickListener
{

    final bt a;

    bu(bt bt1)
    {
        a = bt1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        (new c(a.b.a.k())).a(a.a.getTag().toString());
        a.b.a.f();
    }
}
