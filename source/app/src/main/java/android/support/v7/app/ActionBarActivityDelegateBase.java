// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.view.bb;
import android.support.v4.view.bu;
import android.support.v7.a.b;
import android.support.v7.a.d;
import android.support.v7.a.g;
import android.support.v7.a.l;
import android.support.v7.internal.a.a;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ViewStubCompat;
import android.support.v7.internal.widget.at;
import android.support.v7.internal.widget.au;
import android.support.v7.internal.widget.aw;
import android.support.v7.internal.widget.az;
import android.support.v7.internal.widget.bi;
import android.support.v7.internal.widget.w;
import android.support.v7.internal.widget.z;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.app:
//            g, i, f, m, 
//            p, a, n, l, 
//            j, k

class ActionBarActivityDelegateBase extends android.support.v7.app.g
    implements j
{

    private boolean A;
    private android.support.v7.internal.view.menu.g B;
    private Rect C;
    private Rect D;
    android.support.v7.c.a g;
    ActionBarContextView h;
    PopupWindow i;
    Runnable j;
    private w k;
    private m l;
    private p m;
    private boolean n;
    private ViewGroup o;
    private ViewGroup p;
    private View q;
    private CharSequence r;
    private boolean s;
    private boolean t;
    private boolean u;
    private PanelFeatureState v[];
    private PanelFeatureState w;
    private boolean x;
    private int y;
    private final Runnable z = new android.support.v7.app.i(this);

    ActionBarActivityDelegateBase(f f1)
    {
        super(f1);
    }

    static int a(ActionBarActivityDelegateBase actionbaractivitydelegatebase)
    {
        return actionbaractivitydelegatebase.y;
    }

    private PanelFeatureState a(int i1, boolean flag)
    {
        PanelFeatureState apanelfeaturestate[];
label0:
        {
            PanelFeatureState apanelfeaturestate1[] = v;
            if (apanelfeaturestate1 != null)
            {
                apanelfeaturestate = apanelfeaturestate1;
                if (apanelfeaturestate1.length > i1)
                {
                    break label0;
                }
            }
            apanelfeaturestate = new PanelFeatureState[i1 + 1];
            if (apanelfeaturestate1 != null)
            {
                System.arraycopy(apanelfeaturestate1, 0, apanelfeaturestate, 0, apanelfeaturestate1.length);
            }
            v = apanelfeaturestate;
        }
        PanelFeatureState panelfeaturestate = apanelfeaturestate[i1];
        if (panelfeaturestate == null)
        {
            panelfeaturestate = new PanelFeatureState(i1);
            apanelfeaturestate[i1] = panelfeaturestate;
            return panelfeaturestate;
        } else
        {
            return panelfeaturestate;
        }
    }

    static PanelFeatureState a(ActionBarActivityDelegateBase actionbaractivitydelegatebase, Menu menu)
    {
        return actionbaractivitydelegatebase.a(menu);
    }

    private PanelFeatureState a(Menu menu)
    {
        PanelFeatureState apanelfeaturestate[] = v;
        int i1;
        int j1;
        if (apanelfeaturestate != null)
        {
            i1 = apanelfeaturestate.length;
        } else
        {
            i1 = 0;
        }
        for (j1 = 0; j1 < i1; j1++)
        {
            PanelFeatureState panelfeaturestate = apanelfeaturestate[j1];
            if (panelfeaturestate != null && panelfeaturestate.d == menu)
            {
                return panelfeaturestate;
            }
        }

        return null;
    }

    private void a(int i1, PanelFeatureState panelfeaturestate, Menu menu)
    {
        PanelFeatureState panelfeaturestate2 = panelfeaturestate;
        Object obj = menu;
        if (menu == null)
        {
            PanelFeatureState panelfeaturestate1 = panelfeaturestate;
            if (panelfeaturestate == null)
            {
                panelfeaturestate1 = panelfeaturestate;
                if (i1 >= 0)
                {
                    panelfeaturestate1 = panelfeaturestate;
                    if (i1 < v.length)
                    {
                        panelfeaturestate1 = v[i1];
                    }
                }
            }
            panelfeaturestate2 = panelfeaturestate1;
            obj = menu;
            if (panelfeaturestate1 != null)
            {
                obj = panelfeaturestate1.d;
                panelfeaturestate2 = panelfeaturestate1;
            }
        }
        if (panelfeaturestate2 != null && !panelfeaturestate2.i)
        {
            return;
        } else
        {
            k().b(i1, ((Menu) (obj)));
            return;
        }
    }

    private void a(PanelFeatureState panelfeaturestate)
    {
        panelfeaturestate.b = o;
        panelfeaturestate.a(j());
    }

    private void a(PanelFeatureState panelfeaturestate, KeyEvent keyevent)
    {
        if (!panelfeaturestate.i && !m()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (panelfeaturestate.a != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = a;
        boolean flag;
        boolean flag1;
        if ((((Context) (obj)).getResources().getConfiguration().screenLayout & 0xf) == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((Context) (obj)).getApplicationInfo().targetSdkVersion >= 11)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag && flag1) goto _L1; else goto _L3
_L3:
        obj = k();
        if (obj != null && !((a) (obj)).c(panelfeaturestate.a, panelfeaturestate.d))
        {
            a(panelfeaturestate, true);
            return;
        }
        if (b(panelfeaturestate, keyevent))
        {
            if (panelfeaturestate.b == null || panelfeaturestate.k)
            {
                a(panelfeaturestate);
            }
            if (c(panelfeaturestate) && panelfeaturestate.a())
            {
                panelfeaturestate.h = false;
                panelfeaturestate.i = true;
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(PanelFeatureState panelfeaturestate, boolean flag)
    {
        if (flag && panelfeaturestate.a == 0 && k != null && k.e())
        {
            b(panelfeaturestate.d);
        } else
        {
            if (panelfeaturestate.i && flag)
            {
                a(panelfeaturestate.a, panelfeaturestate, ((Menu) (null)));
            }
            panelfeaturestate.g = false;
            panelfeaturestate.h = false;
            panelfeaturestate.i = false;
            panelfeaturestate.c = null;
            panelfeaturestate.k = true;
            if (w == panelfeaturestate)
            {
                w = null;
                return;
            }
        }
    }

    static void a(ActionBarActivityDelegateBase actionbaractivitydelegatebase, int i1)
    {
        actionbaractivitydelegatebase.d(i1);
    }

    static void a(ActionBarActivityDelegateBase actionbaractivitydelegatebase, int i1, PanelFeatureState panelfeaturestate, Menu menu)
    {
        actionbaractivitydelegatebase.a(i1, panelfeaturestate, menu);
    }

    static void a(ActionBarActivityDelegateBase actionbaractivitydelegatebase, PanelFeatureState panelfeaturestate, boolean flag)
    {
        actionbaractivitydelegatebase.a(panelfeaturestate, flag);
    }

    static void a(ActionBarActivityDelegateBase actionbaractivitydelegatebase, i i1)
    {
        actionbaractivitydelegatebase.b(i1);
    }

    private void a(i i1, boolean flag)
    {
        if (k == null || !k.d() || bu.b(ViewConfiguration.get(a)) && !k.f())
        {
            break MISSING_BLOCK_LABEL_211;
        }
        i1 = k();
        if (k.e() && flag) goto _L2; else goto _L1
_L1:
        if (i1 != null && !m())
        {
            if (x && (y & 1) != 0)
            {
                o.removeCallbacks(z);
                z.run();
            }
            PanelFeatureState panelfeaturestate = a(0, true);
            if (panelfeaturestate.d != null && !panelfeaturestate.l && i1.a(0, null, panelfeaturestate.d))
            {
                i1.c(8, panelfeaturestate.d);
                k.g();
            }
        }
_L4:
        return;
_L2:
        k.h();
        if (m()) goto _L4; else goto _L3
_L3:
        i1 = a(0, true);
        a.onPanelClosed(8, ((PanelFeatureState) (i1)).d);
        return;
        i1 = a(0, true);
        i1.k = true;
        a(((PanelFeatureState) (i1)), false);
        a(((PanelFeatureState) (i1)), ((KeyEvent) (null)));
        return;
    }

    static boolean a(ActionBarActivityDelegateBase actionbaractivitydelegatebase, boolean flag)
    {
        actionbaractivitydelegatebase.x = flag;
        return flag;
    }

    static int b(ActionBarActivityDelegateBase actionbaractivitydelegatebase, int i1)
    {
        actionbaractivitydelegatebase.y = i1;
        return i1;
    }

    private void b(i i1)
    {
        if (u)
        {
            return;
        }
        u = true;
        k.j();
        a a1 = k();
        if (a1 != null && !m())
        {
            a1.b(8, i1);
        }
        u = false;
    }

    private boolean b(PanelFeatureState panelfeaturestate)
    {
        f f1 = a;
        if (panelfeaturestate.a != 0 && panelfeaturestate.a != 8 || k == null) goto _L2; else goto _L1
_L1:
        Object obj;
        TypedValue typedvalue = new TypedValue();
        android.content.res.Resources.Theme theme1 = f1.getTheme();
        theme1.resolveAttribute(b.actionBarTheme, typedvalue, true);
        obj = null;
        android.content.res.Resources.Theme theme;
        if (typedvalue.resourceId != 0)
        {
            obj = f1.getResources().newTheme();
            ((android.content.res.Resources.Theme) (obj)).setTo(theme1);
            ((android.content.res.Resources.Theme) (obj)).applyStyle(typedvalue.resourceId, true);
            ((android.content.res.Resources.Theme) (obj)).resolveAttribute(b.actionBarWidgetTheme, typedvalue, true);
        } else
        {
            theme1.resolveAttribute(b.actionBarWidgetTheme, typedvalue, true);
        }
        theme = ((android.content.res.Resources.Theme) (obj));
        if (typedvalue.resourceId != 0)
        {
            theme = ((android.content.res.Resources.Theme) (obj));
            if (obj == null)
            {
                theme = f1.getResources().newTheme();
                theme.setTo(theme1);
            }
            theme.applyStyle(typedvalue.resourceId, true);
        }
        if (theme == null) goto _L2; else goto _L3
_L3:
        obj = new ContextThemeWrapper(f1, 0);
        ((Context) (obj)).getTheme().setTo(theme);
_L5:
        obj = new i(((Context) (obj)));
        ((i) (obj)).a(this);
        panelfeaturestate.a(((i) (obj)));
        return true;
_L2:
        obj = f1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private boolean b(PanelFeatureState panelfeaturestate, KeyEvent keyevent)
    {
        if (!m()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i1;
        if (panelfeaturestate.g)
        {
            return true;
        }
        if (w != null && w != panelfeaturestate)
        {
            a(w, false);
        }
        if (panelfeaturestate.a == 0 || panelfeaturestate.a == 8)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 && k != null)
        {
            k.i();
        }
        if (panelfeaturestate.d != null && !panelfeaturestate.l)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        if (panelfeaturestate.d == null && (!b(panelfeaturestate) || panelfeaturestate.d == null))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i1 && k != null)
        {
            if (l == null)
            {
                l = new m(this, null);
            }
            k.a(panelfeaturestate.d, l);
        }
        panelfeaturestate.d.g();
        if (k().a(panelfeaturestate.a, panelfeaturestate.d))
        {
            break; /* Loop/switch isn't completed */
        }
        panelfeaturestate.a(null);
        if (i1 && k != null)
        {
            k.a(null, l);
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        panelfeaturestate.l = false;
        panelfeaturestate.d.g();
        if (panelfeaturestate.m != null)
        {
            panelfeaturestate.d.b(panelfeaturestate.m);
            panelfeaturestate.m = null;
        }
        if (!k().a(0, null, panelfeaturestate.d))
        {
            if (i1 && k != null)
            {
                k.a(null, l);
            }
            panelfeaturestate.d.h();
            return false;
        }
        boolean flag;
        if (keyevent != null)
        {
            i1 = keyevent.getDeviceId();
        } else
        {
            i1 = -1;
        }
        if (KeyCharacterMap.load(i1).getKeyboardType() != 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        panelfeaturestate.j = flag;
        panelfeaturestate.d.setQwertyMode(panelfeaturestate.j);
        panelfeaturestate.d.h();
        panelfeaturestate.g = true;
        panelfeaturestate.h = false;
        w = panelfeaturestate;
        return true;
    }

    static int c(ActionBarActivityDelegateBase actionbaractivitydelegatebase, int i1)
    {
        return actionbaractivitydelegatebase.e(i1);
    }

    private void c(int i1)
    {
        y = y | 1 << i1;
        if (!x && o != null)
        {
            bb.a(o, z);
            x = true;
        }
    }

    private boolean c(PanelFeatureState panelfeaturestate)
    {
        if (panelfeaturestate.d == null)
        {
            return false;
        }
        if (m == null)
        {
            m = new p(this, null);
        }
        panelfeaturestate.c = (View)panelfeaturestate.a(m);
        boolean flag;
        if (panelfeaturestate.c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    private void d(int i1)
    {
        PanelFeatureState panelfeaturestate = a(i1, true);
        if (panelfeaturestate.d != null)
        {
            Bundle bundle = new Bundle();
            panelfeaturestate.d.a(bundle);
            if (bundle.size() > 0)
            {
                panelfeaturestate.m = bundle;
            }
            panelfeaturestate.d.g();
            panelfeaturestate.d.clear();
        }
        panelfeaturestate.l = true;
        panelfeaturestate.k = true;
        if ((i1 == 8 || i1 == 0) && k != null)
        {
            PanelFeatureState panelfeaturestate1 = a(0, false);
            if (panelfeaturestate1 != null)
            {
                panelfeaturestate1.g = false;
                b(panelfeaturestate1, ((KeyEvent) (null)));
            }
        }
    }

    private int e(int i1)
    {
        int k1 = 1;
        boolean flag = true;
        boolean flag1 = false;
        int j1;
        if (h != null && (h.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams))
        {
            Object obj = (android.view.ViewGroup.MarginLayoutParams)h.getLayoutParams();
            if (h.isShown())
            {
                if (C == null)
                {
                    C = new Rect();
                    D = new Rect();
                }
                Rect rect = C;
                Rect rect1 = D;
                rect.set(0, i1, 0, 0);
                bi.a(p, rect, rect1);
                if (rect1.top == 0)
                {
                    j1 = i1;
                } else
                {
                    j1 = 0;
                }
                if (((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin != j1)
                {
                    obj.topMargin = i1;
                    if (q == null)
                    {
                        q = new View(a);
                        q.setBackgroundColor(a.getResources().getColor(d.abc_input_method_navigation_guard));
                        p.addView(q, -1, new android.view.ViewGroup.LayoutParams(-1, i1));
                        j1 = 1;
                    } else
                    {
                        android.view.ViewGroup.LayoutParams layoutparams = q.getLayoutParams();
                        if (layoutparams.height != i1)
                        {
                            layoutparams.height = i1;
                            q.setLayoutParams(layoutparams);
                        }
                        j1 = 1;
                    }
                } else
                {
                    j1 = 0;
                }
                if (q == null)
                {
                    flag = false;
                }
                k1 = i1;
                if (!d)
                {
                    k1 = i1;
                    if (flag)
                    {
                        k1 = 0;
                    }
                }
                i1 = k1;
                k1 = j1;
                j1 = ((flag) ? 1 : 0);
            } else
            if (((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin != 0)
            {
                obj.topMargin = 0;
                j1 = 0;
            } else
            {
                k1 = 0;
                j1 = 0;
            }
            if (k1 != 0)
            {
                h.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            }
        } else
        {
            j1 = 0;
        }
        if (q != null)
        {
            obj = q;
            if (j1 != 0)
            {
                j1 = ((flag1) ? 1 : 0);
            } else
            {
                j1 = 8;
            }
            ((View) (obj)).setVisibility(j1);
        }
        return i1;
    }

    private void p()
    {
        TypedValue typedvalue3 = null;
        DisplayMetrics displaymetrics = null;
        TypedArray typedarray = a.obtainStyledAttributes(l.Theme);
        TypedValue typedvalue;
        if (typedarray.hasValue(l.Theme_windowFixedWidthMajor))
        {
            TypedValue typedvalue1;
            TypedValue typedvalue2;
            int i1;
            int j1;
            if (true)
            {
                typedvalue = new TypedValue();
            } else
            {
                typedvalue = null;
            }
            typedarray.getValue(l.Theme_windowFixedWidthMajor, typedvalue);
        } else
        {
            typedvalue = null;
        }
        if (typedarray.hasValue(l.Theme_windowFixedWidthMinor))
        {
            if (true)
            {
                typedvalue1 = new TypedValue();
            } else
            {
                typedvalue1 = null;
            }
            typedarray.getValue(l.Theme_windowFixedWidthMinor, typedvalue1);
        } else
        {
            typedvalue1 = null;
        }
        if (typedarray.hasValue(l.Theme_windowFixedHeightMajor))
        {
            if (true)
            {
                typedvalue2 = new TypedValue();
            } else
            {
                typedvalue2 = null;
            }
            typedarray.getValue(l.Theme_windowFixedHeightMajor, typedvalue2);
        } else
        {
            typedvalue2 = null;
        }
        if (typedarray.hasValue(l.Theme_windowFixedHeightMinor))
        {
            typedvalue3 = displaymetrics;
            if (true)
            {
                typedvalue3 = new TypedValue();
            }
            typedarray.getValue(l.Theme_windowFixedHeightMinor, typedvalue3);
        }
        displaymetrics = a.getResources().getDisplayMetrics();
        if (displaymetrics.widthPixels < displaymetrics.heightPixels)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 == 0)
        {
            typedvalue1 = typedvalue;
        }
        if (typedvalue1 == null || typedvalue1.type == 0) goto _L2; else goto _L1
_L1:
        if (typedvalue1.type != 5) goto _L4; else goto _L3
_L3:
        i1 = (int)typedvalue1.getDimension(displaymetrics);
_L11:
        if (j1 == 0)
        {
            typedvalue2 = typedvalue3;
        }
        if (typedvalue2 == null || typedvalue2.type == 0) goto _L6; else goto _L5
_L5:
        if (typedvalue2.type != 5) goto _L8; else goto _L7
_L7:
        j1 = (int)typedvalue2.getDimension(displaymetrics);
_L9:
        if (i1 != -1 || j1 != -1)
        {
            a.getWindow().setLayout(i1, j1);
        }
        typedarray.recycle();
        return;
_L4:
        if (typedvalue1.type != 6)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = (int)typedvalue1.getFraction(displaymetrics.widthPixels, displaymetrics.widthPixels);
        continue; /* Loop/switch isn't completed */
_L8:
        if (typedvalue2.type == 6)
        {
            j1 = (int)typedvalue2.getFraction(displaymetrics.heightPixels, displaymetrics.heightPixels);
            continue; /* Loop/switch isn't completed */
        }
_L6:
        j1 = -1;
        if (true) goto _L9; else goto _L2
_L2:
        i1 = -1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public android.support.v7.app.a a()
    {
        n();
        android.support.v7.internal.a.b b1 = new android.support.v7.internal.a.b(a, c);
        b1.e(A);
        return b1;
    }

    android.support.v7.c.a a(android.support.v7.c.b b1)
    {
        if (g != null)
        {
            g.c();
        }
        Object obj = new n(this, b1);
        Context context = j();
        if (h == null)
        {
            if (e)
            {
                h = new ActionBarContextView(context);
                i = new PopupWindow(context, null, b.actionModePopupWindowStyle);
                i.setContentView(h);
                i.setWidth(-1);
                TypedValue typedvalue = new TypedValue();
                a.getTheme().resolveAttribute(b.actionBarSize, typedvalue, true);
                int i1 = TypedValue.complexToDimensionPixelSize(typedvalue.data, a.getResources().getDisplayMetrics());
                h.setContentHeight(i1);
                i.setHeight(-2);
                j = new android.support.v7.app.l(this);
            } else
            {
                ViewStubCompat viewstubcompat = (ViewStubCompat)a.findViewById(g.action_mode_bar_stub);
                if (viewstubcompat != null)
                {
                    viewstubcompat.setLayoutInflater(LayoutInflater.from(context));
                    h = (ActionBarContextView)viewstubcompat.a();
                }
            }
        }
        if (h != null)
        {
            h.c();
            ActionBarContextView actionbarcontextview = h;
            boolean flag;
            if (i == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = new android.support.v7.internal.view.b(context, actionbarcontextview, ((android.support.v7.c.b) (obj)), flag);
            if (b1.a(((android.support.v7.c.a) (obj)), ((android.support.v7.c.a) (obj)).b()))
            {
                ((android.support.v7.c.a) (obj)).d();
                h.a(((android.support.v7.c.a) (obj)));
                h.setVisibility(0);
                g = ((android.support.v7.c.a) (obj));
                if (i != null)
                {
                    a.getWindow().getDecorView().post(j);
                }
                h.sendAccessibilityEvent(32);
                if (h.getParent() != null)
                {
                    bb.l((View)h.getParent());
                }
            } else
            {
                g = null;
            }
        }
        if (g != null && a != null)
        {
            a.a(g);
        }
        return g;
    }

    View a(String s1, Context context, AttributeSet attributeset)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21) goto _L2; else goto _L1
_L1:
        byte byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 5: default 64
    //                   -1455429095: 166
    //                   -339785223: 118
    //                   776382189: 150
    //                   1601505219: 134
    //                   1666676343: 102;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        byte0;
        JVM INSTR tableswitch 0 4: default 100
    //                   0 182
    //                   1 192
    //                   2 202
    //                   3 212
    //                   4 222;
           goto _L2 _L9 _L10 _L11 _L12 _L13
_L2:
        return null;
_L8:
        if (s1.equals("EditText"))
        {
            byte0 = 0;
        }
          goto _L3
_L5:
        if (s1.equals("Spinner"))
        {
            byte0 = 1;
        }
          goto _L3
_L7:
        if (s1.equals("CheckBox"))
        {
            byte0 = 2;
        }
          goto _L3
_L6:
        if (s1.equals("RadioButton"))
        {
            byte0 = 3;
        }
          goto _L3
_L4:
        if (s1.equals("CheckedTextView"))
        {
            byte0 = 4;
        }
          goto _L3
_L9:
        return new aw(context, attributeset);
_L10:
        return new android.support.v7.internal.widget.bb(context, attributeset);
_L11:
        return new at(context, attributeset);
_L12:
        return new az(context, attributeset);
_L13:
        return new au(context, attributeset);
    }

    public void a(int i1)
    {
        n();
        ViewGroup viewgroup = (ViewGroup)a.findViewById(0x1020002);
        viewgroup.removeAllViews();
        a.getLayoutInflater().inflate(i1, viewgroup);
        a.i();
    }

    public void a(int i1, Menu menu)
    {
        PanelFeatureState panelfeaturestate = a(i1, false);
        if (panelfeaturestate != null)
        {
            a(panelfeaturestate, false);
        }
        if (i1 == 8)
        {
            menu = b();
            if (menu != null)
            {
                menu.g(false);
            }
        } else
        if (!m())
        {
            a.b(i1, menu);
            return;
        }
    }

    public void a(Configuration configuration)
    {
        if (b && n)
        {
            android.support.v7.app.a a1 = b();
            if (a1 != null)
            {
                a1.a(configuration);
            }
        }
    }

    void a(Bundle bundle)
    {
label0:
        {
            super.a(bundle);
            o = (ViewGroup)a.getWindow().getDecorView();
            if (android.support.v4.app.au.b(a) != null)
            {
                bundle = c();
                if (bundle != null)
                {
                    break label0;
                }
                A = true;
            }
            return;
        }
        bundle.e(true);
    }

    public void a(i i1)
    {
        a(i1, true);
    }

    public void a(View view)
    {
        n();
        ViewGroup viewgroup = (ViewGroup)a.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view);
        a.i();
    }

    public void a(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        n();
        ViewGroup viewgroup = (ViewGroup)a.findViewById(0x1020002);
        viewgroup.removeAllViews();
        viewgroup.addView(view, layoutparams);
        a.i();
    }

    public void a(CharSequence charsequence)
    {
        if (k != null)
        {
            k.setWindowTitle(charsequence);
            return;
        }
        if (b() != null)
        {
            b().a(charsequence);
            return;
        } else
        {
            r = charsequence;
            return;
        }
    }

    boolean a(int i1, KeyEvent keyevent)
    {
        return b(i1, keyevent);
    }

    public boolean a(int i1, View view, Menu menu)
    {
        if (i1 != 0)
        {
            return k().a(i1, view, menu);
        } else
        {
            return false;
        }
    }

    final boolean a(PanelFeatureState panelfeaturestate, int i1, KeyEvent keyevent, int j1)
    {
        boolean flag;
        boolean flag2;
        flag2 = false;
        flag = false;
        if (!keyevent.isSystem()) goto _L2; else goto _L1
_L1:
        flag2 = flag;
_L4:
        return flag2;
_L2:
        boolean flag1;
label0:
        {
            if (!panelfeaturestate.g)
            {
                flag1 = flag2;
                if (!b(panelfeaturestate, keyevent))
                {
                    break label0;
                }
            }
            flag1 = flag2;
            if (panelfeaturestate.d != null)
            {
                flag1 = panelfeaturestate.d.performShortcut(i1, keyevent, j1);
            }
        }
        flag2 = flag1;
        if (flag1)
        {
            flag2 = flag1;
            if ((j1 & 1) == 0)
            {
                flag2 = flag1;
                if (k == null)
                {
                    a(panelfeaturestate, true);
                    return flag1;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean a(i i1, MenuItem menuitem)
    {
        a a1 = k();
        if (a1 != null && !m())
        {
            i1 = a(((Menu) (i1.p())));
            if (i1 != null)
            {
                return a1.a(((PanelFeatureState) (i1)).a, menuitem);
            }
        }
        return false;
    }

    public android.support.v7.c.a b(android.support.v7.c.b b1)
    {
        if (b1 == null)
        {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (g != null)
        {
            g.c();
        }
        b1 = new n(this, b1);
        android.support.v7.app.a a1 = b();
        if (a1 != null)
        {
            g = a1.a(b1);
            if (g != null)
            {
                a.a(g);
            }
        }
        if (g == null)
        {
            g = a(b1);
        }
        return g;
    }

    public View b(int i1)
    {
        if (g == null)
        {
            Object obj = k();
            View view;
            if (obj != null)
            {
                obj = ((a) (obj)).a(i1);
            } else
            {
                obj = null;
            }
            view = ((View) (obj));
            if (obj == null)
            {
                view = ((View) (obj));
                if (B == null)
                {
                    PanelFeatureState panelfeaturestate = a(i1, true);
                    a(panelfeaturestate, ((KeyEvent) (null)));
                    view = ((View) (obj));
                    if (panelfeaturestate.i)
                    {
                        view = panelfeaturestate.c;
                    }
                }
            }
            return view;
        } else
        {
            return null;
        }
    }

    public void b(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        n();
        ((ViewGroup)a.findViewById(0x1020002)).addView(view, layoutparams);
        a.i();
    }

    boolean b(int i1, KeyEvent keyevent)
    {
        if (w == null || !a(w, keyevent.getKeyCode(), keyevent, 1)) goto _L2; else goto _L1
_L1:
        if (w != null)
        {
            w.h = true;
        }
_L4:
        return true;
_L2:
        boolean flag;
        if (w != null)
        {
            break; /* Loop/switch isn't completed */
        }
        PanelFeatureState panelfeaturestate = a(0, true);
        b(panelfeaturestate, keyevent);
        flag = a(panelfeaturestate, keyevent.getKeyCode(), keyevent, 1);
        panelfeaturestate.g = false;
        if (flag) goto _L4; else goto _L3
_L3:
        return false;
    }

    boolean b(int i1, Menu menu)
    {
        if (i1 == 8)
        {
            menu = b();
            if (menu != null)
            {
                menu.g(true);
            }
            return true;
        } else
        {
            return a.c(i1, menu);
        }
    }

    public boolean c(int i1, Menu menu)
    {
        if (i1 != 0)
        {
            return k().a(i1, menu);
        } else
        {
            return false;
        }
    }

    public void e()
    {
        android.support.v7.app.a a1 = b();
        if (a1 != null)
        {
            a1.f(false);
        }
    }

    public void f()
    {
        android.support.v7.app.a a1 = b();
        if (a1 != null)
        {
            a1.f(true);
        }
    }

    public void g()
    {
        android.support.v7.app.a a1 = b();
        if (a1 != null && a1.f())
        {
            return;
        } else
        {
            c(0);
            return;
        }
    }

    public boolean h()
    {
        if (g != null)
        {
            g.c();
        } else
        {
            android.support.v7.app.a a1 = b();
            if (a1 == null || !a1.g())
            {
                return false;
            }
        }
        return true;
    }

    public void i()
    {
    }

    final void n()
    {
        if (!n)
        {
            if (b)
            {
                Object obj = new TypedValue();
                a.getTheme().resolveAttribute(b.actionBarTheme, ((TypedValue) (obj)), true);
                if (((TypedValue) (obj)).resourceId != 0)
                {
                    obj = new ContextThemeWrapper(a, ((TypedValue) (obj)).resourceId);
                } else
                {
                    obj = a;
                }
                p = (ViewGroup)LayoutInflater.from(((Context) (obj))).inflate(android.support.v7.a.i.abc_screen_toolbar, null);
                k = (w)p.findViewById(g.decor_content_parent);
                k.setWindowCallback(k());
                if (c)
                {
                    k.a(9);
                }
                if (s)
                {
                    k.a(2);
                }
                if (t)
                {
                    k.a(5);
                }
            } else
            {
                if (d)
                {
                    p = (ViewGroup)LayoutInflater.from(a).inflate(android.support.v7.a.i.abc_screen_simple_overlay_action_mode, null);
                } else
                {
                    p = (ViewGroup)LayoutInflater.from(a).inflate(android.support.v7.a.i.abc_screen_simple, null);
                }
                if (android.os.Build.VERSION.SDK_INT >= 21)
                {
                    bb.a(p, new android.support.v7.app.j(this));
                } else
                {
                    ((z)p).setOnFitSystemWindowsListener(new android.support.v7.app.k(this));
                }
            }
            bi.b(p);
            a.a(p);
            obj = a.findViewById(0x1020002);
            ((View) (obj)).setId(-1);
            a.findViewById(g.action_bar_activity_content).setId(0x1020002);
            if (obj instanceof FrameLayout)
            {
                ((FrameLayout)obj).setForeground(null);
            }
            if (r != null && k != null)
            {
                k.setWindowTitle(r);
                r = null;
            }
            p();
            o();
            n = true;
            obj = a(0, false);
            if (!m() && (obj == null || ((PanelFeatureState) (obj)).d == null))
            {
                c(8);
            }
        }
    }

    void o()
    {
    }

    private class PanelFeatureState
    {

        int a;
        ViewGroup b;
        View c;
        i d;
        android.support.v7.internal.view.menu.g e;
        Context f;
        boolean g;
        boolean h;
        boolean i;
        public boolean j;
        boolean k;
        boolean l;
        Bundle m;

        android.support.v7.internal.view.menu.z a(y y1)
        {
            if (d == null)
            {
                return null;
            }
            if (e == null)
            {
                e = new android.support.v7.internal.view.menu.g(f, android.support.v7.a.i.abc_list_menu_item_layout);
                e.a(y1);
                d.a(e);
            }
            return e.a(b);
        }

        void a(Context context)
        {
            TypedValue typedvalue = new TypedValue();
            android.content.res.Resources.Theme theme = context.getResources().newTheme();
            theme.setTo(context.getTheme());
            theme.resolveAttribute(b.actionBarPopupTheme, typedvalue, true);
            if (typedvalue.resourceId != 0)
            {
                theme.applyStyle(typedvalue.resourceId, true);
            }
            theme.resolveAttribute(b.panelMenuListTheme, typedvalue, true);
            if (typedvalue.resourceId != 0)
            {
                theme.applyStyle(typedvalue.resourceId, true);
            } else
            {
                theme.applyStyle(k.Theme_AppCompat_CompactMenu, true);
            }
            context = new ContextThemeWrapper(context, 0);
            context.getTheme().setTo(theme);
            f = context;
        }

        void a(i i1)
        {
            if (i1 != d)
            {
                if (d != null)
                {
                    d.b(e);
                }
                d = i1;
                if (i1 != null && e != null)
                {
                    i1.a(e);
                    return;
                }
            }
        }

        public boolean a()
        {
            while (c == null || e.a().getCount() <= 0) 
            {
                return false;
            }
            return true;
        }

        PanelFeatureState(int i1)
        {
            a = i1;
            k = false;
        }
    }

}
