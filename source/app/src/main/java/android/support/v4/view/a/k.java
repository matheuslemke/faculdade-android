// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.os.Bundle;
import java.util.List;

// Referenced classes of package android.support.v4.view.a:
//            o, m, q, l, 
//            a

public class k
{

    private static final l a;
    private final Object b;

    public k()
    {
        b = a.a(this);
    }

    public k(Object obj)
    {
        b = obj;
    }

    public a a(int i)
    {
        return null;
    }

    public Object a()
    {
        return b;
    }

    public List a(String s, int i)
    {
        return null;
    }

    public boolean a(int i, int j, Bundle bundle)
    {
        return false;
    }

    public a b(int i)
    {
        return null;
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new o();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new m();
        } else
        {
            a = new q();
        }
    }
}
