// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.aa;
import com.a.a.ae;
import com.a.a.b.ag;
import com.a.a.b.u;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;
import com.a.a.j;
import com.a.a.t;
import com.a.a.y;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.a.a.b.a:
//            x, k

final class l extends ae
{

    final k a;
    private final ae b;
    private final ae c;
    private final com.a.a.b.ae d;

    public l(k k1, j j, Type type, ae ae1, Type type1, ae ae2, com.a.a.b.ae ae3)
    {
        a = k1;
        super();
        b = new x(j, ae1, type);
        c = new x(j, ae2, type1);
        d = ae3;
    }

    private String a(t t1)
    {
        if (t1.i())
        {
            t1 = t1.m();
            if (t1.p())
            {
                return String.valueOf(t1.a());
            }
            if (t1.o())
            {
                return Boolean.toString(t1.f());
            }
            if (t1.q())
            {
                return t1.b();
            } else
            {
                throw new AssertionError();
            }
        }
        if (t1.j())
        {
            return "null";
        } else
        {
            throw new AssertionError();
        }
    }

    public Map a(a a1)
    {
        c c1 = a1.f();
        if (c1 == c.i)
        {
            a1.j();
            return null;
        }
        Map map = (Map)d.a();
        if (c1 == c.a)
        {
            a1.a();
            for (; a1.e(); a1.b())
            {
                a1.a();
                Object obj = b.b(a1);
                if (map.put(obj, c.b(a1)) != null)
                {
                    throw new aa((new StringBuilder()).append("duplicate key: ").append(obj).toString());
                }
            }

            a1.b();
            return map;
        }
        a1.c();
        while (a1.e()) 
        {
            u.a.a(a1);
            Object obj1 = b.b(a1);
            if (map.put(obj1, c.b(a1)) != null)
            {
                throw new aa((new StringBuilder()).append("duplicate key: ").append(obj1).toString());
            }
        }
        a1.d();
        return map;
    }

    public volatile void a(d d1, Object obj)
    {
        a(d1, (Map)obj);
    }

    public void a(d d1, Map map)
    {
        boolean flag3 = false;
        boolean flag2 = false;
        if (map == null)
        {
            d1.f();
            return;
        }
        if (!com.a.a.b.a.k.a(a))
        {
            d1.d();
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); c.a(d1, entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
                d1.a(String.valueOf(entry.getKey()));
            }

            d1.e();
            return;
        }
        ArrayList arraylist = new ArrayList(map.size());
        ArrayList arraylist1 = new ArrayList(map.size());
        map = map.entrySet().iterator();
        boolean flag = false;
        while (map.hasNext()) 
        {
            java.util.Map.Entry entry1 = (java.util.Map.Entry)map.next();
            t t1 = b.a(entry1.getKey());
            arraylist.add(t1);
            arraylist1.add(entry1.getValue());
            boolean flag1;
            if (t1.g() || t1.h())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag = flag1 | flag;
        }
        if (flag)
        {
            d1.b();
            for (int i = ((flag2) ? 1 : 0); i < arraylist.size(); i++)
            {
                d1.b();
                ag.a((t)arraylist.get(i), d1);
                c.a(d1, arraylist1.get(i));
                d1.c();
            }

            d1.c();
            return;
        }
        d1.d();
        for (int j = ((flag3) ? 1 : 0); j < arraylist.size(); j++)
        {
            d1.a(a((t)arraylist.get(j)));
            c.a(d1, arraylist1.get(j));
        }

        d1.e();
    }

    public Object b(a a1)
    {
        return a(a1);
    }
}
