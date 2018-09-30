// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;


// Referenced classes of package com.a.a:
//            ac, ad

public abstract class ab extends Enum
{

    public static final ab a;
    public static final ab b;
    private static final ab c[];

    private ab(String s, int i)
    {
        super(s, i);
    }

    ab(String s, int i, ac ac1)
    {
        this(s, i);
    }

    public static ab valueOf(String s)
    {
        return (ab)Enum.valueOf(com/a/a/ab, s);
    }

    public static ab[] values()
    {
        return (ab[])c.clone();
    }

    static 
    {
        a = new ac("DEFAULT", 0);
        b = new ad("STRING", 1);
        c = (new ab[] {
            a, b
        });
    }
}
