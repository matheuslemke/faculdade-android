// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class a
    implements Serializable
{

    public List a;
    public List b;
    public Map c;
    public List d;

    public a()
    {
    }

    public List a()
    {
        ArrayList arraylist = new ArrayList();
        Integer integer;
        for (Iterator iterator = c.keySet().iterator(); iterator.hasNext(); arraylist.addAll((Collection)c.get(integer)))
        {
            integer = (Integer)iterator.next();
        }

        return arraylist;
    }
}
