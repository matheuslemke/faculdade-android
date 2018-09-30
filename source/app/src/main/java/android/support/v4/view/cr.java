// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            cy, df, cp, cs, 
//            dh

class cr
    implements cy
{

    WeakHashMap a;

    cr()
    {
        a = null;
    }

    static void a(cr cr1, cp cp1, View view)
    {
        cr1.c(cp1, view);
    }

    private void a(View view)
    {
        if (a != null)
        {
            Runnable runnable = (Runnable)a.get(view);
            if (runnable != null)
            {
                view.removeCallbacks(runnable);
            }
        }
    }

    private void c(cp cp1, View view)
    {
        Object obj = view.getTag(0x7e000000);
        Runnable runnable;
        if (obj instanceof df)
        {
            obj = (df)obj;
        } else
        {
            obj = null;
        }
        runnable = cp.a(cp1);
        cp1 = cp.b(cp1);
        if (runnable != null)
        {
            runnable.run();
        }
        if (obj != null)
        {
            ((df) (obj)).a(view);
            ((df) (obj)).b(view);
        }
        if (cp1 != null)
        {
            cp1.run();
        }
        if (a != null)
        {
            a.remove(view);
        }
    }

    private void d(cp cp1, View view)
    {
        Runnable runnable;
        Object obj;
        if (a != null)
        {
            runnable = (Runnable)a.get(view);
        } else
        {
            runnable = null;
        }
        obj = runnable;
        if (runnable == null)
        {
            obj = new cs(this, cp1, view, null);
            if (a == null)
            {
                a = new WeakHashMap();
            }
            a.put(view, obj);
        }
        view.removeCallbacks(((Runnable) (obj)));
        view.post(((Runnable) (obj)));
    }

    public void a(cp cp1, View view)
    {
        d(cp1, view);
    }

    public void a(cp cp1, View view, float f)
    {
        d(cp1, view);
    }

    public void a(cp cp1, View view, long l)
    {
    }

    public void a(cp cp1, View view, df df1)
    {
        view.setTag(0x7e000000, df1);
    }

    public void a(cp cp1, View view, dh dh)
    {
    }

    public void a(cp cp1, View view, Interpolator interpolator)
    {
    }

    public void b(cp cp1, View view)
    {
        a(view);
        c(cp1, view);
    }

    public void b(cp cp1, View view, float f)
    {
        d(cp1, view);
    }

    public void c(cp cp1, View view, float f)
    {
        d(cp1, view);
    }

    public void d(cp cp1, View view, float f)
    {
        d(cp1, view);
    }
}
