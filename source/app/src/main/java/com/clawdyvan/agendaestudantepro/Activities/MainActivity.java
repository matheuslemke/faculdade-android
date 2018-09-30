// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.a;
import android.support.v7.app.d;
import android.support.v7.app.e;
import android.support.v7.app.f;
import android.view.View;
import com.clawdyvan.agendaestudantepro.Util.v;
import com.clawdyvan.agendaestudantepro.e.i;
import com.clawdyvan.agendaestudantepro.e.p;
import com.clawdyvan.agendaestudantepro.e.y;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Activities:
//            g, i, h, e, 
//            f

public class MainActivity extends f
{

    private static com.clawdyvan.agendaestudantepro.Util.d x;
    private final String n = "CURRENT_TAB";
    private final int o = 4;
    private final int p = 0;
    private final int q = 1;
    private final int r = 2;
    private final int s = 3;
    private a t;
    private ViewPager u;
    private SharedPreferences v;
    private com.clawdyvan.agendaestudantepro.Activities.i w[];
    private e y;

    public MainActivity()
    {
        y = new g(this);
    }

    public static SharedPreferences a(Context context)
    {
        return context.getSharedPreferences("PREFERENCES", 0);
    }

    static a a(MainActivity mainactivity)
    {
        return mainactivity.t;
    }

    private d a(int j)
    {
        switch (j)
        {
        default:
            return null;

        case 0: // '\0'
            return t.c().a(getString(0x7f0b0060)).a(y);

        case 1: // '\001'
            return t.c().a(getString(0x7f0b0039)).a(y);

        case 2: // '\002'
            return t.c().a(getString(0x7f0b0080)).a(y);

        case 3: // '\003'
            return t.c().a(getString(0x7f0b001b)).a(y);
        }
    }

    public static com.clawdyvan.agendaestudantepro.Util.d b(Context context)
    {
        if (x == null)
        {
            x = new com.clawdyvan.agendaestudantepro.Util.d(context);
        }
        return x;
    }

    static com.clawdyvan.agendaestudantepro.Activities.i[] b(MainActivity mainactivity)
    {
        return mainactivity.w;
    }

    static ViewPager c(MainActivity mainactivity)
    {
        return mainactivity.u;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001a);
        t = g();
        t.b(2);
        t.b(false);
        t.a(false);
        w = (new com.clawdyvan.agendaestudantepro.Activities.i[] {
            new p(), new i(), new y(), new com.clawdyvan.agendaestudantepro.e.a()
        });
        u = (ViewPager)findViewById(0x7f090041);
        bundle = new h(this, f());
        u.setAdapter(bundle);
        u.setOnPageChangeListener(new com.clawdyvan.agendaestudantepro.Activities.e(this));
        t.a(a(0), false);
        t.a(a(1), false);
        t.a(a(2), false);
        t.a(a(3), false);
        v = a(this);
        int j = v.getInt("CURRENT_TAB", 0);
        x = b(this);
        t.a(j);
        View view = findViewById(0x7f090042);
        view.setOnClickListener(new com.clawdyvan.agendaestudantepro.Activities.f(this, bundle));
        if (com.clawdyvan.agendaestudantepro.Util.v.a())
        {
            view.setVisibility(8);
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

    protected void onPause()
    {
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
    }

    protected void onStop()
    {
        android.content.SharedPreferences.Editor editor = v.edit();
        editor.putInt("CURRENT_TAB", t.a());
        editor.commit();
        super.onStop();
    }
}
