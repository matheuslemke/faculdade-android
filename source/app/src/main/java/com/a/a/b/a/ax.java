// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.ae;
import com.a.a.af;
import com.a.a.c.a;
import com.a.a.j;

final class ax
    implements af
{

    final Class a;
    final ae b;

    ax(Class class1, ae ae)
    {
        a = class1;
        b = ae;
        super();
    }

    public ae a(j j, a a1)
    {
        if (a.isAssignableFrom(a1.a()))
        {
            return b;
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("Factory[typeHierarchy=").append(a.getName()).append(",adapter=").append(b).append("]").toString();
    }
}
