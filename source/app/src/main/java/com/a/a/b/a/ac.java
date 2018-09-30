// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.aa;
import com.a.a.ae;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;

final class ac extends ae
{

    ac()
    {
    }

    public Character a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        }
        a1 = a1.h();
        if (a1.length() != 1)
        {
            throw new aa((new StringBuilder()).append("Expecting character, got: ").append(a1).toString());
        } else
        {
            return Character.valueOf(a1.charAt(0));
        }
    }

    public void a(d d1, Character character)
    {
        if (character == null)
        {
            character = null;
        } else
        {
            character = String.valueOf(character);
        }
        d1.b(character);
    }

    public volatile void a(d d1, Object obj)
    {
        a(d1, (Character)obj);
    }

    public Object b(a a1)
    {
        return a(a1);
    }
}
