// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.support.v4.view.bb;
import android.support.v4.view.dg;
import android.support.v7.internal.widget.ActionBarContainer;
import android.view.View;

// Referenced classes of package android.support.v7.internal.a:
//            b

class c extends dg
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public void b(View view)
    {
        if (android.support.v7.internal.a.b.a(a) && android.support.v7.internal.a.b.b(a) != null)
        {
            bb.b(android.support.v7.internal.a.b.b(a), 0.0F);
            bb.b(android.support.v7.internal.a.b.c(a), 0.0F);
        }
        if (android.support.v7.internal.a.b.d(a) != null && android.support.v7.internal.a.b.e(a) == 1)
        {
            android.support.v7.internal.a.b.d(a).setVisibility(8);
        }
        android.support.v7.internal.a.b.c(a).setVisibility(8);
        android.support.v7.internal.a.b.c(a).setTransitioning(false);
        android.support.v7.internal.a.b.a(a, null);
        a.h();
        if (android.support.v7.internal.a.b.f(a) != null)
        {
            bb.l(android.support.v7.internal.a.b.f(a));
        }
    }
}
