// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v7.a.l;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.internal.widget:
//            bh

public final class ViewStubCompat extends View
{

    private int a;
    private int b;
    private WeakReference c;
    private LayoutInflater d;
    private bh e;

    public ViewStubCompat(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = 0;
        context = context.obtainStyledAttributes(attributeset, l.ViewStubCompat, i, 0);
        b = context.getResourceId(l.ViewStubCompat_android_inflatedId, -1);
        a = context.getResourceId(l.ViewStubCompat_android_layout, 0);
        setId(context.getResourceId(l.ViewStubCompat_android_id, -1));
        context.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View a()
    {
        Object obj = getParent();
        if (obj != null && (obj instanceof ViewGroup))
        {
            if (a != 0)
            {
                ViewGroup viewgroup = (ViewGroup)obj;
                android.view.ViewGroup.LayoutParams layoutparams;
                int i;
                if (d != null)
                {
                    obj = d;
                } else
                {
                    obj = LayoutInflater.from(getContext());
                }
                obj = ((LayoutInflater) (obj)).inflate(a, viewgroup, false);
                if (b != -1)
                {
                    ((View) (obj)).setId(b);
                }
                i = viewgroup.indexOfChild(this);
                viewgroup.removeViewInLayout(this);
                layoutparams = getLayoutParams();
                if (layoutparams != null)
                {
                    viewgroup.addView(((View) (obj)), i, layoutparams);
                } else
                {
                    viewgroup.addView(((View) (obj)), i);
                }
                c = new WeakReference(obj);
                if (e != null)
                {
                    e.a(this, ((View) (obj)));
                }
                return ((View) (obj));
            } else
            {
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
        } else
        {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
    }

    protected void dispatchDraw(Canvas canvas)
    {
    }

    public void draw(Canvas canvas)
    {
    }

    public int getInflatedId()
    {
        return b;
    }

    public LayoutInflater getLayoutInflater()
    {
        return d;
    }

    public int getLayoutResource()
    {
        return a;
    }

    protected void onMeasure(int i, int j)
    {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i)
    {
        b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutinflater)
    {
        d = layoutinflater;
    }

    public void setLayoutResource(int i)
    {
        a = i;
    }

    public void setOnInflateListener(bh bh1)
    {
        e = bh1;
    }

    public void setVisibility(int i)
    {
        if (c == null) goto _L2; else goto _L1
_L1:
        View view = (View)c.get();
        if (view == null) goto _L4; else goto _L3
_L3:
        view.setVisibility(i);
_L6:
        return;
_L4:
        throw new IllegalStateException("setVisibility called on un-referenced view");
_L2:
        super.setVisibility(i);
        if (i == 0 || i == 4)
        {
            a();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
