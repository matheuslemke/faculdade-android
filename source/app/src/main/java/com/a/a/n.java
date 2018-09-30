// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;

// Referenced classes of package com.a.a:
//            ae, j

class n extends ae
{

    final j a;

    n(j j1)
    {
        a = j1;
        super();
    }

    public Float a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        } else
        {
            return Float.valueOf((float)a1.k());
        }
    }

    public void a(d d1, Number number)
    {
        if (number == null)
        {
            d1.f();
            return;
        } else
        {
            float f = number.floatValue();
            com.a.a.j.a(a, f);
            d1.a(number);
            return;
        }
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
