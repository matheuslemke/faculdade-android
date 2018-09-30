// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            bg, a, br, cp

class bh extends bg
{

    static boolean b = false;

    bh()
    {
    }

    public void a(View view, a a1)
    {
        br.a(view, a1.a());
    }

    public boolean a(View view, int i)
    {
        return br.a(view, i);
    }

    public cp k(View view)
    {
        if (a == null)
        {
            a = new WeakHashMap();
        }
        cp cp2 = (cp)a.get(view);
        cp cp1 = cp2;
        if (cp2 == null)
        {
            cp1 = new cp(view);
            a.put(view, cp1);
        }
        return cp1;
    }

}
