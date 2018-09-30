// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.ae;
import android.support.v4.app.u;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Activities:
//            MainActivity

class h extends ae
{

    final MainActivity a;

    public h(MainActivity mainactivity, u u)
    {
        a = mainactivity;
        super(u);
    }

    public Fragment a(int i)
    {
        return (Fragment)MainActivity.b(a)[i];
    }

    public int b()
    {
        return 4;
    }
}
