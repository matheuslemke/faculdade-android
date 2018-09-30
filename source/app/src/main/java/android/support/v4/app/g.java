// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.f.a;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            aj, e, j, Fragment

class g
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final View a;
    final Object b;
    final ArrayList c;
    final j d;
    final boolean e;
    final Fragment f;
    final Fragment g;
    final e h;

    g(e e1, View view, Object obj, ArrayList arraylist, j j1, boolean flag, Fragment fragment, 
            Fragment fragment1)
    {
        h = e1;
        a = view;
        b = obj;
        c = arraylist;
        d = j1;
        e = flag;
        f = fragment;
        g = fragment1;
        super();
    }

    public boolean onPreDraw()
    {
        a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (b != null)
        {
            android.support.v4.app.aj.a(b, c);
            c.clear();
            a a1 = android.support.v4.app.e.a(h, d, e, f);
            if (a1.isEmpty())
            {
                c.add(d.d);
            } else
            {
                c.addAll(a1.values());
            }
            aj.b(b, c);
            android.support.v4.app.e.a(h, a1, d);
            android.support.v4.app.e.a(h, d, f, g, e, a1);
        }
        return true;
    }
}
