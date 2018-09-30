// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.a.b;
import android.support.v7.app.d;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.w;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

// Referenced classes of package android.support.v7.internal.widget:
//            bc, v, af

class aj extends LinearLayoutCompat
    implements android.view.View.OnLongClickListener
{

    final af a;
    private final int b[] = {
        0x10100d4
    };
    private d c;
    private TextView d;
    private ImageView e;
    private View f;

    public aj(af af1, Context context, d d1, boolean flag)
    {
        a = af1;
        super(context, null, b.actionBarTabStyle);
        c = d1;
        af1 = bc.a(context, null, b, b.actionBarTabStyle, 0);
        if (af1.d(0))
        {
            setBackgroundDrawable(af1.a(0));
        }
        af1.b();
        if (flag)
        {
            setGravity(0x800013);
        }
        a();
    }

    public void a()
    {
        Object obj = c;
        Object obj1 = ((d) (obj)).d();
        if (obj1 != null)
        {
            obj = ((View) (obj1)).getParent();
            if (obj != this)
            {
                if (obj != null)
                {
                    ((ViewGroup)obj).removeView(((View) (obj1)));
                }
                addView(((View) (obj1)));
            }
            f = ((View) (obj1));
            if (d != null)
            {
                d.setVisibility(8);
            }
            if (e != null)
            {
                e.setVisibility(8);
                e.setImageDrawable(null);
            }
            return;
        }
        if (f != null)
        {
            removeView(f);
            f = null;
        }
        android.graphics.drawable.Drawable drawable = ((d) (obj)).b();
        obj1 = ((d) (obj)).c();
        boolean flag;
        if (drawable != null)
        {
            if (e == null)
            {
                ImageView imageview = new ImageView(getContext());
                w w2 = new w(-2, -2);
                w2.h = 16;
                imageview.setLayoutParams(w2);
                addView(imageview, 0);
                e = imageview;
            }
            e.setImageDrawable(drawable);
            e.setVisibility(0);
        } else
        if (e != null)
        {
            e.setVisibility(8);
            e.setImageDrawable(null);
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (d == null)
            {
                v v1 = new v(getContext(), null, b.actionBarTabTextStyle);
                v1.setEllipsize(android.text.TextUtils.TruncateAt.END);
                w w1 = new w(-2, -2);
                w1.h = 16;
                v1.setLayoutParams(w1);
                addView(v1);
                d = v1;
            }
            d.setText(((CharSequence) (obj1)));
            d.setVisibility(0);
        } else
        if (d != null)
        {
            d.setVisibility(8);
            d.setText(null);
        }
        if (e != null)
        {
            e.setContentDescription(((d) (obj)).f());
        }
        if (!flag && !TextUtils.isEmpty(((d) (obj)).f()))
        {
            setOnLongClickListener(this);
            return;
        } else
        {
            setOnLongClickListener(null);
            setLongClickable(false);
            return;
        }
    }

    public void a(d d1)
    {
        c = d1;
        a();
    }

    public d b()
    {
        return c;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(android/support/v7/app/d.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            accessibilitynodeinfo.setClassName(android/support/v7/app/d.getName());
        }
    }

    public boolean onLongClick(View view)
    {
        view = new int[2];
        getLocationOnScreen(view);
        Object obj = getContext();
        int i = getWidth();
        int j = getHeight();
        int k = ((Context) (obj)).getResources().getDisplayMetrics().widthPixels;
        obj = Toast.makeText(((Context) (obj)), c.f(), 0);
        ((Toast) (obj)).setGravity(49, (view[0] + i / 2) - k / 2, j);
        ((Toast) (obj)).show();
        return true;
    }

    public void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (a.b > 0 && getMeasuredWidth() > a.b)
        {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(a.b, 0x40000000), j);
        }
    }

    public void setSelected(boolean flag)
    {
        boolean flag1;
        if (isSelected() != flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        super.setSelected(flag);
        if (flag1 && flag)
        {
            sendAccessibilityEvent(4);
        }
    }
}
