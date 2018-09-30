// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.internal.a.a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            g, f

class h
    implements a
{

    final g a;

    h(g g1)
    {
        a = g1;
        super();
    }

    public View a(int i)
    {
        return null;
    }

    public boolean a(int i, Menu menu)
    {
        return a.a.a(i, menu);
    }

    public boolean a(int i, MenuItem menuitem)
    {
        return a.a.onMenuItemSelected(i, menuitem);
    }

    public boolean a(int i, View view, Menu menu)
    {
        return a.a.a(i, view, menu);
    }

    public void b(int i, Menu menu)
    {
        a.a.onPanelClosed(i, menu);
    }

    public boolean c(int i, Menu menu)
    {
        return a.a.onMenuOpened(i, menu);
    }
}
