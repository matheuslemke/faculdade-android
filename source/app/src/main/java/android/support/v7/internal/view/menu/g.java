// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v7.a.i;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.view.menu:
//            x, ExpandedMenuView, h, y, 
//            ad, l, i, z, 
//            m

public class g
    implements x, android.widget.AdapterView.OnItemClickListener
{

    Context a;
    LayoutInflater b;
    android.support.v7.internal.view.menu.i c;
    ExpandedMenuView d;
    int e;
    int f;
    h g;
    private int h;
    private y i;

    public g(int j, int k)
    {
        f = j;
        e = k;
    }

    public g(Context context, int j)
    {
        this(j, 0);
        a = context;
        b = LayoutInflater.from(a);
    }

    static int a(g g1)
    {
        return g1.h;
    }

    public z a(ViewGroup viewgroup)
    {
        if (d == null)
        {
            d = (ExpandedMenuView)b.inflate(i.abc_expanded_menu_layout, viewgroup, false);
            if (g == null)
            {
                g = new h(this);
            }
            d.setAdapter(g);
            d.setOnItemClickListener(this);
        }
        return d;
    }

    public ListAdapter a()
    {
        if (g == null)
        {
            g = new h(this);
        }
        return g;
    }

    public void a(Context context, android.support.v7.internal.view.menu.i j)
    {
        if (e == 0) goto _L2; else goto _L1
_L1:
        a = new ContextThemeWrapper(context, e);
        b = LayoutInflater.from(a);
_L4:
        c = j;
        if (g != null)
        {
            g.notifyDataSetChanged();
        }
        return;
_L2:
        if (a != null)
        {
            a = context;
            if (b == null)
            {
                b = LayoutInflater.from(a);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(android.support.v7.internal.view.menu.i j, boolean flag)
    {
        if (i != null)
        {
            i.a(j, flag);
        }
    }

    public void a(y y1)
    {
        i = y1;
    }

    public void a(boolean flag)
    {
        if (g != null)
        {
            g.notifyDataSetChanged();
        }
    }

    public boolean a(ad ad1)
    {
        if (!ad1.hasVisibleItems())
        {
            return false;
        }
        (new l(ad1)).a(null);
        if (i != null)
        {
            i.a_(ad1);
        }
        return true;
    }

    public boolean a(android.support.v7.internal.view.menu.i j, m m)
    {
        return false;
    }

    public boolean b()
    {
        return false;
    }

    public boolean b(android.support.v7.internal.view.menu.i j, m m)
    {
        return false;
    }

    public void onItemClick(AdapterView adapterview, View view, int j, long l1)
    {
        c.a(g.a(j), this, 0);
    }
}
