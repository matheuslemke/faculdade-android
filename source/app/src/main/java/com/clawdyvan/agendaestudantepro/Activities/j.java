// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Activities;

import android.view.View;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Activities:
//            VisualizacaoFotoActivity

class j
    implements android.view.View.OnClickListener
{

    final VisualizacaoFotoActivity a;

    j(VisualizacaoFotoActivity visualizacaofotoactivity)
    {
        a = visualizacaofotoactivity;
        super();
    }

    public void onClick(View view)
    {
        VisualizacaoFotoActivity.a(a);
    }
}
