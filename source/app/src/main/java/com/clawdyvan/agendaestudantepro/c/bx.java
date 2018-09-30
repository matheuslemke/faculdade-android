// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.ak;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.Util.e;
import com.clawdyvan.agendaestudantepro.Util.o;
import com.clawdyvan.agendaestudantepro.a.a;
import com.clawdyvan.agendaestudantepro.a.d;
import com.clawdyvan.agendaestudantepro.b.c;
import com.clawdyvan.agendaestudantepro.b.f;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            cb, by, bz, ca, 
//            cd, af, cc

public class bx extends Fragment
{

    private final String a = "indexDisciplinas";
    private View aj;
    private android.widget.AdapterView.OnItemClickListener ak;
    private EditText b;
    private ListView c;
    private List d;
    private View e;
    private List f;
    private String g[];
    private int h;
    private View i;

    public bx()
    {
        h = -1;
        ak = new cb(this);
    }

    static int a(bx bx1, int j)
    {
        bx1.h = j;
        return j;
    }

    static List a(bx bx1)
    {
        return bx1.d;
    }

    private void a()
    {
        f = (new a(k())).b();
        int k = f.size();
        g = new String[k];
        for (int j = 0; j < k; j++)
        {
            g[j] = ((c)f.get(j)).c();
        }

    }

    private void a(c c1)
    {
        d = (new d(k())).a(c1);
        c1 = new o(k(), d);
        c.setAdapter(c1);
        if (d.size() == 0)
        {
            Toast.makeText(k(), a(0x7f0b0064), 0).show();
            i.setVisibility(4);
            return;
        } else
        {
            i.setVisibility(0);
            return;
        }
    }

    static void a(bx bx1, c c1)
    {
        bx1.a(c1);
    }

    static int b(bx bx1)
    {
        return bx1.h;
    }

    static List c(bx bx1)
    {
        return bx1.f;
    }

    static String[] d(bx bx1)
    {
        return bx1.g;
    }

    static EditText e(bx bx1)
    {
        return bx1.b;
    }

    static View f(bx bx1)
    {
        return bx1.e;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(bundle);
        aj = layoutinflater.inflate(0x7f030031, viewgroup, false);
        b = (EditText)aj.findViewById(0x7f09008d);
        b.setOnClickListener(new by(this));
        e = aj.findViewById(0x7f0900c1);
        e.setOnClickListener(new bz(this));
        c = (ListView)aj.findViewById(0x7f0900c0);
        c.setOnItemClickListener(ak);
        if (bundle != null)
        {
            h = bundle.getInt("indexDisciplinas");
        }
        a();
        i = aj.findViewById(0x7f0900bf);
        i.setOnClickListener(new ca(this));
        d(false);
        return aj;
    }

    public void a(View view)
    {
        view = new ak(k(), view);
        view.b().inflate(0x7f0d0005, view.a());
        view.a(new cd(this));
        view.c();
    }

    public void btNovaNotaOnClick(View view)
    {
        view = com.clawdyvan.agendaestudantepro.Util.e.a((c)f.get(h));
        ContainerFragmentsActivity.a(k(), com/clawdyvan/agendaestudantepro/c/af, view, true);
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putInt("indexDisciplinas", h);
    }

    public boolean e(MenuItem menuitem)
    {
        int i1 = d.size();
        if (i1 <= 0) goto _L2; else goto _L1
_L1:
        menuitem.getItemId();
        JVM INSTR tableswitch 2131296494 2131296496: default 48
    //                   2131296494 54
    //                   2131296495 130
    //                   2131296496 248;
           goto _L2 _L3 _L4 _L5
_L2:
        return super.a(menuitem);
_L3:
        int j = 0;
        float f1 = 0.0F;
        for (; j < i1; j++)
        {
            f1 += ((f)d.get(j)).b();
        }

        menuitem = String.format("%.1f", new Object[] {
            Float.valueOf(f1 / (float)i1)
        });
        Toast.makeText(k(), menuitem, 0).show();
        return true;
_L4:
        int k = 0;
        float f2 = 0.0F;
        float f4 = 0.0F;
        for (; k < i1; k++)
        {
            float f5 = ((f)d.get(k)).b();
            f4 += ((f)d.get(k)).c() * f5;
            f2 += ((f)d.get(k)).c();
        }

        menuitem = String.format("%.1f", new Object[] {
            Float.valueOf(f4 / f2)
        });
        Toast.makeText(k(), menuitem, 0).show();
        return true;
_L5:
        int l = 0;
        float f3 = 0.0F;
        for (; l < i1; l++)
        {
            f3 += ((f)d.get(l)).b();
        }

        menuitem = String.format("%.1f", new Object[] {
            Float.valueOf(f3)
        });
        Toast.makeText(k(), menuitem, 0).show();
        return true;
    }

    public void etDisciplinaOnClick(View view)
    {
        if (g.length == 0)
        {
            Toast.makeText(k(), a(0x7f0b0063), 0).show();
            return;
        } else
        {
            view = new android.app.AlertDialog.Builder(k());
            view.setTitle(a(0x7f0b003f));
            view.setItems(g, new cc(this));
            view.show();
            return;
        }
    }

    public void f()
    {
        if (h != -1)
        {
            a((c)f.get(h));
            e.setVisibility(0);
        }
        super.f();
    }
}
