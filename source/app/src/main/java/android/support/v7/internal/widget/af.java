// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v4.view.cp;
import android.support.v7.a.b;
import android.support.v7.app.d;
import android.support.v7.internal.view.a;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.w;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.HorizontalScrollView;

// Referenced classes of package android.support.v7.internal.widget:
//            q, ak, SpinnerCompat, aj, 
//            ai, ah, ag, n

public class af extends HorizontalScrollView
    implements q
{

    private static final Interpolator l = new DecelerateInterpolator();
    Runnable a;
    int b;
    int c;
    protected cp d;
    protected final ak e = new ak(this);
    private ai f;
    private LinearLayoutCompat g;
    private SpinnerCompat h;
    private boolean i;
    private int j;
    private int k;

    public af(Context context)
    {
        super(context);
        setHorizontalScrollBarEnabled(false);
        context = android.support.v7.internal.view.a.a(context);
        setContentHeight(context.e());
        c = context.g();
        g = d();
        addView(g, new android.view.ViewGroup.LayoutParams(-2, -1));
    }

    static aj a(af af1, d d1, boolean flag)
    {
        return af1.b(d1, flag);
    }

    static LinearLayoutCompat a(af af1)
    {
        return af1.g;
    }

    private boolean a()
    {
        return h != null && h.getParent() == this;
    }

    private aj b(d d1, boolean flag)
    {
        d1 = new aj(this, getContext(), d1, flag);
        if (flag)
        {
            d1.setBackgroundDrawable(null);
            d1.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, j));
            return d1;
        }
        d1.setFocusable(true);
        if (f == null)
        {
            f = new ai(this, null);
        }
        d1.setOnClickListener(f);
        return d1;
    }

    private void b()
    {
        if (a())
        {
            return;
        }
        if (h == null)
        {
            h = e();
        }
        removeView(g);
        addView(h, new android.view.ViewGroup.LayoutParams(-2, -1));
        if (h.c() == null)
        {
            h.a(new ah(this, null));
        }
        if (a != null)
        {
            removeCallbacks(a);
            a = null;
        }
        h.setSelection(k);
    }

    private boolean c()
    {
        if (!a())
        {
            return false;
        } else
        {
            removeView(h);
            addView(g, new android.view.ViewGroup.LayoutParams(-2, -1));
            setTabSelected(h.getSelectedItemPosition());
            return false;
        }
    }

    private LinearLayoutCompat d()
    {
        LinearLayoutCompat linearlayoutcompat = new LinearLayoutCompat(getContext(), null, b.actionBarTabBarStyle);
        linearlayoutcompat.setMeasureWithLargestChildEnabled(true);
        linearlayoutcompat.setGravity(17);
        linearlayoutcompat.setLayoutParams(new w(-2, -1));
        return linearlayoutcompat;
    }

    private SpinnerCompat e()
    {
        SpinnerCompat spinnercompat = new SpinnerCompat(getContext(), null, b.actionDropDownStyle);
        spinnercompat.setLayoutParams(new w(-2, -1));
        spinnercompat.a(this);
        return spinnercompat;
    }

    public void a(int i1)
    {
        View view = g.getChildAt(i1);
        if (a != null)
        {
            removeCallbacks(a);
        }
        a = new ag(this, view);
        post(a);
    }

    public void a(d d1, boolean flag)
    {
        d1 = b(d1, false);
        g.addView(d1, new w(0, -1, 1.0F));
        if (h != null)
        {
            ((ah)h.c()).notifyDataSetChanged();
        }
        if (flag)
        {
            d1.setSelected(true);
        }
        if (i)
        {
            requestLayout();
        }
    }

    public void a(n n, View view, int i1, long l1)
    {
        ((aj)view).b().e();
    }

    public void b(int i1)
    {
        ((aj)g.getChildAt(i1)).a();
        if (h != null)
        {
            ((ah)h.c()).notifyDataSetChanged();
        }
        if (i)
        {
            requestLayout();
        }
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (a != null)
        {
            post(a);
        }
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        configuration = android.support.v7.internal.view.a.a(getContext());
        setContentHeight(configuration.e());
        c = configuration.g();
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (a != null)
        {
            removeCallbacks(a);
        }
    }

    public void onMeasure(int i1, int j1)
    {
        j1 = 1;
        int k1 = android.view.View.MeasureSpec.getMode(i1);
        int i2;
        boolean flag;
        if (k1 == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setFillViewport(flag);
        i2 = g.getChildCount();
        if (i2 > 1 && (k1 == 0x40000000 || k1 == 0x80000000))
        {
            int l1;
            if (i2 > 2)
            {
                b = (int)((float)android.view.View.MeasureSpec.getSize(i1) * 0.4F);
            } else
            {
                b = android.view.View.MeasureSpec.getSize(i1) / 2;
            }
            b = Math.min(b, c);
        } else
        {
            b = -1;
        }
        l1 = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
        if (flag || !i)
        {
            j1 = 0;
        }
        if (j1 != 0)
        {
            g.measure(0, l1);
            if (g.getMeasuredWidth() > android.view.View.MeasureSpec.getSize(i1))
            {
                b();
            } else
            {
                c();
            }
        } else
        {
            c();
        }
        j1 = getMeasuredWidth();
        super.onMeasure(i1, l1);
        i1 = getMeasuredWidth();
        if (flag && j1 != i1)
        {
            setTabSelected(k);
        }
    }

    public void setAllowCollapse(boolean flag)
    {
        i = flag;
    }

    public void setContentHeight(int i1)
    {
        j = i1;
        requestLayout();
    }

    public void setTabSelected(int i1)
    {
        k = i1;
        int k1 = g.getChildCount();
        int j1 = 0;
        while (j1 < k1) 
        {
            View view = g.getChildAt(j1);
            boolean flag;
            if (j1 == i1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setSelected(flag);
            if (flag)
            {
                a(i1);
            }
            j1++;
        }
        if (h != null && i1 >= 0)
        {
            h.setSelection(i1);
        }
    }

}
