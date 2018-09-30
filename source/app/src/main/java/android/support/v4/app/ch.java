// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            cp, ck, ci, cm, 
//            cl, cq, cj

public class ch extends cp
{

    public static final cq a = new ci();
    private static final cj g;
    private final String b;
    private final CharSequence c;
    private final CharSequence d[];
    private final boolean e;
    private final Bundle f;

    public String a()
    {
        return b;
    }

    public CharSequence b()
    {
        return c;
    }

    public CharSequence[] c()
    {
        return d;
    }

    public boolean d()
    {
        return e;
    }

    public Bundle e()
    {
        return f;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            g = new ck();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            g = new cm();
        } else
        {
            g = new cl();
        }
    }
}
