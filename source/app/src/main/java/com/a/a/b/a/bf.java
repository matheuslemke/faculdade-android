// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.a.b;
import com.a.a.ae;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

final class bf extends ae
{

    private final Map a;
    private final Map b;

    public bf(Class class1)
    {
        a = new HashMap();
        b = new HashMap();
        String s;
        Enum aenum[];
        Enum enum;
        b b1;
        int i;
        int j;
        try
        {
            aenum = (Enum[])class1.getEnumConstants();
            j = aenum.length;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new AssertionError();
        }
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        enum = aenum[i];
        s = enum.name();
        b1 = (b)class1.getField(s).getAnnotation(com/a/a/a/b);
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        s = b1.a();
        a.put(s, enum);
        b.put(enum, s);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_41;
_L1:
    }

    public Enum a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        } else
        {
            return (Enum)a.get(a1.h());
        }
    }

    public void a(d d1, Enum enum)
    {
        if (enum == null)
        {
            enum = null;
        } else
        {
            enum = (String)b.get(enum);
        }
        d1.b(enum);
    }

    public volatile void a(d d1, Object obj)
    {
        a(d1, (Enum)obj);
    }

    public Object b(a a1)
    {
        return a(a1);
    }
}
