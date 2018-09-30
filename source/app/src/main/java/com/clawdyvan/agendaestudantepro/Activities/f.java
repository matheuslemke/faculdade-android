// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Activities;

import android.support.v7.app.a;
import android.view.View;
import com.clawdyvan.agendaestudantepro.e.p;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Activities:
//            MainActivity, h

class f
    implements android.view.View.OnClickListener
{

    final h a;
    final MainActivity b;

    f(MainActivity mainactivity, h h1)
    {
        b = mainactivity;
        a = h1;
        super();
    }

    public void onClick(View view)
    {
        com.clawdyvan.agendaestudantepro.Activities.MainActivity.a(b).a(0);
        ((p)a.a(0)).a();
    }
}
