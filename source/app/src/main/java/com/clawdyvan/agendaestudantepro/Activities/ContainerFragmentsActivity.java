// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ai;
import android.support.v4.app.u;
import android.support.v7.app.f;
import com.clawdyvan.agendaestudantepro.d.a;

public class ContainerFragmentsActivity extends f
    implements a
{

    public ContainerFragmentsActivity()
    {
    }

    private static Fragment a(Class class1, Bundle bundle)
    {
        try
        {
            class1 = (Fragment)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        try
        {
            class1.g(bundle);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return class1;
        }
        return class1;
    }

    public static void a(Activity activity, Class class1, Bundle bundle, boolean flag)
    {
        if (activity instanceof ContainerFragmentsActivity)
        {
            class1 = a(class1, bundle);
            ((ContainerFragmentsActivity)activity).a(((Fragment) (class1)), flag);
            return;
        } else
        {
            Intent intent = new Intent(activity, com/clawdyvan/agendaestudantepro/Activities/ContainerFragmentsActivity);
            intent.putExtra("FRAGMENT_CLASS", class1);
            intent.putExtra("FRAGMENT_ARGS", bundle);
            activity.startActivity(intent);
            activity.overridePendingTransition(0x7f040008, 0x7f040009);
            return;
        }
    }

    private void a(Fragment fragment, boolean flag)
    {
        ai ai1 = f().a();
        String s = fragment.getClass().getName();
        if (flag)
        {
            ai1.a(s);
            ai1.a(0x7f040010, 0x7f040011, 0x7f040012, 0x7f040013);
        }
        ai1.b(0x7f090040, fragment, s).b();
    }

    public void finish()
    {
        super.finish();
        overridePendingTransition(0x7f040006, 0x7f040007);
    }

    public void j()
    {
        u u1 = f();
        if (u1.d() == 0)
        {
            finish();
            return;
        } else
        {
            u1.c();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03004a);
        g().d();
        if (bundle == null)
        {
            bundle = getIntent();
            a(a((Class)bundle.getSerializableExtra("FRAGMENT_CLASS"), bundle.getBundleExtra("FRAGMENT_ARGS")), false);
        }
    }
}
