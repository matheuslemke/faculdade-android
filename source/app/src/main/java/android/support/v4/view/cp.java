// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.view:
//            cx, cv, cw, ct, 
//            cr, cy, df, dh

public class cp
{

    static final cy a;
    private WeakReference b;
    private Runnable c;
    private Runnable d;
    private int e;

    cp(View view)
    {
        c = null;
        d = null;
        e = -1;
        b = new WeakReference(view);
    }

    static int a(cp cp1, int i)
    {
        cp1.e = i;
        return i;
    }

    static Runnable a(cp cp1)
    {
        return cp1.c;
    }

    static Runnable b(cp cp1)
    {
        return cp1.d;
    }

    static int c(cp cp1)
    {
        return cp1.e;
    }

    public cp a(float f)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view, f);
        }
        return this;
    }

    public cp a(long l)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view, l);
        }
        return this;
    }

    public cp a(df df)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view, df);
        }
        return this;
    }

    public cp a(dh dh)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view, dh);
        }
        return this;
    }

    public cp a(Interpolator interpolator)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view, interpolator);
        }
        return this;
    }

    public void a()
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view);
        }
    }

    public cp b(float f)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.b(this, view, f);
        }
        return this;
    }

    public void b()
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.b(this, view);
        }
    }

    public cp c(float f)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.c(this, view, f);
        }
        return this;
    }

    public cp d(float f)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.d(this, view, f);
        }
        return this;
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 19)
        {
            a = new cx();
        } else
        if (i >= 18)
        {
            a = new cv();
        } else
        if (i >= 16)
        {
            a = new cw();
        } else
        if (i >= 14)
        {
            a = new ct();
        } else
        {
            a = new cr();
        }
    }
}
