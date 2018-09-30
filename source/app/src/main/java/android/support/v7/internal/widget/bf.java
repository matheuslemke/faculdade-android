// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v4.view.dg;
import android.support.v7.widget.Toolbar;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            bd

class bf extends dg
{

    final bd a;
    private boolean b;

    bf(bd bd1)
    {
        a = bd1;
        super();
        b = false;
    }

    public void b(View view)
    {
        if (!b)
        {
            bd.a(a).setVisibility(8);
        }
    }

    public void c(View view)
    {
        b = true;
    }
}
