// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.b;

import java.io.Serializable;

public class g
    implements Serializable
{

    private int a;
    private int b;
    private boolean c;

    public g()
    {
    }

    public g(int i, int j)
    {
        a(i);
        b(j);
        c = true;
    }

    public g(String s)
    {
        a(s);
    }

    public void a(int i)
    {
        a = i;
        c = true;
    }

    public void a(String s)
    {
        a(Integer.parseInt(s.substring(0, s.indexOf(":"))));
        b(Integer.parseInt(s.substring(s.indexOf(":") + 1)));
    }

    public boolean a()
    {
        return c;
    }

    public int b()
    {
        return a;
    }

    public void b(int i)
    {
        b = i;
        c = true;
    }

    public int c()
    {
        return b;
    }

    public void c(int i)
    {
        int j = i / 3600;
        i = (i - j * 3600) / 60;
        a(j);
        b(i);
    }

    public String d()
    {
        return String.format("%02d:%02d", new Object[] {
            Integer.valueOf(b()), Integer.valueOf(c())
        });
    }

    public int e()
    {
        return b() * 3600 + c() * 60;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Hora{hora=").append(a).append(", min=").append(b).append('}').toString();
    }
}
