// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.DialogInterface;
import android.graphics.Color;
import com.clawdyvan.agendaestudantepro.CustomViews.CirculoView;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            an, ai

class ao
    implements android.content.DialogInterface.OnClickListener
{

    final an a;

    ao(an an1)
    {
        a = an1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        i = Color.parseColor("#C2C2C2");
        ai.e(a.a).setCorDesenho(i);
        ai.f(a.a).setCorDesenho(i);
        ai.g(a.a).setCorDesenho(i);
        ai.h(a.a).setCorDesenho(i);
    }
}
