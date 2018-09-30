// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.b.c;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            bd, ck

class bg
    implements android.widget.AdapterView.OnItemClickListener
{

    final bd a;

    bg(bd bd1)
    {
        a = bd1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (c)bd.a(a).get(i);
        view = new Bundle();
        view.putString("_id", adapterview.a());
        ContainerFragmentsActivity.a(a.k(), com/clawdyvan/agendaestudantepro/c/ck, view, true);
    }
}
