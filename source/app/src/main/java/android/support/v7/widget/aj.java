// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.widget:
//            x, ab, y

class aj
    implements Runnable
{

    final x a;

    private aj(x x1)
    {
        a = x1;
        super();
    }

    aj(x x1, y y)
    {
        this(x1);
    }

    public void run()
    {
        if (x.a(a) != null && x.a(a).getCount() > x.a(a).getChildCount() && x.a(a).getChildCount() <= a.b)
        {
            x.b(a).setInputMethodMode(2);
            a.c();
        }
    }
}
