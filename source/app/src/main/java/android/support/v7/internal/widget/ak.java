// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v4.view.df;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            af

public class ak
    implements df
{

    final af a;
    private boolean b;
    private int c;

    protected ak(af af1)
    {
        a = af1;
        super();
        b = false;
    }

    public void a(View view)
    {
        a.setVisibility(0);
        b = false;
    }

    public void b(View view)
    {
        if (b)
        {
            return;
        } else
        {
            a.d = null;
            a.setVisibility(c);
            return;
        }
    }

    public void c(View view)
    {
        b = true;
    }
}
