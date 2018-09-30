// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.CustomViews.ColorPicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

// Referenced classes of package com.clawdyvan.agendaestudantepro.CustomViews.ColorPicker:
//            a

public class ColorPanelView extends View
{

    private static float a = 1.0F;
    private int b;
    private int c;
    private Paint d;
    private Paint e;
    private RectF f;
    private RectF g;
    private a h;

    public ColorPanelView(Context context)
    {
        this(context, null);
    }

    public ColorPanelView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ColorPanelView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = 0xff6e6e6e;
        c = 0xff000000;
        a();
    }

    private void a()
    {
        d = new Paint();
        e = new Paint();
        a = getContext().getResources().getDisplayMetrics().density;
    }

    private void b()
    {
        RectF rectf = f;
        float f1 = rectf.left;
        float f2 = rectf.top;
        float f3 = rectf.bottom;
        g = new RectF(f1 + 1.0F, f2 + 1.0F, rectf.right - 1.0F, f3 - 1.0F);
        h = new a((int)(5F * a));
        h.setBounds(Math.round(g.left), Math.round(g.top), Math.round(g.right), Math.round(g.bottom));
    }

    public int getBorderColor()
    {
        return b;
    }

    public int getColor()
    {
        return c;
    }

    protected void onDraw(Canvas canvas)
    {
        RectF rectf = g;
        d.setColor(b);
        canvas.drawRect(f, d);
        if (h != null)
        {
            h.draw(canvas);
        }
        e.setColor(c);
        canvas.drawRect(rectf, e);
    }

    protected void onMeasure(int i, int j)
    {
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), android.view.View.MeasureSpec.getSize(j));
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        f = new RectF();
        f.left = getPaddingLeft();
        f.right = i - getPaddingRight();
        f.top = getPaddingTop();
        f.bottom = j - getPaddingBottom();
        b();
    }

    public void setBorderColor(int i)
    {
        b = i;
        invalidate();
    }

    public void setColor(int i)
    {
        c = i;
        invalidate();
    }

}
