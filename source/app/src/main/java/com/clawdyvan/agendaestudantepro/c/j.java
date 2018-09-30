// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.view.View;
import android.widget.Toast;
import com.clawdyvan.agendaestudantepro.Util.g;
import com.clawdyvan.agendaestudantepro.Util.m;
import com.clawdyvan.agendaestudantepro.a.b;
import com.clawdyvan.agendaestudantepro.b.d;
import com.clawdyvan.agendaestudantepro.d.a;
import java.io.File;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            f

class j
    implements android.view.View.OnClickListener
{

    final f a;

    j(f f1)
    {
        a = f1;
        super();
    }

    public void onClick(View view)
    {
        if (!f.h(a)) goto _L2; else goto _L1
_L1:
        view = new b(a.k());
        String s = f.c(a).g();
        if (!f.i(a).b().equals(""))
        {
            (new File(s)).delete();
            f.c(a).d(f.i(a).b());
        } else
        if (f.i(a).a().equals(""))
        {
            (new File(s)).delete();
            f.c(a).d("");
        } else
        {
            f.c(a).d(f.i(a).a());
        }
        if (f.j(a))
        {
            view.b(f.c(a));
            Toast.makeText(a.k(), a.a(0x7f0b0044), 0).show();
            com.clawdyvan.agendaestudantepro.c.f.a(a, true);
        } else
        {
            long l = view.a(f.c(a));
            f.c(a).a(String.valueOf(l));
            Toast.makeText(a.k(), a.a(0x7f0b0048), 0).show();
            com.clawdyvan.agendaestudantepro.c.f.a(a, true);
        }
        if (!f.c(a).i()) goto _L4; else goto _L3
_L3:
        g.a(a.k(), f.c(a));
_L5:
        ((a)a.k()).j();
        return;
_L4:
        if (f.j(a))
        {
            g.b(a.k(), f.c(a));
        }
        if (true) goto _L5; else goto _L2
_L2:
        Toast.makeText(a.k(), a.a(0x7f0b0075), 0).show();
        return;
    }
}
