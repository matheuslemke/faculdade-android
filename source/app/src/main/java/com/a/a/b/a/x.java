// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.ae;
import com.a.a.c.a;
import com.a.a.d.d;
import com.a.a.j;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

// Referenced classes of package com.a.a.b.a:
//            r

final class x extends ae
{

    private final j a;
    private final ae b;
    private final Type c;

    x(j j1, ae ae1, Type type)
    {
        a = j1;
        b = ae1;
        c = type;
    }

    private Type a(Type type, Object obj)
    {
        Object obj1;
label0:
        {
            obj1 = type;
            if (obj == null)
            {
                break label0;
            }
            if (type != java/lang/Object && !(type instanceof TypeVariable))
            {
                obj1 = type;
                if (!(type instanceof Class))
                {
                    break label0;
                }
            }
            obj1 = obj.getClass();
        }
        return ((Type) (obj1));
    }

    public void a(d d, Object obj)
    {
        ae ae1;
        ae1 = b;
        Type type = a(c, obj);
        if (type != c)
        {
            ae1 = a.a(com.a.a.c.a.a(type));
            break MISSING_BLOCK_LABEL_38;
        }
_L1:
        ae1.a(d, obj);
        return;
        if ((ae1 instanceof r) && !(b instanceof r))
        {
            ae1 = b;
        }
          goto _L1
    }

    public Object b(com.a.a.d.a a1)
    {
        return b.b(a1);
    }
}
