// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ai;
import android.support.v4.app.p;
import android.support.v4.app.u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.clawdyvan.agendaestudantepro.Util.n;
import com.clawdyvan.agendaestudantepro.Util.t;
import com.clawdyvan.agendaestudantepro.a.c;
import com.clawdyvan.agendaestudantepro.b.b;
import com.clawdyvan.agendaestudantepro.b.e;
import com.clawdyvan.agendaestudantepro.b.g;
import com.clawdyvan.agendaestudantepro.c.bh;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            n, j, k, l, 
//            m

public class i extends Fragment
    implements com.clawdyvan.agendaestudantepro.Activities.i
{

    private View a;
    private String aj[];
    private View ak;
    private boolean al;
    private LinearLayout am;
    private Context an;
    private LayoutInflater ao;
    private android.view.View.OnClickListener ap;
    private n b;
    private b c;
    private TableLayout d;
    private ImageButton e;
    private ImageButton f;
    private Button g;
    private TextView h;
    private String i[];

    public i()
    {
        ap = new com.clawdyvan.agendaestudantepro.e.n(this);
    }

    private Bundle a()
    {
        Bundle bundle = new Bundle();
        bundle.putString("Data", b.i().d());
        bundle.putInt("TIPO_EVENTO", 1);
        return bundle;
    }

    static n a(i i1)
    {
        return i1.b;
    }

    static b a(i i1, b b1)
    {
        i1.c = b1;
        return b1;
    }

    private void a(View view)
    {
        android.view.animation.Animation animation = AnimationUtils.loadAnimation(k(), 0x7f040015);
        view.clearAnimation();
        view.startAnimation(animation);
    }

    static void a(i i1, View view)
    {
        i1.a(view);
    }

    private void b()
    {
        if (!al)
        {
            return;
        } else
        {
            Object obj = a();
            ((Bundle) (obj)).putBoolean("EVENTOS_TABLET", true);
            bh bh1 = new bh();
            bh1.g(((Bundle) (obj)));
            obj = m().a();
            ((ai) (obj)).b(0x7f0900c6, bh1);
            ((ai) (obj)).b();
            return;
        }
    }

    static void b(i i1)
    {
        i1.c();
    }

    private void c()
    {
        ao = (LayoutInflater)k().getSystemService("layout_inflater");
        Object obj = new c(k());
        d.removeAllViews();
        TableRow tablerow = (TableRow)ao.inflate(0x7f030022, null);
        d.addView(tablerow);
        h.setText(String.format(a(0x7f0b0090), new Object[] {
            i[b.g() - 1], Integer.valueOf(b.d()), aj[b.e()]
        }));
        int i1;
        int j1;
        if (c.c() == b.d())
        {
            if (c.b() == b.e() + 1 && c.a() == b.f())
            {
                h.setTypeface(null, 1);
            }
        } else
        {
            h.setTypeface(null, 0);
        }
        obj = ((c) (obj)).a(b.g());
        j1 = ((List) (obj)).size();
        i1 = 0;
        while (i1 < j1) 
        {
            e e1 = (e)((List) (obj)).get(i1);
            TableRow tablerow1 = (TableRow)ao.inflate(0x7f030045, null);
            ((TextView)tablerow1.findViewById(0x7f09005c)).setText(e1.c().c());
            ((TextView)tablerow1.findViewById(0x7f09005d)).setText(e1.d().d());
            if (e1.e() != null)
            {
                ((TextView)tablerow1.findViewById(0x7f09005e)).setText(e1.e().d());
            } else
            {
                ((TextView)tablerow1.findViewById(0x7f09005e)).setText("--:--");
            }
            tablerow1.findViewById(0x7f0900e9).setBackgroundColor(e1.c().f());
            tablerow1.setTag(e1.a());
            tablerow1.setOnClickListener(ap);
            d.addView(tablerow1);
            i1++;
        }
        a(h);
        b();
    }

    static void c(i i1)
    {
        i1.d();
    }

    static ImageButton d(i i1)
    {
        return i1.e;
    }

    private void d()
    {
        if (al)
        {
            return;
        }
        long l1 = (new com.clawdyvan.agendaestudantepro.a.b(k())).d(new b(b.f(), b.e() + 1, b.d()));
        if (l1 > 0L)
        {
            Object obj;
            if (l1 > 1L)
            {
                obj = a(0x7f0b0046);
            } else
            {
                obj = a(0x7f0b0047);
            }
            g.setText(String.format((new StringBuilder()).append("%d ").append(((String) (obj))).toString(), new Object[] {
                Long.valueOf(l1)
            }));
            g.setTypeface(null, 1);
            g.setTextColor(-1);
            obj = l().getDrawable(0x7f02003e);
            ((Drawable) (obj)).setColorFilter(t.a(an), android.graphics.PorterDuff.Mode.SRC_ATOP);
            g.setBackgroundDrawable(((Drawable) (obj)));
            return;
        } else
        {
            g.setText(a(0x7f0b004a));
            g.setTypeface(null, 0);
            g.setTextColor(0xff000000);
            g.setBackgroundDrawable(l().getDrawable(0x7f02003e));
            return;
        }
    }

    static ImageButton e(i i1)
    {
        return i1.f;
    }

    static Bundle f(i i1)
    {
        return i1.a();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        a = layoutinflater.inflate(0x7f03004c, viewgroup, false);
        an = k();
        d = (TableLayout)a.findViewById(0x7f0900bd);
        h = (TextView)a.findViewById(0x7f090052);
        am = (LinearLayout)a.findViewById(0x7f0900c6);
        g = (Button)a.findViewById(0x7f0900c5);
        e = (ImageButton)a.findViewById(0x7f090051);
        f = (ImageButton)a.findViewById(0x7f090053);
        viewgroup = l();
        i = viewgroup.getStringArray(0x7f050002);
        aj = viewgroup.getStringArray(0x7f050005);
        boolean flag;
        if (am != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        al = flag;
        ao = layoutinflater;
        e.setOnClickListener(new j(this));
        h.setOnClickListener(new k(this));
        f.setOnClickListener(new l(this));
        if (!al)
        {
            g.setOnClickListener(new m(this));
        }
        ak = a.findViewById(0x7f090050);
        return a;
    }

    public void a(float f1)
    {
        if (ak != null)
        {
            ak.setTranslationY((float)(-ak.getHeight()) * f1);
        }
        if (g != null)
        {
            g.setTranslationY((float)g.getHeight() * f1);
        }
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        b = new n();
        if (bundle != null)
        {
            b.a(bundle.getLong("DATA"));
            c = new b(bundle.getString("DATA_ATUAL"));
            return;
        } else
        {
            c = b.i();
            return;
        }
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putLong("DATA", b.h());
        bundle.putString("DATA_ATUAL", c.d());
    }

    public void f()
    {
        c();
        d();
        super.f();
    }
}
