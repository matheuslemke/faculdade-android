// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            df, cp, bb

class cu
    implements df
{

    cp a;

    cu(cp cp1)
    {
        a = cp1;
    }

    public void a(View view)
    {
        if (cp.c(a) >= 0)
        {
            bb.a(view, 2, null);
        }
        if (cp.a(a) != null)
        {
            cp.a(a).run();
        }
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof df)
        {
            obj = (df)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((df) (obj)).a(view);
        }
    }

    public void b(View view)
    {
        if (cp.c(a) >= 0)
        {
            bb.a(view, cp.c(a), null);
            cp.a(a, -1);
        }
        if (cp.b(a) != null)
        {
            cp.b(a).run();
        }
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof df)
        {
            obj = (df)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((df) (obj)).b(view);
        }
    }

    public void c(View view)
    {
        Object obj = view.getTag(0x7e000000);
        if (obj instanceof df)
        {
            obj = (df)obj;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            ((df) (obj)).c(view);
        }
    }
}
