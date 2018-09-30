// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.os.Handler;
import android.view.View;
import android.widget.Toast;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            db, cz

class da
    implements android.view.View.OnClickListener
{

    final cz a;
    private boolean b;
    private Handler c;
    private Runnable d;

    da(cz cz1)
    {
        a = cz1;
        super();
        b = false;
        c = new Handler();
        d = new db(this);
    }

    static boolean a(da da1, boolean flag)
    {
        da1.b = flag;
        return flag;
    }

    public void onClick(View view)
    {
        if (b)
        {
            cz.a(a);
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
