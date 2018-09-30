// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ai;
import android.support.v4.app.u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clawdyvan.agendaestudantepro.Activities.i;
import com.clawdyvan.agendaestudantepro.Util.n;
import com.clawdyvan.agendaestudantepro.Util.t;
import com.clawdyvan.agendaestudantepro.b.b;
import com.clawdyvan.agendaestudantepro.b.d;
import com.clawdyvan.agendaestudantepro.c.bh;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            g, f, b, c, 
//            d, e

public class a extends Fragment
    implements i
{

    private View a;
    private View aj;
    private boolean ak;
    private LinearLayout al;
    private Context am;
    private AsyncTask an;
    private android.widget.AdapterView.OnItemClickListener ao;
    private GridView b;
    private n c;
    private ImageButton d;
    private TextView e;
    private ImageButton f;
    private com.clawdyvan.agendaestudantepro.Util.b g;
    private Button h;
    private String i[];

    public a()
    {
        ao = new g(this);
    }

    static AsyncTask a(a a1)
    {
        return a1.an;
    }

    static AsyncTask a(a a1, AsyncTask asynctask)
    {
        a1.an = asynctask;
        return asynctask;
    }

    private Bundle a()
    {
        Bundle bundle = new Bundle();
        bundle.putString("Data", c.i().d());
        bundle.putInt("TIPO_EVENTO", 3);
        return bundle;
    }

    private void a(View view)
    {
        android.view.animation.Animation animation = AnimationUtils.loadAnimation(k(), 0x7f040015);
        view.clearAnimation();
        view.startAnimation(animation);
    }

    static void a(a a1, View view)
    {
        a1.a(view);
    }

    static void a(a a1, List list)
    {
        a1.a(list);
    }

    private void a(List list)
    {
        if (ak)
        {
            return;
        }
        list = list.iterator();
        int k = 0;
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            if (!((d)list.next()).j())
            {
                k++;
            }
        } while (true);
        if (k > 0)
        {
            if (k > 1)
            {
                list = a(0x7f0b0046);
            } else
            {
                list = a(0x7f0b0047);
            }
            h.setText(String.format((new StringBuilder()).append("%d ").append(list).toString(), new Object[] {
                Integer.valueOf(k)
            }));
            h.setTypeface(null, 1);
            h.setTextColor(-1);
            list = l().getDrawable(0x7f02003e);
            list.setColorFilter(t.a(am), android.graphics.PorterDuff.Mode.SRC_ATOP);
            h.setBackgroundDrawable(list);
            return;
        } else
        {
            h.setText(a(0x7f0b004a));
            h.setTypeface(null, 0);
            h.setTextColor(0xff000000);
            h.setBackgroundDrawable(l().getDrawable(0x7f02003e));
            return;
        }
    }

    static com.clawdyvan.agendaestudantepro.Util.b b(a a1)
    {
        return a1.g;
    }

    private void b()
    {
        if (!ak)
        {
            return;
        } else
        {
            Object obj = a();
            ((Bundle) (obj)).putBoolean("EVENTOS_TABLET", true);
            bh bh1 = new bh();
            bh1.g(((Bundle) (obj)));
            obj = m().a();
            ((ai) (obj)).b(0x7f0900c4, bh1);
            ((ai) (obj)).b();
            return;
        }
    }

    private void c()
    {
        an = (new f(this)).execute(new Void[0]);
    }

    static void c(a a1)
    {
        a1.c();
    }

    static ImageButton d(a a1)
    {
        return a1.d;
    }

    private void d()
    {
        e.setText(String.format(a(0x7f0b008f), new Object[] {
            i[c.e()], Integer.valueOf(c.f())
        }));
        if (c.e() + 1 == g.a().b() && c.f() == g.a().a())
        {
            e.setTypeface(null, 1);
            return;
        } else
        {
            e.setTypeface(null, 0);
            return;
        }
    }

    static ImageButton e(a a1)
    {
        return a1.f;
    }

    static Bundle f(a a1)
    {
        return a1.a();
    }

    static n g(a a1)
    {
        return a1.c;
    }

    static void h(a a1)
    {
        a1.d();
    }

    static void i(a a1)
    {
        a1.b();
    }

    static TextView j(a a1)
    {
        return a1.e;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        a = layoutinflater.inflate(0x7f03004b, viewgroup, false);
        am = k();
        b = (GridView)a.findViewById(0x7f0900eb);
        b.setAdapter(g);
        b.setOnItemClickListener(ao);
        e = (TextView)a.findViewById(0x7f090052);
        al = (LinearLayout)a.findViewById(0x7f0900c4);
        h = (Button)a.findViewById(0x7f0900c3);
        d = (ImageButton)a.findViewById(0x7f090053);
        f = (ImageButton)a.findViewById(0x7f090051);
        boolean flag;
        if (al != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ak = flag;
        i = l().getStringArray(0x7f050005);
        d.setOnClickListener(new com.clawdyvan.agendaestudantepro.e.b(this));
        e.setOnClickListener(new c(this));
        f.setOnClickListener(new com.clawdyvan.agendaestudantepro.e.d(this));
        if (!ak)
        {
            h.setOnClickListener(new e(this));
        }
        aj = a.findViewById(0x7f090050);
        d();
        b();
        return a;
    }

    public void a(float f1)
    {
        if (aj != null)
        {
            aj.setTranslationY((float)(-aj.getHeight()) * f1);
        }
        if (h != null)
        {
            h.setTranslationY((float)h.getHeight() * f1);
        }
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        c = new n();
        if (bundle != null)
        {
            c.a(bundle.getLong("DATA"));
            g = new com.clawdyvan.agendaestudantepro.Util.b(k(), new b(bundle.getString("DATA_ATUAL")), c);
            return;
        } else
        {
            g = new com.clawdyvan.agendaestudantepro.Util.b(k(), c);
            return;
        }
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putLong("DATA", c.h());
        bundle.putString("DATA_ATUAL", g.a().d());
    }

    public void f()
    {
        if (!g.a().toString().equals((new n()).i().toString()))
        {
            g.c();
            g.g();
        }
        c();
        super.f();
    }

    public void u()
    {
        if (an != null)
        {
            an.cancel(true);
        }
        super.u();
    }
}
