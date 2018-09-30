// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Util;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.CompoundButton;
import com.b.a.i;
import com.clawdyvan.agendaestudantepro.a.b;
import com.clawdyvan.agendaestudantepro.b.d;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Util:
//            i, k

class j
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    final com.clawdyvan.agendaestudantepro.Util.i a;

    j(com.clawdyvan.agendaestudantepro.Util.i l)
    {
        a = l;
        super();
    }

    private void a(View view, boolean flag)
    {
        if (!flag)
        {
            i.a(view, "alpha", new float[] {
                1.0F, 0.2F
            }).a();
            return;
        } else
        {
            i.a(view, "alpha", new float[] {
                0.2F, 1.0F
            }).a();
            return;
        }
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        Object obj = (View)compoundbutton.getParent().getParent();
        b b1 = new b(i.a(a));
        compoundbutton = (d)com.clawdyvan.agendaestudantepro.Util.i.b(a).get(Integer.parseInt(compoundbutton.getTag().toString()));
        if (flag)
        {
            a(((View) (obj)), false);
            if (!compoundbutton.j() && compoundbutton.i())
            {
                obj = new android.app.AlertDialog.Builder(i.a(a));
                ((android.app.AlertDialog.Builder) (obj)).setMessage(i.a(a).getString(0x7f0b0031));
                ((android.app.AlertDialog.Builder) (obj)).setNegativeButton(i.a(a).getString(0x7f0b0062), null);
                ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(i.a(a).getString(0x7f0b0082), new k(this, compoundbutton, b1));
                ((android.app.AlertDialog.Builder) (obj)).show();
            }
        } else
        {
            a(((View) (obj)), true);
        }
        if (compoundbutton.j() != flag)
        {
            compoundbutton.b(flag);
            b1.b(compoundbutton);
        }
    }
}
