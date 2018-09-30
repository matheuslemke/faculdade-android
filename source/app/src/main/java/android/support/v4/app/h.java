// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package android.support.v4.app:
//            e, j

class h
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final View a;
    final j b;
    final int c;
    final Object d;
    final e e;

    h(e e1, View view, j j, int i, Object obj)
    {
        e = e1;
        a = view;
        b = j;
        c = i;
        d = obj;
        super();
    }

    public boolean onPreDraw()
    {
        a.getViewTreeObserver().removeOnPreDrawListener(this);
        android.support.v4.app.e.a(e, b, c, d);
        return true;
    }
}
