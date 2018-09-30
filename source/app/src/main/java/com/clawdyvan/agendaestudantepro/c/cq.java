// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import com.b.c.a;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.Activities.VisualizacaoFotoActivity;
import com.clawdyvan.agendaestudantepro.Util.e;
import com.clawdyvan.agendaestudantepro.Util.m;
import com.clawdyvan.agendaestudantepro.Util.n;
import com.clawdyvan.agendaestudantepro.a.b;
import com.clawdyvan.agendaestudantepro.b.d;
import com.clawdyvan.agendaestudantepro.b.g;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            cv, cx, cr, cs, 
//            ct, f, cu

public class cq extends Fragment
{

    public CheckBox a;
    private m aj;
    private View ak;
    private View al;
    private Context am;
    private android.view.View.OnClickListener an;
    private android.widget.CompoundButton.OnCheckedChangeListener ao;
    private TextView b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private Button h;
    private d i;

    public cq()
    {
        an = new cv(this);
        ao = new cx(this);
    }

    static d a(cq cq1)
    {
        return cq1.i;
    }

    private void a()
    {
        String as[] = l().getStringArray(0x7f050001);
        String as1[] = l().getStringArray(0x7f050000);
        if (i.i())
        {
            n n1 = new n(i.h());
            String s = String.format("%s, %d %s %d - %02dh%02d", new Object[] {
                as1[n1.g() - 1], Integer.valueOf(n1.d()), as[n1.e()], Integer.valueOf(n1.f()), Integer.valueOf(n1.c()), Integer.valueOf(n1.b())
            });
            g.setText(s);
            return;
        } else
        {
            g.setText("");
            return;
        }
    }

    private void a(View view, boolean flag)
    {
        if (flag)
        {
            com.b.c.a.a(view, 0.4F);
            return;
        } else
        {
            com.b.c.a.a(view, 1.0F);
            return;
        }
    }

    static void a(cq cq1, View view, boolean flag)
    {
        cq1.a(view, flag);
    }

    static View b(cq cq1)
    {
        return cq1.al;
    }

    static Context c(cq cq1)
    {
        return cq1.am;
    }

    private boolean c(Bundle bundle)
    {
        b b1 = new b(k());
        String as[];
        String as1[];
        try
        {
            i = b1.b(bundle.getString("_id"));
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            k().onBackPressed();
            return false;
        }
        a.setChecked(i.j());
        a(al, i.j());
        a.setOnCheckedChangeListener(ao);
        b.setText(l().getStringArray(0x7f050008)[i.a() - 1]);
        c.setText(i.c());
        d.setText(i.d());
        bundle = new n();
        bundle.e(i.e().a());
        bundle.d(i.e().b() - 1);
        bundle.c(i.e().c());
        as = l().getStringArray(0x7f050001);
        as1 = l().getStringArray(0x7f050000);
        e.setText(String.format("%s, %d %s %d", new Object[] {
            as1[bundle.g() - 1], Integer.valueOf(bundle.d()), as[bundle.e()], Integer.valueOf(bundle.f())
        }));
        if (i.f() != null)
        {
            f.setText(i.f().d().replace(':', 'h'));
        }
        a();
        return true;
    }

    static void d(cq cq1)
    {
        cq1.a();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(bundle);
        ak = layoutinflater.inflate(0x7f03003d, viewgroup, false);
        am = k();
        al = ak.findViewById(0x7f0900d9);
        a = (CheckBox)ak.findViewById(0x7f09004c);
        b = (TextView)ak.findViewById(0x7f09007e);
        b.setOnClickListener(an);
        c = (TextView)ak.findViewById(0x7f090049);
        c.setOnClickListener(an);
        d = (TextView)ak.findViewById(0x7f09004d);
        d.setOnClickListener(an);
        e = (TextView)ak.findViewById(0x7f09004a);
        e.setOnClickListener(an);
        f = (TextView)ak.findViewById(0x7f09004b);
        f.setOnClickListener(an);
        g = (TextView)ak.findViewById(0x7f0900da);
        g.setOnClickListener(an);
        h = (Button)ak.findViewById(0x7f090085);
        h.setOnClickListener(new cr(this));
        ak.findViewById(0x7f0900d7).setOnClickListener(new cs(this));
        ak.findViewById(0x7f0900d8).setOnClickListener(new ct(this));
        return ak;
    }

    public void btEditarOnClick(View view)
    {
        view = com.clawdyvan.agendaestudantepro.Util.e.a(i);
        ContainerFragmentsActivity.a(k(), com/clawdyvan/agendaestudantepro/c/f, view, true);
    }

    public void btExcluirOnClick(View view)
    {
        view = new android.app.AlertDialog.Builder(k());
        view.setIcon(0x7f020056);
        view.setTitle(a(0x7f0b004e));
        view.setMessage(a(0x7f0b0036));
        view.setNegativeButton(a(0x7f0b0062), null);
        view.setPositiveButton(a(0x7f0b0082), new cu(this));
        view.show();
    }

    public void btFotoOnClick(View view)
    {
        view = Environment.getExternalStorageState();
        if ("mounted".equals(view) || "mounted_ro".equals(view))
        {
            view = new Intent(k(), com/clawdyvan/agendaestudantepro/Activities/VisualizacaoFotoActivity);
            view.putExtra("fotoHandler", aj);
            view.putExtra("apenasVisualizacao", true);
            a(view);
            return;
        } else
        {
            Toast.makeText(k(), a(0x7f0b001e), 1).show();
            return;
        }
    }

    public void f()
    {
        super.f();
        if (!c(j()))
        {
            return;
        }
        if (!i.g().equals(""))
        {
            h.setEnabled(true);
            h.setTextColor(0xff0000ff);
            h.setText(l().getString(0x7f0b001a));
        }
        aj = new m();
        aj.a(i.g());
    }
}
