// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.a.c;
import com.clawdyvan.agendaestudantepro.b.e;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            bs, bp, cz, u, 
//            bu

class bt
    implements android.content.DialogInterface.OnClickListener
{

    final View a;
    final bs b;

    bt(bs bs1, View view)
    {
        b = bs1;
        a = view;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            dialoginterface = new Bundle();
            dialoginterface.putString("_id", a.getTag().toString());
            ContainerFragmentsActivity.a(b.a.k(), com/clawdyvan/agendaestudantepro/c/cz, dialoginterface, true);
            return;

        case 1: // '\001'
            dialoginterface = (new c(b.a.k())).b(a.getTag().toString());
            dialoginterface.a("");
            dialoginterface = com.clawdyvan.agendaestudantepro.Util.e.a(dialoginterface);
            ContainerFragmentsActivity.a(b.a.k(), com/clawdyvan/agendaestudantepro/c/u, dialoginterface, true);
            return;

        case 2: // '\002'
            dialoginterface = com.clawdyvan.agendaestudantepro.Util.e.a((new c(b.a.k())).b(a.getTag().toString()));
            ContainerFragmentsActivity.a(b.a.k(), com/clawdyvan/agendaestudantepro/c/u, dialoginterface, true);
            return;

        case 3: // '\003'
            dialoginterface = new android.app.AlertDialog.Builder(b.a.k());
            break;
        }
        dialoginterface.setMessage(b.a.a(0x7f0b0036));
        dialoginterface.setNegativeButton(b.a.a(0x7f0b0062), null);
        dialoginterface.setPositiveButton(b.a.a(0x7f0b0082), new bu(this));
        dialoginterface.show();
    }
}
