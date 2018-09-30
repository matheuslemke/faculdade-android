// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import java.util.Comparator;

// Referenced classes of package android.support.v4.view:
//            cg

final class cc
    implements Comparator
{

    cc()
    {
    }

    public int a(cg cg1, cg cg2)
    {
        return cg1.b - cg2.b;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((cg)obj, (cg)obj1);
    }
}
