// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.a.a.j;
import com.clawdyvan.agendaestudantepro.Util.a;
import com.clawdyvan.agendaestudantepro.a.b;
import com.clawdyvan.agendaestudantepro.a.d;
import com.clawdyvan.agendaestudantepro.b.c;
import com.clawdyvan.agendaestudantepro.b.e;
import com.clawdyvan.agendaestudantepro.b.f;
import com.clawdyvan.agendaestudantepro.b.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            au, aw, ay, bc, 
//            bb, ba, as

public class ar extends Fragment
{

    private View a;
    private ListView b;
    private Context c;
    private android.view.View.OnClickListener d;
    private android.view.View.OnClickListener e;
    private android.widget.AdapterView.OnItemClickListener f;

    public ar()
    {
        d = new au(this);
        e = new aw(this);
        f = new ay(this);
    }

    static View a(ar ar1)
    {
        return ar1.a;
    }

    static File a(ar ar1, String s)
    {
        return ar1.a(s);
    }

    private File a(String s)
    {
        try
        {
            s = b(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        a();
        return s;
    }

    private void a()
    {
        List list = com.clawdyvan.agendaestudantepro.Util.a.a();
        Collections.sort(list, new bc(this, null));
        b.setAdapter(new bb(this, list));
    }

    private void a(com.clawdyvan.agendaestudantepro.b.a a1)
    {
        Object obj = new com.clawdyvan.agendaestudantepro.a.a(k());
        for (Iterator iterator = a1.a.iterator(); iterator.hasNext(); ((com.clawdyvan.agendaestudantepro.a.a) (obj)).a((c)iterator.next())) { }
        obj = new com.clawdyvan.agendaestudantepro.a.c(k());
        e e1;
        for (Iterator iterator1 = a1.a().iterator(); iterator1.hasNext(); ((com.clawdyvan.agendaestudantepro.a.c) (obj)).a(e1))
        {
            e1 = (e)iterator1.next();
            if (!e1.e().a())
            {
                e1.b(null);
            }
        }

        obj = new d(k());
        for (Iterator iterator2 = a1.d.iterator(); iterator2.hasNext(); ((d) (obj)).a((f)iterator2.next())) { }
        obj = new b(k());
        a1 = a1.b.iterator();
        do
        {
            if (!a1.hasNext())
            {
                break;
            }
            com.clawdyvan.agendaestudantepro.b.d d1 = (com.clawdyvan.agendaestudantepro.b.d)a1.next();
            if (!d1.f().a())
            {
                d1.a(null);
            }
            ((b) (obj)).a(d1);
            if (d1.i())
            {
                com.clawdyvan.agendaestudantepro.Util.g.a(k(), d1);
            }
        } while (true);
    }

    static void a(ar ar1, com.clawdyvan.agendaestudantepro.b.a a1)
    {
        ar1.a(a1);
    }

    static void a(ar ar1, String s, Runnable runnable)
    {
        ar1.a(s, runnable);
    }

    private void a(String s, Runnable runnable)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(c);
        builder.setMessage(s);
        builder.setPositiveButton(0x7f0b0082, new ba(this, runnable));
        builder.setNegativeButton(0x7f0b0062, null);
        builder.show();
    }

    static Context b(ar ar1)
    {
        return ar1.c;
    }

    private File b(String s)
    {
        com.clawdyvan.agendaestudantepro.b.a a1 = new com.clawdyvan.agendaestudantepro.b.a();
        a1.a = (new com.clawdyvan.agendaestudantepro.a.a(k())).b();
        a1.c = (new com.clawdyvan.agendaestudantepro.a.c(k())).b();
        Object obj = new d(k());
        a1.d = new ArrayList();
        c c1;
        for (Iterator iterator = a1.a.iterator(); iterator.hasNext(); a1.d.addAll(((d) (obj)).a(c1)))
        {
            c1 = (c)iterator.next();
        }

        a1.b = (new b(k())).a();
        obj = Calendar.getInstance();
        s = s.replaceAll("[^a-zA-Z0-9_\\-\\. ]", "_");
        return com.clawdyvan.agendaestudantepro.Util.a.a((new j()).a(a1), String.format("%s_-_%04d-%02d-%02d_-_%02d.%02d.%02d", new Object[] {
            s, Integer.valueOf(((Calendar) (obj)).get(1)), Integer.valueOf(((Calendar) (obj)).get(2) + 1), Integer.valueOf(((Calendar) (obj)).get(5)), Integer.valueOf(((Calendar) (obj)).get(11)), Integer.valueOf(((Calendar) (obj)).get(12)), Integer.valueOf(((Calendar) (obj)).get(13))
        }));
    }

    private void b()
    {
        (new com.clawdyvan.agendaestudantepro.a.c(k())).a();
        (new d(k())).a();
        for (Iterator iterator = (new b(k())).a().iterator(); iterator.hasNext(); com.clawdyvan.agendaestudantepro.Util.g.a((com.clawdyvan.agendaestudantepro.b.d)iterator.next(), c, false)) { }
        (new com.clawdyvan.agendaestudantepro.a.a(k())).a();
    }

    static void b(ar ar1, String s)
    {
        ar1.c(s);
    }

    static void c(ar ar1)
    {
        ar1.b();
    }

    private void c(String s)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(c);
        builder.setMessage(s);
        builder.setNeutralButton(a(0x7f0b0071), null);
        builder.show();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        a = layoutinflater.inflate(0x7f03002d, viewgroup, false);
        c = k();
        b = (ListView)a.findViewById(0x7f0900ae);
        b.setEmptyView(a.findViewById(0x7f0900af));
        a.findViewById(0x7f0900ab).setOnClickListener(d);
        a.findViewById(0x7f0900ac).setOnClickListener(e);
        b.setOnItemClickListener(f);
        a.findViewById(0x7f0900b1).setOnClickListener(new as(this));
        return a;
    }

    public void f()
    {
        super.f();
        a();
    }
}
