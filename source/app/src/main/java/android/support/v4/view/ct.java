// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            cr, cz, cu, cp, 
//            df

class ct extends cr
{

    WeakHashMap b;

    ct()
    {
        b = null;
    }

    public void a(cp cp, View view)
    {
        cz.a(view);
    }

    public void a(cp cp, View view, float f)
    {
        cz.a(view, f);
    }

    public void a(cp cp, View view, long l)
    {
        cz.a(view, l);
    }

    public void a(cp cp, View view, df df)
    {
        view.setTag(0x7e000000, df);
        cz.a(view, new cu(cp));
    }

    public void a(cp cp, View view, Interpolator interpolator)
    {
        cz.a(view, interpolator);
    }

    public void b(cp cp, View view)
    {
        cz.b(view);
    }

    public void b(cp cp, View view, float f)
    {
        cz.b(view, f);
    }

    public void c(cp cp, View view, float f)
    {
        cz.c(view, f);
    }

    public void d(cp cp, View view, float f)
    {
        cz.d(view, f);
    }
}
