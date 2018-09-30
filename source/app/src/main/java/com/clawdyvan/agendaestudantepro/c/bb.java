// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.io.File;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            ar

class bb extends BaseAdapter
{

    final ar a;
    private List b;

    public bb(ar ar1, List list)
    {
        a = ar1;
        super();
        b = list;
    }

    public File a(int i)
    {
        return (File)b.get(i);
    }

    public int getCount()
    {
        return b.size();
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = LayoutInflater.from(ar.b(a)).inflate(0x7f030046, null);
        viewgroup = (TextView)view.findViewById(0x7f0900ea);
        String s = a(i).getName();
        viewgroup.setText(s.substring(0, s.indexOf(".aeb")));
        return view;
    }
}
