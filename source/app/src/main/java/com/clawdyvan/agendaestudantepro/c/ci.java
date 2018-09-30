// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.view.View;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            cg

class ci
    implements android.view.View.OnClickListener
{

    final cg a;

    ci(cg cg1)
    {
        a = cg1;
        super();
    }

    public void onClick(View view)
    {
        cg.c(a).onClick(view);
        a.a();
    }
}
