// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.view.View;
import com.clawdyvan.agendaestudantepro.Util.d;
import com.clawdyvan.agendaestudantepro.d.a;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            ai

class al
    implements android.view.View.OnClickListener
{

    final ai a;

    al(ai ai1)
    {
        a = ai1;
        super();
    }

    public void onClick(View view)
    {
        view = ai.c(a);
        com.clawdyvan.agendaestudantepro.c.ai.d(a).a(view);
        ((a)a.k()).j();
    }
}
