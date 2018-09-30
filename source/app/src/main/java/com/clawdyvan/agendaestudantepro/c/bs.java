// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.res.Resources;
import android.view.View;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            bp, bt

class bs
    implements android.view.View.OnClickListener
{

    final bp a;

    bs(bp bp1)
    {
        a = bp1;
        super();
    }

    public void onClick(View view)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(view.getContext());
        builder.setItems(a.l().getStringArray(0x7f050004), new bt(this, view));
        builder.show();
    }
}
