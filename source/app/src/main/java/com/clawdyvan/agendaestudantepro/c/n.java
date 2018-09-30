// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.DialogInterface;
import android.widget.TextView;
import com.clawdyvan.agendaestudantepro.b.d;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            m, f

class n
    implements android.content.DialogInterface.OnClickListener
{

    final m a;

    n(m m1)
    {
        a = m1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        f.a(a.a, i + 1);
        f.c(a.a).a(f.b(a.a));
        com.clawdyvan.agendaestudantepro.c.f.d(a.a).setText(f.a(a.a)[f.b(a.a) - 1]);
    }
}
