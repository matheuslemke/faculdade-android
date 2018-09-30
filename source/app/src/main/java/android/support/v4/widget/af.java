// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v4.widget:
//            aj, ag, ai, ah

public class af
{

    Object a;
    ag b;

    private af(int i, Context context, Interpolator interpolator)
    {
        if (i >= 14)
        {
            b = new aj();
        } else
        if (i >= 9)
        {
            b = new ai();
        } else
        {
            b = new ah();
        }
        a = b.a(context, interpolator);
    }

    af(Context context, Interpolator interpolator)
    {
        this(android.os.Build.VERSION.SDK_INT, context, interpolator);
    }

    public static af a(Context context)
    {
        return a(context, null);
    }

    public static af a(Context context, Interpolator interpolator)
    {
        return new af(context, interpolator);
    }

    public int a()
    {
        return b.a(a);
    }

    public void a(int i, int j, int k, int l, int i1)
    {
        b.a(a, i, j, k, l, i1);
    }

    public void a(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        b.a(a, i, j, k, l, i1, j1, k1, l1);
    }

    public int b()
    {
        return b.b(a);
    }

    public int c()
    {
        return b.e(a);
    }

    public int d()
    {
        return b.f(a);
    }

    public boolean e()
    {
        return b.c(a);
    }

    public void f()
    {
        b.d(a);
    }
}
