// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.a.b;
import com.a.a.ae;
import com.a.a.af;
import com.a.a.b.f;
import com.a.a.b.s;
import com.a.a.c.a;
import com.a.a.i;
import com.a.a.j;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.a.a.b.a:
//            q, s, r

public final class p
    implements af
{

    private final f a;
    private final i b;
    private final s c;

    public p(f f1, i j, s s1)
    {
        a = f1;
        b = j;
        c = s1;
    }

    private com.a.a.b.a.s a(j j, Field field, String s1, a a1, boolean flag, boolean flag1)
    {
        return new q(this, s1, flag, flag1, j, a1, field, com.a.a.b.af.a(a1.a()));
    }

    private String a(Field field)
    {
        b b1 = (b)field.getAnnotation(com/a/a/a/b);
        if (b1 == null)
        {
            return b.a(field);
        } else
        {
            return b1.a();
        }
    }

    private Map a(j j, a a1, Class class1)
    {
        LinkedHashMap linkedhashmap;
        java.lang.reflect.Type type;
        linkedhashmap = new LinkedHashMap();
        if (class1.isInterface())
        {
            return linkedhashmap;
        }
        type = a1.b();
_L6:
        Field afield[];
        int k;
        int l;
        if (class1 == java/lang/Object)
        {
            break; /* Loop/switch isn't completed */
        }
        afield = class1.getDeclaredFields();
        l = afield.length;
        k = 0;
_L2:
        Object obj;
        boolean flag;
        boolean flag1;
        if (k >= l)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        obj = afield[k];
        flag = a(((Field) (obj)), true);
        flag1 = a(((Field) (obj)), false);
        if (flag || flag1)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        ((Field) (obj)).setAccessible(true);
        java.lang.reflect.Type type1 = com.a.a.b.b.a(a1.b(), class1, ((Field) (obj)).getGenericType());
        obj = a(j, ((Field) (obj)), a(((Field) (obj))), com.a.a.c.a.a(type1), flag, flag1);
        obj = (com.a.a.b.a.s)linkedhashmap.put(((com.a.a.b.a.s) (obj)).g, obj);
        if (obj == null) goto _L4; else goto _L3
_L3:
        throw new IllegalArgumentException((new StringBuilder()).append(type).append(" declares multiple JSON fields named ").append(((com.a.a.b.a.s) (obj)).g).toString());
        a1 = com.a.a.c.a.a(com.a.a.b.b.a(a1.b(), class1, class1.getGenericSuperclass()));
        class1 = a1.a();
        if (true) goto _L6; else goto _L5
_L5:
        return linkedhashmap;
    }

    public ae a(j j, a a1)
    {
        Class class1 = a1.a();
        if (!java/lang/Object.isAssignableFrom(class1))
        {
            return null;
        } else
        {
            return new r(a.a(a1), a(j, a1, class1), null);
        }
    }

    public boolean a(Field field, boolean flag)
    {
        return !c.a(field.getType(), flag) && !c.a(field, flag);
    }
}
