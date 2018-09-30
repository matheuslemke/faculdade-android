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
import android.widget.ListView;
import android.widget.TextView;
import com.clawdyvan.agendaestudantepro.Util.g;
import com.clawdyvan.agendaestudantepro.Util.n;
import com.clawdyvan.agendaestudantepro.Util.t;
import com.clawdyvan.agendaestudantepro.b.b;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            bl, bm, bj, bi

public class bh extends Fragment
{

    private ListView a;
    private List b;
    private int c;
    private b d;
    private View e;
    private android.widget.AdapterView.OnItemClickListener f;
    private android.widget.AdapterView.OnItemLongClickListener g;

    public bh()
    {
        f = new bl(this);
        g = new bm(this);
    }

    static int a(bh bh1)
    {
        return bh1.c;
    }

    static List a(bh bh1, List list)
    {
        bh1.b = list;
        return list;
    }

    private void a()
    {
        (new bj(this)).execute(new Void[0]);
    }

    static b b(bh bh1)
    {
        return bh1.d;
    }

    static List c(bh bh1)
    {
        return bh1.b;
    }

    static View d(bh bh1)
    {
        return bh1.e;
    }

    static ListView e(bh bh1)
    {
        return bh1.a;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(bundle);
        e = layoutinflater.inflate(0x7f03002f, viewgroup, false);
        a = (ListView)e.findViewById(0x7f0900bb);
        a.setOnItemClickListener(f);
        a.setOnItemLongClickListener(g);
        e.findViewById(0x7f0900ba).setOnClickListener(new bi(this));
        viewgroup = j();
        layoutinflater = a(0x7f0b008b);
        if (viewgroup != null)
        {
            c = viewgroup.getInt("TIPO_EVENTO");
            d = new b(viewgroup.getString("Data"));
            layoutinflater = new n((new n(d)).h());
            bundle = l();
            if (viewgroup.getBoolean("EVENTOS_TABLET", false))
            {
                e.findViewById(0x7f0900b8).setVisibility(8);
            }
            if (c == 1)
            {
                viewgroup = bundle.getStringArray(0x7f050002);
                bundle = bundle.getStringArray(0x7f050005);
                layoutinflater = String.format(a(0x7f0b0090), new Object[] {
                    viewgroup[layoutinflater.g() - 1], Integer.valueOf(layoutinflater.d()), bundle[layoutinflater.e()]
                });
            } else
            if (c == 2)
            {
                layoutinflater.f(4);
                layoutinflater = String.format(a(0x7f0b0091), new Object[] {
                    Integer.valueOf(layoutinflater.k()), Integer.valueOf(layoutinflater.f())
                });
            } else
            {
                viewgroup = bundle.getStringArray(0x7f050005);
                layoutinflater = String.format(a(0x7f0b008f), new Object[] {
                    viewgroup[layoutinflater.e()], Integer.valueOf(layoutinflater.f())
                });
            }
        }
        ((TextView)e.findViewById(0x7f090049)).setText(layoutinflater);
        t.a(e);
        return e;
    }

    public void btNovoEventoOnClick(View view)
    {
        b b1;
        b1 = d;
        view = b1;
        if (c == 1) goto _L2; else goto _L1
_L1:
        view = b1;
        if (d == null) goto _L2; else goto _L3
_L3:
        n n1 = new n();
        if (c != 3 || n1.e() + 1 != d.b()) goto _L5; else goto _L4
_L4:
        view = n1.i();
_L2:
        com.clawdyvan.agendaestudantepro.Util.g.a(k(), view);
        return;
_L5:
        view = b1;
        if ((new n(d)).k() == n1.k())
        {
            view = n1.i();
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void f()
    {
        a();
        super.f();
    }
}
