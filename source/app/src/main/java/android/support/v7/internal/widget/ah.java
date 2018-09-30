// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.app.d;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            af, aj, ag

class ah extends BaseAdapter
{

    final af a;

    private ah(af af1)
    {
        a = af1;
        super();
    }

    ah(af af1, ag ag)
    {
        this(af1);
    }

    public int getCount()
    {
        return af.a(a).getChildCount();
    }

    public Object getItem(int i)
    {
        return ((aj)af.a(a).getChildAt(i)).b();
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            return af.a(a, (d)getItem(i), true);
        } else
        {
            ((aj)view).a((d)getItem(i));
            return view;
        }
    }
}
