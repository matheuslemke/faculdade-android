// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.view.View;
import com.b.b.a;

final class t extends a
{

    t(String s)
    {
        super(s);
    }

    public Float a(View view)
    {
        return Float.valueOf(com.b.c.a.a.a(view).l());
    }

    public volatile Object a(Object obj)
    {
        return a((View)obj);
    }

    public void a(View view, float f)
    {
        com.b.c.a.a.a(view).j(f);
    }

    public volatile void a(Object obj, float f)
    {
        a((View)obj, f);
    }
}
