// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            bh, bs

class bi extends bh
{

    bi()
    {
    }

    public void a(View view)
    {
        bs.d(view);
    }

    public void a(View view, int i, int k, int l, int i1)
    {
        bs.a(view, i, k, l, i1);
    }

    public void a(View view, Runnable runnable)
    {
        bs.a(view, runnable);
    }

    public void a(View view, Runnable runnable, long l)
    {
        bs.a(view, runnable, l);
    }

    public void b(View view, int i)
    {
        int k = i;
        if (i == 4)
        {
            k = 2;
        }
        bs.a(view, k);
    }

    public void c(View view)
    {
        bs.a(view);
    }

    public int d(View view)
    {
        return bs.b(view);
    }

    public int j(View view)
    {
        return bs.c(view);
    }

    public boolean m(View view)
    {
        return bs.e(view);
    }
}
