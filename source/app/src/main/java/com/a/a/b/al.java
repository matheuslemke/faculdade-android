// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import java.lang.reflect.Method;

// Referenced classes of package com.a.a.b:
//            ak

final class al extends ak
{

    final Method a;
    final Object b;

    al(Method method, Object obj)
    {
        a = method;
        b = obj;
        super();
    }

    public Object a(Class class1)
    {
        return a.invoke(b, new Object[] {
            class1
        });
    }
}
