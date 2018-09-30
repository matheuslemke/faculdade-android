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
import com.clawdyvan.agendaestudantepro.b.f;
import java.util.List;

public class o extends ArrayAdapter
{

    private TextView a;
    private TextView b;
    private TextView c;
    private TextView d;
    private Context e;
    private List f;

    public o(Context context, List list)
    {
        super(context, 0x7f03001e, list);
        e = context;
        f = list;
    }

    public long getItemId(int i)
    {
        return Long.parseLong(((f)f.get(i)).a());
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = ((LayoutInflater)e.getSystemService("layout_inflater")).inflate(0x7f03001e, viewgroup, false);
        a = (TextView)view.findViewById(0x7f090049);
        b = (TextView)view.findViewById(0x7f09004d);
        c = (TextView)view.findViewById(0x7f09004e);
        d = (TextView)view.findViewById(0x7f09004f);
        viewgroup = (f)f.get(i);
        a.setText(viewgroup.d());
        b.setText(viewgroup.e());
        c.setText(String.valueOf(viewgroup.b()));
        d.setText(String.valueOf(viewgroup.c()));
        return view;
    }
}
