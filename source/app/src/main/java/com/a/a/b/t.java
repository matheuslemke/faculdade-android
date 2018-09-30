// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import com.a.a.ae;
import com.a.a.d.a;
import com.a.a.d.d;
import com.a.a.j;

// Referenced classes of package com.a.a.b:
//            s

class t extends ae
{

    final boolean a;
    final boolean b;
    final j c;
    final com.a.a.c.a d;
    final s e;
    private ae f;

    t(s s, boolean flag, boolean flag1, j j1, com.a.a.c.a a1)
    {
        e = s;
        a = flag;
        b = flag1;
        c = j1;
        d = a1;
        super();
    }

    private ae a()
    {
        ae ae1 = f;
        if (ae1 != null)
        {
            return ae1;
        } else
        {
            ae ae2 = c.a(e, d);
            f = ae2;
            return ae2;
        }
    }

    public void a(d d1, Object obj)
    {
        if (b)
        {
            d1.f();
            return;
        } else
        {
            a().a(d1, obj);
            return;
        }
    }

    public Object b(a a1)
    {
        if (a)
        {
            a1.n();
            return null;
        } else
        {
            return a().b(a1);
        }
    }
}
