// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.ae;
import com.a.a.b.v;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;
import com.a.a.r;
import com.a.a.t;
import com.a.a.w;
import com.a.a.y;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.a.a.b.a:
//            ay

final class ar extends ae
{

    ar()
    {
    }

    public t a(a a1)
    {
        w w1;
        switch (com.a.a.b.a.ay.a[a1.f().ordinal()])
        {
        default:
            throw new IllegalArgumentException();

        case 3: // '\003'
            return new y(a1.h());

        case 1: // '\001'
            return new y(new v(a1.h()));

        case 2: // '\002'
            return new y(Boolean.valueOf(a1.i()));

        case 4: // '\004'
            a1.j();
            return com.a.a.v.a;

        case 5: // '\005'
            r r1 = new r();
            a1.a();
            for (; a1.e(); r1.a(a(a1))) { }
            a1.b();
            return r1;

        case 6: // '\006'
            w1 = new w();
            a1.c();
            break;
        }
        for (; a1.e(); w1.a(a1.g(), a(a1))) { }
        a1.d();
        return w1;
    }

    public void a(d d1, t t1)
    {
        if (t1 == null || t1.j())
        {
            d1.f();
            return;
        }
        if (t1.i())
        {
            t1 = t1.m();
            if (t1.p())
            {
                d1.a(t1.a());
                return;
            }
            if (t1.o())
            {
                d1.a(t1.f());
                return;
            } else
            {
                d1.b(t1.b());
                return;
            }
        }
        if (t1.g())
        {
            d1.b();
            for (t1 = t1.l().iterator(); t1.hasNext(); a(d1, (t)t1.next())) { }
            d1.c();
            return;
        }
        if (t1.h())
        {
            d1.d();
            java.util.Map.Entry entry;
            for (t1 = t1.k().o().iterator(); t1.hasNext(); a(d1, (t)entry.getValue()))
            {
                entry = (java.util.Map.Entry)t1.next();
                d1.a((String)entry.getKey());
            }

            d1.e();
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Couldn't write ").append(t1.getClass()).toString());
        }
    }

    public volatile void a(d d1, Object obj)
    {
        a(d1, (t)obj);
    }

    public Object b(a a1)
    {
        return a(a1);
    }
}
