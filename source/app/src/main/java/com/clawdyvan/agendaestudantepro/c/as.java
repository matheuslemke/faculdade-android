// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            ar, at

class as
    implements android.view.View.OnClickListener
{

    final ar a;

    as(ar ar1)
    {
        a = ar1;
        super();
    }

    public void onClick(View view)
    {
        view = ar.a(a).findViewById(0x7f0900b0);
        Animation animation = AnimationUtils.loadAnimation(ar.b(a), 0x7f040013);
        animation.setDuration(100L);
        animation.setAnimationListener(new at(this, view));
        view.clearAnimation();
        view.startAnimation(animation);
    }
}
