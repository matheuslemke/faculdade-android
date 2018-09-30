// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.clawdyvan.agendaestudantepro.Activities.i;
import com.clawdyvan.agendaestudantepro.Util.t;
import com.clawdyvan.agendaestudantepro.Util.v;
import com.clawdyvan.agendaestudantepro.c.ce;
import com.clawdyvan.agendaestudantepro.c.cj;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            q, r, s, t, 
//            u, v, w, x

public class p extends Fragment
    implements i
{

    private View a;
    private View aj;
    private ce ak;
    private cj al;
    private View b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;

    public p()
    {
    }

    static ce a(p p1)
    {
        return p1.ak;
    }

    static ce a(p p1, ce ce)
    {
        p1.ak = ce;
        return ce;
    }

    static cj a(p p1, cj cj)
    {
        p1.al = cj;
        return cj;
    }

    static cj b(p p1)
    {
        return p1.al;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        a = (RelativeLayout)layoutinflater.inflate(0x7f030038, viewgroup, false);
        b = a.findViewById(0x7f0900c7);
        c = a.findViewById(0x7f0900c8);
        d = a.findViewById(0x7f0900c9);
        e = a.findViewById(0x7f0900ca);
        f = a.findViewById(0x7f0900cb);
        g = a.findViewById(0x7f0900cf);
        h = a.findViewById(0x7f0900cd);
        i = a.findViewById(0x7f0900ce);
        aj = a.findViewById(0x7f0900cc);
        b.setOnClickListener(new q(this));
        c.setOnClickListener(new r(this));
        d.setOnClickListener(new s(this));
        e.setOnClickListener(new com.clawdyvan.agendaestudantepro.e.t(this));
        h.setOnClickListener(new u(this));
        aj.setOnClickListener(new com.clawdyvan.agendaestudantepro.e.v(this));
        layoutinflater = k().f();
        i.setOnClickListener(new w(this, layoutinflater));
        g.setOnClickListener(new x(this, layoutinflater));
        if (v.a())
        {
            i.setVisibility(8);
        }
        return a;
    }

    public void a()
    {
        if (i != null)
        {
            i.performClick();
        }
    }

    public void a(float f1)
    {
        if (f != null)
        {
            f.setTranslationY((float)f.getHeight() * f1);
        }
    }

    public void f()
    {
        super.f();
        t.a(a);
    }
}
