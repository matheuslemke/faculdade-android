// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.view.View;
import android.widget.Toast;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.a.a;
import com.clawdyvan.agendaestudantepro.c.bp;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            p

class r
    implements android.view.View.OnClickListener
{

    final p a;

    r(p p1)
    {
        a = p1;
        super();
    }

    public void onClick(View view)
    {
        if ((new a(a.k())).b().size() > 0)
        {
            ContainerFragmentsActivity.a(a.k(), com/clawdyvan/agendaestudantepro/c/bp, null, false);
            return;
        } else
        {
            Toast.makeText(a.k(), a.a(0x7f0b0074), 1).show();
            return;
        }
    }
}
