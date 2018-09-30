// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;
import java.io.File;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            au, ar

class av
    implements android.content.DialogInterface.OnClickListener
{

    final EditText a;
    final au b;

    av(au au1, EditText edittext)
    {
        b = au1;
        a = edittext;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = a.getText().toString();
        dialoginterface = ar.a(b.a, dialoginterface);
        if (dialoginterface == null)
        {
            ar.b(b.a, "Error: Copy error");
            return;
        } else
        {
            ar.b(b.a, String.format(ar.b(b.a).getString(0x7f0b0022), new Object[] {
                dialoginterface.getName().replace(".aeb", "")
            }));
            return;
        }
    }
}
