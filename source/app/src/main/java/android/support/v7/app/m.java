// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.internal.a.a;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.y;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateBase, i

final class m
    implements y
{

    final ActionBarActivityDelegateBase a;

    private m(ActionBarActivityDelegateBase actionbaractivitydelegatebase)
    {
        a = actionbaractivitydelegatebase;
        super();
    }

    m(ActionBarActivityDelegateBase actionbaractivitydelegatebase, android.support.v7.app.i i)
    {
        this(actionbaractivitydelegatebase);
    }

    public void a(i i, boolean flag)
    {
        android.support.v7.app.ActionBarActivityDelegateBase.a(a, i);
    }

    public boolean a_(i i)
    {
        a a1 = a.k();
        if (a1 != null)
        {
            a1.c(8, i);
        }
        return true;
    }
}
