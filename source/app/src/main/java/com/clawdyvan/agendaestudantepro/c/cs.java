// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.view.View;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            cq

class cs
    implements android.view.View.OnClickListener
{

    final cq a;

    cs(cq cq1)
    {
        a = cq1;
        super();
    }

    public void onClick(View view)
    {
        a.btEditarOnClick(view);
    }
}
