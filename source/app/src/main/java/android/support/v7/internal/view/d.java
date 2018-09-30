// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.support.v4.c.a.a;
import android.support.v4.f.m;
import android.support.v7.c.b;
import android.support.v7.internal.view.menu.ab;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.view:
//            c

public class d
    implements b
{

    final android.view.ActionMode.Callback a;
    final Context b;
    final m c = new m();
    final m d = new m();

    public d(Context context, android.view.ActionMode.Callback callback)
    {
        b = context;
        a = callback;
    }

    private Menu a(Menu menu)
    {
        Menu menu2 = (Menu)d.get(menu);
        Menu menu1 = menu2;
        if (menu2 == null)
        {
            menu1 = ab.a(b, (a)menu);
            d.put(menu, menu1);
        }
        return menu1;
    }

    private ActionMode b(android.support.v7.c.a a1)
    {
        c c1 = (c)c.get(a1);
        if (c1 != null)
        {
            return c1;
        } else
        {
            c c2 = new c(b, a1);
            c.put(a1, c2);
            return c2;
        }
    }

    public void a(android.support.v7.c.a a1)
    {
        a.onDestroyActionMode(b(a1));
    }

    public boolean a(android.support.v7.c.a a1, Menu menu)
    {
        return a.onCreateActionMode(b(a1), a(menu));
    }

    public boolean a(android.support.v7.c.a a1, MenuItem menuitem)
    {
        return a.onActionItemClicked(b(a1), ab.a(b, (android.support.v4.c.a.b)menuitem));
    }

    public boolean b(android.support.v7.c.a a1, Menu menu)
    {
        return a.onPrepareActionMode(b(a1), a(menu));
    }
}
