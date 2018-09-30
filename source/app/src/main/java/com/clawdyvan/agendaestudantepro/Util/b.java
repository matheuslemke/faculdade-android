// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Util;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.clawdyvan.agendaestudantepro.b.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Util:
//            n, t

public class b extends BaseAdapter
{

    public String a[];
    Map b;
    private final int c;
    private TextView d[];
    private Context e;
    private n f;
    private com.clawdyvan.agendaestudantepro.b.b g;
    private Integer h;

    public b(Context context, n n1)
    {
        this(context, n1.i(), n1);
    }

    public b(Context context, com.clawdyvan.agendaestudantepro.b.b b1, n n1)
    {
        c = 37;
        e = context;
        f = n1;
        g = b1;
        b1 = (LayoutInflater)context.getSystemService("layout_inflater");
        d = new TextView[42];
        b = new HashMap();
        a = context.getResources().getStringArray(0x7f050000);
        int j = d.length;
        for (int i = 0; i < j; i++)
        {
            d[i] = (TextView)b1.inflate(0x7f030042, null);
        }

        n1.c(1);
        e();
    }

    public com.clawdyvan.agendaestudantepro.b.b a()
    {
        return g;
    }

    public void a(List list)
    {
        Integer integer1;
        for (Iterator iterator = b.keySet().iterator(); iterator.hasNext(); d[integer1.intValue()].setBackgroundResource(0x7f020044))
        {
            integer1 = (Integer)iterator.next();
        }

        int i = f.g();
        b = new HashMap();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            d d1 = (d)list.next();
            int j = (d1.e().c() + (i - 1)) - 1;
            if (!b.containsKey(Integer.valueOf(j)) || ((Boolean)b.get(Integer.valueOf(j))).booleanValue())
            {
                b.put(Integer.valueOf(j), Boolean.valueOf(d1.j()));
            }
        } while (true);
        for (list = b.keySet().iterator(); list.hasNext();)
        {
            Integer integer = (Integer)list.next();
            if (!((Boolean)b.get(integer)).booleanValue())
            {
                d[integer.intValue()].setBackgroundResource(0x7f020043);
            } else
            {
                d[integer.intValue()].setBackgroundResource(0x7f020042);
            }
        }

    }

    public void b()
    {
        f.n();
        e();
    }

    public void c()
    {
        f.a();
        g = f.i();
        f.c(1);
        e();
    }

    public void d()
    {
        f.r();
        e();
    }

    public void e()
    {
        int j = f.g() - 1;
        int k = f.j();
        int i = 0;
        while (i < 37) 
        {
            if (i < j)
            {
                d[i].setText(null);
            } else
            if (i < k + j)
            {
                d[i].setText(String.format("%02d", new Object[] {
                    Integer.valueOf((i + 1) - j)
                }));
            } else
            {
                d[i].setText(null);
            }
            i++;
        }
    }

    public void f()
    {
        int i = f.g();
        if (g.b() == f.e() + 1 && g.a() == f.f())
        {
            h = Integer.valueOf(((i - 1) + g.c()) - 1);
            d[h.intValue()].setTypeface(null, 1);
            d[h.intValue()].setTextColor(t.a(e));
            return;
        } else
        {
            g();
            return;
        }
    }

    public void g()
    {
        if (h != null)
        {
            TextView textview = d[h.intValue()];
            textview.setTypeface(null, 0);
            if (h.intValue() % 7 == 0)
            {
                textview.setTextColor(0xffff0000);
            } else
            {
                textview.setTextColor(0xff000000);
            }
            h = null;
        }
    }

    public int getCount()
    {
        return d.length + a.length;
    }

    public Object getItem(int i)
    {
        if (i < a.length)
        {
            TextView textview = (TextView)((LayoutInflater)e.getSystemService("layout_inflater")).inflate(0x7f030043, null);
            textview.setText(a[i]);
            return textview;
        } else
        {
            return d[i - a.length];
        }
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = (TextView)getItem(i);
        if (i == 0)
        {
            view.setBackgroundResource(0x7f020046);
            view.setTextColor(-1);
        } else
        if (i % 7 == 0)
        {
            view.setTextColor(0xffff0000);
            return view;
        }
        return view;
    }
}
