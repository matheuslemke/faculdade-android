// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.WindowInsets;

// Referenced classes of package android.support.v4.view:
//            di

class dj extends di
{

    private final WindowInsets a;

    dj(WindowInsets windowinsets)
    {
        a = windowinsets;
    }

    public int a()
    {
        return a.getSystemWindowInsetLeft();
    }

    public di a(int i, int j, int k, int l)
    {
        return new dj(a.replaceSystemWindowInsets(i, j, k, l));
    }

    public int b()
    {
        return a.getSystemWindowInsetTop();
    }

    public int c()
    {
        return a.getSystemWindowInsetRight();
    }

    public int d()
    {
        return a.getSystemWindowInsetBottom();
    }

    WindowInsets e()
    {
        return a;
    }
}
