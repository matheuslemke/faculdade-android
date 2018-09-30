// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import com.a.a.ae;
import com.a.a.b.a.y;
import com.a.a.d.d;
import com.a.a.t;
import java.io.Writer;

// Referenced classes of package com.a.a.b:
//            ai

public final class ag
{

    public static Writer a(Appendable appendable)
    {
        if (appendable instanceof Writer)
        {
            return (Writer)appendable;
        } else
        {
            return new ai(appendable, null);
        }
    }

    public static void a(t t, d d)
    {
        y.P.a(d, t);
    }
}
