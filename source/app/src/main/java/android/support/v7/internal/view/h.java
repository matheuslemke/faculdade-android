// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.support.v4.view.cp;
import android.support.v4.view.df;
import android.support.v4.view.dg;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v7.internal.view:
//            i

public class h
{

    private final ArrayList a = new ArrayList();
    private long b;
    private Interpolator c;
    private df d;
    private boolean e;
    private final dg f = new i(this);

    public h()
    {
        b = -1L;
    }

    static df a(h h1)
    {
        return h1.d;
    }

    static void b(h h1)
    {
        h1.c();
    }

    static ArrayList c(h h1)
    {
        return h1.a;
    }

    private void c()
    {
        e = false;
    }

    public h a(long l)
    {
        if (!e)
        {
            b = l;
        }
        return this;
    }

    public h a(cp cp1)
    {
        if (!e)
        {
            a.add(cp1);
        }
        return this;
    }

    public h a(df df)
    {
        if (!e)
        {
            d = df;
        }
        return this;
    }

    public h a(Interpolator interpolator)
    {
        if (!e)
        {
            c = interpolator;
        }
        return this;
    }

    public void a()
    {
        if (e)
        {
            return;
        }
        cp cp1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); cp1.b())
        {
            cp1 = (cp)iterator.next();
            if (b >= 0L)
            {
                cp1.a(b);
            }
            if (c != null)
            {
                cp1.a(c);
            }
            if (d != null)
            {
                cp1.a(f);
            }
        }

        e = true;
    }

    public void b()
    {
        if (!e)
        {
            return;
        }
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((cp)iterator.next()).a()) { }
        e = false;
    }
}
