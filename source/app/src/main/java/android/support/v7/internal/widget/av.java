// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v7.internal.widget:
//            y, ax

class av extends y
{

    private final ColorStateList a;
    private final android.graphics.PorterDuff.Mode b;
    private int c;

    public av(Drawable drawable, ColorStateList colorstatelist)
    {
        this(drawable, colorstatelist, ax.a);
    }

    public av(Drawable drawable, ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode)
    {
        super(drawable);
        a = colorstatelist;
        b = mode;
    }

    private boolean a(int ai[])
    {
        if (a != null)
        {
            int i = a.getColorForState(ai, c);
            if (i != c)
            {
                if (i != 0)
                {
                    setColorFilter(i, b);
                } else
                {
                    clearColorFilter();
                }
                c = i;
                return true;
            }
        }
        return false;
    }

    public boolean isStateful()
    {
        return a != null && a.isStateful() || super.isStateful();
    }

    public boolean setState(int ai[])
    {
        boolean flag = super.setState(ai);
        return a(ai) || flag;
    }
}
