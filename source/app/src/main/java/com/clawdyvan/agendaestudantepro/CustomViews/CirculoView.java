// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.CustomViews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class CirculoView extends View
{

    private int a;
    private Paint b;
    private RectF c;

    public CirculoView(Context context)
    {
        super(context);
        a(null);
    }

    public CirculoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(attributeset);
    }

    private void a(AttributeSet attributeset)
    {
        b = new Paint(1);
        try
        {
            a = Color.parseColor(attributeset.getAttributeValue("http://schemas.android.com/apk/res-auto", "cor"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AttributeSet attributeset)
        {
            a = 0xff000000;
        }
    }

    public int getCorDesenho()
    {
        return a;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        b.setColor(a);
        canvas.drawOval(c, b);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        k = super.getPaddingLeft();
        l = super.getPaddingRight();
        int i1 = super.getPaddingTop();
        int j1 = super.getPaddingBottom();
        c = new RectF(k, i1, k + (i - (l + k)), i1 + (j - (j1 + i1)));
    }

    public void setCorDesenho(int i)
    {
        a = i;
        invalidate();
        requestLayout();
    }
}
