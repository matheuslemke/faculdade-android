// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.clawdyvan.agendaestudantepro.CustomViews.CirculoView;
import com.clawdyvan.agendaestudantepro.Util.e;
import com.clawdyvan.agendaestudantepro.Util.t;
import com.clawdyvan.agendaestudantepro.Util.u;
import com.clawdyvan.agendaestudantepro.Util.v;
import com.clawdyvan.agendaestudantepro.b.c;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            b, c, d

public class a extends Fragment
{

    private EditText a;
    private c aj;
    private View ak;
    private android.view.View.OnClickListener al;
    private android.view.View.OnClickListener am;
    private android.view.View.OnClickListener an;
    private TextView b;
    private EditText c;
    private EditText d;
    private EditText e;
    private Button f;
    private Button g;
    private CirculoView h;
    private boolean i;

    public a()
    {
        al = new b(this);
        am = new com.clawdyvan.agendaestudantepro.c.c(this);
        an = new d(this);
    }

    private boolean a()
    {
        boolean flag = true;
        aj.a(h.getCorDesenho());
        aj.e(e.getText().toString());
        aj.d(d.getText().toString());
        aj.c(c.getText().toString());
        if (!u.a(aj.c()))
        {
            c.requestFocus();
            b.setTextColor(0xffff0000);
            flag = false;
        }
        aj.b(a.getText().toString());
        return flag;
    }

    static boolean a(a a1)
    {
        return a1.a();
    }

    static boolean b(a a1)
    {
        return a1.i;
    }

    private String[] b()
    {
        String as[] = new String[22];
        as[0] = "#1abc9c";
        as[1] = "#16a085";
        as[2] = "#f1c40f";
        as[3] = "#f39c12";
        as[4] = "#2ecc71";
        as[5] = "#27ae60";
        as[6] = "#e67e22";
        as[7] = "#d35400";
        as[8] = "#3498db";
        as[9] = "#8FA6BF";
        as[10] = "#e74c3c";
        as[11] = "#c0392b";
        as[12] = "#9b59b6";
        as[13] = "#8e44ad";
        as[14] = "#bdc3c7";
        as[15] = "#34495e";
        as[16] = "#2c3e50";
        as[17] = "#95a5a6";
        as[18] = "#7f8c8d";
        as[19] = "#FF8FE6";
        as[20] = "#F120FF";
        as[21] = "#333333";
        if (v.a())
        {
            return as;
        } else
        {
            return (String[])(String[])Arrays.asList(as).subList(0, 16).toArray();
        }
    }

    static c c(a a1)
    {
        return a1.aj;
    }

    static CirculoView d(a a1)
    {
        return a1.h;
    }

    static String[] e(a a1)
    {
        return a1.b();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(bundle);
        ak = layoutinflater.inflate(0x7f030028, viewgroup, false);
        a = (EditText)ak.findViewById(0x7f09006f);
        b = (TextView)ak.findViewById(0x7f090046);
        c = (EditText)ak.findViewById(0x7f090071);
        d = (EditText)ak.findViewById(0x7f090073);
        e = (EditText)ak.findViewById(0x7f090075);
        h = (CirculoView)ak.findViewById(0x7f090079);
        h.setCorDesenho(0xff3498db);
        c.requestFocus();
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            f = (Button)ak.findViewById(0x7f09007b);
            g = (Button)ak.findViewById(0x7f09007c);
        } else
        {
            f = (Button)ak.findViewById(0x7f09007c);
            g = (Button)ak.findViewById(0x7f09007b);
        }
        f.setText(a(0x7f0b007c));
        f.setOnClickListener(al);
        g.setText(a(0x7f0b001d));
        g.setOnClickListener(am);
        h.setOnClickListener(an);
        layoutinflater = j();
        if (layoutinflater != null)
        {
            aj = com.clawdyvan.agendaestudantepro.Util.e.a(layoutinflater);
            a.setText(aj.b());
            c.setText(aj.c());
            d.setText(aj.d());
            e.setText(aj.e());
            h.setCorDesenho(aj.f());
            i = true;
        } else
        {
            aj = new c();
        }
        t.a(ak);
        return ak;
    }
}
