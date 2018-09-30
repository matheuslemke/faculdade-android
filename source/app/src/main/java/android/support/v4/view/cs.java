// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v4.view:
//            cr, cp, cq

class cs
    implements Runnable
{

    WeakReference a;
    cp b;
    final cr c;

    private cs(cr cr1, cp cp, View view)
    {
        c = cr1;
        super();
        a = new WeakReference(view);
        b = cp;
    }

    cs(cr cr1, cp cp, View view, cq cq)
    {
        this(cr1, cp, view);
    }

    public void run()
    {
        cr.a(c, b, (View)a.get());
    }
}
