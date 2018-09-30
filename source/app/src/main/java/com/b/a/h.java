// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.b.a:
//            f, g, d, ab

class h
{

    int a;
    f b;
    f c;
    Interpolator d;
    ArrayList e;
    ab f;

    public transient h(f af[])
    {
        a = af.length;
        e = new ArrayList();
        e.addAll(Arrays.asList(af));
        b = (f)e.get(0);
        c = (f)e.get(a - 1);
        d = c.d();
    }

    public static transient h a(float af[])
    {
        int i = 1;
        int j = af.length;
        g ag[] = new g[Math.max(j, 2)];
        if (j == 1)
        {
            ag[0] = (g)com.b.a.f.a(0.0F);
            ag[1] = (g)com.b.a.f.a(1.0F, af[0]);
        } else
        {
            ag[0] = (g)com.b.a.f.a(0.0F, af[0]);
            while (i < j) 
            {
                ag[i] = (g)com.b.a.f.a((float)i / (float)(j - 1), af[i]);
                i++;
            }
        }
        return new d(ag);
    }

    public Object a(float f1)
    {
        if (a == 2)
        {
            float f2 = f1;
            if (d != null)
            {
                f2 = d.getInterpolation(f1);
            }
            return f.a(f2, b.b(), c.b());
        }
        if (f1 <= 0.0F)
        {
            f f6 = (f)e.get(1);
            Interpolator interpolator = f6.d();
            float f3 = f1;
            if (interpolator != null)
            {
                f3 = interpolator.getInterpolation(f1);
            }
            f1 = b.c();
            f1 = (f3 - f1) / (f6.c() - f1);
            return f.a(f1, b.b(), f6.b());
        }
        if (f1 >= 1.0F)
        {
            f f7 = (f)e.get(a - 2);
            Interpolator interpolator1 = c.d();
            float f4 = f1;
            if (interpolator1 != null)
            {
                f4 = interpolator1.getInterpolation(f1);
            }
            f1 = f7.c();
            f1 = (f4 - f1) / (c.c() - f1);
            return f.a(f1, f7.b(), c.b());
        }
        f f8 = b;
        for (int i = 1; i < a;)
        {
            f f9 = (f)e.get(i);
            if (f1 < f9.c())
            {
                Interpolator interpolator2 = f9.d();
                float f5 = f1;
                if (interpolator2 != null)
                {
                    f5 = interpolator2.getInterpolation(f1);
                }
                f1 = f8.c();
                f1 = (f5 - f1) / (f9.c() - f1);
                return f.a(f1, f8.b(), f9.b());
            }
            i++;
            f8 = f9;
        }

        return c.b();
    }

    public void a(ab ab1)
    {
        f = ab1;
    }

    public h b()
    {
        ArrayList arraylist = e;
        int j = e.size();
        f af[] = new f[j];
        for (int i = 0; i < j; i++)
        {
            af[i] = ((f)arraylist.get(i)).e();
        }

        return new h(af);
    }

    public Object clone()
    {
        return b();
    }

    public String toString()
    {
        String s = " ";
        for (int i = 0; i < a; i++)
        {
            s = (new StringBuilder()).append(s).append(((f)e.get(i)).b()).append("  ").toString();
        }

        return s;
    }
}
