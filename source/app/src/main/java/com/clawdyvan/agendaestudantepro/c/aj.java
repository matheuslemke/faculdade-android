// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.view.View;
import com.clawdyvan.agendaestudantepro.CustomViews.CirculoView;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            ai

class aj
    implements android.view.View.OnClickListener
{

    final ai a;

    aj(ai ai1)
    {
        a = ai1;
        super();
    }

    public void onClick(View view)
    {
        ai.a(a).setCorDesenho(((CirculoView)view).getCorDesenho());
    }
}
