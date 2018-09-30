// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.b;

import java.io.Serializable;

public class b
    implements Serializable
{

    private int a;
    private int b;
    private int c;

    public b()
    {
        this(2013, 1, 1);
    }

    public b(int i, int j, int k)
    {
        a(i);
        b(j);
        c(k);
    }

    public b(String s)
    {
        a(s);
    }

    public int a()
    {
        return a;
    }

    public void a(int i)
    {
        a = i;
    }

    public void a(String s)
    {
        s = s.split("-");
        a(Integer.parseInt(s[0]));
        b(Integer.parseInt(s[1]));
        c(Integer.parseInt(s[2]));
    }

    public int b()
    {
        return b;
    }

    public void b(int i)
    {
        b = i;
    }

    public int c()
    {
        return c;
    }

    public void c(int i)
    {
        c = i;
    }

    public String d()
    {
        return String.format("%04d-%02d-%02d", new Object[] {
            Integer.valueOf(a()), Integer.valueOf(b()), Integer.valueOf(c())
        });
    }

    public String toString()
    {
        return (new StringBuilder()).append("Data{ano=").append(a).append(", mes=").append(b).append(", dia=").append(c).append('}').toString();
    }
}
