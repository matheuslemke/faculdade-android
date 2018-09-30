// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.view.View;
import android.widget.Toast;
import com.clawdyvan.agendaestudantepro.a.d;
import com.clawdyvan.agendaestudantepro.d.a;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            af

class ag
    implements android.view.View.OnClickListener
{

    final af a;

    ag(af af1)
    {
        a = af1;
        super();
    }

    public void onClick(View view)
    {
        if (com.clawdyvan.agendaestudantepro.c.af.a(a))
        {
            view = new d(a.k());
            if (af.b(a))
            {
                view.b(af.c(a));
                Toast.makeText(a.k(), a.a(0x7f0b0069), 0).show();
            } else
            {
                view.a(af.c(a));
                Toast.makeText(a.k(), a.a(0x7f0b006a), 0).show();
            }
            ((a)a.k()).j();
            return;
        } else
        {
            Toast.makeText(a.k(), a.a(0x7f0b0075), 0).show();
            return;
        }
    }
}
