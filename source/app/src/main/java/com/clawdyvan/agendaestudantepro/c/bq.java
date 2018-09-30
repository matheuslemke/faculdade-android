// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.view.View;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            bp

class bq
    implements android.view.View.OnClickListener
{

    final bp a;

    bq(bp bp1)
    {
        a = bp1;
        super();
    }

    public void onClick(View view)
    {
        a.btNovoHorarioOnClick(view);
    }
}
