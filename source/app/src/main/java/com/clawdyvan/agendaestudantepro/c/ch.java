// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.view.View;
import com.clawdyvan.agendaestudantepro.CustomViews.ColorPicker.b;
import com.clawdyvan.agendaestudantepro.Util.v;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            cg

class ch
    implements android.view.View.OnClickListener
{

    final cg a;

    ch(cg cg1)
    {
        a = cg1;
        super();
    }

    public void onClick(View view)
    {
        if (!v.a())
        {
            v.a(cg.a(a));
            return;
        } else
        {
            b.a(a.k(), com.clawdyvan.agendaestudantepro.c.cg.b(a), cg.c(a));
            a.a();
            return;
        }
    }
}
