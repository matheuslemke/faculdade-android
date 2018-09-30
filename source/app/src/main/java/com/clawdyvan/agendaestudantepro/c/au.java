// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            ar, av

class au
    implements android.view.View.OnClickListener
{

    final ar a;

    au(ar ar1)
    {
        a = ar1;
        super();
    }

    public void onClick(View view)
    {
        view = (EditText)LayoutInflater.from(ar.b(a)).inflate(0x7f03001f, null);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(ar.b(a));
        builder.setView(view);
        builder.setTitle(ar.b(a).getString(0x7f0b0057));
        builder.setPositiveButton(ar.b(a).getString(0x7f0b0071), new av(this, view));
        builder.setNegativeButton(0x7f0b001d, null);
        builder.create().show();
    }
}
