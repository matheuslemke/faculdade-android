// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.ae;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;

final class z extends ae
{

    z()
    {
    }

    public Class a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        } else
        {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }
    }

    public void a(d d1, Class class1)
    {
        if (class1 == null)
        {
            d1.f();
            return;
        } else
        {
            throw new UnsupportedOperationException((new StringBuilder()).append("Attempted to serialize java.lang.Class: ").append(class1.getName()).append(". Forgot to register a type adapter?").toString());
        }
    }

    public volatile void a(d d1, Object obj)
    {
        a(d1, (Class)obj);
    }

    public Object b(a a1)
    {
        return a(a1);
    }
}
