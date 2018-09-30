// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.os.AsyncTask;
import android.view.View;
import com.clawdyvan.agendaestudantepro.Util.n;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            y

class ab
    implements android.view.View.OnClickListener
{

    final y a;

    ab(y y1)
    {
        a = y1;
        super();
    }

    public void onClick(View view)
    {
        if (y.a(a) != null)
        {
            y.a(a).cancel(true);
        }
        y.b(a).m();
        y.c(a);
        y.a(a, y.e(a));
    }
}
