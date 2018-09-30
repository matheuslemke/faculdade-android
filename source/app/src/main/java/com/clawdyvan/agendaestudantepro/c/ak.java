// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.support.v4.app.u;
import android.view.View;
import com.clawdyvan.agendaestudantepro.CustomViews.CirculoView;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            ai, cg

class ak
    implements android.view.View.OnClickListener
{

    final u a;
    final ai b;

    ak(ai ai1, u u)
    {
        b = ai1;
        a = u;
        super();
    }

    public void onClick(View view)
    {
        ai.a(b, (CirculoView)view.findViewWithTag("circuloView"));
        ai.b(b).b(ai.a(b).getCorDesenho());
        ai.b(b).a(a, "SeletorCoresDialogFragment");
    }
}
