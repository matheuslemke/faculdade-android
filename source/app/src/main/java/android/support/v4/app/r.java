// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;
import android.view.Window;

// Referenced classes of package android.support.v4.app:
//            t, p

class r
    implements t
{

    final p a;

    r(p p1)
    {
        a = p1;
        super();
    }

    public View a(int i)
    {
        return a.findViewById(i);
    }

    public boolean a()
    {
        Window window = a.getWindow();
        return window != null && window.peekDecorView() != null;
    }
}
