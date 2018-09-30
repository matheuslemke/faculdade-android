// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.view.animation.Interpolator;

// Referenced classes of package com.b.a:
//            g

public abstract class f
    implements Cloneable
{

    float a;
    Class b;
    boolean c;
    private Interpolator d;

    public f()
    {
        d = null;
        c = false;
    }

    public static f a(float f1)
    {
        return new g(f1);
    }

    public static f a(float f1, float f2)
    {
        return new g(f1, f2);
    }

    public void a(Interpolator interpolator)
    {
        d = interpolator;
    }

    public abstract void a(Object obj);

    public boolean a()
    {
        return c;
    }

    public abstract Object b();

    public float c()
    {
        return a;
    }

    public Object clone()
    {
        return e();
    }

    public Interpolator d()
    {
        return d;
    }

    public abstract f e();
}
