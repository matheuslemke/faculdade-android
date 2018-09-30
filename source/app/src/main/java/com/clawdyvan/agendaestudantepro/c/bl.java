// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.b.d;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            bh, cq

class bl
    implements android.widget.AdapterView.OnItemClickListener
{

    final bh a;

    bl(bh bh1)
    {
        a = bh1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (d)bh.c(a).get(i);
        view = new Bundle();
        view.putString("_id", adapterview.b());
        ContainerFragmentsActivity.a(a.k(), com/clawdyvan/agendaestudantepro/c/cq, view, true);
    }
}
