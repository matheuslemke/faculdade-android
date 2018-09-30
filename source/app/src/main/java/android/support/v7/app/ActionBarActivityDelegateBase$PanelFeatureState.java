// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.a.b;
import android.support.v7.a.i;
import android.support.v7.a.k;
import android.support.v7.internal.view.menu.g;
import android.support.v7.internal.view.menu.y;
import android.support.v7.internal.view.menu.z;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

final class k
{

    int a;
    ViewGroup b;
    View c;
    android.support.v7.internal.view.menu.i d;
    g e;
    Context f;
    boolean g;
    boolean h;
    boolean i;
    public boolean j;
    boolean k;
    boolean l;
    Bundle m;

    z a(y y)
    {
        if (d == null)
        {
            return null;
        }
        if (e == null)
        {
            e = new g(f, i.abc_list_menu_item_layout);
            e.a(y);
            d.a(e);
        }
        return e.a(b);
    }

    void a(Context context)
    {
        TypedValue typedvalue = new TypedValue();
        android.content.res.te te = context.getResources().newTheme();
        te.te(context.getTheme());
        te.te(b.actionBarPopupTheme, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            te.te(typedvalue.resourceId, true);
        }
        te.te(b.panelMenuListTheme, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            te.te(typedvalue.resourceId, true);
        } else
        {
            te.te(k.Theme_AppCompat_CompactMenu, true);
        }
        context = new ContextThemeWrapper(context, 0);
        context.getTheme().te(te);
        f = context;
    }

    void a(android.support.v7.internal.view.menu.i i1)
    {
        if (i1 != d)
        {
            if (d != null)
            {
                d.b(e);
            }
            d = i1;
            if (i1 != null && e != null)
            {
                i1.a(e);
                return;
            }
        }
    }

    public boolean a()
    {
        while (c == null || e.a().getCount() <= 0) 
        {
            return false;
        }
        return true;
    }

    (int i1)
    {
        a = i1;
        k = false;
    }
}
