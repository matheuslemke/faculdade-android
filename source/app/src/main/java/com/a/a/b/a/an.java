// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.ae;
import com.a.a.af;
import com.a.a.c.a;
import com.a.a.j;
import java.sql.Timestamp;
import java.util.Date;

// Referenced classes of package com.a.a.b.a:
//            ao

final class an
    implements af
{

    an()
    {
    }

    public ae a(j j1, a a1)
    {
        if (a1.a() != java/sql/Timestamp)
        {
            return null;
        } else
        {
            return new ao(this, j1.a(java/util/Date));
        }
    }
}
