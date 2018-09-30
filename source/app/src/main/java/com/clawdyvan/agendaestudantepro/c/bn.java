// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.DialogInterface;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.Util.e;
import com.clawdyvan.agendaestudantepro.b.d;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            bm, bh, bo, f

class bn
    implements android.content.DialogInterface.OnClickListener
{

    final int a;
    final bm b;

    bn(bm bm1, int i)
    {
        b = bm1;
        a = i;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            dialoginterface = new android.app.AlertDialog.Builder(b.a.k());
            dialoginterface.setMessage(b.a.a(0x7f0b0036));
            dialoginterface.setNegativeButton(b.a.a(0x7f0b0062), null);
            dialoginterface.setPositiveButton(b.a.a(0x7f0b0082), new bo(this));
            dialoginterface.show();
            return;

        case 1: // '\001'
            dialoginterface = new d((d)bh.c(b.a).get(a));
            break;
        }
        dialoginterface.a("");
        dialoginterface.b(false);
        dialoginterface.a(false);
        dialoginterface = e.a(dialoginterface);
        ContainerFragmentsActivity.a(b.a.k(), com/clawdyvan/agendaestudantepro/c/f, dialoginterface, true);
    }
}
