// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.os.AsyncTask;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.clawdyvan.agendaestudantepro.Util.i;
import com.clawdyvan.agendaestudantepro.a.b;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            bh, bk

class bj extends AsyncTask
{

    final bh a;

    bj(bh bh1)
    {
        a = bh1;
        super();
    }

    protected transient List a(Void avoid[])
    {
        avoid = a.k();
        if (avoid == null)
        {
            return null;
        }
        avoid = new b(avoid);
        if (bh.a(a) == 1)
        {
            bh.a(a, avoid.a(com.clawdyvan.agendaestudantepro.c.bh.b(a)));
        } else
        if (bh.a(a) == 2)
        {
            bh.a(a, avoid.b(com.clawdyvan.agendaestudantepro.c.bh.b(a)));
        } else
        if (bh.a(a) == 3)
        {
            bh.a(a, avoid.c(com.clawdyvan.agendaestudantepro.c.bh.b(a)));
        } else
        {
            bh.a(a, avoid.a());
        }
        return bh.c(a);
    }

    protected void a(List list)
    {
        Object obj;
        super.onPostExecute(list);
        if (a.k() == null)
        {
            return;
        }
        obj = bh.d(a).findViewById(0x7f0900b9);
        if (list.size() != 0) goto _L2; else goto _L1
_L1:
        ((View) (obj)).setVisibility(0);
        Animation animation = AnimationUtils.loadAnimation(a.k(), 0x7f04000a);
        animation.setStartOffset(200L);
        animation.setDuration(1000L);
        ((View) (obj)).clearAnimation();
        ((View) (obj)).startAnimation(animation);
_L4:
        obj = AnimationUtils.loadAnimation(a.k(), 0x7f04000a);
        ((Animation) (obj)).setDuration(300L);
        bh.e(a).clearAnimation();
        bh.e(a).startAnimation(((Animation) (obj)));
        list = new i(a.k(), list);
        bh.e(a).setAdapter(list);
        return;
_L2:
        if (((View) (obj)).getVisibility() == 0)
        {
            Animation animation1 = AnimationUtils.loadAnimation(a.k(), 0x7f04000c);
            animation1.setDuration(300L);
            animation1.setAnimationListener(new bk(this, ((View) (obj))));
            ((View) (obj)).clearAnimation();
            ((View) (obj)).startAnimation(animation1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((List)obj);
    }
}
