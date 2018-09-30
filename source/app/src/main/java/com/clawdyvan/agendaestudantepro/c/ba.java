// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.DialogInterface;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            ar

class ba
    implements android.content.DialogInterface.OnClickListener
{

    final Runnable a;
    final ar b;

    ba(ar ar, Runnable runnable)
    {
        b = ar;
        a = runnable;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (a != null)
        {
            a.run();
        }
    }
}
