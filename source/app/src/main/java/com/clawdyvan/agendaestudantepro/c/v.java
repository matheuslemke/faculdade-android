// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.view.View;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            u

class v
    implements android.view.View.OnClickListener
{

    final u a;

    v(u u1)
    {
        a = u1;
        super();
    }

    public void onClick(View view)
    {
        a.etDiaSemanaOnClick(view);
    }
}
