// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.bb;
import android.support.v7.c.a;
import android.support.v7.c.b;
import android.support.v7.internal.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateBase, f

class n
    implements b
{

    final ActionBarActivityDelegateBase a;
    private b b;

    public n(ActionBarActivityDelegateBase actionbaractivitydelegatebase, b b1)
    {
        a = actionbaractivitydelegatebase;
        super();
        b = b1;
    }

    public void a(a a1)
    {
        b.a(a1);
        if (a.i != null)
        {
            a.a.getWindow().getDecorView().removeCallbacks(a.j);
            a.i.dismiss();
        } else
        if (a.h != null)
        {
            a.h.setVisibility(8);
            if (a.h.getParent() != null)
            {
                bb.l((View)a.h.getParent());
            }
        }
        if (a.h != null)
        {
            a.h.removeAllViews();
        }
        if (a.a != null)
        {
            try
            {
                a.a.b(a.g);
            }
            // Misplaced declaration of an exception variable
            catch (a a1) { }
        }
        a.g = null;
    }

    public boolean a(a a1, Menu menu)
    {
        return b.a(a1, menu);
    }

    public boolean a(a a1, MenuItem menuitem)
    {
        return b.a(a1, menuitem);
    }

    public boolean b(a a1, Menu menu)
    {
        return b.b(a1, menu);
    }
}
