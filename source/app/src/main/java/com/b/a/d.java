// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;

// Referenced classes of package com.b.a:
//            h, g, f, ab

class d extends h
{

    private float g;
    private float h;
    private float i;
    private boolean j;

    public transient d(g ag[])
    {
        super(ag);
        j = true;
    }

    public d a()
    {
        ArrayList arraylist = e;
        int l = e.size();
        g ag[] = new g[l];
        for (int k = 0; k < l; k++)
        {
            ag[k] = (g)((f)arraylist.get(k)).e();
        }

        return new d(ag);
    }

    public Object a(float f1)
    {
        return Float.valueOf(b(f1));
    }

    public float b(float f1)
    {
        int k = 1;
        if (a == 2)
        {
            if (j)
            {
                j = false;
                g = ((g)e.get(0)).f();
                h = ((g)e.get(1)).f();
                i = h - g;
            }
            float f2 = f1;
            if (d != null)
            {
                f2 = d.getInterpolation(f1);
            }
            if (f == null)
            {
                return g + i * f2;
            } else
            {
                return ((Number)f.a(f2, Float.valueOf(g), Float.valueOf(h))).floatValue();
            }
        }
        if (f1 <= 0.0F)
        {
            Object obj = (g)e.get(0);
            g g2 = (g)e.get(1);
            float f6 = ((g) (obj)).f();
            float f9 = g2.f();
            float f11 = ((g) (obj)).c();
            float f13 = g2.c();
            obj = g2.d();
            float f3 = f1;
            if (obj != null)
            {
                f3 = ((Interpolator) (obj)).getInterpolation(f1);
            }
            f1 = (f3 - f11) / (f13 - f11);
            if (f == null)
            {
                return f1 * (f9 - f6) + f6;
            } else
            {
                return ((Number)f.a(f1, Float.valueOf(f6), Float.valueOf(f9))).floatValue();
            }
        }
        if (f1 >= 1.0F)
        {
            Object obj1 = (g)e.get(a - 2);
            g g3 = (g)e.get(a - 1);
            float f7 = ((g) (obj1)).f();
            float f10 = g3.f();
            float f12 = ((g) (obj1)).c();
            float f14 = g3.c();
            obj1 = g3.d();
            float f4 = f1;
            if (obj1 != null)
            {
                f4 = ((Interpolator) (obj1)).getInterpolation(f1);
            }
            f1 = (f4 - f12) / (f14 - f12);
            if (f == null)
            {
                return f1 * (f10 - f7) + f7;
            } else
            {
                return ((Number)f.a(f1, Float.valueOf(f7), Float.valueOf(f10))).floatValue();
            }
        }
        g g4;
        for (g g1 = (g)e.get(0); k < a; g1 = g4)
        {
            g4 = (g)e.get(k);
            if (f1 < g4.c())
            {
                Interpolator interpolator = g4.d();
                float f5 = f1;
                if (interpolator != null)
                {
                    f5 = interpolator.getInterpolation(f1);
                }
                f1 = (f5 - g1.c()) / (g4.c() - g1.c());
                f5 = g1.f();
                float f8 = g4.f();
                if (f == null)
                {
                    return (f8 - f5) * f1 + f5;
                } else
                {
                    return ((Number)f.a(f1, Float.valueOf(f5), Float.valueOf(f8))).floatValue();
                }
            }
            k++;
        }

        return ((Number)((f)e.get(a - 1)).b()).floatValue();
    }

    public h b()
    {
        return a();
    }

    public Object clone()
    {
        return a();
    }
}
