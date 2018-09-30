// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.view.View;
import com.b.b.c;
import com.b.c.a.a;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.b.a:
//            ac, j, y, a

public final class i extends ac
{

    private static final Map h;
    private Object i;
    private String j;
    private c k;

    public i()
    {
    }

    private i(Object obj, String s)
    {
        i = obj;
        a(s);
    }

    public static transient i a(Object obj, String s, float af[])
    {
        obj = new i(obj, s);
        ((i) (obj)).a(af);
        return ((i) (obj));
    }

    public void a()
    {
        super.a();
    }

    void a(float f)
    {
        super.a(f);
        int i1 = this.f.length;
        for (int l = 0; l < i1; l++)
        {
            this.f[l].b(i);
        }

    }

    public void a(c c1)
    {
        if (f != null)
        {
            y y1 = f[0];
            String s = y1.c();
            y1.a(c1);
            g.remove(s);
            g.put(j, y1);
        }
        if (k != null)
        {
            j = c1.a();
        }
        k = c1;
        e = false;
    }

    public void a(String s)
    {
        if (f != null)
        {
            y y1 = f[0];
            String s1 = y1.c();
            y1.a(s);
            g.remove(s1);
            g.put(s, y1);
        }
        j = s;
        e = false;
    }

    public transient void a(float af[])
    {
        if (f == null || f.length == 0)
        {
            if (k != null)
            {
                a(new y[] {
                    com.b.a.y.a(k, af)
                });
                return;
            } else
            {
                a(new y[] {
                    com.b.a.y.a(j, af)
                });
                return;
            }
        } else
        {
            super.a(af);
            return;
        }
    }

    public com.b.a.a b()
    {
        return d();
    }

    void c()
    {
        if (!e)
        {
            if (k == null && a.a && (i instanceof View) && h.containsKey(j))
            {
                a((c)h.get(j));
            }
            int i1 = f.length;
            for (int l = 0; l < i1; l++)
            {
                f[l].a(i);
            }

            super.c();
        }
    }

    public Object clone()
    {
        return d();
    }

    public i d()
    {
        return (i)super.e();
    }

    public ac e()
    {
        return d();
    }

    public String toString()
    {
        String s = (new StringBuilder()).append("ObjectAnimator@").append(Integer.toHexString(hashCode())).append(", target ").append(i).toString();
        String s1 = s;
        if (f != null)
        {
            int l = 0;
            do
            {
                s1 = s;
                if (l >= f.length)
                {
                    break;
                }
                s = (new StringBuilder()).append(s).append("\n    ").append(f[l].toString()).toString();
                l++;
            } while (true);
        }
        return s1;
    }

    static 
    {
        h = new HashMap();
        h.put("alpha", com.b.a.j.a);
        h.put("pivotX", j.b);
        h.put("pivotY", com.b.a.j.c);
        h.put("translationX", j.d);
        h.put("translationY", j.e);
        h.put("rotation", j.f);
        h.put("rotationX", j.g);
        h.put("rotationY", j.h);
        h.put("scaleX", j.i);
        h.put("scaleY", j.j);
        h.put("scrollX", j.k);
        h.put("scrollY", j.l);
        h.put("x", j.m);
        h.put("y", j.n);
    }
}
