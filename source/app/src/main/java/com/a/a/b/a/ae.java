// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.aa;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;
import java.math.BigDecimal;

final class ae extends com.a.a.ae
{

    ae()
    {
    }

    public BigDecimal a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        }
        try
        {
            a1 = new BigDecimal(a1.h());
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new aa(a1);
        }
        return a1;
    }

    public volatile void a(d d1, Object obj)
    {
        a(d1, (BigDecimal)obj);
    }

    public void a(d d1, BigDecimal bigdecimal)
    {
        d1.a(bigdecimal);
    }

    public Object b(a a1)
    {
        return a(a1);
    }
}
