// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.ae;
import com.a.a.af;
import com.a.a.c.a;
import com.a.a.j;

final class au
    implements af
{

    final Class a;
    final Class b;
    final ae c;

    au(Class class1, Class class2, ae ae)
    {
        a = class1;
        b = class2;
        c = ae;
        super();
    }

    public ae a(j j, a a1)
    {
        j = a1.a();
        if (j == a || j == b)
        {
            return c;
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("Factory[type=").append(b.getName()).append("+").append(a.getName()).append(",adapter=").append(c).append("]").toString();
    }
}
