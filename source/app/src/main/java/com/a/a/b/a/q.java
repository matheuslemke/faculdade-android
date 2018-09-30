// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.ae;
import com.a.a.c.a;
import com.a.a.d.d;
import com.a.a.j;
import java.lang.reflect.Field;

// Referenced classes of package com.a.a.b.a:
//            s, x, p

class q extends s
{

    final ae a;
    final j b;
    final a c;
    final Field d;
    final boolean e;
    final p f;

    q(p p, String s1, boolean flag, boolean flag1, j j1, a a1, Field field, 
            boolean flag2)
    {
        f = p;
        b = j1;
        c = a1;
        d = field;
        e = flag2;
        super(s1, flag, flag1);
        a = b.a(c);
    }

    void a(com.a.a.d.a a1, Object obj)
    {
        a1 = ((com.a.a.d.a) (a.b(a1)));
        if (a1 != null || !e)
        {
            d.set(obj, a1);
        }
    }

    void a(d d1, Object obj)
    {
        obj = d.get(obj);
        (new x(b, a, c.b())).a(d1, obj);
    }
}
