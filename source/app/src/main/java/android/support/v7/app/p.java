// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.internal.a.a;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.y;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateBase, f, i

final class p
    implements y
{

    final ActionBarActivityDelegateBase a;

    private p(ActionBarActivityDelegateBase actionbaractivitydelegatebase)
    {
        a = actionbaractivitydelegatebase;
        super();
    }

    p(ActionBarActivityDelegateBase actionbaractivitydelegatebase, android.support.v7.app.i j)
    {
        this(actionbaractivitydelegatebase);
    }

    public void a(i j, boolean flag)
    {
label0:
        {
            i k = j.p();
            ActionBarActivityDelegateBase actionbaractivitydelegatebase;
            boolean flag1;
            if (k != j)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            actionbaractivitydelegatebase = a;
            if (flag1)
            {
                j = k;
            }
            j = android.support.v7.app.ActionBarActivityDelegateBase.a(actionbaractivitydelegatebase, j);
            if (j != null)
            {
                if (!flag1)
                {
                    break label0;
                }
                android.support.v7.app.ActionBarActivityDelegateBase.a(a, ((ActionBarActivityDelegateBase.PanelFeatureState) (j)).a, j, k);
                android.support.v7.app.ActionBarActivityDelegateBase.a(a, j, true);
            }
            return;
        }
        a.a.closeOptionsMenu();
        android.support.v7.app.ActionBarActivityDelegateBase.a(a, j, flag);
    }

    public boolean a_(i j)
    {
        if (j == null && a.b)
        {
            a a1 = a.k();
            if (a1 != null && !a.m())
            {
                a1.c(8, j);
            }
        }
        return true;
    }
}
