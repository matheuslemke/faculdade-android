// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.widget:
//            x, aj, y

class ah
    implements android.widget.AbsListView.OnScrollListener
{

    final x a;

    private ah(x x1)
    {
        a = x1;
        super();
    }

    ah(x x1, y y)
    {
        this(x1);
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 1 && !a.f() && x.b(a).getContentView() != null)
        {
            x.d(a).removeCallbacks(x.c(a));
            x.c(a).run();
        }
    }
}
