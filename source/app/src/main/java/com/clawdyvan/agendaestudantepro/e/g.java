// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.clawdyvan.agendaestudantepro.Util.n;
import com.clawdyvan.agendaestudantepro.b.b;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            a, h

class g
    implements android.widget.AdapterView.OnItemClickListener
{

    final a a;

    g(a a1)
    {
        a = a1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((TextView)view).getText().toString();
        b b1 = com.clawdyvan.agendaestudantepro.e.a.g(a).i();
        try
        {
            b1.c(Integer.parseInt(adapterview));
            view = new android.app.AlertDialog.Builder(view.getContext());
            view.setTitle(adapterview);
            view.setIcon(0x7f020067);
            view.setItems(a.l().getStringArray(0x7f050006), new h(this, b1));
            view.show();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AdapterView adapterview)
        {
            return;
        }
    }
}
