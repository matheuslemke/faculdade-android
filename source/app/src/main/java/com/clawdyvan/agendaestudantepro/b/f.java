// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.b;

import java.io.Serializable;

// Referenced classes of package com.clawdyvan.agendaestudantepro.b:
//            c

public class f
    implements Serializable
{

    private String a;
    private float b;
    private float c;
    private String d;
    private String e;
    private c f;

    public f()
    {
        this("", 0.0F, 1.0F, "", "", new c());
    }

    public f(String s, float f1, float f2, String s1, String s2, c c1)
    {
        a(s);
        a(f1);
        b(f2);
        b(s1);
        c(s2);
    }

    public String a()
    {
        return a;
    }

    public void a(float f1)
    {
        b = f1;
    }

    public void a(c c1)
    {
        f = c1;
    }

    public void a(String s)
    {
        a = s;
    }

    public float b()
    {
        return b;
    }

    public void b(float f1)
    {
        c = f1;
    }

    public void b(String s)
    {
        d = s;
    }

    public float c()
    {
        return c;
    }

    public void c(String s)
    {
        e = s;
    }

    public String d()
    {
        return d;
    }

    public String e()
    {
        return e;
    }

    public c f()
    {
        return f;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Nota [codNota=").append(a).append(", nota=").append(b).append(", peso=").append(c).append(", titulo=").append(d).append(", descricao=").append(e).append(", disciplina=").append(f).append("]").toString();
    }
}
