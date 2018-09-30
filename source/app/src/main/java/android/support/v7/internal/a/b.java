// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.app.ai;
import android.support.v4.app.p;
import android.support.v4.app.u;
import android.support.v4.view.bb;
import android.support.v4.view.cp;
import android.support.v4.view.df;
import android.support.v4.view.dh;
import android.support.v7.a.g;
import android.support.v7.app.a;
import android.support.v7.app.c;
import android.support.v7.app.d;
import android.support.v7.app.e;
import android.support.v7.app.f;
import android.support.v7.internal.view.h;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.internal.widget.af;
import android.support.v7.internal.widget.l;
import android.support.v7.internal.widget.x;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.a:
//            c, d, e, g, 
//            f

public class b extends a
    implements l
{

    static final boolean h;
    private static final boolean i;
    private boolean A;
    private int B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private h H;
    private boolean I;
    android.support.v7.internal.a.f a;
    android.support.v7.c.a b;
    android.support.v7.c.b c;
    boolean d;
    final df e = new android.support.v7.internal.a.c(this);
    final df f = new android.support.v7.internal.a.d(this);
    final dh g = new android.support.v7.internal.a.e(this);
    private Context j;
    private Context k;
    private p l;
    private ActionBarOverlayLayout m;
    private ActionBarContainer n;
    private x o;
    private ActionBarContextView p;
    private ActionBarContainer q;
    private View r;
    private af s;
    private ArrayList t;
    private android.support.v7.internal.a.g u;
    private int v;
    private boolean w;
    private boolean x;
    private ArrayList y;
    private int z;

    public b(f f1, boolean flag)
    {
        t = new ArrayList();
        v = -1;
        y = new ArrayList();
        B = 0;
        C = true;
        G = true;
        l = f1;
        f1 = f1.getWindow().getDecorView();
        a(f1);
        if (!flag)
        {
            r = f1.findViewById(0x1020002);
        }
    }

    static h a(b b1, h h1)
    {
        b1.H = h1;
        return h1;
    }

    private void a(d d1, int i1)
    {
        d1 = (android.support.v7.internal.a.g)d1;
        if (d1.g() == null)
        {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
        d1.a(i1);
        t.add(i1, d1);
        int j1 = t.size();
        for (i1++; i1 < j1; i1++)
        {
            ((android.support.v7.internal.a.g)t.get(i1)).a(i1);
        }

    }

    private void a(View view)
    {
        m = (ActionBarOverlayLayout)view.findViewById(g.decor_content_parent);
        if (m != null)
        {
            m.setActionBarVisibilityCallback(this);
        }
        o = b(view.findViewById(g.action_bar));
        p = (ActionBarContextView)view.findViewById(g.action_context_bar);
        n = (ActionBarContainer)view.findViewById(g.action_bar_container);
        q = (ActionBarContainer)view.findViewById(g.split_action_bar);
        if (o == null || p == null || n == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used ").append("with a compatible window decor layout").toString());
        }
        j = o.b();
        int i1;
        boolean flag;
        if (o.c())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        z = i1;
        if ((o.p() & 4) != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            w = true;
        }
        view = android.support.v7.internal.view.a.a(j);
        if (view.f() || i1 != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c(flag);
        m(view.d());
        view = j.obtainStyledAttributes(null, android.support.v7.a.l.ActionBar, android.support.v7.a.b.actionBarStyle, 0);
        if (view.getBoolean(android.support.v7.a.l.ActionBar_hideOnContentScroll, false))
        {
            d(true);
        }
        i1 = view.getDimensionPixelSize(android.support.v7.a.l.ActionBar_elevation, 0);
        if (i1 != 0)
        {
            a(i1);
        }
        view.recycle();
    }

    static boolean a(b b1)
    {
        return b1.C;
    }

    static boolean a(boolean flag, boolean flag1, boolean flag2)
    {
        return b(flag, flag1, flag2);
    }

    private x b(View view)
    {
        if (view instanceof x)
        {
            return (x)view;
        }
        if (view instanceof Toolbar)
        {
            return ((Toolbar)view).getWrapper();
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Can't make a decor toolbar out of ").append(view.getClass().getSimpleName()).toString());
        }
    }

    static View b(b b1)
    {
        return b1.r;
    }

    private static boolean b(boolean flag, boolean flag1, boolean flag2)
    {
        while (flag2 || !flag && !flag1) 
        {
            return true;
        }
        return false;
    }

    static ActionBarContainer c(b b1)
    {
        return b1.n;
    }

    static ActionBarContainer d(b b1)
    {
        return b1.q;
    }

    static int e(b b1)
    {
        return b1.z;
    }

    static ActionBarOverlayLayout f(b b1)
    {
        return b1.m;
    }

    static boolean g(b b1)
    {
        return b1.D;
    }

    static boolean h(b b1)
    {
        return b1.E;
    }

    static ActionBarContextView i(b b1)
    {
        return b1.p;
    }

    static x j(b b1)
    {
        return b1.o;
    }

    static Context k(b b1)
    {
        return b1.j;
    }

    static af l(b b1)
    {
        return b1.s;
    }

    private void m(boolean flag)
    {
        boolean flag2 = true;
        A = flag;
        Object obj;
        boolean flag1;
        if (!A)
        {
            o.a(null);
            n.setTabContainer(s);
        } else
        {
            n.setTabContainer(null);
            o.a(s);
        }
        if (i() == 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (s != null)
        {
            if (flag1)
            {
                s.setVisibility(0);
                if (m != null)
                {
                    bb.l(m);
                }
            } else
            {
                s.setVisibility(8);
            }
        }
        obj = o;
        if (!A && flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((x) (obj)).a(flag);
        obj = m;
        if (!A && flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        ((ActionBarOverlayLayout) (obj)).setHasNonEmbeddedTabs(flag);
    }

    private void n()
    {
        if (s != null)
        {
            return;
        }
        af af1 = new af(j);
        if (A)
        {
            af1.setVisibility(0);
            o.a(af1);
        } else
        {
            if (i() == 2)
            {
                af1.setVisibility(0);
                if (m != null)
                {
                    bb.l(m);
                }
            } else
            {
                af1.setVisibility(8);
            }
            n.setTabContainer(af1);
        }
        s = af1;
    }

    private void n(boolean flag)
    {
        if (b(D, E, F))
        {
            if (!G)
            {
                G = true;
                j(flag);
            }
        } else
        if (G)
        {
            G = false;
            k(flag);
            return;
        }
    }

    private void o()
    {
        if (!F)
        {
            F = true;
            if (m != null)
            {
                m.setShowingForActionMode(true);
            }
            n(false);
        }
    }

    private void p()
    {
        if (F)
        {
            F = false;
            if (m != null)
            {
                m.setShowingForActionMode(false);
            }
            n(false);
        }
    }

    public int a()
    {
        o.q();
        JVM INSTR tableswitch 1 2: default 32
    //                   1 49
    //                   2 34;
           goto _L1 _L2 _L3
_L1:
        return -1;
_L3:
        if (u != null)
        {
            return u.a();
        }
          goto _L1
_L2:
        return o.r();
    }

    public android.support.v7.c.a a(android.support.v7.c.b b1)
    {
        if (a != null)
        {
            a.c();
        }
        m.setHideOnContentScrollEnabled(false);
        p.c();
        b1 = new android.support.v7.internal.a.f(this, b1);
        if (b1.e())
        {
            b1.d();
            p.a(b1);
            l(true);
            if (q != null && z == 1 && q.getVisibility() != 0)
            {
                q.setVisibility(0);
                if (m != null)
                {
                    bb.l(m);
                }
            }
            p.sendAccessibilityEvent(32);
            a = b1;
            return b1;
        } else
        {
            return null;
        }
    }

    public void a(float f1)
    {
        bb.e(n, f1);
        if (q != null)
        {
            bb.e(q, f1);
        }
    }

    public void a(int i1)
    {
        switch (o.q())
        {
        default:
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");

        case 2: // '\002'
            a((d)t.get(i1));
            return;

        case 1: // '\001'
            o.e(i1);
            return;
        }
    }

    public void a(int i1, int j1)
    {
        int k1 = o.p();
        if ((j1 & 4) != 0)
        {
            w = true;
        }
        o.c(k1 & ~j1 | i1 & j1);
    }

    public void a(Configuration configuration)
    {
        m(android.support.v7.internal.view.a.a(j).d());
    }

    public void a(d d1)
    {
        int i1 = -1;
        if (i() == 2) goto _L2; else goto _L1
_L1:
        if (d1 != null)
        {
            i1 = d1.a();
        }
        v = i1;
_L4:
        return;
_L2:
        ai ai1;
        if (o.a().isInEditMode())
        {
            ai1 = null;
        } else
        {
            ai1 = l.f().a().a();
        }
        if (u != d1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (u != null)
        {
            u.g().c(u, ai1);
            s.a(d1.a());
        }
_L5:
        if (ai1 != null && !ai1.e())
        {
            ai1.b();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        af af1 = s;
        if (d1 != null)
        {
            i1 = d1.a();
        }
        af1.setTabSelected(i1);
        if (u != null)
        {
            u.g().b(u, ai1);
        }
        u = (android.support.v7.internal.a.g)d1;
        if (u != null)
        {
            u.g().a(u, ai1);
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public void a(d d1, boolean flag)
    {
        n();
        s.a(d1, flag);
        a(d1, t.size());
        if (flag)
        {
            a(d1);
        }
    }

    public void a(CharSequence charsequence)
    {
        o.a(charsequence);
    }

    public void a(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 2);
    }

    public int b()
    {
        return o.p();
    }

    public void b(int i1)
    {
        int j1;
        boolean flag1;
        flag1 = true;
        j1 = o.q();
        j1;
        JVM INSTR tableswitch 2 2: default 32
    //                   2 144;
           goto _L1 _L2
_L1:
        if (j1 != i1 && !A && m != null)
        {
            bb.l(m);
        }
        o.d(i1);
        i1;
        JVM INSTR tableswitch 2 2: default 88
    //                   2 169;
           goto _L3 _L4
_L3:
        Object obj = o;
        boolean flag;
        if (i1 == 2 && !A)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((x) (obj)).a(flag);
        obj = m;
        if (i1 == 2 && !A)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ((ActionBarOverlayLayout) (obj)).setHasNonEmbeddedTabs(flag);
        return;
_L2:
        v = a();
        a(((d) (null)));
        s.setVisibility(8);
          goto _L1
_L4:
        n();
        s.setVisibility(0);
        if (v != -1)
        {
            a(v);
            v = -1;
        }
          goto _L3
    }

    public void b(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 8);
    }

    public d c()
    {
        return new android.support.v7.internal.a.g(this);
    }

    public void c(int i1)
    {
        B = i1;
    }

    public void c(boolean flag)
    {
        o.b(flag);
    }

    public void d()
    {
        if (!D)
        {
            D = true;
            n(false);
        }
    }

    public void d(boolean flag)
    {
        if (flag && !m.a())
        {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        } else
        {
            d = flag;
            m.setHideOnContentScrollEnabled(flag);
            return;
        }
    }

    public Context e()
    {
        if (k == null)
        {
            TypedValue typedvalue = new TypedValue();
            j.getTheme().resolveAttribute(android.support.v7.a.b.actionBarWidgetTheme, typedvalue, true);
            int i1 = typedvalue.resourceId;
            if (i1 != 0)
            {
                k = new ContextThemeWrapper(j, i1);
            } else
            {
                k = j;
            }
        }
        return k;
    }

    public void e(boolean flag)
    {
        if (!w)
        {
            h(flag);
        }
    }

    public void f(boolean flag)
    {
        I = flag;
        if (!flag && H != null)
        {
            H.b();
        }
    }

    public void g(boolean flag)
    {
        if (flag != x)
        {
            x = flag;
            int j1 = y.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                ((c)y.get(i1)).a(flag);
                i1++;
            }
        }
    }

    public boolean g()
    {
        if (o != null && o.d())
        {
            o.e();
            return true;
        } else
        {
            return false;
        }
    }

    void h()
    {
        if (c != null)
        {
            c.a(b);
            b = null;
            c = null;
        }
    }

    public void h(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 4);
    }

    public int i()
    {
        return o.q();
    }

    public void i(boolean flag)
    {
        C = flag;
    }

    public void j()
    {
        if (E)
        {
            E = false;
            n(true);
        }
    }

    public void j(boolean flag)
    {
        if (H != null)
        {
            H.b();
        }
        n.setVisibility(0);
        if (B == 0 && i && (I || flag))
        {
            bb.b(n, 0.0F);
            float f2 = -n.getHeight();
            float f1 = f2;
            if (flag)
            {
                int ai1[] = new int[2];
                int[] _tmp = ai1;
                ai1[0] = 0;
                ai1[1] = 0;
                n.getLocationInWindow(ai1);
                f1 = f2 - (float)ai1[1];
            }
            bb.b(n, f1);
            h h1 = new h();
            cp cp1 = bb.j(n).c(0.0F);
            cp1.a(g);
            h1.a(cp1);
            if (C && r != null)
            {
                bb.b(r, f1);
                h1.a(bb.j(r).c(0.0F));
            }
            if (q != null && z == 1)
            {
                bb.b(q, q.getHeight());
                q.setVisibility(0);
                h1.a(bb.j(q).c(0.0F));
            }
            h1.a(AnimationUtils.loadInterpolator(j, 0x10a0006));
            h1.a(250L);
            h1.a(f);
            H = h1;
            h1.a();
        } else
        {
            bb.c(n, 1.0F);
            bb.b(n, 0.0F);
            if (C && r != null)
            {
                bb.b(r, 0.0F);
            }
            if (q != null && z == 1)
            {
                bb.c(q, 1.0F);
                bb.b(q, 0.0F);
                q.setVisibility(0);
            }
            f.b(null);
        }
        if (m != null)
        {
            bb.l(m);
        }
    }

    public void k()
    {
        if (!E)
        {
            E = true;
            n(true);
        }
    }

    public void k(boolean flag)
    {
        if (H != null)
        {
            H.b();
        }
        if (B == 0 && i && (I || flag))
        {
            bb.c(n, 1.0F);
            n.setTransitioning(true);
            h h1 = new h();
            float f2 = -n.getHeight();
            float f1 = f2;
            if (flag)
            {
                int ai1[] = new int[2];
                int[] _tmp = ai1;
                ai1[0] = 0;
                ai1[1] = 0;
                n.getLocationInWindow(ai1);
                f1 = f2 - (float)ai1[1];
            }
            cp cp1 = bb.j(n).c(f1);
            cp1.a(g);
            h1.a(cp1);
            if (C && r != null)
            {
                h1.a(bb.j(r).c(f1));
            }
            if (q != null && q.getVisibility() == 0)
            {
                bb.c(q, 1.0F);
                h1.a(bb.j(q).c(q.getHeight()));
            }
            h1.a(AnimationUtils.loadInterpolator(j, 0x10a0005));
            h1.a(250L);
            h1.a(e);
            H = h1;
            h1.a();
            return;
        } else
        {
            e.b(null);
            return;
        }
    }

    public void l()
    {
        if (H != null)
        {
            H.b();
            H = null;
        }
    }

    public void l(boolean flag)
    {
        boolean flag1 = false;
        Object obj;
        int i1;
        if (flag)
        {
            o();
        } else
        {
            p();
        }
        obj = o;
        if (flag)
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        ((x) (obj)).f(i1);
        obj = p;
        if (flag)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        ((ActionBarContextView) (obj)).a(i1);
    }

    public void m()
    {
    }

    static 
    {
        boolean flag1 = true;
        boolean flag;
        if (!android/support/v7/internal/a/b.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        i = flag;
    }
}
