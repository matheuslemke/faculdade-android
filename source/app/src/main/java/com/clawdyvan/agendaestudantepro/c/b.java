// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.view.View;
import android.widget.Toast;
import com.clawdyvan.agendaestudantepro.a.a;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            a

class b
    implements android.view.View.OnClickListener
{

    final com.clawdyvan.agendaestudantepro.c.a a;

    b(com.clawdyvan.agendaestudantepro.c.a a1)
    {
        a = a1;
        super();
    }

    public void onClick(View view)
    {
        if (com.clawdyvan.agendaestudantepro.c.a.a(a))
        {
            view = new a(a.k());
            if (com.clawdyvan.agendaestudantepro.c.a.b(a))
            {
                view.b(com.clawdyvan.agendaestudantepro.c.a.c(a));
                Toast.makeText(a.k(), a.a(0x7f0b003d), 0).show();
            } else
            {
                view.a(com.clawdyvan.agendaestudantepro.c.a.c(a));
                Toast.makeText(a.k(), a.a(0x7f0b003e), 0).show();
            }
            ((com.clawdyvan.agendaestudantepro.d.a)a.k()).j();
            return;
        } else
        {
            Toast.makeText(a.k(), a.a(0x7f0b0075), 0).show();
            return;
        }
    }
}
