// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Util;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.RingtoneManager;
import android.os.Bundle;
import android.support.v4.app.bh;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.Activities.MainActivity;
import com.clawdyvan.agendaestudantepro.a.b;
import com.clawdyvan.agendaestudantepro.b.d;
import com.clawdyvan.agendaestudantepro.c.cq;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Util:
//            ReceiverReativaAlarmReboot

public class AlarmReceiver extends BroadcastReceiver
{

    public AlarmReceiver()
    {
    }

    private void a(Context context, Intent intent)
    {
        intent = (d)intent.getSerializableExtra("_id");
        intent.a(false);
        (new b(context)).b(intent);
        int i = Integer.parseInt(intent.b());
        bh bh1 = new bh(context);
        bh1.a(0x7f02005b);
        bh1.a(intent.c());
        bh1.b(intent.d());
        bh1.a(RingtoneManager.getDefaultUri(2), 5);
        Intent intent1 = new Intent(context, com/clawdyvan/agendaestudantepro/Activities/ContainerFragmentsActivity);
        intent1.putExtra("FRAGMENT_CLASS", com/clawdyvan/agendaestudantepro/c/cq);
        Bundle bundle = new Bundle();
        bundle.putString("_id", intent.b());
        intent1.putExtra("FRAGMENT_ARGS", bundle);
        bh1.a(PendingIntent.getActivity(context, i, intent1, 0x8000000));
        bh1.a(true);
        ((NotificationManager)context.getSystemService("notification")).notify(i, bh1.a());
_L2:
        return;
        intent;
        intent = MainActivity.a(context);
        if (!intent.contains("foramReativados"))
        {
            (new ReceiverReativaAlarmReboot()).a(context);
            context = intent.edit();
            context.putBoolean("foramReativados", true);
            context.commit();
            return;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onReceive(Context context, Intent intent)
    {
        a(context, intent);
    }
}
