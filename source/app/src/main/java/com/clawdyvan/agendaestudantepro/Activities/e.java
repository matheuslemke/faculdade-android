// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Activities;

import android.support.v4.view.ck;
import android.support.v7.app.a;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Activities:
//            MainActivity, i

class e
    implements ck
{

    final MainActivity a;

    e(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }

    public void a(int j)
    {
        com.clawdyvan.agendaestudantepro.Activities.MainActivity.a(a).a(j);
    }

    public void a(int j, float f, int k)
    {
        if (android.os.Build.VERSION.SDK_INT > 11)
        {
            if (j == 0)
            {
                MainActivity.b(a)[0].a(f);
                MainActivity.b(a)[1].a(1.0F - f);
                return;
            }
            if (j == 1)
            {
                MainActivity.b(a)[1].a(f);
                MainActivity.b(a)[2].a(1.0F - f);
                return;
            }
            if (j == 2)
            {
                MainActivity.b(a)[2].a(f);
                MainActivity.b(a)[3].a(1.0F - f);
                return;
            }
        }
    }

    public void b(int j)
    {
    }
}
