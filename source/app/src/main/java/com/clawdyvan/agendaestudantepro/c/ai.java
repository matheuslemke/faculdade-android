// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import android.support.v4.app.u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.clawdyvan.agendaestudantepro.Activities.MainActivity;
import com.clawdyvan.agendaestudantepro.CustomViews.CirculoView;
import com.clawdyvan.agendaestudantepro.Util.d;
import com.clawdyvan.agendaestudantepro.Util.t;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            cg, aj, ak, al, 
//            am, an, ap

public class ai extends Fragment
{

    private CirculoView a;
    private String aj[] = {
        "#1abc9c", "#16a085", "#f1c40f", "#f39c12", "#2ecc71", "#27ae60", "#e67e22", "#d35400", "#3498db", "#8FA6BF", 
        "#e74c3c", "#c0392b", "#9b59b6", "#8e44ad", "#bdc3c7", "#34495e", "#2c3e50", "#95a5a6", "#7f8c8d", "#FF8FE6", 
        "#F120FF", "#333333", "#C2C2C2", "#2980b9"
    };
    private CirculoView b;
    private CirculoView c;
    private CirculoView d;
    private CirculoView e;
    private View f;
    private d g;
    private cg h;
    private CirculoView i;

    public ai()
    {
    }

    private Bundle a()
    {
        Bundle bundle = new Bundle();
        bundle.putInt("COR_PROVA", a.getCorDesenho());
        bundle.putInt("COR_TRABALHO", b.getCorDesenho());
        bundle.putInt("COR_ATIVIDADE", c.getCorDesenho());
        bundle.putInt("COR_LIVRO", d.getCorDesenho());
        bundle.putInt("COR_BACKGROUND", e.getCorDesenho());
        return bundle;
    }

    static CirculoView a(ai ai1)
    {
        return ai1.i;
    }

    static CirculoView a(ai ai1, CirculoView circuloview)
    {
        ai1.i = circuloview;
        return circuloview;
    }

    static cg b(ai ai1)
    {
        return ai1.h;
    }

    static Bundle c(ai ai1)
    {
        return ai1.a();
    }

    static d d(ai ai1)
    {
        return ai1.g;
    }

    static CirculoView e(ai ai1)
    {
        return ai1.a;
    }

    static CirculoView f(ai ai1)
    {
        return ai1.b;
    }

    static CirculoView g(ai ai1)
    {
        return ai1.c;
    }

    static CirculoView h(ai ai1)
    {
        return ai1.d;
    }

    static CirculoView i(ai ai1)
    {
        return ai1.e;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        f = layoutinflater.inflate(0x7f03002c, viewgroup, false);
        Object obj = k().f();
        h = (cg)((u) (obj)).a("SeletorCoresDialogFragment");
        if (h != null)
        {
            ((u) (obj)).a().a(h).b();
        }
        h = new cg();
        h.a(k(), 5, aj, new aj(this));
        layoutinflater = f.findViewById(0x7f090097);
        viewgroup = f.findViewById(0x7f09009a);
        View view = f.findViewById(0x7f09009d);
        View view1 = f.findViewById(0x7f0900a0);
        View view2 = f.findViewById(0x7f0900a5);
        obj = new ak(this, ((u) (obj)));
        layoutinflater.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        viewgroup.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        view.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        view1.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        view2.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        a = (CirculoView)layoutinflater.findViewWithTag("circuloView");
        b = (CirculoView)viewgroup.findViewWithTag("circuloView");
        c = (CirculoView)view.findViewWithTag("circuloView");
        d = (CirculoView)view1.findViewWithTag("circuloView");
        e = (CirculoView)view2.findViewWithTag("circuloView");
        g = MainActivity.b(k());
        if (bundle != null)
        {
            layoutinflater = bundle.getBundle("BUNDLE_CORES");
            int j = Color.parseColor("#C2C2C2");
            a.setCorDesenho(layoutinflater.getInt("COR_PROVA", j));
            b.setCorDesenho(layoutinflater.getInt("COR_TRABALHO", j));
            c.setCorDesenho(layoutinflater.getInt("COR_ATIVIDADE", j));
            d.setCorDesenho(layoutinflater.getInt("COR_LIVRO", j));
            e.setCorDesenho(layoutinflater.getInt("COR_BACKGROUND", Color.parseColor("#2980b9")));
        } else
        {
            int k = Color.parseColor("#C2C2C2");
            a.setCorDesenho(g.a("COR_PROVA", k));
            b.setCorDesenho(g.a("COR_TRABALHO", k));
            c.setCorDesenho(g.a("COR_ATIVIDADE", k));
            d.setCorDesenho(g.a("COR_LIVRO", k));
            e.setCorDesenho(g.a("COR_BACKGROUND", Color.parseColor("#2980b9")));
        }
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            layoutinflater = (Button)f.findViewById(0x7f09007b);
            viewgroup = (Button)f.findViewById(0x7f09007c);
        } else
        {
            layoutinflater = (Button)f.findViewById(0x7f09007c);
            viewgroup = (Button)f.findViewById(0x7f09007b);
        }
        layoutinflater.setText(a(0x7f0b007c));
        layoutinflater.setOnClickListener(new al(this));
        viewgroup.setText(a(0x7f0b001d));
        viewgroup.setOnClickListener(new am(this));
        layoutinflater = f.findViewById(0x7f090096);
        viewgroup = f.findViewById(0x7f0900a4);
        layoutinflater.setOnClickListener(new an(this));
        viewgroup.setOnClickListener(new ap(this));
        t.a(k(), (TextView)f.findViewById(0x7f090098));
        t.a(k(), (TextView)f.findViewById(0x7f09009b));
        t.a(k(), (TextView)f.findViewById(0x7f09009e));
        t.a(k(), (TextView)f.findViewById(0x7f0900a1));
        t.a(k(), (TextView)f.findViewById(0x7f090077));
        return f;
    }

    public void e(Bundle bundle)
    {
        bundle.putBundle("BUNDLE_CORES", a());
        super.e(bundle);
    }
}
