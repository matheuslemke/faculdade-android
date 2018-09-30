// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.a.b;
import android.support.v7.internal.view.e;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.v;
import android.support.v7.internal.view.menu.y;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            al, am

public class ak
    implements j, y
{

    private Context a;
    private i b;
    private View c;
    private v d;
    private am e;
    private al f;

    public ak(Context context, View view)
    {
        this(context, view, 0);
    }

    public ak(Context context, View view, int k)
    {
        this(context, view, k, b.popupMenuStyle, 0);
    }

    public ak(Context context, View view, int k, int l, int i1)
    {
        a = context;
        b = new i(context);
        b.a(this);
        c = view;
        d = new v(context, b, view, false, l, i1);
        d.a(k);
        d.a(this);
    }

    public Menu a()
    {
        return b;
    }

    public void a(i k)
    {
    }

    public void a(i k, boolean flag)
    {
        if (f != null)
        {
            f.a(this);
        }
    }

    public void a(am am1)
    {
        e = am1;
    }

    public boolean a(i k, MenuItem menuitem)
    {
        if (e != null)
        {
            return e.a(menuitem);
        } else
        {
            return false;
        }
    }

    public boolean a_(i k)
    {
        boolean flag = true;
        if (k == null)
        {
            flag = false;
        } else
        if (k.hasVisibleItems())
        {
            (new v(a, k, c)).a();
            return true;
        }
        return flag;
    }

    public MenuInflater b()
    {
        return new e(a);
    }

    public void c()
    {
        d.a();
    }
}
