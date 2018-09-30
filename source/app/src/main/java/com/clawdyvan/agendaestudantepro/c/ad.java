// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import com.clawdyvan.agendaestudantepro.b.g;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            u

class ad
    implements android.app.TimePickerDialog.OnTimeSetListener
{

    final View a;
    final u b;

    ad(u u1, View view)
    {
        b = u1;
        a = view;
        super();
    }

    public void onTimeSet(TimePicker timepicker, int i, int j)
    {
        ((TextView)a).setText(String.format("%02dh%02d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        }));
        u.f(b).a(i);
        u.f(b).b(j);
    }
}
