// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Util;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.clawdyvan.agendaestudantepro.b.c;
import com.clawdyvan.agendaestudantepro.b.e;
import com.clawdyvan.agendaestudantepro.b.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Util:
//            r, s, n

public class p extends BaseAdapter
{

    private final int a = 0;
    private final int b = 1;
    private final int c = 2;
    private final int d = 7;
    private List e;
    private List f;
    private Map g;
    private int h;
    private Context i;

    public p(Context context, Map map, n n1)
    {
        i = context;
        e = b(map);
        a(new HashMap(0));
        a(n1);
    }

    private View a(View view)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(i).inflate(0x7f030044, null);
            view1.setVisibility(8);
        }
        return view1;
    }

    private View a(View view, int j)
    {
        r r1;
label0:
        {
            Integer integer;
            int k;
            if (view == null)
            {
                view = LayoutInflater.from(i).inflate(0x7f030041, null);
                r1 = new r(this, null);
                r1.a = (TextView)view.findViewById(0x7f0900e2);
                r1.b = (TextView)view.findViewById(0x7f0900e3);
                view.setTag(r1);
            } else
            {
                r1 = (r)view.getTag();
            }
            integer = (Integer)getItem(j);
            r1.a.setText(integer.toString());
            r1.b.setText(b(j));
            if (j == 0)
            {
                k = 0xffff0000;
            } else
            {
                k = i.getResources().getColor(0x7f070017);
            }
            r1.a.setTextColor(k);
            r1.b.setTextColor(k);
            r1.a.setPaintFlags(r1.a.getPaintFlags() & 0xffffffef);
            if (h - 1 == j)
            {
                r1.b.setTypeface(null, 3);
            } else
            {
                r1.b.setTypeface(null, 0);
            }
            if (g.containsKey(Integer.valueOf(j + 1)))
            {
                if (!((Boolean)g.get(Integer.valueOf(j + 1))).booleanValue())
                {
                    break label0;
                }
                r1.a.setPaintFlags(r1.a.getPaintFlags() | 0x10);
            }
            return view;
        }
        r1.a.setTextColor(0xff0000ff);
        return view;
    }

    private View b(View view, int j)
    {
        s s1;
        e e1;
        if (view == null)
        {
            view = LayoutInflater.from(i).inflate(0x7f030044, null);
            s1 = new s(this, null);
            s1.a = (TextView)view.findViewById(0x7f0900e5);
            s1.b = (TextView)view.findViewById(0x7f0900e6);
            s1.c = (TextView)view.findViewById(0x7f0900e7);
            view.setTag(s1);
        } else
        {
            s1 = (s)view.getTag();
        }
        e1 = (e)getItem(j);
        s1.a.setText(e1.d().d());
        s1.b.setText(e1.c().c());
        if (e1.e() != null)
        {
            s1.c.setText(e1.e().d());
        } else
        {
            s1.c.setText("--:--");
        }
        view.setBackgroundColor(e1.c().f());
        return view;
    }

    private String b(int j)
    {
        switch (j)
        {
        default:
            return null;

        case 0: // '\0'
            return i.getString(0x7f0b0041);

        case 1: // '\001'
            return i.getString(0x7f0b007d);

        case 2: // '\002'
            return i.getString(0x7f0b0086);

        case 3: // '\003'
            return i.getString(0x7f0b0077);

        case 4: // '\004'
            return i.getString(0x7f0b0078);

        case 5: // '\005'
            return i.getString(0x7f0b0081);

        case 6: // '\006'
            return i.getString(0x7f0b007a);
        }
    }

    private List b(Map map)
    {
        ArrayList arraylist;
        int j;
        int k;
        arraylist = new ArrayList();
        k = 1;
        j = 0;
_L2:
        e e1;
        int l;
        e1 = (e)((List)map.get(Integer.valueOf(k))).remove(0);
        l = ((List)map.get(Integer.valueOf(k))).size();
        if (l > j)
        {
            j = l;
        }
        Exception exception;
        try
        {
            arraylist.add(e1);
            break MISSING_BLOCK_LABEL_78;
        }
        catch (Exception exception1) { }
          goto _L1
        exception;
_L1:
        arraylist.add(new e());
        if (k == 7)
        {
            if (j == 0)
            {
                return arraylist;
            }
            j = 0;
            k = 0;
        }
        k++;
        if (true) goto _L2; else goto _L1
    }

    public void a(int j)
    {
        h = j;
    }

    public void a(n n1)
    {
        f = new ArrayList(7);
        n1.f(1);
        for (int j = 0; j < 7; j++)
        {
            int k = n1.d();
            f.add(Integer.valueOf(k));
            n1.l();
        }

    }

    public void a(Map map)
    {
        g = map;
    }

    public int getCount()
    {
        return e.size() + 7;
    }

    public Object getItem(int j)
    {
        if (j < 7)
        {
            return f.get(j);
        } else
        {
            return e.get(j - 7);
        }
    }

    public long getItemId(int j)
    {
        return (long)j;
    }

    public int getItemViewType(int j)
    {
        if (j < 7)
        {
            return 0;
        }
        return !((e)getItem(j)).g() ? 2 : 1;
    }

    public View getView(int j, View view, ViewGroup viewgroup)
    {
        switch (getItemViewType(j))
        {
        default:
            return null;

        case 0: // '\0'
            return a(view, j);

        case 1: // '\001'
            return b(view, j);

        case 2: // '\002'
            return a(view);
        }
    }

    public int getViewTypeCount()
    {
        return 3;
    }

    public boolean hasStableIds()
    {
        return true;
    }
}
