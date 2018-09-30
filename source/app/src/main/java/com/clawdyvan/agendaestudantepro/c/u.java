// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.app.TimePickerDialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.clawdyvan.agendaestudantepro.Util.t;
import com.clawdyvan.agendaestudantepro.a.a;
import com.clawdyvan.agendaestudantepro.b.c;
import com.clawdyvan.agendaestudantepro.b.e;
import com.clawdyvan.agendaestudantepro.b.g;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            ae, w, v, x, 
//            y, z, ad, ac, 
//            aa, ab

public class u extends Fragment
{

    private final String a = "indexDiaSemana";
    private View aA;
    private android.view.View.OnClickListener aB;
    private android.view.View.OnClickListener aC;
    private EditText aj;
    private TextView ak;
    private EditText al;
    private EditText am;
    private TextView an;
    private Button ao;
    private Button ap;
    private Button aq;
    private Button ar;
    private List as;
    private String at[];
    private int au;
    private int av;
    private e aw;
    private g ax;
    private g ay;
    private boolean az;
    private final String b = "indexDisciplinas";
    private final String c = "horaInicio";
    private final String d = "horaFim";
    private final String e = "btInicio";
    private final String f = "btFim";
    private final String g = "edicao";
    private String h[];
    private TextView i;

    public u()
    {
        aB = new ae(this);
        aC = new w(this);
    }

    static int a(u u1, int j)
    {
        u1.au = j;
        return j;
    }

    private boolean a()
    {
        aw.b(am.getText().toString());
        boolean flag;
        if (!com.clawdyvan.agendaestudantepro.Util.u.a(ao.getText().toString()))
        {
            an.setTextColor(0xffff0000);
            flag = false;
        } else
        {
            aw.a(ax);
            an.setTextColor(0xff000000);
            flag = true;
        }
        if (!com.clawdyvan.agendaestudantepro.Util.u.a(ap.getText().toString()))
        {
            aw.b(null);
        } else
        {
            aw.b(ay);
        }
        if (!com.clawdyvan.agendaestudantepro.Util.u.a(al.getText().toString()))
        {
            ak.setTextColor(0xffff0000);
            flag = false;
        } else
        {
            ak.setTextColor(0xff000000);
            aw.a((c)as.get(av));
        }
        if (!com.clawdyvan.agendaestudantepro.Util.u.a(aj.getText().toString()))
        {
            i.setTextColor(0xffff0000);
            return false;
        } else
        {
            i.setTextColor(0xff000000);
            aw.a(au + 1);
            return flag;
        }
    }

    static String[] a(u u1)
    {
        return u1.h;
    }

    static int b(u u1, int j)
    {
        u1.av = j;
        return j;
    }

    static EditText b(u u1)
    {
        return u1.aj;
    }

    private void b()
    {
        as = (new a(k())).b();
        int k = as.size();
        at = new String[k];
        for (int j = 0; j < k; j++)
        {
            at[j] = ((c)as.get(j)).c();
        }

    }

    private void c(Bundle bundle)
    {
        au = bundle.getInt("indexDiaSemana");
        av = bundle.getInt("indexDisciplinas");
        ax.c(bundle.getInt("horaInicio"));
        ay.c(bundle.getInt("horaFim"));
        ao.setText(bundle.getString("btInicio"));
        ap.setText(bundle.getString("btFim"));
        az = bundle.getBoolean("edicao");
        aw = com.clawdyvan.agendaestudantepro.Util.e.b(bundle.getBundle("Horario"));
    }

    static String[] c(u u1)
    {
        return u1.at;
    }

    static EditText d(u u1)
    {
        return u1.al;
    }

    static g e(u u1)
    {
        return u1.ax;
    }

    static g f(u u1)
    {
        return u1.ay;
    }

    static boolean g(u u1)
    {
        return u1.a();
    }

    static boolean h(u u1)
    {
        return u1.az;
    }

    static e i(u u1)
    {
        return u1.aw;
    }

    private void l(Bundle bundle)
    {
        aw = com.clawdyvan.agendaestudantepro.Util.e.b(bundle);
        au = aw.b() - 1;
        aj.setText(h[au]);
        if (!aw.c().a().equals(""))
        {
            av = as.indexOf(aw.c());
            al.setText(((c)as.get(av)).c());
        }
        ax.c(aw.d().e());
        ao.setText(ax.d().replace(':', 'h'));
        if (aw.e() != null)
        {
            ay.c(aw.e().e());
            ap.setText(ay.d().replace(':', 'h'));
        }
        am.setText(aw.f());
        if (!aw.a().equals(""))
        {
            az = true;
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(bundle);
        aA = layoutinflater.inflate(0x7f03002a, viewgroup, false);
        i = (TextView)aA.findViewById(0x7f09008a);
        aj = (EditText)aA.findViewById(0x7f09008b);
        aj.setOnClickListener(new v(this));
        ak = (TextView)aA.findViewById(0x7f09005c);
        al = (EditText)aA.findViewById(0x7f09008d);
        al.setOnClickListener(new x(this));
        an = (TextView)aA.findViewById(0x7f09005d);
        ao = (Button)aA.findViewById(0x7f09008f);
        ao.setOnClickListener(new y(this));
        ap = (Button)aA.findViewById(0x7f090090);
        ap.setOnClickListener(new z(this));
        am = (EditText)aA.findViewById(0x7f090091);
        h = l().getStringArray(0x7f050002);
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            aq = (Button)aA.findViewById(0x7f09007b);
            ar = (Button)aA.findViewById(0x7f09007c);
        } else
        {
            aq = (Button)aA.findViewById(0x7f09007c);
            ar = (Button)aA.findViewById(0x7f09007b);
        }
        aq.setText(a(0x7f0b007c));
        aq.setOnClickListener(aB);
        ar.setText(a(0x7f0b001d));
        ar.setOnClickListener(aC);
        ax = new g(9, 0);
        ay = new g(9, 0);
        b();
        if (bundle != null)
        {
            c(bundle);
        } else
        {
            layoutinflater = j();
            if (layoutinflater != null)
            {
                l(layoutinflater);
            } else
            {
                aw = new e();
            }
        }
        t.a(aA);
        return aA;
    }

    public void btFimOnClick(View view)
    {
        (new TimePickerDialog(k(), new ad(this, view), ay.b(), ay.c(), true)).show();
    }

    public void btInicioOnClick(View view)
    {
        (new TimePickerDialog(k(), new ac(this, view), ax.b(), ax.c(), true)).show();
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putInt("indexDiaSemana", au);
        bundle.putInt("indexDisciplinas", av);
        bundle.putInt("horaInicio", ax.e());
        bundle.putInt("horaFim", ay.e());
        bundle.putString("btInicio", ao.getText().toString());
        bundle.putString("btFim", ap.getText().toString());
        bundle.putBoolean("edicao", az);
        bundle.putBundle("Horario", com.clawdyvan.agendaestudantepro.Util.e.a(aw));
    }

    public void etDiaSemanaOnClick(View view)
    {
        view = new android.app.AlertDialog.Builder(k());
        view.setTitle(a(0x7f0b003b));
        view.setItems(h, new aa(this));
        view.show();
    }

    public void etDisciplinaOnClick(View view)
    {
        if (at.length == 0)
        {
            Toast.makeText(k(), a(0x7f0b0063), 0).show();
            return;
        } else
        {
            view = new android.app.AlertDialog.Builder(k());
            view.setTitle(a(0x7f0b003f));
            view.setItems(at, new ab(this));
            view.show();
            return;
        }
    }
}
