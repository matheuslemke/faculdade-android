// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.aa;
import com.a.a.ae;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;

final class bc extends ae
{

    bc()
    {
    }

    public Number a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        }
        int i;
        try
        {
            i = a1.m();
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new aa(a1);
        }
        return Integer.valueOf(i);
    }

    public void a(d d1, Number number)
    {
        d1.a(number);
    }

    public volatile void a(d d1, Object obj)
    {
        a(d1, (Number)obj);
    }

    public Object b(a a1)
    {
        return a(a1);
    }
}
