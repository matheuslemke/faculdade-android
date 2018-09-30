// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.Context;
import android.view.View;
import com.clawdyvan.agendaestudantepro.Util.v;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            ar, ax

class aw
    implements android.view.View.OnClickListener
{

    final ar a;

    aw(ar ar1)
    {
        a = ar1;
        super();
    }

    public void onClick(View view)
    {
        if (!v.a())
        {
            v.a(ar.b(a));
            return;
        } else
        {
            ar.a(a, ar.b(a).getString(0x7f0b0035), new ax(this));
            return;
        }
    }
}
