// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Util;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.a.b;
import com.clawdyvan.agendaestudantepro.b.d;
import com.clawdyvan.agendaestudantepro.c.bh;
import java.io.File;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Util:
//            h

public class g
{

    public static void a(Activity activity, com.clawdyvan.agendaestudantepro.b.b b1)
    {
        a(activity, b1, ((com.clawdyvan.agendaestudantepro.b.g) (null)));
    }

    public static void a(Activity activity, com.clawdyvan.agendaestudantepro.b.b b1, com.clawdyvan.agendaestudantepro.b.g g1)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        builder.setTitle(activity.getString(0x7f0b0087));
        builder.setItems(activity.getResources().getStringArray(0x7f050008), new h(b1, g1, activity));
        builder.show();
    }

    public static void a(Context context, d d1)
    {
        Object obj = new Intent("com.clawdyvan.agendaestudantepro");
        ((Intent) (obj)).putExtra("_id", d1);
        obj = PendingIntent.getBroadcast(context, Integer.parseInt(d1.b()), ((Intent) (obj)), 0x8000000);
        ((AlarmManager)context.getSystemService("alarm")).set(0, d1.h(), ((PendingIntent) (obj)));
    }

    public static void a(d d1, Context context)
    {
        a(d1, context, true);
    }

    public static void a(d d1, Context context, boolean flag)
    {
        (new b(context)).a(d1.b());
        if (flag)
        {
            (new File(d1.g())).delete();
        }
        if (d1.i())
        {
            b(context, d1);
        }
    }

    public static void b(Activity activity, com.clawdyvan.agendaestudantepro.b.b b1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("Data", b1.d());
        bundle.putInt("TIPO_EVENTO", 1);
        ContainerFragmentsActivity.a(activity, com/clawdyvan/agendaestudantepro/c/bh, bundle, true);
    }

    public static void b(Context context, d d1)
    {
        Intent intent = new Intent("com.clawdyvan.agendaestudantepro");
        d1 = PendingIntent.getBroadcast(context, Integer.parseInt(d1.b()), intent, 0x20000000);
        if (d1 != null)
        {
            ((AlarmManager)context.getSystemService("alarm")).cancel(d1);
            d1.cancel();
        }
    }
}
