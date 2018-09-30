// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            as

class at
    implements android.view.animation.Animation.AnimationListener
{

    final View a;
    final as b;

    at(as as, View view)
    {
        b = as;
        a = view;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        a.setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
