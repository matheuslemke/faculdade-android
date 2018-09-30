// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.clawdyvan.agendaestudantepro.Activities.ContainerFragmentsActivity;
import com.clawdyvan.agendaestudantepro.Util.f;
import com.clawdyvan.agendaestudantepro.Util.t;
import com.clawdyvan.agendaestudantepro.a.a;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            bg, bf, be, a

public class bd extends Fragment
{

    private ListView a;
    private List b;
    private View c;
    private View d;
    private android.widget.AdapterView.OnItemClickListener e;

    public bd()
    {
        e = new bg(this);
    }

    static List a(bd bd1)
    {
        return bd1.b;
    }

    private void a()
    {
        Object obj;
        b = (new a(k())).b();
        obj = d.findViewById(0x7f0900b2);
        if (b.size() != 0) goto _L2; else goto _L1
_L1:
        ((View) (obj)).setVisibility(0);
        Animation animation = AnimationUtils.loadAnimation(k(), 0x7f04000a);
        animation.setStartOffset(200L);
        animation.setDuration(1000L);
        ((View) (obj)).clearAnimation();
        ((View) (obj)).startAnimation(animation);
_L4:
        obj = AnimationUtils.loadAnimation(k(), 0x7f04000a);
        ((Animation) (obj)).setDuration(300L);
        a.clearAnimation();
        a.startAnimation(((Animation) (obj)));
        obj = new f(k(), b);
        a.setAdapter(((android.widget.ListAdapter) (obj)));
        return;
_L2:
        if (((View) (obj)).getVisibility() == 0)
        {
            Animation animation1 = AnimationUtils.loadAnimation(k(), 0x7f04000c);
            animation1.setDuration(300L);
            animation1.setAnimationListener(new bf(this, ((View) (obj))));
            ((View) (obj)).clearAnimation();
            ((View) (obj)).startAnimation(animation1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(bundle);
        d = layoutinflater.inflate(0x7f03002e, viewgroup, false);
        c = d.findViewById(0x7f0900b3);
        c.setOnClickListener(new be(this));
        a = (ListView)d.findViewById(0x7f0900b5);
        a.setOnItemClickListener(e);
        t.a(d);
        return d;
    }

    public void btNovaDisciplinaOnClick(View view)
    {
        ContainerFragmentsActivity.a(k(), com/clawdyvan/agendaestudantepro/c/a, null, true);
    }

    public void f()
    {
        a();
        super.f();
    }
}
