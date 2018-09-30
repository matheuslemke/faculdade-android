// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.ae;
import com.a.a.af;
import com.a.a.c.a;
import com.a.a.j;

// Referenced classes of package com.a.a.b.a:
//            bf

final class as
    implements af
{

    as()
    {
    }

    public ae a(j j, a a1)
    {
        a1 = a1.a();
        if (!java/lang/Enum.isAssignableFrom(a1) || a1 == java/lang/Enum)
        {
            return null;
        }
        j = a1;
        if (!a1.isEnum())
        {
            j = a1.getSuperclass();
        }
        return new bf(j);
    }
}
