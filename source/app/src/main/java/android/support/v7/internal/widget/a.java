// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.view.bb;
import android.support.v4.view.cp;
import android.support.v7.a.b;
import android.support.v7.a.l;
import android.support.v7.internal.view.h;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v7.internal.widget:
//            b

abstract class a extends ViewGroup
{

    private static final Interpolator j = new DecelerateInterpolator();
    protected final android.support.v7.internal.widget.b a;
    protected final Context b;
    protected ActionMenuView c;
    protected ActionMenuPresenter d;
    protected ViewGroup e;
    protected boolean f;
    protected boolean g;
    protected int h;
    protected cp i;

    a(Context context)
    {
        this(context, null);
    }

    a(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    a(Context context, AttributeSet attributeset, int k)
    {
        super(context, attributeset, k);
        a = new android.support.v7.internal.widget.b(this);
        attributeset = new TypedValue();
        if (context.getTheme().resolveAttribute(b.actionBarPopupTheme, attributeset, true) && ((TypedValue) (attributeset)).resourceId != 0)
        {
            b = new ContextThemeWrapper(context, ((TypedValue) (attributeset)).resourceId);
            return;
        } else
        {
            b = context;
            return;
        }
    }

    protected static int a(int k, int i1, boolean flag)
    {
        if (flag)
        {
            return k - i1;
        } else
        {
            return k + i1;
        }
    }

    protected int a(View view, int k, int i1, int j1)
    {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k, 0x80000000), i1);
        return Math.max(0, k - view.getMeasuredWidth() - j1);
    }

    protected int a(View view, int k, int i1, int j1, boolean flag)
    {
        int k1 = view.getMeasuredWidth();
        int l1 = view.getMeasuredHeight();
        i1 = (j1 - l1) / 2 + i1;
        if (flag)
        {
            view.layout(k - k1, i1, k, l1 + i1);
        } else
        {
            view.layout(k, i1, k + k1, l1 + i1);
        }
        k = k1;
        if (flag)
        {
            k = -k1;
        }
        return k;
    }

    public void a(int k)
    {
        if (i != null)
        {
            i.a();
        }
        if (k == 0)
        {
            if (getVisibility() != 0)
            {
                bb.c(this, 0.0F);
                if (e != null && c != null)
                {
                    bb.c(c, 0.0F);
                }
            }
            cp cp1 = bb.j(this).a(1.0F);
            cp1.a(200L);
            cp1.a(j);
            if (e != null && c != null)
            {
                h h1 = new h();
                cp cp3 = bb.j(c).a(1.0F);
                cp3.a(200L);
                h1.a(a.a(cp1, k));
                h1.a(cp1).a(cp3);
                h1.a();
                return;
            } else
            {
                cp1.a(a.a(cp1, k));
                cp1.b();
                return;
            }
        }
        cp cp2 = bb.j(this).a(0.0F);
        cp2.a(200L);
        cp2.a(j);
        if (e != null && c != null)
        {
            h h2 = new h();
            cp cp4 = bb.j(c).a(0.0F);
            cp4.a(200L);
            h2.a(a.a(cp2, k));
            h2.a(cp2).a(cp4);
            h2.a();
            return;
        } else
        {
            cp2.a(a.a(cp2, k));
            cp2.b();
            return;
        }
    }

    public boolean a()
    {
        if (d != null)
        {
            return d.c();
        } else
        {
            return false;
        }
    }

    public int getAnimatedVisibility()
    {
        if (i != null)
        {
            return a.a;
        } else
        {
            return getVisibility();
        }
    }

    public int getContentHeight()
    {
        return h;
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        TypedArray typedarray = getContext().obtainStyledAttributes(null, l.ActionBar, b.actionBarStyle, 0);
        setContentHeight(typedarray.getLayoutDimension(l.ActionBar_height, 0));
        typedarray.recycle();
        if (d != null)
        {
            d.a(configuration);
        }
    }

    public void setContentHeight(int k)
    {
        h = k;
        requestLayout();
    }

    public void setSplitToolbar(boolean flag)
    {
        f = flag;
    }

    public void setSplitView(ViewGroup viewgroup)
    {
        e = viewgroup;
    }

    public void setSplitWhenNarrow(boolean flag)
    {
        g = flag;
    }

}
