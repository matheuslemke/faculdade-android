// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout

public class p extends android.view.ViewGroup.MarginLayoutParams
{

    public int a;
    float b;
    boolean c;
    boolean d;

    public p(int i, int j)
    {
        super(i, j);
        a = 0;
    }

    public p(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0;
        context = context.obtainStyledAttributes(attributeset, DrawerLayout.c());
        a = context.getInt(0, 0);
        context.recycle();
    }

    public p(p p1)
    {
        super(p1);
        a = 0;
        a = p1.a;
    }

    public p(android.view.ViewGroup.LayoutParams layoutparams)
    {
        super(layoutparams);
        a = 0;
    }

    public p(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
    {
        super(marginlayoutparams);
        a = 0;
    }
}
