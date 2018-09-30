// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.DialogInterface;
import android.graphics.Color;
import com.clawdyvan.agendaestudantepro.CustomViews.CirculoView;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            ap, ai

class aq
    implements android.content.DialogInterface.OnClickListener
{

    final ap a;

    aq(ap ap1)
    {
        a = ap1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        i = Color.parseColor("#2980b9");
        ai.i(a.a).setCorDesenho(i);
    }
}
