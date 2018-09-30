// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.view.View;
import android.widget.AdapterView;
import com.clawdyvan.agendaestudantepro.b.e;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            y

class ad
    implements android.widget.AdapterView.OnItemClickListener
{

    final y a;

    ad(y y1)
    {
        a = y1;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((AdapterView) (adapterview.getItemAtPosition(i)));
        if (adapterview instanceof Integer)
        {
            y.a(a, ((Integer)adapterview).intValue());
        } else
        {
            adapterview = (e)adapterview;
            if (adapterview.g())
            {
                y.a(a, adapterview);
                return;
            }
        }
    }
}
