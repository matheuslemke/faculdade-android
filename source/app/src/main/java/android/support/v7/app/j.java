// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.au;
import android.support.v4.view.di;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateBase

class j
    implements au
{

    final ActionBarActivityDelegateBase a;

    j(ActionBarActivityDelegateBase actionbaractivitydelegatebase)
    {
        a = actionbaractivitydelegatebase;
        super();
    }

    public di a(View view, di di1)
    {
        int i = di1.b();
        int k = ActionBarActivityDelegateBase.c(a, i);
        view = di1;
        if (i != k)
        {
            view = di1.a(di1.a(), k, di1.c(), di1.d());
        }
        return view;
    }
}
