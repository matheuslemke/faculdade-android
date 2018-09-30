// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.Util.e;
import com.clawdyvan.agendaestudantepro.a.a;
import com.clawdyvan.agendaestudantepro.b.c;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            co, cl, cm, a, 
//            cn

public class ck extends Fragment
{

    private TextView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private c e;
    private View f;
    private View g;
    private View h;
    private android.view.View.OnClickListener i;

    public ck()
    {
        i = new co(this);
    }

    static c a(ck ck1)
    {
        return ck1.e;
    }

    private void c(Bundle bundle)
    {
        e = (new a(k())).b(bundle.getString("_id"));
        a.setText(e.b());
        b.setText(e.c());
        c.setText(e.d());
        d.setText(e.e());
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(bundle);
        h = layoutinflater.inflate(0x7f03003c, viewgroup, false);
        a = (TextView)h.findViewById(0x7f0900d3);
        a.setOnClickListener(i);
        b = (TextView)h.findViewById(0x7f090046);
        b.setOnClickListener(i);
        c = (TextView)h.findViewById(0x7f090047);
        c.setOnClickListener(i);
        d = (TextView)h.findViewById(0x7f0900d6);
        d.setOnClickListener(i);
        f = h.findViewById(0x7f0900d7);
        f.setOnClickListener(new cl(this));
        g = h.findViewById(0x7f0900d8);
        g.setOnClickListener(new cm(this));
        return h;
    }

    public void btEditarOnClick(View view)
    {
        view = com.clawdyvan.agendaestudantepro.Util.e.a(e);
        ContainerFragmentsActivity.a(k(), com/clawdyvan/agendaestudantepro/c/a, view, true);
    }

    public void btExcluirOnClick(View view)
    {
        view = new android.app.AlertDialog.Builder(k());
        view.setIcon(0x7f020056);
        view.setTitle(a(0x7f0b004e));
        view.setMessage(a(0x7f0b0036));
        view.setNegativeButton(a(0x7f0b0062), null);
        view.setPositiveButton(a(0x7f0b0082), new cn(this));
        view.show();
    }

    public void f()
    {
        super.f();
        c(j());
    }
}
