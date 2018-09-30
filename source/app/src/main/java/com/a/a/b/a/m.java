// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.ae;
import com.a.a.af;
import com.a.a.b.w;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;
import com.a.a.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.a.a.b.a:
//            n, o

public final class m extends ae
{

    public static final af a = new n();
    private final j b;

    private m(j j1)
    {
        b = j1;
    }

    m(j j1, n n1)
    {
        this(j1);
    }

    public void a(d d1, Object obj)
    {
        if (obj == null)
        {
            d1.f();
            return;
        }
        ae ae1 = b.a(obj.getClass());
        if (ae1 instanceof m)
        {
            d1.d();
            d1.e();
            return;
        } else
        {
            ae1.a(d1, obj);
            return;
        }
    }

    public Object b(a a1)
    {
        c c1 = a1.f();
        switch (com.a.a.b.a.o.a[c1.ordinal()])
        {
        default:
            throw new IllegalStateException();

        case 1: // '\001'
            ArrayList arraylist = new ArrayList();
            a1.a();
            for (; a1.e(); arraylist.add(b(a1))) { }
            a1.b();
            return arraylist;

        case 2: // '\002'
            w w1 = new w();
            a1.c();
            for (; a1.e(); w1.put(a1.g(), b(a1))) { }
            a1.d();
            return w1;

        case 3: // '\003'
            return a1.h();

        case 4: // '\004'
            return Double.valueOf(a1.k());

        case 5: // '\005'
            return Boolean.valueOf(a1.i());

        case 6: // '\006'
            a1.j();
            return null;
        }
    }

}
