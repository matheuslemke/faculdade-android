// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Activities;

import android.view.View;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Activities:
//            VisualizacaoFotoActivity, l

class k
    implements android.view.View.OnClickListener
{

    final VisualizacaoFotoActivity a;

    k(VisualizacaoFotoActivity visualizacaofotoactivity)
    {
        a = visualizacaofotoactivity;
        super();
    }

    public void onClick(View view)
    {
        view = new android.app.AlertDialog.Builder(a);
        view.setMessage(a.getString(0x7f0b0036));
        view.setNegativeButton(a.getString(0x7f0b0062), null);
        view.setPositiveButton(0x7f0b0082, new l(this));
        view.show();
    }
}
