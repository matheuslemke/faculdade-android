// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.res.Resources;
import android.view.View;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            bp, bw

class bv
    implements android.view.View.OnClickListener
{

    final bp a;

    bv(bp bp1)
    {
        a = bp1;
        super();
    }

    public void onClick(View view)
    {
        int i = Integer.parseInt(view.getTag().toString());
        String as[] = a.l().getStringArray(0x7f050002);
        view = new android.app.AlertDialog.Builder(view.getContext());
        view.setTitle(as[i - 1]);
        String s = a.a(0x7f0b006f);
        bw bw1 = new bw(this, i);
        view.setItems(new String[] {
            s
        }, bw1);
        view.show();
    }
}
