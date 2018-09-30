// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.c.b;

// Referenced classes of package android.support.v7.app:
//            d

public abstract class a
{

    public a()
    {
    }

    public abstract int a();

    public android.support.v7.c.a a(b b1)
    {
        return null;
    }

    public void a(float f1)
    {
        if (f1 != 0.0F)
        {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        } else
        {
            return;
        }
    }

    public abstract void a(int i);

    public void a(Configuration configuration)
    {
    }

    public abstract void a(d d1, boolean flag);

    public void a(CharSequence charsequence)
    {
    }

    public abstract void a(boolean flag);

    public abstract int b();

    public abstract void b(int i);

    public abstract void b(boolean flag);

    public abstract d c();

    public void c(boolean flag)
    {
    }

    public abstract void d();

    public void d(boolean flag)
    {
        if (flag)
        {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        } else
        {
            return;
        }
    }

    public Context e()
    {
        return null;
    }

    public void e(boolean flag)
    {
    }

    public void f(boolean flag)
    {
    }

    public boolean f()
    {
        return false;
    }

    public void g(boolean flag)
    {
    }

    public boolean g()
    {
        return false;
    }
}
