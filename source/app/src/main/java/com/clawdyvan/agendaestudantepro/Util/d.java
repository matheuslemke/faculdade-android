// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Util;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import com.clawdyvan.agendaestudantepro.Activities.MainActivity;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class d
    implements Serializable
{

    private Map a;
    private SharedPreferences b;

    public d(Context context)
    {
        a = new HashMap();
        b = MainActivity.a(context);
    }

    public int a()
    {
        return a("COR_BACKGROUND", Color.parseColor("#2980b9"));
    }

    public int a(String s, int i)
    {
        if (a.containsKey(s))
        {
            return ((Integer)a.get(s)).intValue();
        } else
        {
            i = b.getInt(s, i);
            a.put(s, Integer.valueOf(i));
            return i;
        }
    }

    public void a(Bundle bundle)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        String s;
        int i;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); editor.putInt(s, i))
        {
            s = (String)iterator.next();
            i = bundle.getInt(s);
            a.put(s, Integer.valueOf(i));
        }

        editor.commit();
    }

    public void a(View view)
    {
        view.setBackgroundColor(a("COR_BACKGROUND", Color.parseColor("#2980b9")));
    }
}
