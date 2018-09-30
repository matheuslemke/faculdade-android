// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.aa;
import com.a.a.ae;
import com.a.a.b.v;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;

// Referenced classes of package com.a.a.b.a:
//            ay

final class ab extends ae
{

    ab()
    {
    }

    public Number a(a a1)
    {
        c c1 = a1.f();
        switch (com.a.a.b.a.ay.a[c1.ordinal()])
        {
        case 2: // '\002'
        case 3: // '\003'
        default:
            throw new aa((new StringBuilder()).append("Expecting number, got: ").append(c1).toString());

        case 4: // '\004'
            a1.j();
            return null;

        case 1: // '\001'
            return new v(a1.h());
        }
    }

    public void a(d d1, Number number)
    {
        d1.a(number);
    }

    public volatile void a(d d1, Object obj)
    {
        a(d1, (Number)obj);
    }

    public Object b(a a1)
    {
        return a(a1);
    }
}
