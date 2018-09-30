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
import com.clawdyvan.agendaestudantepro.Util.p;
import com.clawdyvan.agendaestudantepro.Util.t;
import com.clawdyvan.agendaestudantepro.b.b;
import com.clawdyvan.agendaestudantepro.b.c;
import com.clawdyvan.agendaestudantepro.b.d;
import com.clawdyvan.agendaestudantepro.b.e;
import com.clawdyvan.agendaestudantepro.b.g;
import com.clawdyvan.agendaestudantepro.c.bh;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            ad, af, ae, ag, 
//            ah, z, aa, ab, 
//            ac

public class y extends Fragment
    implements i
{

    private View a;
    private View aj;
    private boolean ak;
    private LinearLayout al;
    private Context am;
    private AsyncTask an;
    private AsyncTask ao;
    private android.widget.AdapterView.OnItemClickListener ap;
    private n b;
    private n c;
    private n d;
    private GridView e;
    private ImageButton f;
    private ImageButton g;
    private Button h;
    private TextView i;

    public y()
    {
        ap = new ad(this);
    }

    private void O()
    {
        b.f(4);
        i.setText(String.format(a(0x7f0b0091), new Object[] {
            Integer.valueOf(b.k()), Integer.valueOf(b.f())
        }));
        b.f(1);
        d.a(b.h());
        d.g(6);
        if (c.a(b) >= 0 && c.a(d) <= 0)
        {
            i.setTypeface(null, 1);
            return;
        } else
        {
            i.setTypeface(null, 0);
            return;
        }
    }

    private void P()
    {
        p p1 = (p)e.getAdapter();
        p1.a(new n(b.h()));
        Q();
        p1.notifyDataSetChanged();
    }

    private void Q()
    {
        b.f(1);
        d.a(b.h());
        d.g(6);
        p p1 = (p)e.getAdapter();
        if (c.a(b) >= 0 && c.a(d) <= 0)
        {
            p1.a(c.g());
            return;
        } else
        {
            p1.a(0);
            return;
        }
    }

    static AsyncTask a(y y1)
    {
        return y1.an;
    }

    static AsyncTask a(y y1, AsyncTask asynctask)
    {
        y1.ao = asynctask;
        return asynctask;
    }

    private Bundle a()
    {
        Bundle bundle = new Bundle();
        bundle.putString("Data", b.i().d());
        bundle.putInt("TIPO_EVENTO", 2);
        return bundle;
    }

    static n a(y y1, n n1)
    {
        y1.c = n1;
        return n1;
    }

    private void a(View view)
    {
        android.view.animation.Animation animation = AnimationUtils.loadAnimation(k(), 0x7f040015);
        view.clearAnimation();
        view.startAnimation(animation);
    }

    private void a(e e1)
    {
        g g1 = e1.d();
        String s = e1.c().c();
        String s1 = e1.a();
        b.f(e1.b());
        e1 = new android.app.AlertDialog.Builder(am);
        e1.setTitle((new StringBuilder()).append(s).append(" - ").append(g1.d()).toString());
        e1.setIcon(0x7f020070);
        e1.setItems(l().getStringArray(0x7f050007), new af(this, g1, s1));
        e1.show();
    }

    static void a(y y1, int k)
    {
        y1.b(k);
    }

    static void a(y y1, View view)
    {
        y1.a(view);
    }

    static void a(y y1, e e1)
    {
        y1.a(e1);
    }

    static void a(y y1, List list)
    {
        y1.a(list);
    }

    static void a(y y1, Map map)
    {
        y1.a(map);
    }

    private void a(List list)
    {
        HashMap hashmap = new HashMap();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            d d1 = (d)list.next();
            d.a(d1.e());
            int k = d.g();
            if (!hashmap.containsKey(Integer.valueOf(k)) || ((Boolean)hashmap.get(Integer.valueOf(k))).booleanValue())
            {
                hashmap.put(Integer.valueOf(k), Boolean.valueOf(d1.j()));
            }
        } while (true);
        list = (p)e.getAdapter();
        list.a(hashmap);
        list.notifyDataSetChanged();
    }

    private void a(Map map)
    {
        e.setAdapter(new p(am, map, new n(b.h())));
    }

    static AsyncTask b(y y1, AsyncTask asynctask)
    {
        y1.an = asynctask;
        return asynctask;
    }

    static n b(y y1)
    {
        return y1.b;
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
            ((ai) (obj)).b(0x7f0900d1, bh1);
            ((ai) (obj)).b();
            return;
        }
    }

    private void b(int k)
    {
        b.f(k);
        String as[] = l().getStringArray(0x7f050002);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(am);
        builder.setTitle(String.format("%s, %d", new Object[] {
            as[b.g() - 1], Integer.valueOf(b.d())
        }));
        builder.setIcon(0x7f020070);
        builder.setItems(l().getStringArray(0x7f050006), new ae(this));
        builder.show();
    }

    static void b(y y1, List list)
    {
        y1.b(list);
    }

    private void b(List list)
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

    private void c()
    {
        ao = (new ag(this)).execute(new Object[0]);
    }

    static void c(y y1)
    {
        y1.d();
    }

    static ImageButton d(y y1)
    {
        return y1.g;
    }

    private void d()
    {
        an = (new ah(this)).execute(new Void[0]);
    }

    static ImageButton e(y y1)
    {
        return y1.f;
    }

    static Bundle f(y y1)
    {
        return y1.a();
    }

    static void g(y y1)
    {
        y1.O();
    }

    static void h(y y1)
    {
        y1.b();
    }

    static TextView i(y y1)
    {
        return y1.i;
    }

    static void j(y y1)
    {
        y1.P();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        a = (LinearLayout)layoutinflater.inflate(0x7f03004d, viewgroup, false);
        am = k();
        e = (GridView)a.findViewById(0x7f0900ec);
        e.setOnItemClickListener(ap);
        i = (TextView)a.findViewById(0x7f090052);
        al = (LinearLayout)a.findViewById(0x7f0900d1);
        h = (Button)a.findViewById(0x7f0900d0);
        f = (ImageButton)a.findViewById(0x7f090053);
        g = (ImageButton)a.findViewById(0x7f090051);
        boolean flag;
        if (al != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ak = flag;
        g.setOnClickListener(new z(this));
        i.setOnClickListener(new aa(this));
        f.setOnClickListener(new ab(this));
        if (!ak)
        {
            h.setOnClickListener(new ac(this));
        }
        aj = a.findViewById(0x7f090050);
        O();
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
        b = new n();
        c = new n(b.h());
        d = new n();
        if (bundle != null)
        {
            b.a(bundle.getLong("DATA"));
            c.a(bundle.getLong("DATA_ATUAL"));
        }
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putLong("DATA", b.h());
        bundle.putLong("DATA_ATUAL", c.h());
    }

    public void f()
    {
        n n1 = new n();
        if (n1.a(c) != 0)
        {
            b.a();
            c = n1;
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
        if (ao != null)
        {
            ao.cancel(true);
        }
        super.u();
    }
}
