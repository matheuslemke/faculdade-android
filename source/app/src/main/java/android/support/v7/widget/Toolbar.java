// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.ac;
import android.support.v4.view.ah;
import android.support.v4.view.ap;
import android.support.v4.view.bb;
import android.support.v4.view.q;
import android.support.v7.a.b;
import android.support.v7.a.l;
import android.support.v7.internal.view.e;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.y;
import android.support.v7.internal.widget.ae;
import android.support.v7.internal.widget.ax;
import android.support.v7.internal.widget.bc;
import android.support.v7.internal.widget.bd;
import android.support.v7.internal.widget.bi;
import android.support.v7.internal.widget.x;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            aw, ax, ba, ActionMenuView, 
//            az, ay, ActionMenuPresenter, bb, 
//            o

public class Toolbar extends ViewGroup
{

    private final ArrayList A;
    private final int B[];
    private android.support.v7.widget.bb C;
    private final o D;
    private bd E;
    private ActionMenuPresenter F;
    private az G;
    private y H;
    private j I;
    private boolean J;
    private int K;
    private final Runnable L;
    private final ax M;
    View a;
    private ActionMenuView b;
    private TextView c;
    private TextView d;
    private ImageButton e;
    private ImageView f;
    private Drawable g;
    private CharSequence h;
    private ImageButton i;
    private Context j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private final ae t;
    private int u;
    private CharSequence v;
    private CharSequence w;
    private int x;
    private int y;
    private boolean z;

    public Toolbar(Context context)
    {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeset, int i1)
    {
        super(a(context, attributeset, i1), attributeset, i1);
        t = new ae();
        u = 0x800013;
        A = new ArrayList();
        B = new int[2];
        D = new aw(this);
        L = new android.support.v7.widget.ax(this);
        context = bc.a(getContext(), attributeset, l.Toolbar, i1, 0);
        l = context.f(l.Toolbar_titleTextAppearance, 0);
        m = context.f(l.Toolbar_subtitleTextAppearance, 0);
        u = context.b(l.Toolbar_android_gravity, u);
        n = 48;
        i1 = context.c(l.Toolbar_titleMargins, 0);
        s = i1;
        r = i1;
        q = i1;
        p = i1;
        i1 = context.c(l.Toolbar_titleMarginStart, -1);
        if (i1 >= 0)
        {
            p = i1;
        }
        i1 = context.c(l.Toolbar_titleMarginEnd, -1);
        if (i1 >= 0)
        {
            q = i1;
        }
        i1 = context.c(l.Toolbar_titleMarginTop, -1);
        if (i1 >= 0)
        {
            r = i1;
        }
        i1 = context.c(l.Toolbar_titleMarginBottom, -1);
        if (i1 >= 0)
        {
            s = i1;
        }
        o = context.d(l.Toolbar_maxButtonHeight, -1);
        i1 = context.c(l.Toolbar_contentInsetStart, 0x80000000);
        int j1 = context.c(l.Toolbar_contentInsetEnd, 0x80000000);
        int k1 = context.d(l.Toolbar_contentInsetLeft, 0);
        int l1 = context.d(l.Toolbar_contentInsetRight, 0);
        t.b(k1, l1);
        if (i1 != 0x80000000 || j1 != 0x80000000)
        {
            t.a(i1, j1);
        }
        g = context.a(l.Toolbar_collapseIcon);
        h = context.b(l.Toolbar_collapseContentDescription);
        attributeset = context.b(l.Toolbar_title);
        if (!TextUtils.isEmpty(attributeset))
        {
            setTitle(attributeset);
        }
        attributeset = context.b(l.Toolbar_subtitle);
        if (!TextUtils.isEmpty(attributeset))
        {
            setSubtitle(attributeset);
        }
        j = getContext();
        setPopupTheme(context.f(l.Toolbar_popupTheme, 0));
        attributeset = context.a(l.Toolbar_navigationIcon);
        if (attributeset != null)
        {
            setNavigationIcon(attributeset);
        }
        attributeset = context.b(l.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(attributeset))
        {
            setNavigationContentDescription(attributeset);
        }
        K = context.d(l.Toolbar_android_minHeight, 0);
        context.b();
        M = context.c();
    }

    private int a(int i1)
    {
        int j1 = i1 & 0x70;
        i1 = j1;
        switch (j1)
        {
        default:
            i1 = u & 0x70;
            // fall through

        case 16: // '\020'
        case 48: // '0'
        case 80: // 'P'
            return i1;
        }
    }

    private int a(View view, int i1)
    {
        ba ba1;
        int j1;
        int k1;
        int l1;
        int i2;
        ba1 = (ba)view.getLayoutParams();
        k1 = view.getMeasuredHeight();
        if (i1 > 0)
        {
            i1 = (k1 - i1) / 2;
        } else
        {
            i1 = 0;
        }
        a(ba1.a);
        JVM INSTR lookupswitch 2: default 60
    //                   48: 115
    //                   80: 122;
           goto _L1 _L2 _L3
_L1:
        j1 = getPaddingTop();
        l1 = getPaddingBottom();
        i2 = getHeight();
        i1 = (i2 - j1 - l1 - k1) / 2;
        if (i1 >= ba1.topMargin) goto _L5; else goto _L4
_L4:
        i1 = ba1.topMargin;
_L7:
        return i1 + j1;
_L2:
        return getPaddingTop() - i1;
_L3:
        return getHeight() - getPaddingBottom() - k1 - ba1.bottomMargin - i1;
_L5:
        k1 = i2 - l1 - k1 - i1 - j1;
        if (k1 < ba1.bottomMargin)
        {
            i1 = Math.max(0, i1 - (ba1.bottomMargin - k1));
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private int a(View view, int i1, int j1, int k1, int l1, int ai[])
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i2 = marginlayoutparams.leftMargin - ai[0];
        int j2 = marginlayoutparams.rightMargin - ai[1];
        int k2 = Math.max(0, i2) + Math.max(0, j2);
        ai[0] = Math.max(0, -i2);
        ai[1] = Math.max(0, -j2);
        view.measure(getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight() + k2 + j1, marginlayoutparams.width), getChildMeasureSpec(k1, getPaddingTop() + getPaddingBottom() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin + l1, marginlayoutparams.height));
        return view.getMeasuredWidth() + k2;
    }

    private int a(View view, int i1, int ai[], int j1)
    {
        ba ba1 = (ba)view.getLayoutParams();
        int k1 = ba1.leftMargin - ai[0];
        i1 = Math.max(0, k1) + i1;
        ai[0] = Math.max(0, -k1);
        j1 = a(view, j1);
        k1 = view.getMeasuredWidth();
        view.layout(i1, j1, i1 + k1, view.getMeasuredHeight() + j1);
        return ba1.rightMargin + k1 + i1;
    }

    private int a(List list, int ai[])
    {
        int l1 = ai[0];
        int k1 = ai[1];
        int i2 = list.size();
        int j1 = 0;
        int i1;
        int j2;
        int k2;
        int l2;
        for (i1 = 0; j1 < i2; i1 += l2 + j2 + k2)
        {
            ai = (View)list.get(j1);
            ba ba1 = (ba)ai.getLayoutParams();
            l1 = ba1.leftMargin - l1;
            k1 = ba1.rightMargin - k1;
            j2 = Math.max(0, l1);
            k2 = Math.max(0, k1);
            l1 = Math.max(0, -l1);
            k1 = Math.max(0, -k1);
            l2 = ai.getMeasuredWidth();
            j1++;
        }

        return i1;
    }

    private static Context a(Context context, AttributeSet attributeset, int i1)
    {
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, l.Toolbar, i1, 0);
        i1 = typedarray.getResourceId(l.Toolbar_theme, 0);
        attributeset = context;
        if (i1 != 0)
        {
            attributeset = new ContextThemeWrapper(context, i1);
        }
        typedarray.recycle();
        return attributeset;
    }

    static android.support.v7.widget.bb a(Toolbar toolbar)
    {
        return toolbar.C;
    }

    static void a(Toolbar toolbar, boolean flag)
    {
        toolbar.setChildVisibilityForExpandedActionView(flag);
    }

    private void a(View view)
    {
        Object obj = view.getLayoutParams();
        if (obj == null)
        {
            obj = i();
        } else
        if (!checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
        {
            obj = a(((android.view.ViewGroup.LayoutParams) (obj)));
        } else
        {
            obj = (ba)obj;
        }
        obj.b = 1;
        addView(view, ((android.view.ViewGroup.LayoutParams) (obj)));
    }

    private void a(View view, int i1, int j1, int k1, int l1, int i2)
    {
        android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int j2 = getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin + j1, marginlayoutparams.width);
        j1 = getChildMeasureSpec(k1, getPaddingTop() + getPaddingBottom() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin + l1, marginlayoutparams.height);
        k1 = android.view.View.MeasureSpec.getMode(j1);
        i1 = j1;
        if (k1 != 0x40000000)
        {
            i1 = j1;
            if (i2 >= 0)
            {
                i1 = i2;
                if (k1 != 0)
                {
                    i1 = Math.min(android.view.View.MeasureSpec.getSize(j1), i2);
                }
                i1 = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
            }
        }
        view.measure(j2, i1);
    }

    private void a(List list, int i1)
    {
        boolean flag = true;
        boolean flag1 = false;
        int j1;
        int k1;
        if (bb.e(this) != 1)
        {
            flag = false;
        }
        k1 = getChildCount();
        j1 = android.support.v4.view.q.a(i1, bb.e(this));
        list.clear();
        i1 = ((flag1) ? 1 : 0);
        if (flag)
        {
            for (i1 = k1 - 1; i1 >= 0; i1--)
            {
                View view = getChildAt(i1);
                ba ba1 = (ba)view.getLayoutParams();
                if (ba1.b == 0 && b(view) && b(ba1.a) == j1)
                {
                    list.add(view);
                }
            }

        } else
        {
            for (; i1 < k1; i1++)
            {
                View view1 = getChildAt(i1);
                ba ba2 = (ba)view1.getLayoutParams();
                if (ba2.b == 0 && b(view1) && b(ba2.a) == j1)
                {
                    list.add(view1);
                }
            }

        }
    }

    private int b(int i1)
    {
label0:
        {
            int k1 = bb.e(this);
            int j1 = android.support.v4.view.q.a(i1, k1) & 7;
            i1 = j1;
            switch (j1)
            {
            case 2: // '\002'
            case 4: // '\004'
            default:
                if (k1 != 1)
                {
                    break label0;
                }
                i1 = 5;
                break;

            case 1: // '\001'
            case 3: // '\003'
            case 5: // '\005'
                break;
            }
            return i1;
        }
        return 3;
    }

    private int b(View view, int i1, int ai[], int j1)
    {
        ba ba1 = (ba)view.getLayoutParams();
        int k1 = ba1.rightMargin - ai[1];
        i1 -= Math.max(0, k1);
        ai[1] = Math.max(0, -k1);
        j1 = a(view, j1);
        k1 = view.getMeasuredWidth();
        view.layout(i1 - k1, j1, i1, view.getMeasuredHeight() + j1);
        return i1 - (ba1.leftMargin + k1);
    }

    static void b(Toolbar toolbar)
    {
        toolbar.n();
    }

    private boolean b(View view)
    {
        return view != null && view.getParent() == this && view.getVisibility() != 8;
    }

    private int c(View view)
    {
        view = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i1 = ac.a(view);
        return ac.b(view) + i1;
    }

    static ImageButton c(Toolbar toolbar)
    {
        return toolbar.i;
    }

    static int d(Toolbar toolbar)
    {
        return toolbar.n;
    }

    private int d(View view)
    {
        view = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int i1 = ((android.view.ViewGroup.MarginLayoutParams) (view)).topMargin;
        return ((android.view.ViewGroup.MarginLayoutParams) (view)).bottomMargin + i1;
    }

    private void e(View view)
    {
        if (((ba)view.getLayoutParams()).b != 2 && view != b)
        {
            byte byte0;
            if (a != null)
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            view.setVisibility(byte0);
        }
    }

    private MenuInflater getMenuInflater()
    {
        return new e(getContext());
    }

    private int getMinimumHeightCompat()
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return bb.i(this);
        } else
        {
            return K;
        }
    }

    private void j()
    {
        if (f == null)
        {
            f = new ImageView(getContext());
        }
    }

    private void k()
    {
        l();
        if (b.d() == null)
        {
            i i1 = (i)b.getMenu();
            if (G == null)
            {
                G = new az(this, null);
            }
            b.setExpandedActionViewsExclusive(true);
            i1.a(G, j);
        }
    }

    private void l()
    {
        if (b == null)
        {
            b = new ActionMenuView(getContext());
            b.setPopupTheme(k);
            b.setOnMenuItemClickListener(D);
            b.a(H, I);
            ba ba1 = i();
            ba1.a = 0x800005 | n & 0x70;
            b.setLayoutParams(ba1);
            a(b);
        }
    }

    private void m()
    {
        if (e == null)
        {
            e = new ImageButton(getContext(), null, b.toolbarNavigationButtonStyle);
            ba ba1 = i();
            ba1.a = 0x800003 | n & 0x70;
            e.setLayoutParams(ba1);
        }
    }

    private void n()
    {
        if (i == null)
        {
            i = new ImageButton(getContext(), null, b.toolbarNavigationButtonStyle);
            i.setImageDrawable(g);
            i.setContentDescription(h);
            ba ba1 = i();
            ba1.a = 0x800003 | n & 0x70;
            ba1.b = 2;
            i.setLayoutParams(ba1);
            i.setOnClickListener(new ay(this));
        }
    }

    private void o()
    {
        removeCallbacks(L);
        post(L);
    }

    private boolean p()
    {
        if (J) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j1 = getChildCount();
        int i1 = 0;
label0:
        do
        {
label1:
            {
                if (i1 >= j1)
                {
                    break label1;
                }
                View view = getChildAt(i1);
                if (b(view) && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0)
                {
                    break label0;
                }
                i1++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    private void setChildVisibilityForExpandedActionView(boolean flag)
    {
        int j1 = getChildCount();
        int i1 = 0;
        while (i1 < j1) 
        {
            View view = getChildAt(i1);
            if (((ba)view.getLayoutParams()).b != 2 && view != b)
            {
                byte byte0;
                if (flag)
                {
                    byte0 = 8;
                } else
                {
                    byte0 = 0;
                }
                view.setVisibility(byte0);
            }
            i1++;
        }
    }

    public ba a(AttributeSet attributeset)
    {
        return new ba(getContext(), attributeset);
    }

    protected ba a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof ba)
        {
            return new ba((ba)layoutparams);
        }
        if (layoutparams instanceof android.support.v7.app.b)
        {
            return new ba((android.support.v7.app.b)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new ba((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new ba(layoutparams);
        }
    }

    public void a(int i1, int j1)
    {
        t.a(i1, j1);
    }

    public void a(Context context, int i1)
    {
        l = i1;
        if (c != null)
        {
            c.setTextAppearance(context, i1);
        }
    }

    public void a(i i1, ActionMenuPresenter actionmenupresenter)
    {
        if (i1 != null || b != null)
        {
            l();
            i j1 = b.d();
            if (j1 != i1)
            {
                if (j1 != null)
                {
                    j1.b(F);
                    j1.b(G);
                }
                if (G == null)
                {
                    G = new az(this, null);
                }
                actionmenupresenter.c(true);
                if (i1 != null)
                {
                    i1.a(actionmenupresenter, j);
                    i1.a(G, j);
                } else
                {
                    actionmenupresenter.a(j, null);
                    G.a(j, null);
                    actionmenupresenter.a(true);
                    G.a(true);
                }
                b.setPopupTheme(k);
                b.setPresenter(actionmenupresenter);
                F = actionmenupresenter;
                return;
            }
        }
    }

    public boolean a()
    {
        return getVisibility() == 0 && b != null && b.a();
    }

    public void b(Context context, int i1)
    {
        m = i1;
        if (d != null)
        {
            d.setTextAppearance(context, i1);
        }
    }

    public boolean b()
    {
        return b != null && b.g();
    }

    public boolean c()
    {
        return b != null && b.h();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return super.checkLayoutParams(layoutparams) && (layoutparams instanceof ba);
    }

    public boolean d()
    {
        return b != null && b.e();
    }

    public boolean e()
    {
        return b != null && b.f();
    }

    public void f()
    {
        if (b != null)
        {
            b.i();
        }
    }

    public boolean g()
    {
        return G != null && G.b != null;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return i();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    public int getContentInsetEnd()
    {
        return t.d();
    }

    public int getContentInsetLeft()
    {
        return t.a();
    }

    public int getContentInsetRight()
    {
        return t.b();
    }

    public int getContentInsetStart()
    {
        return t.c();
    }

    public Drawable getLogo()
    {
        if (f != null)
        {
            return f.getDrawable();
        } else
        {
            return null;
        }
    }

    public CharSequence getLogoDescription()
    {
        if (f != null)
        {
            return f.getContentDescription();
        } else
        {
            return null;
        }
    }

    public Menu getMenu()
    {
        k();
        return b.getMenu();
    }

    public CharSequence getNavigationContentDescription()
    {
        if (e != null)
        {
            return e.getContentDescription();
        } else
        {
            return null;
        }
    }

    public Drawable getNavigationIcon()
    {
        if (e != null)
        {
            return e.getDrawable();
        } else
        {
            return null;
        }
    }

    public int getPopupTheme()
    {
        return k;
    }

    public CharSequence getSubtitle()
    {
        return w;
    }

    public CharSequence getTitle()
    {
        return v;
    }

    public x getWrapper()
    {
        if (E == null)
        {
            E = new bd(this, true);
        }
        return E;
    }

    public void h()
    {
        m m1;
        if (G == null)
        {
            m1 = null;
        } else
        {
            m1 = G.b;
        }
        if (m1 != null)
        {
            m1.collapseActionView();
        }
    }

    protected ba i()
    {
        return new ba(-2, -2);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks(L);
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        Object obj;
        Object obj1;
        int ai[];
        int i2;
        boolean flag1;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        boolean flag2;
        if (bb.e(this) == 1)
        {
            k2 = 1;
        } else
        {
            k2 = 0;
        }
        j3 = getWidth();
        i4 = getHeight();
        i2 = getPaddingLeft();
        k3 = getPaddingRight();
        l3 = getPaddingTop();
        j4 = getPaddingBottom();
        l1 = j3 - k3;
        ai = B;
        ai[1] = 0;
        ai[0] = 0;
        i3 = getMinimumHeightCompat();
        if (b(e))
        {
            if (k2 != 0)
            {
                l1 = b(e, l1, ai, i3);
                i1 = i2;
            } else
            {
                i1 = a(e, i2, ai, i3);
            }
        } else
        {
            i1 = i2;
        }
        j1 = l1;
        k1 = i1;
        if (b(i))
        {
            if (k2 != 0)
            {
                j1 = b(i, l1, ai, i3);
                k1 = i1;
            } else
            {
                k1 = a(i, i1, ai, i3);
                j1 = l1;
            }
        }
        i1 = j1;
        l1 = k1;
        if (b(b))
        {
            if (k2 != 0)
            {
                l1 = a(b, k1, ai, i3);
                i1 = j1;
            } else
            {
                i1 = b(b, j1, ai, i3);
                l1 = k1;
            }
        }
        ai[0] = Math.max(0, getContentInsetLeft() - l1);
        ai[1] = Math.max(0, getContentInsetRight() - (j3 - k3 - i1));
        k1 = Math.max(l1, getContentInsetLeft());
        l1 = Math.min(i1, j3 - k3 - getContentInsetRight());
        j1 = l1;
        i1 = k1;
        if (b(a))
        {
            if (k2 != 0)
            {
                j1 = b(a, l1, ai, i3);
                i1 = k1;
            } else
            {
                i1 = a(a, k1, ai, i3);
                j1 = l1;
            }
        }
        if (b(f))
        {
            if (k2 != 0)
            {
                j1 = b(f, j1, ai, i3);
                k1 = i1;
            } else
            {
                k1 = a(f, i1, ai, i3);
            }
        } else
        {
            k1 = i1;
        }
        flag = b(c);
        flag2 = b(d);
        i1 = 0;
        if (flag)
        {
            ba ba1 = (ba)c.getLayoutParams();
            i1 = ba1.topMargin;
            l1 = c.getMeasuredHeight();
            i1 = 0 + (ba1.bottomMargin + (i1 + l1));
        }
        if (flag2)
        {
            ba ba2 = (ba)d.getLayoutParams();
            l1 = ba2.topMargin;
            int j2 = d.getMeasuredHeight();
            l2 = ba2.bottomMargin + (l1 + j2) + i1;
        } else
        {
            l2 = i1;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        l1 = j1;
        i1 = k1;
        if (!flag2) goto _L3; else goto _L2
_L2:
        if (flag)
        {
            obj = c;
        } else
        {
            obj = d;
        }
        if (flag2)
        {
            obj1 = d;
        } else
        {
            obj1 = c;
        }
        obj = (ba)((View) (obj)).getLayoutParams();
        obj1 = (ba)((View) (obj1)).getLayoutParams();
        if (flag && c.getMeasuredWidth() > 0 || flag2 && d.getMeasuredWidth() > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        u & 0x70;
        JVM INSTR lookupswitch 2: default 560
    //                   48: 999
    //                   80: 1073;
           goto _L4 _L5 _L6
_L4:
        i1 = (i4 - l3 - j4 - l2) / 2;
        if (i1 < ((ba) (obj)).topMargin + r)
        {
            i1 = ((ba) (obj)).topMargin + r;
        } else
        {
            l1 = i4 - j4 - l2 - i1 - l3;
            if (l1 < ((ba) (obj)).bottomMargin + s)
            {
                i1 = Math.max(0, i1 - ((((ba) (obj1)).bottomMargin + s) - l1));
            }
        }
        i1 = l3 + i1;
_L8:
        if (k2 != 0)
        {
            if (flag1)
            {
                l1 = p;
            } else
            {
                l1 = 0;
            }
            l1 -= ai[1];
            j1 -= Math.max(0, l1);
            ai[1] = Math.max(0, -l1);
            if (flag)
            {
                obj = (ba)c.getLayoutParams();
                l1 = j1 - c.getMeasuredWidth();
                k2 = c.getMeasuredHeight() + i1;
                c.layout(l1, i1, j1, k2);
                l2 = q;
                i1 = k2 + ((ba) (obj)).bottomMargin;
                l1 -= l2;
            } else
            {
                l1 = j1;
            }
            if (flag2)
            {
                obj = (ba)d.getLayoutParams();
                i1 = ((ba) (obj)).topMargin + i1;
                k2 = d.getMeasuredWidth();
                l2 = d.getMeasuredHeight() + i1;
                d.layout(j1 - k2, i1, j1, l2);
                i1 = q;
                k2 = ((ba) (obj)).bottomMargin;
                i1 = j1 - i1;
            } else
            {
                i1 = j1;
            }
            if (flag1)
            {
                i1 = Math.min(l1, i1);
            } else
            {
                i1 = j1;
            }
            l1 = i1;
            i1 = k1;
        } else
        {
            if (flag1)
            {
                l1 = p;
            } else
            {
                l1 = 0;
            }
            l1 -= ai[0];
            k1 += Math.max(0, l1);
            ai[0] = Math.max(0, -l1);
            if (flag)
            {
                obj = (ba)c.getLayoutParams();
                k2 = c.getMeasuredWidth() + k1;
                l1 = c.getMeasuredHeight() + i1;
                c.layout(k1, i1, k2, l1);
                l2 = q;
                i1 = ((ba) (obj)).bottomMargin;
                k2 += l2;
                i1 += l1;
            } else
            {
                k2 = k1;
            }
            if (flag2)
            {
                obj = (ba)d.getLayoutParams();
                l1 = i1 + ((ba) (obj)).topMargin;
                i1 = d.getMeasuredWidth() + k1;
                l2 = d.getMeasuredHeight() + l1;
                d.layout(k1, l1, i1, l2);
                l1 = q;
                l2 = ((ba) (obj)).bottomMargin;
                l2 = l1 + i1;
            } else
            {
                l2 = k1;
            }
            l1 = j1;
            i1 = k1;
            if (flag1)
            {
                i1 = Math.max(k2, l2);
                l1 = j1;
            }
        }
_L3:
        a(A, 3);
        k1 = A.size();
        for (j1 = 0; j1 < k1; j1++)
        {
            i1 = a((View)A.get(j1), i1, ai, i3);
        }

        a(A, 5);
        k1 = A.size();
        for (j1 = 0; j1 < k1; j1++)
        {
            l1 = b((View)A.get(j1), l1, ai, i3);
        }

        a(A, 1);
        k1 = a(A, ai);
        j1 = ((j3 - i2 - k3) / 2 + i2) - k1 / 2;
        k1 += j1;
          goto _L7
_L5:
        i1 = getPaddingTop();
        i1 = ((ba) (obj)).topMargin + i1 + r;
        break MISSING_BLOCK_LABEL_604;
_L6:
        i1 = i4 - j4 - ((ba) (obj1)).bottomMargin - s - l2;
          goto _L8
_L7:
        if (j1 >= i1) goto _L10; else goto _L9
_L9:
        l1 = A.size();
        k1 = 0;
        j1 = i1;
        for (i1 = k1; i1 < l1; i1++)
        {
            j1 = a((View)A.get(i1), j1, ai, i3);
        }

        break; /* Loop/switch isn't completed */
_L10:
        i1 = j1;
        if (k1 > l1)
        {
            i1 = j1 - (k1 - l1);
        }
        if (true) goto _L9; else goto _L11
_L11:
        A.clear();
        return;
          goto _L8
    }

    protected void onMeasure(int i1, int j1)
    {
        int j2 = 0;
        int i2 = 0;
        int ai[] = B;
        int k1;
        int l1;
        int k2;
        int l2;
        int i3;
        int j3;
        if (bi.a(this))
        {
            k2 = 0;
            l2 = 1;
        } else
        {
            k2 = 1;
            l2 = 0;
        }
        k1 = 0;
        if (b(e))
        {
            a(e, i1, 0, j1, 0, o);
            k1 = e.getMeasuredWidth() + c(e);
            j2 = Math.max(0, e.getMeasuredHeight() + d(e));
            i2 = bi.a(0, bb.g(e));
        }
        i3 = k1;
        k1 = i2;
        l1 = j2;
        if (b(i))
        {
            a(i, i1, 0, j1, 0, o);
            i3 = i.getMeasuredWidth() + c(i);
            l1 = Math.max(j2, i.getMeasuredHeight() + d(i));
            k1 = bi.a(i2, bb.g(i));
        }
        i2 = getContentInsetStart();
        j3 = 0 + Math.max(i2, i3);
        ai[l2] = Math.max(0, i2 - i3);
        l2 = 0;
        i2 = k1;
        j2 = l1;
        if (b(b))
        {
            a(b, i1, j3, j1, 0, o);
            l2 = b.getMeasuredWidth() + c(b);
            j2 = Math.max(l1, b.getMeasuredHeight() + d(b));
            i2 = bi.a(k1, bb.g(b));
        }
        k1 = getContentInsetEnd();
        i3 = j3 + Math.max(k1, l2);
        ai[k2] = Math.max(0, k1 - l2);
        l2 = i3;
        k1 = i2;
        l1 = j2;
        if (b(a))
        {
            l2 = i3 + a(a, i1, i3, j1, 0, ai);
            l1 = Math.max(j2, a.getMeasuredHeight() + d(a));
            k1 = bi.a(i2, bb.g(a));
        }
        i2 = l2;
        j2 = k1;
        k2 = l1;
        if (b(f))
        {
            i2 = l2 + a(f, i1, l2, j1, 0, ai);
            k2 = Math.max(l1, f.getMeasuredHeight() + d(f));
            j2 = bi.a(k1, bb.g(f));
        }
        i3 = getChildCount();
        l2 = 0;
        l1 = k2;
        k1 = j2;
        j2 = l2;
        l2 = i2;
        while (j2 < i3) 
        {
            View view = getChildAt(j2);
            if (((ba)view.getLayoutParams()).b == 0 && b(view))
            {
                l2 += a(view, i1, l2, j1, 0, ai);
                l1 = Math.max(l1, view.getMeasuredHeight() + d(view));
                k1 = bi.a(k1, bb.g(view));
            }
            j2++;
        }
        k2 = 0;
        j2 = 0;
        int k3 = r + s;
        int l3 = p + q;
        i2 = k1;
        if (b(c))
        {
            a(c, i1, l2 + l3, j1, k3, ai);
            i2 = c.getMeasuredWidth();
            k2 = c(c) + i2;
            j2 = c.getMeasuredHeight() + d(c);
            i2 = bi.a(k1, bb.g(c));
        }
        j3 = j2;
        i3 = k2;
        k1 = i2;
        if (b(d))
        {
            i3 = Math.max(k2, a(d, i1, l2 + l3, j1, k3 + j2, ai));
            j3 = j2 + (d.getMeasuredHeight() + d(d));
            k1 = bi.a(i2, bb.g(d));
        }
        l1 = Math.max(l1, j3);
        k2 = getPaddingLeft();
        j3 = getPaddingRight();
        i2 = getPaddingTop();
        j2 = getPaddingBottom();
        k2 = bb.a(Math.max(i3 + l2 + (k2 + j3), getSuggestedMinimumWidth()), i1, 0xff000000 & k1);
        i1 = bb.a(Math.max(l1 + (i2 + j2), getSuggestedMinimumHeight()), j1, k1 << 16);
        if (p())
        {
            i1 = 0;
        }
        setMeasuredDimension(k2, i1);
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        SavedState savedstate = (SavedState)parcelable;
        super.onRestoreInstanceState(savedstate.getSuperState());
        if (b != null)
        {
            parcelable = b.d();
        } else
        {
            parcelable = null;
        }
        if (savedstate.a != 0 && G != null && parcelable != null)
        {
            parcelable = parcelable.findItem(savedstate.a);
            if (parcelable != null)
            {
                ah.b(parcelable);
            }
        }
        if (savedstate.b)
        {
            o();
        }
    }

    public void onRtlPropertiesChanged(int i1)
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            super.onRtlPropertiesChanged(i1);
        }
        ae ae1 = t;
        if (i1 != 1)
        {
            flag = false;
        }
        ae1.a(flag);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        if (G != null && G.b != null)
        {
            savedstate.a = G.b.getItemId();
        }
        savedstate.b = b();
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1 = ap.a(motionevent);
        if (i1 == 0)
        {
            z = false;
        }
        if (!z)
        {
            boolean flag = super.onTouchEvent(motionevent);
            if (i1 == 0 && !flag)
            {
                z = true;
            }
        }
        if (i1 == 1 || i1 == 3)
        {
            z = false;
        }
        return true;
    }

    public void setCollapsible(boolean flag)
    {
        J = flag;
        requestLayout();
    }

    public void setLogo(int i1)
    {
        setLogo(M.a(i1));
    }

    public void setLogo(Drawable drawable)
    {
        if (drawable == null) goto _L2; else goto _L1
_L1:
        j();
        if (f.getParent() == null)
        {
            a(f);
            e(f);
        }
_L4:
        if (f != null)
        {
            f.setImageDrawable(drawable);
        }
        return;
_L2:
        if (f != null && f.getParent() != null)
        {
            removeView(f);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setLogoDescription(int i1)
    {
        setLogoDescription(getContext().getText(i1));
    }

    public void setLogoDescription(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            j();
        }
        if (f != null)
        {
            f.setContentDescription(charsequence);
        }
    }

    public void setMinimumHeight(int i1)
    {
        K = i1;
        super.setMinimumHeight(i1);
    }

    public void setNavigationContentDescription(int i1)
    {
        CharSequence charsequence;
        if (i1 != 0)
        {
            charsequence = getContext().getText(i1);
        } else
        {
            charsequence = null;
        }
        setNavigationContentDescription(charsequence);
    }

    public void setNavigationContentDescription(CharSequence charsequence)
    {
        if (!TextUtils.isEmpty(charsequence))
        {
            m();
        }
        if (e != null)
        {
            e.setContentDescription(charsequence);
        }
    }

    public void setNavigationIcon(int i1)
    {
        setNavigationIcon(M.a(i1));
    }

    public void setNavigationIcon(Drawable drawable)
    {
        if (drawable == null) goto _L2; else goto _L1
_L1:
        m();
        if (e.getParent() == null)
        {
            a(e);
            e(e);
        }
_L4:
        if (e != null)
        {
            e.setImageDrawable(drawable);
        }
        return;
_L2:
        if (e != null && e.getParent() != null)
        {
            removeView(e);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setNavigationOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        m();
        e.setOnClickListener(onclicklistener);
    }

    public void setOnMenuItemClickListener(android.support.v7.widget.bb bb1)
    {
        C = bb1;
    }

    public void setPopupTheme(int i1)
    {
label0:
        {
            if (k != i1)
            {
                k = i1;
                if (i1 != 0)
                {
                    break label0;
                }
                j = getContext();
            }
            return;
        }
        j = new ContextThemeWrapper(getContext(), i1);
    }

    public void setSubtitle(int i1)
    {
        setSubtitle(getContext().getText(i1));
    }

    public void setSubtitle(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        if (d == null)
        {
            Context context = getContext();
            d = new TextView(context);
            d.setSingleLine();
            d.setEllipsize(android.text.TextUtils.TruncateAt.END);
            if (m != 0)
            {
                d.setTextAppearance(context, m);
            }
            if (y != 0)
            {
                d.setTextColor(y);
            }
        }
        if (d.getParent() == null)
        {
            a(d);
            e(d);
        }
_L4:
        if (d != null)
        {
            d.setText(charsequence);
        }
        w = charsequence;
        return;
_L2:
        if (d != null && d.getParent() != null)
        {
            removeView(d);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setSubtitleTextColor(int i1)
    {
        y = i1;
        if (d != null)
        {
            d.setTextColor(i1);
        }
    }

    public void setTitle(int i1)
    {
        setTitle(getContext().getText(i1));
    }

    public void setTitle(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        if (c == null)
        {
            Context context = getContext();
            c = new TextView(context);
            c.setSingleLine();
            c.setEllipsize(android.text.TextUtils.TruncateAt.END);
            if (l != 0)
            {
                c.setTextAppearance(context, l);
            }
            if (x != 0)
            {
                c.setTextColor(x);
            }
        }
        if (c.getParent() == null)
        {
            a(c);
            e(c);
        }
_L4:
        if (c != null)
        {
            c.setText(charsequence);
        }
        v = charsequence;
        return;
_L2:
        if (c != null && c.getParent() != null)
        {
            removeView(c);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setTitleTextColor(int i1)
    {
        x = i1;
        if (c != null)
        {
            c.setTextColor(i1);
        }
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.support.v7.widget.bc();
        public int a;
        public boolean b;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(a);
            if (b)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readInt();
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b = flag;
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
