// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.view.View;
import com.clawdyvan.agendaestudantepro.CustomViews.CirculoView;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            d, a

class e
    implements android.view.View.OnClickListener
{

    final d a;

    e(d d1)
    {
        a = d1;
        super();
    }

    public void onClick(View view)
    {
        com.clawdyvan.agendaestudantepro.c.a.d(a.a).setCorDesenho(((CirculoView)view).getCorDesenho());
    }
}
