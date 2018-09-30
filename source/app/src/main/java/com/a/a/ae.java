// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import com.a.a.b.a.i;
import com.a.a.d.a;
import com.a.a.d.d;
import java.io.IOException;

// Referenced classes of package com.a.a:
//            u, t

public abstract class ae
{

    public ae()
    {
    }

    public final t a(Object obj)
    {
        try
        {
            i j = new i();
            a(((d) (j)), obj);
            obj = j.a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new u(((Throwable) (obj)));
        }
        return ((t) (obj));
    }

    public abstract void a(d d, Object obj);

    public abstract Object b(a a1);
}
