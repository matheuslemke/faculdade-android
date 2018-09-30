// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.clawdyvan.agendaestudantepro.b.c;
import java.util.List;

public class f extends ArrayAdapter
{

    private TextView a;
    private TextView b;
    private TextView c;
    private Context d;
    private List e;

    public f(Context context, List list)
    {
        super(context, 0x7f03001c, list);
        d = context;
        e = list;
    }

    public long getItemId(int i)
    {
        return Long.parseLong(((c)e.get(i)).a());
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = ((LayoutInflater)d.getSystemService("layout_inflater")).inflate(0x7f03001c, viewgroup, false);
        a = (TextView)view.findViewById(0x7f090045);
        b = (TextView)view.findViewById(0x7f090046);
        c = (TextView)view.findViewById(0x7f090047);
        viewgroup = (c)e.get(i);
        a.setText(viewgroup.b());
        b.setText(viewgroup.c());
        b.setTextColor(viewgroup.f());
        c.setText(viewgroup.d());
        return view;
    }
}
