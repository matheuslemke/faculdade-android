// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.Context;
import android.widget.CompoundButton;
import com.clawdyvan.agendaestudantepro.a.b;
import com.clawdyvan.agendaestudantepro.b.d;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            cq, cy

class cx
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    final cq a;

    cx(cq cq1)
    {
        a = cq1;
        super();
    }

    private void a(boolean flag)
    {
        b b1 = new b(cq.c(a));
        if (flag && !cq.a(a).j() && cq.a(a).i())
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(cq.c(a));
            builder.setMessage(cq.c(a).getString(0x7f0b0031));
            builder.setNegativeButton(cq.c(a).getString(0x7f0b0062), null);
            builder.setPositiveButton(cq.c(a).getString(0x7f0b0082), new cy(this, b1));
            builder.show();
        }
        if (cq.a(a).j() != flag)
        {
            cq.a(a).b(flag);
            b1.b(cq.a(a));
        }
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        a(flag);
        cq.a(a, com.clawdyvan.agendaestudantepro.c.cq.b(a), flag);
    }
}
