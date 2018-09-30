// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.ae;
import com.a.a.af;
import com.a.a.b.b;
import com.a.a.b.f;
import com.a.a.c.a;
import com.a.a.j;
import java.util.Collection;

// Referenced classes of package com.a.a.b.a:
//            d

public final class c
    implements af
{

    private final f a;

    public c(f f1)
    {
        a = f1;
    }

    public ae a(j j1, a a1)
    {
        java.lang.reflect.Type type = a1.b();
        Class class1 = a1.a();
        if (!java/util/Collection.isAssignableFrom(class1))
        {
            return null;
        } else
        {
            type = b.a(type, class1);
            return new d(j1, type, j1.a(com.a.a.c.a.a(type)), a.a(a1));
        }
    }
}
