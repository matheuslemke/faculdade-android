// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.Util.e;
import com.clawdyvan.agendaestudantepro.a.c;
import com.clawdyvan.agendaestudantepro.b.g;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            da, u

public class cz extends Fragment
{

    private TextView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private com.clawdyvan.agendaestudantepro.b.e f;
    private View g;
    private android.view.View.OnClickListener h;

    public cz()
    {
        h = new da(this);
    }

    private void a()
    {
        Bundle bundle = com.clawdyvan.agendaestudantepro.Util.e.a(f);
        ContainerFragmentsActivity.a(k(), com/clawdyvan/agendaestudantepro/c/u, bundle, true);
    }

    static void a(cz cz1)
    {
        cz1.a();
    }

    private void c(Bundle bundle)
    {
        bundle = bundle.getString("_id");
        f = (new c(k())).b(bundle);
        a.setText(l().getStringArray(0x7f050002)[f.b() - 1]);
        b.setText(f.c().c());
        c.setText(f.d().d().replace(':', 'h'));
        if (f.e() != null)
        {
            d.setText(f.e().d().replace(':', 'h'));
        } else
        {
            d.setText("--:--");
        }
        e.setText(f.f());
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(bundle);
        g = layoutinflater.inflate(0x7f03003e, viewgroup, false);
        a = (TextView)g.findViewById(0x7f09008a);
        a.setOnClickListener(h);
        b = (TextView)g.findViewById(0x7f09005c);
        b.setOnClickListener(h);
        c = (TextView)g.findViewById(0x7f09005d);
        c.setOnClickListener(h);
        d = (TextView)g.findViewById(0x7f09005e);
        d.setOnClickListener(h);
        e = (TextView)g.findViewById(0x7f0900e0);
        e.setOnClickListener(h);
        return g;
    }

    public void f()
    {
        super.f();
        c(j());
    }
}
