// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Util;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.b.b;
import com.clawdyvan.agendaestudantepro.b.g;
import com.clawdyvan.agendaestudantepro.c.f;

final class h
    implements android.content.DialogInterface.OnClickListener
{

    final b a;
    final g b;
    final Activity c;

    h(b b1, g g, Activity activity)
    {
        a = b1;
        b = g;
        c = activity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Bundle();
        dialoginterface.putInt("Tipo", i + 1);
        if (a != null)
        {
            dialoginterface.putString("Data", a.d());
        }
        if (b != null)
        {
            dialoginterface.putSerializable("Hora", b);
        }
        ContainerFragmentsActivity.a(c, com/clawdyvan/agendaestudantepro/c/f, dialoginterface, true);
    }
}
