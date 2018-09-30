// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.clawdyvan.agendaestudantepro.CustomViews.CirculoView;
import com.clawdyvan.agendaestudantepro.Util.t;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            ci, ch

public class cg extends l
{

    private final int aj = 50;
    private Context ak;
    private int al;
    private int am;
    private String an[];
    private android.view.View.OnClickListener ao;

    public cg()
    {
    }

    static Context a(cg cg1)
    {
        return cg1.ak;
    }

    private void a(View view)
    {
        if (al != 0)
        {
            view = (LinearLayout)view.findViewById(0x7f09006a);
            int k = an.length;
            int i1 = (int)Math.ceil((float)k / (float)al);
            int i = 0;
            while (i < i1) 
            {
                LinearLayout linearlayout = new LinearLayout(ak);
                linearlayout.setOrientation(0);
                linearlayout.setMinimumWidth(al * com.clawdyvan.agendaestudantepro.Util.t.a(50));
                for (int j = 0; j < al && al * i + j < k; j++)
                {
                    CirculoView circuloview = new CirculoView(ak);
                    circuloview.setLayoutParams(new android.view.ViewGroup.LayoutParams(com.clawdyvan.agendaestudantepro.Util.t.a(50), com.clawdyvan.agendaestudantepro.Util.t.a(50)));
                    int j1 = com.clawdyvan.agendaestudantepro.Util.t.a(1);
                    circuloview.setPadding(com.clawdyvan.agendaestudantepro.Util.t.a(j1), com.clawdyvan.agendaestudantepro.Util.t.a(j1), com.clawdyvan.agendaestudantepro.Util.t.a(j1), com.clawdyvan.agendaestudantepro.Util.t.a(j1));
                    circuloview.setCorDesenho(Color.parseColor(an[al * i + j]));
                    circuloview.setOnClickListener(new ci(this));
                    linearlayout.addView(circuloview);
                }

                view.addView(linearlayout);
                i++;
            }
        }
    }

    static int b(cg cg1)
    {
        return cg1.am;
    }

    static android.view.View.OnClickListener c(cg cg1)
    {
        return cg1.ao;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        c().getWindow().getAttributes().windowAnimations = 0x7f0c00e9;
        layoutinflater = layoutinflater.inflate(0x7f030025, null);
        a(((View) (layoutinflater)));
        layoutinflater.findViewById(0x7f09006b).setOnClickListener(new ch(this));
        return layoutinflater;
    }

    public void a(Context context, int i, String as[], android.view.View.OnClickListener onclicklistener)
    {
        ak = context;
        al = i;
        an = as;
        ao = onclicklistener;
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        a(1, 0);
    }

    public void b(int i)
    {
        am = i;
    }

    public void t()
    {
        a();
        super.t();
    }
}
