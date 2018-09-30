// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Activities;

import android.content.DialogInterface;
import android.content.Intent;
import com.clawdyvan.agendaestudantepro.Util.m;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Activities:
//            k, VisualizacaoFotoActivity

class l
    implements android.content.DialogInterface.OnClickListener
{

    final k a;

    l(k k1)
    {
        a = k1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        VisualizacaoFotoActivity.b(a.a).c();
        VisualizacaoFotoActivity.b(a.a).a("");
        dialoginterface = new Intent();
        dialoginterface.putExtra("fotoHandler", VisualizacaoFotoActivity.b(a.a));
        a.a.setResult(-1, dialoginterface);
        a.a.finish();
    }
}
