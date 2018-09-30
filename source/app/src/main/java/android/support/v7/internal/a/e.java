// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.support.v4.view.dh;
import android.support.v7.internal.widget.ActionBarContainer;
import android.view.View;

// Referenced classes of package android.support.v7.internal.a:
//            b

class e
    implements dh
{

    final b a;

    e(b b1)
    {
        a = b1;
        super();
    }

    public void a(View view)
    {
        ((View)b.c(a).getParent()).invalidate();
    }
}
