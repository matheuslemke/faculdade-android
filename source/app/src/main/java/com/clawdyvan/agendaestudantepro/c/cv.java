// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.os.Handler;
import android.view.View;
import android.widget.Toast;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            cw, cq

class cv
    implements android.view.View.OnClickListener
{

    final cq a;
    private boolean b;
    private Handler c;
    private Runnable d;

    cv(cq cq1)
    {
        a = cq1;
        super();
        b = false;
        c = new Handler();
        d = new cw(this);
    }

    static boolean a(cv cv1, boolean flag)
    {
        cv1.b = flag;
        return flag;
    }

    public void onClick(View view)
    {
        if (b)
        {
            a.btEditarOnClick(view);
            return;
        } else
        {
            b = true;
            Toast.makeText(a.k(), a.a(0x7f0b008c), 0).show();
            c.postDelayed(d, 3000L);
            return;
        }
    }
}
