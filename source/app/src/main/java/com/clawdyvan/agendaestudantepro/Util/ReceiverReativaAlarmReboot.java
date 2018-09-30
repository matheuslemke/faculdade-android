// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.clawdyvan.agendaestudantepro.a.b;
import com.clawdyvan.agendaestudantepro.b.d;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Util:
//            g

public class ReceiverReativaAlarmReboot extends BroadcastReceiver
{

    public ReceiverReativaAlarmReboot()
    {
    }

    public void a(Context context)
    {
        for (Iterator iterator = (new b(context)).b().iterator(); iterator.hasNext(); g.a(context, (d)iterator.next())) { }
    }

    public void onReceive(Context context, Intent intent)
    {
        a(context);
    }
}
