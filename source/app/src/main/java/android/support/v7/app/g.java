// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.a.l;
import android.support.v7.c.b;
import android.support.v7.internal.a.a;
import android.support.v7.internal.view.e;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            h, q, ActionBarActivityDelegateBase, f, 
//            a

abstract class g
{

    final f a;
    boolean b;
    boolean c;
    boolean d;
    boolean e;
    final a f = new h(this);
    private android.support.v7.app.a g;
    private MenuInflater h;
    private a i;
    private boolean j;

    g(f f1)
    {
        a = f1;
        i = f;
    }

    static g a(f f1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return new q(f1);
        } else
        {
            return new ActionBarActivityDelegateBase(f1);
        }
    }

    abstract android.support.v7.app.a a();

    abstract android.support.v7.c.a a(b b1);

    abstract View a(String s, Context context, AttributeSet attributeset);

    abstract void a(int i1);

    abstract void a(int i1, Menu menu);

    abstract void a(Configuration configuration);

    void a(Bundle bundle)
    {
        bundle = a.obtainStyledAttributes(l.Theme);
        if (!bundle.hasValue(l.Theme_windowActionBar))
        {
            bundle.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (bundle.getBoolean(l.Theme_windowActionBar, false))
        {
            b = true;
        }
        if (bundle.getBoolean(l.Theme_windowActionBarOverlay, false))
        {
            c = true;
        }
        if (bundle.getBoolean(l.Theme_windowActionModeOverlay, false))
        {
            d = true;
        }
        e = bundle.getBoolean(l.Theme_android_windowIsFloating, false);
        bundle.recycle();
    }

    abstract void a(View view);

    abstract void a(View view, android.view.ViewGroup.LayoutParams layoutparams);

    abstract void a(CharSequence charsequence);

    boolean a(int i1, KeyEvent keyevent)
    {
        return false;
    }

    abstract boolean a(int i1, View view, Menu menu);

    boolean a(View view, Menu menu)
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            return a.onPrepareOptionsMenu(menu);
        } else
        {
            return a.b(view, menu);
        }
    }

    final android.support.v7.app.a b()
    {
        if (b && g == null)
        {
            g = a();
        }
        return g;
    }

    abstract View b(int i1);

    abstract void b(View view, android.view.ViewGroup.LayoutParams layoutparams);

    abstract boolean b(int i1, KeyEvent keyevent);

    abstract boolean b(int i1, Menu menu);

    final android.support.v7.app.a c()
    {
        return g;
    }

    abstract boolean c(int i1, Menu menu);

    MenuInflater d()
    {
        if (h == null)
        {
            h = new e(j());
        }
        return h;
    }

    abstract void e();

    abstract void f();

    abstract void g();

    abstract boolean h();

    abstract void i();

    protected final Context j()
    {
        Context context = null;
        Object obj = b();
        if (obj != null)
        {
            context = ((android.support.v7.app.a) (obj)).e();
        }
        obj = context;
        if (context == null)
        {
            obj = a;
        }
        return ((Context) (obj));
    }

    final a k()
    {
        return i;
    }

    final void l()
    {
        j = true;
    }

    final boolean m()
    {
        return j;
    }
}
