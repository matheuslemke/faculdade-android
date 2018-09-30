// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.view.View;
import android.widget.Toast;
import com.clawdyvan.agendaestudantepro.a.c;
import com.clawdyvan.agendaestudantepro.d.a;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            u

class ae
    implements android.view.View.OnClickListener
{

    final u a;

    ae(u u1)
    {
        a = u1;
        super();
    }

    public void onClick(View view)
    {
        if (u.g(a))
        {
            view = new c(a.k());
            if (u.h(a))
            {
                view.b(u.i(a));
                Toast.makeText(a.k(), a.a(0x7f0b0053), 0).show();
            } else
            {
                view.a(u.i(a));
                Toast.makeText(a.k(), a.a(0x7f0b0054), 0).show();
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
