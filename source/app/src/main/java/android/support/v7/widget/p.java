// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            t, q, an, ao

class p
    implements t
{

    p()
    {
    }

    public float a(q q1)
    {
        return ((an)(an)q1.getBackground()).a();
    }

    public void a()
    {
    }

    public void a(q q1, float f1)
    {
        ((an)(an)q1.getBackground()).a(f1);
    }

    public void a(q q1, int i)
    {
        ((an)(an)q1.getBackground()).a(i);
    }

    public void a(q q1, Context context, int i, float f1, float f2, float f3)
    {
        q1.setBackgroundDrawable(new an(i, f1));
        context = (View)q1;
        context.setClipToOutline(true);
        context.setElevation(f2);
        b(q1, f3);
    }

    public float b(q q1)
    {
        return d(q1) * 2.0F;
    }

    public void b(q q1, float f1)
    {
        ((an)(an)q1.getBackground()).a(f1, q1.getUseCompatPadding(), q1.getPreventCornerOverlap());
        f(q1);
    }

    public float c(q q1)
    {
        return d(q1) * 2.0F;
    }

    public void c(q q1, float f1)
    {
        ((View)q1).setElevation(f1);
    }

    public float d(q q1)
    {
        return ((an)(an)q1.getBackground()).b();
    }

    public float e(q q1)
    {
        return ((View)q1).getElevation();
    }

    public void f(q q1)
    {
        if (!q1.getUseCompatPadding())
        {
            q1.a(0, 0, 0, 0);
            return;
        } else
        {
            float f1 = a(q1);
            float f2 = d(q1);
            int i = (int)Math.ceil(ao.b(f1, f2, q1.getPreventCornerOverlap()));
            int j = (int)Math.ceil(ao.a(f1, f2, q1.getPreventCornerOverlap()));
            q1.a(i, j, i, j);
            return;
        }
    }

    public void g(q q1)
    {
        b(q1, a(q1));
    }

    public void h(q q1)
    {
        b(q1, a(q1));
    }
}
