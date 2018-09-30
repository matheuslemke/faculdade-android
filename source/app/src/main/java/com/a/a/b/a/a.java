// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.ae;
import com.a.a.af;
import com.a.a.d.c;
import com.a.a.d.d;
import com.a.a.j;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.a.a.b.a:
//            b, x

public final class a extends ae
{

    public static final af a = new b();
    private final Class b;
    private final ae c;

    public a(j j, ae ae1, Class class1)
    {
        c = new x(j, ae1, class1);
        b = class1;
    }

    public void a(d d1, Object obj)
    {
        if (obj == null)
        {
            d1.f();
            return;
        }
        d1.b();
        int i = 0;
        for (int j = Array.getLength(obj); i < j; i++)
        {
            Object obj1 = Array.get(obj, i);
            c.a(d1, obj1);
        }

        d1.c();
    }

    public Object b(com.a.a.d.a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        }
        ArrayList arraylist = new ArrayList();
        a1.a();
        for (; a1.e(); arraylist.add(c.b(a1))) { }
        a1.b();
        a1 = ((com.a.a.d.a) (Array.newInstance(b, arraylist.size())));
        for (int i = 0; i < arraylist.size(); i++)
        {
            Array.set(a1, i, arraylist.get(i));
        }

        return a1;
    }

}
