// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v7.widget:
//            x, y

class ag extends DataSetObserver
{

    final x a;

    private ag(x x1)
    {
        a = x1;
        super();
    }

    ag(x x1, y y)
    {
        this(x1);
    }

    public void onChanged()
    {
        if (a.b())
        {
            a.c();
        }
    }

    public void onInvalidated()
    {
        a.a();
    }
}
