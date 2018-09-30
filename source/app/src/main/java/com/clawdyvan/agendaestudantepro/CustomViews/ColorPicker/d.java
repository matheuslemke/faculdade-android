// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.CustomViews.ColorPicker;

import android.view.View;

// Referenced classes of package com.clawdyvan.agendaestudantepro.CustomViews.ColorPicker:
//            b

class d
    implements android.view.View.OnClickListener
{

    final b a;

    d(b b1)
    {
        a = b1;
        super();
    }

    public void onClick(View view)
    {
        a.b();
        if (b.b(a) != null)
        {
            b.b(a).onClick(view);
        }
    }
}
