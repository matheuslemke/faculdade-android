// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            x

class z
    implements Runnable
{

    final x a;

    z(x x1)
    {
        a = x1;
        super();
    }

    public void run()
    {
        View view = a.d();
        if (view != null && view.getWindowToken() != null)
        {
            a.c();
        }
    }
}
