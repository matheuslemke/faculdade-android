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
import com.clawdyvan.agendaestudantepro.a.d;
import com.clawdyvan.agendaestudantepro.b.c;
import com.clawdyvan.agendaestudantepro.b.f;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            dg, dd, de, af, 
//            df

public class dc extends Fragment
{

    private TextView a;
    private android.view.View.OnClickListener aj;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private View f;
    private View g;
    private f h;
    private View i;

    public dc()
    {
        aj = new dg(this);
    }

    static f a(dc dc1)
    {
        return dc1.h;
    }

    private void c(Bundle bundle)
    {
        h = (new d(k())).b(bundle.getString("_id"));
        bundle = (new a(k())).b(bundle.getString("Disciplina"));
        h.a(bundle);
        a.setText(h.f().c());
        b.setText(String.valueOf(h.b()));
        c.setText(String.valueOf(h.c()));
        d.setText(h.d());
        e.setText(h.e());
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(bundle);
        i = layoutinflater.inflate(0x7f03003f, viewgroup, false);
        a = (TextView)i.findViewById(0x7f09005c);
        b = (TextView)i.findViewById(0x7f09004e);
        b.setOnClickListener(aj);
        c = (TextView)i.findViewById(0x7f09004f);
        c.setOnClickListener(aj);
        d = (TextView)i.findViewById(0x7f090049);
        d.setOnClickListener(aj);
        e = (TextView)i.findViewById(0x7f09004d);
        e.setOnClickListener(aj);
        f = i.findViewById(0x7f0900d7);
        f.setOnClickListener(new dd(this));
        g = i.findViewById(0x7f0900d8);
        g.setOnClickListener(new de(this));
        return i;
    }

    public void btEditarOnClick(View view)
    {
        view = com.clawdyvan.agendaestudantepro.Util.e.a(h);
        ContainerFragmentsActivity.a(k(), com/clawdyvan/agendaestudantepro/c/af, view, true);
    }

    public void btExcluirOnClick(View view)
    {
        view = new android.app.AlertDialog.Builder(k());
        view.setIcon(0x7f020056);
        view.setTitle(a(0x7f0b004e));
        view.setMessage(a(0x7f0b0036));
        view.setNegativeButton(a(0x7f0b0062), null);
        view.setPositiveButton(a(0x7f0b0082), new df(this));
        view.show();
    }

    public void f()
    {
        super.f();
        c(j());
    }
}
