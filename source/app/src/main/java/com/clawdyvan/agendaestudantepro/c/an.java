// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.support.v4.app.p;
import android.view.View;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            ai, ao

class an
    implements android.view.View.OnClickListener
{

    final ai a;

    an(ai ai1)
    {
        a = ai1;
        super();
    }

    public void onClick(View view)
    {
        view = new android.app.AlertDialog.Builder(a.k());
        view.setMessage(a.k().getString(0x7f0b0079));
        view.setNegativeButton(a.a(0x7f0b0062), null);
        view.setPositiveButton(a.a(0x7f0b0082), new ao(this));
        view.show();
    }
}
