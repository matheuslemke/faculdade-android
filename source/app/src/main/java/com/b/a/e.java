// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;


// Referenced classes of package com.b.a:
//            ab

public class e
    implements ab
{

    public e()
    {
    }

    public Integer a(float f, Integer integer, Integer integer1)
    {
        int i = integer.intValue();
        float f1 = i;
        return Integer.valueOf((int)((float)(integer1.intValue() - i) * f + f1));
    }

    public volatile Object a(float f, Object obj, Object obj1)
    {
        return a(f, (Integer)obj, (Integer)obj1);
    }
}
