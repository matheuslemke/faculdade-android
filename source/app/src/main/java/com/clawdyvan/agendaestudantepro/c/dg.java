// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.os.Handler;
import android.view.View;
import android.widget.Toast;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            dh, dc

class dg
    implements android.view.View.OnClickListener
{

    final dc a;
    private boolean b;
    private Handler c;
    private Runnable d;

    dg(dc dc1)
    {
        a = dc1;
        super();
        b = false;
        c = new Handler();
        d = new dh(this);
    }

    static boolean a(dg dg1, boolean flag)
    {
        dg1.b = flag;
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
