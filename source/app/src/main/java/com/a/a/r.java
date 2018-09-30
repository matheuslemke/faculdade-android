// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.a.a:
//            t, v

public final class r extends t
    implements Iterable
{

    private final List a = new ArrayList();

    public r()
    {
    }

    public Number a()
    {
        if (a.size() == 1)
        {
            return ((t)a.get(0)).a();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public void a(t t1)
    {
        Object obj = t1;
        if (t1 == null)
        {
            obj = v.a;
        }
        a.add(obj);
    }

    public String b()
    {
        if (a.size() == 1)
        {
            return ((t)a.get(0)).b();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public double c()
    {
        if (a.size() == 1)
        {
            return ((t)a.get(0)).c();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public long d()
    {
        if (a.size() == 1)
        {
            return ((t)a.get(0)).d();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public int e()
    {
        if (a.size() == 1)
        {
            return ((t)a.get(0)).e();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof r) && ((r)obj).a.equals(a);
    }

    public boolean f()
    {
        if (a.size() == 1)
        {
            return ((t)a.get(0)).f();
        } else
        {
            throw new IllegalStateException();
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public Iterator iterator()
    {
        return a.iterator();
    }
}
