// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.widget.ac;
import android.support.v7.widget.x;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            SpinnerCompat, as, ap

class al extends ac
{

    final ap a;
    final SpinnerCompat b;

    al(SpinnerCompat spinnercompat, View view, ap ap)
    {
        b = spinnercompat;
        a = ap;
        super(view);
    }

    public x a()
    {
        return a;
    }

    public boolean b()
    {
        if (!SpinnerCompat.a(b).b())
        {
            SpinnerCompat.a(b).c();
        }
        return true;
    }
}
