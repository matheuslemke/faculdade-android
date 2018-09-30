// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

class bs
{

    public static void a(View view)
    {
        view.postInvalidateOnAnimation();
    }

    public static void a(View view, int i)
    {
        view.setImportantForAccessibility(i);
    }

    public static void a(View view, int i, int j, int k, int l)
    {
        view.postInvalidate(i, j, k, l);
    }

    public static void a(View view, Runnable runnable)
    {
        view.postOnAnimation(runnable);
    }

    public static void a(View view, Runnable runnable, long l)
    {
        view.postOnAnimationDelayed(runnable, l);
    }

    public static int b(View view)
    {
        return view.getImportantForAccessibility();
    }

    public static int c(View view)
    {
        return view.getMinimumHeight();
    }

    public static void d(View view)
    {
        view.requestFitSystemWindows();
    }

    public static boolean e(View view)
    {
        return view.getFitsSystemWindows();
    }
}
