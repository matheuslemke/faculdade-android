// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.DialogInterface;
import com.clawdyvan.agendaestudantepro.Util.g;
import com.clawdyvan.agendaestudantepro.b.d;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            bn, bm, bh

class bo
    implements android.content.DialogInterface.OnClickListener
{

    final bn a;

    bo(bn bn1)
    {
        a = bn1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        g.a((d)bh.c(a.b.a).get(a.a), a.b.a.k());
        a.b.a.f();
    }
}
