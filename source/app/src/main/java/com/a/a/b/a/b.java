// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.ae;
import com.a.a.af;
import com.a.a.c.a;
import com.a.a.j;
import java.lang.reflect.GenericArrayType;

// Referenced classes of package com.a.a.b.a:
//            a

final class b
    implements af
{

    b()
    {
    }

    public ae a(j j1, a a1)
    {
        a1 = a1.b();
        if (!(a1 instanceof GenericArrayType) && (!(a1 instanceof Class) || !((Class)a1).isArray()))
        {
            return null;
        } else
        {
            a1 = com.a.a.b.b.g(a1);
            return new com.a.a.b.a.a(j1, j1.a(com.a.a.c.a.a(a1)), com.a.a.b.b.e(a1));
        }
    }
}
