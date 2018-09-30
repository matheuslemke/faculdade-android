// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.widget.Button;
import android.widget.DatePicker;
import com.clawdyvan.agendaestudantepro.Util.n;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            f

class s
    implements android.app.DatePickerDialog.OnDateSetListener
{

    final f a;

    s(f f1)
    {
        a = f1;
        super();
    }

    public void onDateSet(DatePicker datepicker, int i, int j, int k)
    {
        f.e(a).a(i, j, k);
        f.f(a).setText(f.a(a, f.e(a)));
    }
}
