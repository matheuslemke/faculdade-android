// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.support.v4.app.ai;
import android.support.v4.app.p;
import android.support.v4.app.u;
import android.view.View;
import com.clawdyvan.agendaestudantepro.CustomViews.CirculoView;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            a, cg, e

class d
    implements android.view.View.OnClickListener
{

    final a a;

    d(a a1)
    {
        a = a1;
        super();
    }

    public void onClick(View view)
    {
        view = a.k().f();
        cg cg1 = (cg)view.a("SeletorCoresDialogFragment");
        if (cg1 != null)
        {
            view.a().a(cg1).b();
        }
        cg1 = new cg();
        cg1.b(com.clawdyvan.agendaestudantepro.c.a.d(a).getCorDesenho());
        cg1.a(a.k(), 5, com.clawdyvan.agendaestudantepro.c.a.e(a), new e(this));
        cg1.a(view, "SeletorCoresDialogFragment");
    }
}
