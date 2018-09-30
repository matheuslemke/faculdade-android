// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.view.View;
import com.clawdyvan.agendaestudantepro.Util.n;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            i

class j
    implements android.view.View.OnClickListener
{

    final i a;

    j(i k)
    {
        a = k;
        super();
    }

    public void onClick(View view)
    {
        i.a(a).p();
        i.b(a);
        i.c(a);
        i.a(a, i.d(a));
    }
}
