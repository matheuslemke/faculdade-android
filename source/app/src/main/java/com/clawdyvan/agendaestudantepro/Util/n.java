// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Util;

import com.clawdyvan.agendaestudantepro.b.b;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;

public class n
    implements Serializable, Comparable
{

    private Calendar a;

    public n()
    {
        a();
    }

    public n(long l1)
    {
        a();
        a(l1);
        t();
    }

    public n(b b1)
    {
        a();
        a(b1);
    }

    private void t()
    {
        a.set(13, 0);
        a.set(14, 0);
    }

    public int a(n n1)
    {
        if (f() != n1.f())
        {
            return f() - n1.f();
        }
        if (e() != n1.e())
        {
            return e() - n1.e();
        }
        if (d() != n1.d())
        {
            return d() - n1.d();
        } else
        {
            return 0;
        }
    }

    public void a()
    {
        a = Calendar.getInstance(Locale.US);
        t();
    }

    public void a(int i1)
    {
        a.set(12, i1);
    }

    public void a(int i1, int j1, int k1)
    {
        a.set(i1, j1, k1);
    }

    public void a(long l1)
    {
        a.setTimeInMillis(l1);
    }

    public void a(b b1)
    {
        a(b1.a(), b1.b() - 1, b1.c());
    }

    public int b()
    {
        return a.get(12);
    }

    public void b(int i1)
    {
        a.set(11, i1);
    }

    public int c()
    {
        return a.get(11);
    }

    public void c(int i1)
    {
        a.set(5, i1);
    }

    public int compareTo(Object obj)
    {
        return a((n)obj);
    }

    public int d()
    {
        return a.get(5);
    }

    public void d(int i1)
    {
        a.set(2, i1);
    }

    public int e()
    {
        return a.get(2);
    }

    public void e(int i1)
    {
        a.set(1, i1);
    }

    public int f()
    {
        return a.get(1);
    }

    public void f(int i1)
    {
        a.set(7, i1);
    }

    public int g()
    {
        return a.get(7);
    }

    public void g(int i1)
    {
        a.add(5, i1);
    }

    public long h()
    {
        return a.getTimeInMillis();
    }

    public b i()
    {
        return new b(f(), e() + 1, d());
    }

    public int j()
    {
        return a.getActualMaximum(5);
    }

    public int k()
    {
        return a.get(3);
    }

    public void l()
    {
        if (d() == j())
        {
            n();
            c(1);
            return;
        } else
        {
            a.roll(5, true);
            return;
        }
    }

    public void m()
    {
        f(1);
        a.add(5, 7);
    }

    public void n()
    {
        if (e() == 11)
        {
            d(0);
            o();
            return;
        } else
        {
            a.roll(2, true);
            return;
        }
    }

    public void o()
    {
        a.roll(1, true);
    }

    public void p()
    {
        if (d() == 1)
        {
            r();
            c(j());
            return;
        } else
        {
            a.roll(5, false);
            return;
        }
    }

    public void q()
    {
        f(1);
        a.add(5, -7);
    }

    public void r()
    {
        if (e() == 0)
        {
            d(11);
            s();
            return;
        } else
        {
            a.roll(2, false);
            return;
        }
    }

    public void s()
    {
        a.roll(1, false);
    }

    public String toString()
    {
        return String.format("%02d/%02d/%04d", new Object[] {
            Integer.valueOf(d()), Integer.valueOf(e() + 1), Integer.valueOf(f())
        });
    }
}
