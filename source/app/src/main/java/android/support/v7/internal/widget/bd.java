// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.bb;
import android.support.v4.view.cp;
import android.support.v7.a.b;
import android.support.v7.a.f;
import android.support.v7.a.g;
import android.support.v7.a.j;
import android.support.v7.a.l;
import android.support.v7.internal.a.a;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.y;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ba;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.internal.widget:
//            x, bc, ax, be, 
//            SpinnerCompat, af, bf, bg

public class bd
    implements x
{

    private Toolbar a;
    private int b;
    private View c;
    private SpinnerCompat d;
    private View e;
    private Drawable f;
    private Drawable g;
    private Drawable h;
    private boolean i;
    private CharSequence j;
    private CharSequence k;
    private CharSequence l;
    private a m;
    private boolean n;
    private ActionMenuPresenter o;
    private int p;
    private final ax q;
    private int r;
    private Drawable s;

    public bd(Toolbar toolbar, boolean flag)
    {
        this(toolbar, flag, j.abc_action_bar_up_description, f.abc_ic_ab_back_mtrl_am_alpha);
    }

    public bd(Toolbar toolbar, boolean flag, int i1, int j1)
    {
        p = 0;
        r = 0;
        a = toolbar;
        j = toolbar.getTitle();
        k = toolbar.getSubtitle();
        boolean flag1;
        if (j != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        i = flag1;
        if (flag)
        {
            toolbar = android.support.v7.internal.widget.bc.a(toolbar.getContext(), null, l.ActionBar, b.actionBarStyle, 0);
            Object obj = toolbar.b(l.ActionBar_title);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                b(((CharSequence) (obj)));
            }
            obj = toolbar.b(l.ActionBar_subtitle);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                c(((CharSequence) (obj)));
            }
            obj = toolbar.a(l.ActionBar_logo);
            if (obj != null)
            {
                c(((Drawable) (obj)));
            }
            obj = toolbar.a(l.ActionBar_icon);
            if (obj != null)
            {
                a(((Drawable) (obj)));
            }
            obj = toolbar.a(l.ActionBar_homeAsUpIndicator);
            if (obj != null)
            {
                d(((Drawable) (obj)));
            }
            c(toolbar.a(l.ActionBar_displayOptions, 0));
            int k1 = toolbar.f(l.ActionBar_customNavigationLayout, 0);
            if (k1 != 0)
            {
                a(LayoutInflater.from(a.getContext()).inflate(k1, a, false));
                c(b | 0x10);
            }
            k1 = toolbar.e(l.ActionBar_height, 0);
            if (k1 > 0)
            {
                android.view.ViewGroup.LayoutParams layoutparams = a.getLayoutParams();
                layoutparams.height = k1;
                a.setLayoutParams(layoutparams);
            }
            k1 = toolbar.c(l.ActionBar_contentInsetStart, -1);
            int l1 = toolbar.c(l.ActionBar_contentInsetEnd, -1);
            if (k1 >= 0 || l1 >= 0)
            {
                a.a(Math.max(k1, 0), Math.max(l1, 0));
            }
            k1 = toolbar.f(l.ActionBar_titleTextStyle, 0);
            if (k1 != 0)
            {
                a.a(a.getContext(), k1);
            }
            k1 = toolbar.f(l.ActionBar_subtitleTextStyle, 0);
            if (k1 != 0)
            {
                a.b(a.getContext(), k1);
            }
            k1 = toolbar.f(l.ActionBar_popupTheme, 0);
            if (k1 != 0)
            {
                a.setPopupTheme(k1);
            }
            toolbar.b();
            q = toolbar.c();
        } else
        {
            b = s();
            q = new ax(toolbar.getContext());
        }
        g(i1);
        l = a.getNavigationContentDescription();
        b(q.a(j1));
        a.setNavigationOnClickListener(new be(this));
    }

    static Toolbar a(bd bd1)
    {
        return bd1.a;
    }

    static CharSequence b(bd bd1)
    {
        return bd1.j;
    }

    static a c(bd bd1)
    {
        return bd1.m;
    }

    static boolean d(bd bd1)
    {
        return bd1.n;
    }

    private void e(CharSequence charsequence)
    {
        j = charsequence;
        if ((b & 8) != 0)
        {
            a.setTitle(charsequence);
        }
    }

    private int s()
    {
        byte byte0 = 11;
        if (a.getNavigationIcon() != null)
        {
            byte0 = 15;
        }
        return byte0;
    }

    private void t()
    {
        Drawable drawable = null;
        if ((b & 2) != 0)
        {
            if ((b & 1) != 0)
            {
                if (g != null)
                {
                    drawable = g;
                } else
                {
                    drawable = f;
                }
            } else
            {
                drawable = f;
            }
        }
        a.setLogo(drawable);
    }

    private void u()
    {
        if (d == null)
        {
            d = new SpinnerCompat(b(), null, b.actionDropDownStyle);
            ba ba1 = new ba(-2, -2, 0x800013);
            d.setLayoutParams(ba1);
        }
    }

    private void v()
    {
label0:
        {
            if ((b & 4) != 0)
            {
                if (!TextUtils.isEmpty(l))
                {
                    break label0;
                }
                a.setNavigationContentDescription(r);
            }
            return;
        }
        a.setNavigationContentDescription(l);
    }

    private void w()
    {
        if ((b & 4) != 0)
        {
            Toolbar toolbar = a;
            Drawable drawable;
            if (h != null)
            {
                drawable = h;
            } else
            {
                drawable = s;
            }
            toolbar.setNavigationIcon(drawable);
        }
    }

    public ViewGroup a()
    {
        return a;
    }

    public void a(int i1)
    {
        Drawable drawable;
        if (i1 != 0)
        {
            drawable = q.a(i1);
        } else
        {
            drawable = null;
        }
        a(drawable);
    }

    public void a(Drawable drawable)
    {
        f = drawable;
        t();
    }

    public void a(a a1)
    {
        m = a1;
    }

    public void a(af af1)
    {
        if (c != null && c.getParent() == a)
        {
            a.removeView(c);
        }
        c = af1;
        if (af1 != null && p == 2)
        {
            a.addView(c, 0);
            ba ba1 = (ba)c.getLayoutParams();
            ba1.width = -2;
            ba1.height = -2;
            ba1.a = 0x800053;
            af1.setAllowCollapse(true);
        }
    }

    public void a(Menu menu, y y)
    {
        if (o == null)
        {
            o = new ActionMenuPresenter(a.getContext());
            o.a(g.action_menu_presenter);
        }
        o.a(y);
        a.a((i)menu, o);
    }

    public void a(View view)
    {
        if (e != null && (b & 0x10) != 0)
        {
            a.removeView(e);
        }
        e = view;
        if (view != null && (b & 0x10) != 0)
        {
            a.addView(e);
        }
    }

    public void a(CharSequence charsequence)
    {
        if (!i)
        {
            e(charsequence);
        }
    }

    public void a(boolean flag)
    {
        a.setCollapsible(flag);
    }

    public Context b()
    {
        return a.getContext();
    }

    public void b(int i1)
    {
        Drawable drawable;
        if (i1 != 0)
        {
            drawable = q.a(i1);
        } else
        {
            drawable = null;
        }
        c(drawable);
    }

    public void b(Drawable drawable)
    {
        if (s != drawable)
        {
            s = drawable;
            w();
        }
    }

    public void b(CharSequence charsequence)
    {
        i = true;
        e(charsequence);
    }

    public void b(boolean flag)
    {
    }

    public void c(int i1)
    {
label0:
        {
            int j1 = b ^ i1;
            b = i1;
            if (j1 != 0)
            {
                if ((j1 & 4) != 0)
                {
                    if ((i1 & 4) != 0)
                    {
                        w();
                        v();
                    } else
                    {
                        a.setNavigationIcon(null);
                    }
                }
                if ((j1 & 3) != 0)
                {
                    t();
                }
                if ((j1 & 8) != 0)
                {
                    if ((i1 & 8) != 0)
                    {
                        a.setTitle(j);
                        a.setSubtitle(k);
                    } else
                    {
                        a.setTitle(null);
                        a.setSubtitle(null);
                    }
                }
                if ((j1 & 0x10) != 0 && e != null)
                {
                    if ((i1 & 0x10) == 0)
                    {
                        break label0;
                    }
                    a.addView(e);
                }
            }
            return;
        }
        a.removeView(e);
    }

    public void c(Drawable drawable)
    {
        g = drawable;
        t();
    }

    public void c(CharSequence charsequence)
    {
        k = charsequence;
        if ((b & 8) != 0)
        {
            a.setSubtitle(charsequence);
        }
    }

    public boolean c()
    {
        return false;
    }

    public void d(int i1)
    {
        int j1 = p;
        if (i1 == j1) goto _L2; else goto _L1
_L1:
        j1;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 92
    //                   2 127;
           goto _L3 _L4 _L5
_L3:
        p = i1;
        i1;
        JVM INSTR tableswitch 0 2: default 64
    //                   0 178
    //                   1 162
    //                   2 179;
           goto _L6 _L2 _L7 _L8
_L6:
        throw new IllegalArgumentException((new StringBuilder()).append("Invalid navigation mode ").append(i1).toString());
_L4:
        if (d != null && d.getParent() == a)
        {
            a.removeView(d);
        }
          goto _L3
_L5:
        if (c != null && c.getParent() == a)
        {
            a.removeView(c);
        }
          goto _L3
_L7:
        u();
        a.addView(d, 0);
_L2:
        return;
_L8:
        if (c != null)
        {
            a.addView(c, 0);
            ba ba1 = (ba)c.getLayoutParams();
            ba1.width = -2;
            ba1.height = -2;
            ba1.a = 0x800053;
            return;
        }
        if (true) goto _L2; else goto _L9
_L9:
    }

    public void d(Drawable drawable)
    {
        h = drawable;
        w();
    }

    public void d(CharSequence charsequence)
    {
        l = charsequence;
        v();
    }

    public boolean d()
    {
        return a.g();
    }

    public void e()
    {
        a.h();
    }

    public void e(int i1)
    {
        if (d == null)
        {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        } else
        {
            d.setSelection(i1);
            return;
        }
    }

    public CharSequence f()
    {
        return a.getTitle();
    }

    public void f(int i1)
    {
        if (i1 == 8)
        {
            bb.j(a).a(0.0F).a(new bf(this));
        } else
        if (i1 == 0)
        {
            bb.j(a).a(1.0F).a(new bg(this));
            return;
        }
    }

    public void g()
    {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void g(int i1)
    {
        if (i1 != r)
        {
            r = i1;
            if (TextUtils.isEmpty(a.getNavigationContentDescription()))
            {
                h(r);
                return;
            }
        }
    }

    public void h()
    {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void h(int i1)
    {
        Object obj;
        if (i1 == 0)
        {
            obj = null;
        } else
        {
            obj = b().getString(i1);
        }
        d(((CharSequence) (obj)));
    }

    public boolean i()
    {
        return a.a();
    }

    public boolean j()
    {
        return a.b();
    }

    public boolean k()
    {
        return a.c();
    }

    public boolean l()
    {
        return a.d();
    }

    public boolean m()
    {
        return a.e();
    }

    public void n()
    {
        n = true;
    }

    public void o()
    {
        a.f();
    }

    public int p()
    {
        return b;
    }

    public int q()
    {
        return p;
    }

    public int r()
    {
        if (d != null)
        {
            return d.getSelectedItemPosition();
        } else
        {
            return 0;
        }
    }
}
