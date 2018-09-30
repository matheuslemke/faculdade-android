// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import com.clawdyvan.agendaestudantepro.b.c;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            bx

class cc
    implements android.content.DialogInterface.OnClickListener
{

    final bx a;

    cc(bx bx1)
    {
        a = bx1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        bx.e(a).setText(bx.d(a)[i]);
        bx.a(a, i);
        bx.f(a).setVisibility(0);
        bx.a(a, (c)com.clawdyvan.agendaestudantepro.c.bx.c(a).get(i));
    }
}
