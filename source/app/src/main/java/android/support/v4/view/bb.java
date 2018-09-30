// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            bc, bk, bj, bi, 
//            bh, bg, bf, be, 
//            bd, bl, a, au, 
//            cp

public class bb
{

    static final bl a;

    public static int a(int i1, int j1, int k1)
    {
        return a.a(i1, j1, k1);
    }

    public static int a(View view)
    {
        return a.b(view);
    }

    public static void a(View view, float f1)
    {
        a.b(view, f1);
    }

    public static void a(View view, int i1, int j1, int k1, int l1)
    {
        a.a(view, i1, j1, k1, l1);
    }

    public static void a(View view, int i1, Paint paint)
    {
        a.a(view, i1, paint);
    }

    public static void a(View view, Paint paint)
    {
        a.a(view, paint);
    }

    public static void a(View view, a a1)
    {
        a.a(view, a1);
    }

    public static void a(View view, au au)
    {
        a.a(view, au);
    }

    public static void a(View view, Runnable runnable)
    {
        a.a(view, runnable);
    }

    public static void a(View view, Runnable runnable, long l1)
    {
        a.a(view, runnable, l1);
    }

    public static boolean a(View view, int i1)
    {
        return a.a(view, i1);
    }

    public static void b(View view)
    {
        a.c(view);
    }

    public static void b(View view, float f1)
    {
        a.c(view, f1);
    }

    public static void b(View view, int i1)
    {
        a.b(view, i1);
    }

    public static int c(View view)
    {
        return a.d(view);
    }

    public static void c(View view, float f1)
    {
        a.d(view, f1);
    }

    public static int d(View view)
    {
        return a.e(view);
    }

    public static void d(View view, float f1)
    {
        a.e(view, f1);
    }

    public static int e(View view)
    {
        return a.f(view);
    }

    public static void e(View view, float f1)
    {
        a.a(view, f1);
    }

    public static boolean f(View view)
    {
        return a.g(view);
    }

    public static int g(View view)
    {
        return a.h(view);
    }

    public static float h(View view)
    {
        return a.i(view);
    }

    public static int i(View view)
    {
        return a.j(view);
    }

    public static cp j(View view)
    {
        return a.k(view);
    }

    public static int k(View view)
    {
        return a.l(view);
    }

    public static void l(View view)
    {
        a.a(view);
    }

    public static boolean m(View view)
    {
        return a.m(view);
    }

    public static void n(View view)
    {
        a.n(view);
    }

    static 
    {
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 >= 21)
        {
            a = new bc();
        } else
        if (i1 >= 19)
        {
            a = new bk();
        } else
        if (i1 >= 17)
        {
            a = new bj();
        } else
        if (i1 >= 16)
        {
            a = new bi();
        } else
        if (i1 >= 14)
        {
            a = new bh();
        } else
        if (i1 >= 11)
        {
            a = new bg();
        } else
        if (i1 >= 9)
        {
            a = new bf();
        } else
        if (i1 >= 7)
        {
            a = new be();
        } else
        {
            a = new bd();
        }
    }
}
