// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v4.view.bb;
import android.support.v4.view.cp;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarOverlayLayout, ActionBarContainer

class k
    implements Runnable
{

    final ActionBarOverlayLayout a;

    k(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        a = actionbaroverlaylayout;
        super();
    }

    public void run()
    {
        ActionBarOverlayLayout.a(a);
        ActionBarOverlayLayout.a(a, bb.j(ActionBarOverlayLayout.c(a)).c(-ActionBarOverlayLayout.c(a).getHeight()).a(ActionBarOverlayLayout.b(a)));
        if (ActionBarOverlayLayout.d(a) != null && ActionBarOverlayLayout.d(a).getVisibility() != 8)
        {
            ActionBarOverlayLayout.b(a, bb.j(ActionBarOverlayLayout.d(a)).c(ActionBarOverlayLayout.d(a).getHeight()).a(ActionBarOverlayLayout.e(a)));
        }
    }
}
