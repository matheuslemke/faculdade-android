// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.CustomViews.ColorPicker;

import android.support.v4.app.p;
import android.view.View;
import com.clawdyvan.agendaestudantepro.CustomViews.CirculoView;

// Referenced classes of package com.clawdyvan.agendaestudantepro.CustomViews.ColorPicker:
//            b

final class e
    implements android.view.View.OnClickListener
{

    final b a;
    final p b;
    final android.view.View.OnClickListener c;

    e(b b1, p p, android.view.View.OnClickListener onclicklistener)
    {
        a = b1;
        b = p;
        c = onclicklistener;
        super();
    }

    public void onClick(View view)
    {
        int i = a.O();
        view = new CirculoView(b);
        view.setCorDesenho(i);
        c.onClick(view);
    }
}
