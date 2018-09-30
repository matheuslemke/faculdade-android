// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.b.c;
import com.clawdyvan.agendaestudantepro.b.f;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            bx, dc

class cb
    implements android.widget.AdapterView.OnItemClickListener
{

    final bx a;

    cb(bx bx1)
    {
        a = bx1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (f)bx.a(a).get(i);
        view = (c)com.clawdyvan.agendaestudantepro.c.bx.c(a).get(bx.b(a));
        Bundle bundle = new Bundle();
        bundle.putString("_id", adapterview.a());
        bundle.putString("Disciplina", view.a());
        ContainerFragmentsActivity.a(a.k(), com/clawdyvan/agendaestudantepro/c/dc, bundle, true);
    }
}
