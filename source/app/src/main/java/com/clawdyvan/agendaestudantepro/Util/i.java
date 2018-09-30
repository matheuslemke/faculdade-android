// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.b.c.a;
import com.clawdyvan.agendaestudantepro.Activities.MainActivity;
import com.clawdyvan.agendaestudantepro.b.b;
import com.clawdyvan.agendaestudantepro.b.d;
import com.clawdyvan.agendaestudantepro.b.g;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Util:
//            j, n, d, l

public class i extends ArrayAdapter
{

    private Context a;
    private List b;
    private n c;
    private String d[];
    private String e[];
    private Drawable f;
    private Drawable g;
    private Drawable h;
    private Drawable i;
    private android.widget.CompoundButton.OnCheckedChangeListener j;

    public i(Context context, List list)
    {
        super(context, 0x7f03001d, list);
        j = new j(this);
        a = context;
        b = list;
        d = context.getResources().getStringArray(0x7f050001);
        e = context.getResources().getStringArray(0x7f050000);
        c = new n();
        a();
    }

    static Context a(i k)
    {
        return k.a;
    }

    private String a(n n1)
    {
        return String.format("%s, %d/%s", new Object[] {
            e[n1.g() - 1], Integer.valueOf(n1.d()), d[n1.e()]
        });
    }

    private void a()
    {
        com.clawdyvan.agendaestudantepro.Util.d d1 = MainActivity.b(a);
        int k = Color.parseColor("#C2C2C2");
        f = a.getResources().getDrawable(0x7f020074);
        f.setColorFilter(d1.a("COR_PROVA", k), android.graphics.PorterDuff.Mode.SRC_ATOP);
        g = a.getResources().getDrawable(0x7f020074);
        g.setColorFilter(d1.a("COR_TRABALHO", k), android.graphics.PorterDuff.Mode.SRC_ATOP);
        h = a.getResources().getDrawable(0x7f020074);
        h.setColorFilter(d1.a("COR_ATIVIDADE", k), android.graphics.PorterDuff.Mode.SRC_ATOP);
        i = a.getResources().getDrawable(0x7f020074);
        i.setColorFilter(d1.a("COR_LIVRO", k), android.graphics.PorterDuff.Mode.SRC_ATOP);
    }

    static List b(i k)
    {
        return k.b;
    }

    public long getItemId(int k)
    {
        return Long.parseLong(((d)b.get(k)).b());
    }

    public View getView(int k, View view, ViewGroup viewgroup)
    {
        d d1 = (d)b.get(k);
        View view1;
        int i1;
        if (view == null)
        {
            view1 = LayoutInflater.from(a).inflate(0x7f03001d, viewgroup, false);
            view = new l(this, null);
            view.a = (ImageView)view1.findViewById(0x7f090048);
            view.b = (TextView)view1.findViewById(0x7f090049);
            view.c = (TextView)view1.findViewById(0x7f09004a);
            view.d = (TextView)view1.findViewById(0x7f09004b);
            view.e = (CheckBox)view1.findViewById(0x7f09004c);
            view1.setTag(view);
            viewgroup = view;
        } else
        {
            viewgroup = (l)view.getTag();
            view1 = view;
        }
        i1 = d1.a();
        if (i1 == 1)
        {
            ((l) (viewgroup)).a.setImageResource(0x7f020065);
            ((l) (viewgroup)).a.setBackgroundDrawable(f);
        } else
        if (i1 == 2)
        {
            ((l) (viewgroup)).a.setImageResource(0x7f020073);
            ((l) (viewgroup)).a.setBackgroundDrawable(g);
        } else
        if (i1 == 3)
        {
            ((l) (viewgroup)).a.setImageResource(0x7f020051);
            ((l) (viewgroup)).a.setBackgroundDrawable(h);
        } else
        {
            ((l) (viewgroup)).a.setImageResource(0x7f02005d);
            ((l) (viewgroup)).a.setBackgroundDrawable(i);
        }
        ((l) (viewgroup)).b.setText(d1.c());
        c.a(d1.e().a(), d1.e().b() - 1, d1.e().c());
        ((l) (viewgroup)).c.setText(a(c));
        if (d1.f() != null)
        {
            ((l) (viewgroup)).d.setText(d1.f().d());
        } else
        {
            ((l) (viewgroup)).d.setText(null);
        }
        ((l) (viewgroup)).e.setOnCheckedChangeListener(null);
        if (d1.j())
        {
            ((l) (viewgroup)).e.setChecked(true);
            com.b.c.a.a(view1, 0.2F);
        } else
        {
            ((l) (viewgroup)).e.setChecked(false);
            com.b.c.a.a(view1, 1.0F);
        }
        ((l) (viewgroup)).e.setOnCheckedChangeListener(j);
        ((l) (viewgroup)).e.setTag(String.valueOf(k));
        return view1;
    }
}
