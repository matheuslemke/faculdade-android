// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.b;

import java.io.Serializable;

public class c
    implements Serializable
{

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private int f;

    public c()
    {
        this("", "", "", "", "");
    }

    public c(String s, String s1, String s2, String s3, String s4)
    {
        this(s, s1, s2, s3, s4, 0xff3498db);
    }

    public c(String s, String s1, String s2, String s3, String s4, int i)
    {
        f = 0xff3498db;
        a(s);
        b(s1);
        c(s2);
        d(s3);
        e(s4);
        a(i);
    }

    public String a()
    {
        return a;
    }

    public void a(int i)
    {
        f = i;
    }

    public void a(String s)
    {
        a = s;
    }

    public String b()
    {
        return b;
    }

    public void b(String s)
    {
        b = s;
    }

    public String c()
    {
        return c;
    }

    public void c(String s)
    {
        c = s;
    }

    public String d()
    {
        return d;
    }

    public void d(String s)
    {
        d = s;
    }

    public String e()
    {
        return e;
    }

    public void e(String s)
    {
        e = s;
    }

    public boolean equals(Object obj)
    {
        boolean flag = false;
        if (obj instanceof c)
        {
            obj = (c)obj;
            flag = a().equals(((c) (obj)).a());
        }
        return flag;
    }

    public int f()
    {
        return f;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Disciplina [codDisciplina=").append(a).append(", nome=").append(b).append(", abreviacao=").append(c).append(", nomeProfessor=").append(d).append(", emailProfessor=").append(e).append("]").toString();
    }
}
