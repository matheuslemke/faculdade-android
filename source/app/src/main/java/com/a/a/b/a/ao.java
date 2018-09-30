// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.ae;
import com.a.a.d.a;
import com.a.a.d.d;
import java.sql.Timestamp;
import java.util.Date;

// Referenced classes of package com.a.a.b.a:
//            an

class ao extends ae
{

    final ae a;
    final an b;

    ao(an an, ae ae1)
    {
        b = an;
        a = ae1;
        super();
    }

    public Timestamp a(a a1)
    {
        a1 = (Date)a.b(a1);
        if (a1 != null)
        {
            return new Timestamp(a1.getTime());
        } else
        {
            return null;
        }
    }

    public volatile void a(d d, Object obj)
    {
        a(d, (Timestamp)obj);
    }

    public void a(d d, Timestamp timestamp)
    {
        a.a(d, timestamp);
    }

    public Object b(a a1)
    {
        return a(a1);
    }
}
