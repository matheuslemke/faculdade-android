// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.ae;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;

final class ag extends ae
{

    ag()
    {
    }

    public StringBuilder a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        } else
        {
            return new StringBuilder(a1.h());
        }
    }

    public volatile void a(d d1, Object obj)
    {
        a(d1, (StringBuilder)obj);
    }

    public void a(d d1, StringBuilder stringbuilder)
    {
        if (stringbuilder == null)
        {
            stringbuilder = null;
        } else
        {
            stringbuilder = stringbuilder.toString();
        }
        d1.b(stringbuilder);
    }

    public Object b(a a1)
    {
        return a(a1);
    }
}
