// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.c.a;
import android.support.v7.c.b;
import android.support.v7.internal.view.e;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.internal.widget.x;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.internal.a:
//            b

public class f extends a
    implements j
{

    final android.support.v7.internal.a.b a;
    private b b;
    private i c;
    private WeakReference d;

    public f(android.support.v7.internal.a.b b1, b b2)
    {
        a = b1;
        super();
        b = b2;
        c = (new i(b1.e())).a(1);
        c.a(this);
    }

    public MenuInflater a()
    {
        return new e(a.e());
    }

    public void a(int k)
    {
        b(android.support.v7.internal.a.b.k(a).getResources().getString(k));
    }

    public void a(i k)
    {
        if (b == null)
        {
            return;
        } else
        {
            d();
            android.support.v7.internal.a.b.i(a).a();
            return;
        }
    }

    public void a(View view)
    {
        android.support.v7.internal.a.b.i(a).setCustomView(view);
        d = new WeakReference(view);
    }

    public void a(CharSequence charsequence)
    {
        android.support.v7.internal.a.b.i(a).setSubtitle(charsequence);
    }

    public void a(boolean flag)
    {
        super.a(flag);
        android.support.v7.internal.a.b.i(a).setTitleOptional(flag);
    }

    public boolean a(i k, MenuItem menuitem)
    {
        if (b != null)
        {
            return b.a(this, menuitem);
        } else
        {
            return false;
        }
    }

    public Menu b()
    {
        return c;
    }

    public void b(int k)
    {
        a(android.support.v7.internal.a.b.k(a).getResources().getString(k));
    }

    public void b(CharSequence charsequence)
    {
        android.support.v7.internal.a.b.i(a).setTitle(charsequence);
    }

    public void c()
    {
        if (a.a != this)
        {
            return;
        }
        if (!android.support.v7.internal.a.b.a(android.support.v7.internal.a.b.g(a), android.support.v7.internal.a.b.h(a), false))
        {
            a.b = this;
            a.c = b;
        } else
        {
            b.a(this);
        }
        b = null;
        a.l(false);
        android.support.v7.internal.a.b.i(a).b();
        android.support.v7.internal.a.b.j(a).a().sendAccessibilityEvent(32);
        android.support.v7.internal.a.b.f(a).setHideOnContentScrollEnabled(a.d);
        a.a = null;
    }

    public void d()
    {
        c.g();
        b.b(this, c);
        c.h();
        return;
        Exception exception;
        exception;
        c.h();
        throw exception;
    }

    public boolean e()
    {
        c.g();
        boolean flag = b.a(this, c);
        c.h();
        return flag;
        Exception exception;
        exception;
        c.h();
        throw exception;
    }

    public CharSequence f()
    {
        return android.support.v7.internal.a.b.i(a).getTitle();
    }

    public CharSequence g()
    {
        return android.support.v7.internal.a.b.i(a).getSubtitle();
    }

    public boolean h()
    {
        return android.support.v7.internal.a.b.i(a).d();
    }

    public View i()
    {
        if (d != null)
        {
            return (View)d.get();
        } else
        {
            return null;
        }
    }
}
