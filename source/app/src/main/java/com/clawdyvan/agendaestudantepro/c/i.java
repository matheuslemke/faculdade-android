// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import com.clawdyvan.agendaestudantepro.Util.n;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            f

class i
    implements android.app.TimePickerDialog.OnTimeSetListener
{

    final View a;
    final f b;

    i(f f1, View view)
    {
        b = f1;
        a = view;
        super();
    }

    public void onTimeSet(TimePicker timepicker, int j, int k)
    {
        f.g(b).b(j);
        f.g(b).a(k);
        ((TextView)a).setText(String.format("%02dh%02d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(k)
        }));
    }
}
