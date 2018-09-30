// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import com.a.a.d.a;
import com.a.a.d.d;

// Referenced classes of package com.a.a:
//            ae

class p extends ae
{

    private ae a;

    p()
    {
    }

    public void a(ae ae1)
    {
        if (a != null)
        {
            throw new AssertionError();
        } else
        {
            a = ae1;
            return;
        }
    }

    public void a(d d, Object obj)
    {
        if (a == null)
        {
            throw new IllegalStateException();
        } else
        {
            a.a(d, obj);
            return;
        }
    }

    public Object b(a a1)
    {
        if (a == null)
        {
            throw new IllegalStateException();
        } else
        {
            return a.b(a1);
        }
    }
}
