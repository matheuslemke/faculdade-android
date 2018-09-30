// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import com.clawdyvan.agendaestudantepro.Util.n;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            f

class h
    implements android.app.DatePickerDialog.OnDateSetListener
{

    final View a;
    final f b;

    h(f f1, View view)
    {
        b = f1;
        a = view;
        super();
    }

    public void onDateSet(DatePicker datepicker, int i, int j, int k)
    {
        f.g(b).a(i, j, k);
        ((TextView)a).setText(f.a(b, f.g(b)));
    }
}
