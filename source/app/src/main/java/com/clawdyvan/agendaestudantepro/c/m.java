// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.view.View;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            f, n

class m
    implements android.view.View.OnClickListener
{

    final f a;

    m(f f1)
    {
        a = f1;
        super();
    }

    public void onClick(View view)
    {
        view = new android.app.AlertDialog.Builder(a.k());
        view.setTitle(a.a(0x7f0b0087));
        view.setItems(f.a(a), new n(this));
        view.show();
    }
}
