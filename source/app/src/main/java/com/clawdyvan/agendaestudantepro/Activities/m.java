// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Activities;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Activities:
//            VisualizacaoFotoActivity

class m
    implements android.view.View.OnClickListener
{

    final VisualizacaoFotoActivity a;

    m(VisualizacaoFotoActivity visualizacaofotoactivity)
    {
        a = visualizacaofotoactivity;
        super();
    }

    public void onClick(View view)
    {
        if (!VisualizacaoFotoActivity.b(a).b().equals(""))
        {
            VisualizacaoFotoActivity.b(a).a(VisualizacaoFotoActivity.b(a).b());
        }
        view = new Intent();
        view.putExtra("fotoHandler", VisualizacaoFotoActivity.b(a));
        a.setResult(-1, view);
        a.finish();
    }
}
