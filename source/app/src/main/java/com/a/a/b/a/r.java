// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.aa;
import com.a.a.ae;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.a.a.b.a:
//            s, q

public final class r extends ae
{

    private final com.a.a.b.ae a;
    private final Map b;

    private r(com.a.a.b.ae ae1, Map map)
    {
        a = ae1;
        b = map;
    }

    r(com.a.a.b.ae ae1, Map map, q q)
    {
        this(ae1, map);
    }

    public void a(d d1, Object obj)
    {
        if (obj == null)
        {
            d1.f();
            return;
        }
        d1.d();
        try
        {
            Iterator iterator = b.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                s s1 = (s)iterator.next();
                if (s1.h)
                {
                    d1.a(s1.g);
                    s1.a(d1, obj);
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            throw new AssertionError();
        }
        d1.e();
    }

    public Object b(a a1)
    {
        Object obj;
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        }
        obj = a.a();
        a1.c();
_L1:
        Object obj1;
        if (!a1.e())
        {
            break MISSING_BLOCK_LABEL_103;
        }
        obj1 = a1.g();
        obj1 = (s)b.get(obj1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        if (((s) (obj1)).i)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        a1.n();
          goto _L1
        try
        {
            ((s) (obj1)).a(a1, obj);
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new aa(a1);
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new AssertionError(a1);
        }
          goto _L1
        a1.d();
        return obj;
    }
}
