// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.CustomViews.ColorPicker;

import android.app.Dialog;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ai;
import android.support.v4.app.l;
import android.support.v4.app.p;
import android.support.v4.app.u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clawdyvan.agendaestudantepro.Util.t;

// Referenced classes of package com.clawdyvan.agendaestudantepro.CustomViews.ColorPicker:
//            h, e, ColorPickerView, ColorPanelView, 
//            c, d

public class b extends l
    implements h
{

    private String aj;
    private boolean ak;
    private boolean al;
    private String am;
    private String an;
    private android.view.View.OnClickListener ao;
    private android.view.View.OnClickListener ap;
    private ColorPickerView aq;
    private ColorPanelView ar;
    private ColorPanelView as;
    private int at;
    private boolean au;

    public b()
    {
    }

    static android.view.View.OnClickListener a(b b1)
    {
        return b1.ap;
    }

    public static void a(p p1, int i, android.view.View.OnClickListener onclicklistener)
    {
        b b1 = (b)p1.f().a("ColorPicker");
        if (b1 != null)
        {
            p1.f().a().a(b1).b();
        }
        b1 = new b();
        b1.b(i);
        b1.a(p1.getString(0x7f0b007f));
        b1.g(true);
        b1.h(true);
        b1.b(p1.getString(0x7f0b0071));
        b1.c(p1.getString(0x7f0b001d));
        b1.b(true);
        b1.a(((android.view.View.OnClickListener) (new e(b1, p1, onclicklistener))));
        b1.a(p1.f(), "ColorPicker");
    }

    static android.view.View.OnClickListener b(b b1)
    {
        return b1.ao;
    }

    public int O()
    {
        return aq.getColor();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = layoutinflater.inflate(0x7f030023, null);
        c().getWindow().getAttributes().windowAnimations = 0x7f0c00e7;
        c().getWindow().setBackgroundDrawableResource(0x106000d);
        aq = (ColorPickerView)bundle.findViewById(0x7f090060);
        ar = (ColorPanelView)bundle.findViewById(0x7f090062);
        as = (ColorPanelView)bundle.findViewById(0x7f090063);
        if (l().getConfiguration().orientation == 2 && com.clawdyvan.agendaestudantepro.Util.t.a(k()) <= com.clawdyvan.agendaestudantepro.Util.t.a(360))
        {
            bundle.findViewById(0x7f090061).setVisibility(8);
        }
        ((LinearLayout)ar.getParent()).setPadding(Math.round(aq.getDrawingOffset()), 0, Math.round(aq.getDrawingOffset()), 0);
        aq.setOnColorChangedListener(this);
        ar.setColor(at);
        aq.a(at, true);
        View view;
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            viewgroup = (TextView)bundle.findViewById(0x7f090065);
            layoutinflater = (TextView)bundle.findViewById(0x7f090067);
        } else
        {
            viewgroup = (TextView)bundle.findViewById(0x7f090067);
            layoutinflater = (TextView)bundle.findViewById(0x7f090065);
        }
        if (aj != null)
        {
            TextView textview = (TextView)bundle.findViewById(0x7f09005f);
            textview.setVisibility(0);
            textview.setText(aj);
        }
        view = bundle.findViewById(0x7f090064);
        if (ak)
        {
            view.setVisibility(0);
            viewgroup.setVisibility(0);
            if (am != null)
            {
                viewgroup.setText(am);
            }
            viewgroup.setOnClickListener(new c(this));
        }
        if (al)
        {
            view.setVisibility(0);
            layoutinflater.setVisibility(0);
            if (an != null)
            {
                layoutinflater.setText(an);
            }
            layoutinflater.setOnClickListener(new d(this));
        }
        if (ak && al)
        {
            bundle.findViewById(0x7f090066).setVisibility(0);
        }
        return bundle;
    }

    public void a()
    {
        b();
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        a(1, 0);
    }

    public void a(android.view.View.OnClickListener onclicklistener)
    {
        ap = onclicklistener;
    }

    public void a(String s)
    {
        aj = s;
    }

    public void b()
    {
        super.b();
        b b1;
        try
        {
            b1 = (b)k().f().a("ColorPicker");
        }
        catch (Exception exception)
        {
            return;
        }
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        k().f().a().a(b1).b();
    }

    public void b(int i)
    {
        at = i;
    }

    public void b(String s)
    {
        am = s;
    }

    public void c(int i)
    {
        as.setColor(i);
    }

    public void c(String s)
    {
        an = s;
    }

    public void g(boolean flag)
    {
        ak = flag;
    }

    public void h(boolean flag)
    {
        al = flag;
    }

    public void t()
    {
        if (!au)
        {
            b();
        }
        super.t();
    }
}
