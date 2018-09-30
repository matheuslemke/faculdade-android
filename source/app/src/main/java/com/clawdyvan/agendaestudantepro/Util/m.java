// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Util;

import java.io.File;
import java.io.Serializable;

public class m
    implements Serializable
{

    private String a;
    private String b;

    public m()
    {
        a("");
        b("");
    }

    public String a()
    {
        return a;
    }

    public void a(File file)
    {
        b(file.getAbsolutePath());
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

    public boolean c()
    {
        boolean flag = d().delete();
        b("");
        return flag;
    }

    public File d()
    {
        return new File(b());
    }

    public File e()
    {
        return new File(a());
    }
}
