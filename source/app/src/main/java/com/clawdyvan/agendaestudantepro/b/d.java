// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.b;

import java.io.Serializable;

// Referenced classes of package com.clawdyvan.agendaestudantepro.b:
//            b, g

public class d
    implements Serializable
{

    private int a;
    private String b;
    private String c;
    private String d;
    private b e;
    private g f;
    private String g;
    private long h;
    private boolean i;
    private boolean j;

    public d()
    {
        this(1, "", "", "", new b(), new g(), "", 0L, false, false);
    }

    public d(int k, String s, String s1, String s2, b b1, g g1, String s3, 
            long l, boolean flag, boolean flag1)
    {
        a(k);
        a(s);
        b(s1);
        c(s2);
        a(b1);
        a(g1);
        d(s3);
        a(l);
        a(flag);
        b(flag1);
    }

    public d(d d1)
    {
        this(d1.a(), d1.b(), d1.c(), d1.d(), d1.e(), d1.f(), d1.g(), d1.h(), d1.i(), d1.j());
    }

    public int a()
    {
        return a;
    }

    public void a(int k)
    {
        a = k;
    }

    public void a(long l)
    {
        h = l;
    }

    public void a(b b1)
    {
        e = b1;
    }

    public void a(g g1)
    {
        f = g1;
    }

    public void a(String s)
    {
        b = s;
    }

    public void a(boolean flag)
    {
        i = flag;
    }

    public String b()
    {
        return b;
    }

    public void b(String s)
    {
        c = s;
    }

    public void b(boolean flag)
    {
        j = flag;
    }

    public String c()
    {
        return c;
    }

    public void c(String s)
    {
        d = s;
    }

    public String d()
    {
        return d;
    }

    public void d(String s)
    {
        g = s;
    }

    public b e()
    {
        return e;
    }

    public g f()
    {
        return f;
    }

    public String g()
    {
        return g;
    }

    public long h()
    {
        return h;
    }

    public boolean i()
    {
        return i;
    }

    public boolean j()
    {
        return j;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Evento{codEvento=").append(b).append(", titulo=").append(c).append(", descricao=").append(d).append(", data=").append(e).append(", hora=").append(f).append(", foto=").append(g).append(", lembreteMs=").append(h).append('}').toString();
    }
}
