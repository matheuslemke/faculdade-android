// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;

// Referenced classes of package android.support.v4.app:
//            ao, aj

final class am extends android.transition.Transition.EpicenterCallback
{

    final ao a;
    private Rect b;

    am(ao ao1)
    {
        a = ao1;
        super();
    }

    public Rect onGetEpicenter(Transition transition)
    {
        if (b == null && a.a != null)
        {
            b = aj.b(a.a);
        }
        return b;
    }
}
