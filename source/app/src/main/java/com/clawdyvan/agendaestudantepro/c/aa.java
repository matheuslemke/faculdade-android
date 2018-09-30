// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.DialogInterface;
import android.widget.EditText;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            u

class aa
    implements android.content.DialogInterface.OnClickListener
{

    final u a;

    aa(u u1)
    {
        a = u1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        u.b(a).setText(u.a(a)[i]);
        u.a(a, i);
    }
}
