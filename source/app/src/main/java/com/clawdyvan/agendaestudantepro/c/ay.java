// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import com.clawdyvan.agendaestudantepro.Util.v;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            ar, az

class ay
    implements android.widget.AdapterView.OnItemClickListener
{

    final ar a;

    ay(ar ar1)
    {
        a = ar1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (!v.a())
        {
            v.a(ar.b(a));
            return;
        } else
        {
            ar.a(a, ar.b(a).getString(0x7f0b0037), new az(this, adapterview, i));
            return;
        }
    }
}
