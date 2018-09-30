// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.a.c;
import com.clawdyvan.agendaestudantepro.b.e;
import com.clawdyvan.agendaestudantepro.b.g;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            bs, bv, br, bq, 
//            u

public class bp extends Fragment
{

    private TableLayout a;
    private View b;
    private View c;
    private android.view.View.OnClickListener d;
    private android.view.View.OnClickListener e;

    public bp()
    {
        d = new bs(this);
        e = new bv(this);
    }

    private Map a()
    {
        return (new c(k())).b();
    }

    static Map a(bp bp1)
    {
        return bp1.a();
    }

    static void a(bp bp1, Map map)
    {
        bp1.a(map);
    }

    private void a(Map map)
    {
        LayoutInflater layoutinflater = k().getLayoutInflater();
        a.removeAllViews();
        TableRow tablerow = (TableRow)layoutinflater.inflate(0x7f030021, null);
        a.addView(tablerow);
        int k = tablerow.getChildCount();
        for (int i = 0; i < k; i++)
        {
            tablerow.getChildAt(i).setOnClickListener(e);
        }

label0:
        for (int j = 1; j <= 7; j++)
        {
            if (!map.containsKey(Integer.valueOf(j)))
            {
                continue;
            }
            List list = (List)map.get(Integer.valueOf(j));
            int j1 = list.size();
            int k1 = a.getChildCount();
            int l = 0;
            do
            {
                if (l >= j1)
                {
                    continue label0;
                }
                View view = layoutinflater.inflate(0x7f030044, null);
                Object obj = (e)list.get(l);
                view.setTag(((e) (obj)).a());
                ((TextView)view.findViewById(0x7f0900e5)).setText(((e) (obj)).d().d());
                ((TextView)view.findViewById(0x7f0900e6)).setText(((e) (obj)).c().c());
                if (((e) (obj)).e() != null)
                {
                    ((TextView)view.findViewById(0x7f0900e7)).setText(((e) (obj)).e().d());
                } else
                {
                    ((TextView)view.findViewById(0x7f0900e7)).setText("--:--");
                }
                view.setBackgroundColor(((e) (obj)).c().f());
                if (k1 <= l + 1)
                {
                    obj = new TableRow(k());
                    a.addView(((View) (obj)));
                }
                obj = (TableRow)a.getChildAt(l + 1);
                for (int i1 = ((TableRow) (obj)).getChildCount() + 1; i1 < j; i1++)
                {
                    ((TableRow) (obj)).addView(new TextView(k()));
                }

                view.setOnClickListener(d);
                ((TableRow) (obj)).addView(view);
                l++;
            } while (true);
        }

    }

    private void b()
    {
        (new br(this)).execute(new Void[0]);
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(bundle);
        c = layoutinflater.inflate(0x7f030030, viewgroup, false);
        a = (TableLayout)c.findViewById(0x7f0900bd);
        b = c.findViewById(0x7f0900be);
        b.setOnClickListener(new bq(this));
        return c;
    }

    public void btNovoHorarioOnClick(View view)
    {
        ContainerFragmentsActivity.a(k(), com/clawdyvan/agendaestudantepro/c/u, null, true);
    }

    public void f()
    {
        b();
        super.f();
    }
}
