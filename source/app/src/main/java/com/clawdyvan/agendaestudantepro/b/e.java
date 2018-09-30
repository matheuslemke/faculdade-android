// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.b;

import java.io.Serializable;

// Referenced classes of package com.clawdyvan.agendaestudantepro.b:
//            c, g

public class e
    implements Serializable
{

    private String a;
    private int b;
    private c c;
    private g d;
    private g e;
    private String f;

    public e()
    {
        this("", 0, new c(), new g(), new g(), "");
    }

    public e(String s, int i, c c1, g g1, g g2, String s1)
    {
        a(s);
        a(i);
        a(c1);
        a(g1);
        b(g2);
        b(s1);
    }

    public String a()
    {
        return a;
    }

    public void a(int i)
    {
        b = i;
    }

    public void a(c c1)
    {
        c = c1;
    }

    public void a(g g1)
    {
        d = g1;
    }

    public void a(String s)
    {
        a = s;
    }

    public int b()
    {
        return b;
    }

    public void b(g g1)
    {
        e = g1;
    }

    public void b(String s)
    {
        f = s;
    }

    public c c()
    {
        return c;
    }

    public g d()
    {
        return d;
    }

    public g e()
    {
        return e;
    }

    public String f()
    {
        return f;
    }

    public boolean g()
    {
        return b != 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Horario{codHorario=").append(a).append(", diaSemana=").append(b).append(", disciplina=").append(c).append(", horaInicio=").append(d).append(", horaFim=").append(e).append(", sala=").append(f).append('}').toString();
    }
}
