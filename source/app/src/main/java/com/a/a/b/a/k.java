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
import java.lang.reflect.Type;
import java.util.Map;

// Referenced classes of package com.a.a.b.a:
//            y, l

public final class k
    implements af
{

    private final f a;
    private final boolean b;

    public k(f f1, boolean flag)
    {
        a = f1;
        b = flag;
    }

    private ae a(j j1, Type type)
    {
        if (type == Boolean.TYPE || type == java/lang/Boolean)
        {
            return com.a.a.b.a.y.f;
        } else
        {
            return j1.a(com.a.a.c.a.a(type));
        }
    }

    static boolean a(k k1)
    {
        return k1.b;
    }

    public ae a(j j1, a a1)
    {
        Type type = a1.b();
        if (!java/util/Map.isAssignableFrom(a1.a()))
        {
            return null;
        } else
        {
            Type atype[] = com.a.a.b.b.b(type, com.a.a.b.b.e(type));
            ae ae = a(j1, atype[0]);
            ae ae1 = j1.a(com.a.a.c.a.a(atype[1]));
            a1 = a.a(a1);
            return new l(this, j1, atype[0], ae, atype[1], ae1, a1);
        }
    }
}
