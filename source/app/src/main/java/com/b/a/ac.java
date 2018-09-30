// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.b.a:
//            a, ad, ae, af, 
//            ag, ah, e, c, 
//            b, ai, y, aj, 
//            ab

public class ac extends a
{

    private static ThreadLocal h = new ThreadLocal();
    private static final ThreadLocal i = new ad();
    private static final ThreadLocal j = new ae();
    private static final ThreadLocal k = new af();
    private static final ThreadLocal l = new ag();
    private static final ThreadLocal m = new ah();
    private static final Interpolator n = new AccelerateDecelerateInterpolator();
    private static final ab o = new e();
    private static final ab p = new c();
    private static long z = 10L;
    private int A;
    private int B;
    private Interpolator C;
    private ArrayList D;
    long b;
    long c;
    int d;
    boolean e;
    y f[];
    HashMap g;
    private boolean q;
    private int r;
    private float s;
    private boolean t;
    private long u;
    private boolean v;
    private boolean w;
    private long x;
    private long y;

    public ac()
    {
        c = -1L;
        q = false;
        r = 0;
        s = 0.0F;
        t = false;
        d = 0;
        v = false;
        w = false;
        e = false;
        x = 300L;
        y = 0L;
        A = 0;
        B = 1;
        C = n;
        D = null;
    }

    static long a(ac ac1)
    {
        return ac1.y;
    }

    private void a(boolean flag)
    {
        if (Looper.myLooper() == null)
        {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        q = flag;
        r = 0;
        d = 0;
        w = true;
        t = false;
        ((ArrayList)j.get()).add(this);
        if (y == 0L)
        {
            a(f());
            d = 0;
            v = true;
            if (a != null)
            {
                ArrayList arraylist = (ArrayList)a.clone();
                int j1 = arraylist.size();
                for (int i1 = 0; i1 < j1; i1++)
                {
                    ((b)arraylist.get(i1)).a(this);
                }

            }
        }
        ai ai2 = (ai)h.get();
        ai ai1 = ai2;
        if (ai2 == null)
        {
            ai1 = new ai(null);
            h.set(ai1);
        }
        ai1.sendEmptyMessage(0);
    }

    static boolean a(ac ac1, long l1)
    {
        return ac1.c(l1);
    }

    static boolean a(ac ac1, boolean flag)
    {
        ac1.v = flag;
        return flag;
    }

    static void b(ac ac1)
    {
        ac1.m();
    }

    static void c(ac ac1)
    {
        ac1.d();
    }

    private boolean c(long l1)
    {
        if (!t)
        {
            t = true;
            u = l1;
        } else
        {
            long l2 = l1 - u;
            if (l2 > y)
            {
                b = l1 - (l2 - y);
                d = 1;
                return true;
            }
        }
        return false;
    }

    private void d()
    {
        ((ArrayList)i.get()).remove(this);
        ((ArrayList)j.get()).remove(this);
        ((ArrayList)k.get()).remove(this);
        d = 0;
        if (v && a != null)
        {
            ArrayList arraylist = (ArrayList)a.clone();
            int j1 = arraylist.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                ((b)arraylist.get(i1)).b(this);
            }

        }
        v = false;
        w = false;
    }

    static ThreadLocal g()
    {
        return i;
    }

    static ThreadLocal h()
    {
        return k;
    }

    static ThreadLocal i()
    {
        return j;
    }

    static ThreadLocal j()
    {
        return m;
    }

    static ThreadLocal k()
    {
        return l;
    }

    static long l()
    {
        return z;
    }

    private void m()
    {
        c();
        ((ArrayList)i.get()).add(this);
        if (y > 0L && a != null)
        {
            ArrayList arraylist = (ArrayList)a.clone();
            int j1 = arraylist.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                ((b)arraylist.get(i1)).a(this);
            }

        }
    }

    public void a()
    {
        a(false);
    }

    void a(float f1)
    {
        f1 = C.getInterpolation(f1);
        s = f1;
        int k1 = f.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            f[i1].a(f1);
        }

        if (D != null)
        {
            int l1 = D.size();
            for (int j1 = 0; j1 < l1; j1++)
            {
                ((aj)D.get(j1)).a(this);
            }

        }
    }

    public void a(long l1)
    {
        c();
        long l2 = AnimationUtils.currentAnimationTimeMillis();
        if (d != 1)
        {
            c = l1;
            d = 2;
        }
        b = l2 - l1;
        b(l2);
    }

    public transient void a(float af1[])
    {
        if (af1 == null || af1.length == 0)
        {
            return;
        }
        if (f == null || f.length == 0)
        {
            a(new y[] {
                com.b.a.y.a("", af1)
            });
        } else
        {
            f[0].a(af1);
        }
        e = false;
    }

    public transient void a(y ay[])
    {
        int j1 = ay.length;
        f = ay;
        g = new HashMap(j1);
        for (int i1 = 0; i1 < j1; i1++)
        {
            y y1 = ay[i1];
            g.put(y1.c(), y1);
        }

        e = false;
    }

    public a b()
    {
        return e();
    }

    boolean b(long l1)
    {
        boolean flag1 = false;
        if (d == 0)
        {
            d = 1;
            if (c < 0L)
            {
                b = l1;
            } else
            {
                b = l1 - c;
                c = -1L;
            }
        }
        switch (d)
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
            break;
        }
        float f1;
        if (x > 0L)
        {
            f1 = (float)(l1 - b) / (float)x;
        } else
        {
            f1 = 1.0F;
        }
        boolean flag;
        if (f1 >= 1.0F)
        {
            if (r < A || A == -1)
            {
                if (a != null)
                {
                    int j1 = a.size();
                    for (int i1 = 0; i1 < j1; i1++)
                    {
                        ((b)a.get(i1)).c(this);
                    }

                }
                if (B == 2)
                {
                    float f2;
                    if (q)
                    {
                        flag = false;
                    } else
                    {
                        flag = true;
                    }
                    q = flag;
                }
                r = r + (int)f1;
                f1 %= 1.0F;
                b = b + x;
                flag = flag1;
            } else
            {
                f1 = Math.min(f1, 1.0F);
                flag = true;
            }
        } else
        {
            flag = flag1;
        }
        f2 = f1;
        if (q)
        {
            f2 = 1.0F - f1;
        }
        a(f2);
        return flag;
    }

    void c()
    {
        if (!e)
        {
            int j1 = f.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                f[i1].b();
            }

            e = true;
        }
    }

    public Object clone()
    {
        return e();
    }

    public ac e()
    {
        boolean flag = false;
        ac ac1 = (ac)super.b();
        if (D != null)
        {
            ArrayList arraylist = D;
            ac1.D = new ArrayList();
            int k1 = arraylist.size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                ac1.D.add(arraylist.get(i1));
            }

        }
        ac1.c = -1L;
        ac1.q = false;
        ac1.r = 0;
        ac1.e = false;
        ac1.d = 0;
        ac1.t = false;
        y ay[] = f;
        if (ay != null)
        {
            int l1 = ay.length;
            ac1.f = new y[l1];
            ac1.g = new HashMap(l1);
            for (int j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
            {
                y y1 = ay[j1].a();
                ac1.f[j1] = y1;
                ac1.g.put(y1.c(), y1);
            }

        }
        return ac1;
    }

    public long f()
    {
        if (!e || d == 0)
        {
            return 0L;
        } else
        {
            return AnimationUtils.currentAnimationTimeMillis() - b;
        }
    }

    public String toString()
    {
        String s1 = (new StringBuilder()).append("ValueAnimator@").append(Integer.toHexString(hashCode())).toString();
        String s2 = s1;
        if (f != null)
        {
            int i1 = 0;
            do
            {
                s2 = s1;
                if (i1 >= f.length)
                {
                    break;
                }
                s1 = (new StringBuilder()).append(s1).append("\n    ").append(f[i1].toString()).toString();
                i1++;
            } while (true);
        }
        return s2;
    }

}
