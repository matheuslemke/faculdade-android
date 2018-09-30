// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.support.v7.widget.ac;
import android.support.v7.widget.x;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ActionMenuItemView, c, k

class b extends ac
{

    final ActionMenuItemView a;

    public b(ActionMenuItemView actionmenuitemview)
    {
        a = actionmenuitemview;
        super(actionmenuitemview);
    }

    public x a()
    {
        if (ActionMenuItemView.a(a) != null)
        {
            return ActionMenuItemView.a(a).a();
        } else
        {
            return null;
        }
    }

    protected boolean b()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (ActionMenuItemView.b(a) != null)
        {
            flag = flag1;
            if (ActionMenuItemView.b(a).a(ActionMenuItemView.c(a)))
            {
                x x1 = a();
                flag = flag1;
                if (x1 != null)
                {
                    flag = flag1;
                    if (x1.b())
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    protected boolean c()
    {
        x x1 = a();
        if (x1 != null)
        {
            x1.a();
            return true;
        } else
        {
            return false;
        }
    }
}
