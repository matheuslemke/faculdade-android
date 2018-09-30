// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.internal.view.menu.a;
import android.support.v7.widget.Toolbar;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            bd

class be
    implements android.view.View.OnClickListener
{

    final a a;
    final bd b;

    be(bd bd1)
    {
        b = bd1;
        super();
        a = new a(android.support.v7.internal.widget.bd.a(b).getContext(), 0, 0x102002c, 0, 0, bd.b(b));
    }

    public void onClick(View view)
    {
        if (bd.c(b) != null && bd.d(b))
        {
            bd.c(b).a(0, a);
        }
    }
}
