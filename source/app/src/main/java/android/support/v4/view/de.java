// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            dh

final class de
    implements android.animation.ValueAnimator.AnimatorUpdateListener
{

    final dh a;
    final View b;

    de(dh dh1, View view)
    {
        a = dh1;
        b = view;
        super();
    }

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        a.a(b);
    }
}
