// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.CustomViews.ColorPicker;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class a extends Drawable
{

    private int a;
    private Paint b;
    private Paint c;
    private Paint d;
    private int e;
    private int f;
    private Bitmap g;

    public a(int i)
    {
        a = 10;
        b = new Paint();
        c = new Paint();
        d = new Paint();
        a = i;
        c.setColor(-1);
        d.setColor(0xffcbcbcb);
    }

    private void a()
    {
        if (getBounds().width() > 0 && getBounds().height() > 0)
        {
            g = Bitmap.createBitmap(getBounds().width(), getBounds().height(), android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(g);
            Rect rect = new Rect();
            int i = 0;
            boolean flag = true;
            while (i <= f) 
            {
                int j = 0;
                boolean flag1 = flag;
                while (j <= e) 
                {
                    rect.top = a * i;
                    rect.left = a * j;
                    rect.bottom = rect.top + a;
                    rect.right = rect.left + a;
                    Paint paint;
                    if (flag1)
                    {
                        paint = c;
                    } else
                    {
                        paint = d;
                    }
                    canvas.drawRect(rect, paint);
                    if (!flag1)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    j++;
                }
                if (!flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                i++;
            }
        }
    }

    public void draw(Canvas canvas)
    {
        canvas.drawBitmap(g, null, getBounds(), b);
    }

    public int getOpacity()
    {
        return 0;
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        int i = rect.height();
        e = (int)Math.ceil(rect.width() / a);
        f = (int)Math.ceil(i / a);
        a();
    }

    public void setAlpha(int i)
    {
        throw new UnsupportedOperationException("Alpha is not supported by this drawwable.");
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        throw new UnsupportedOperationException("ColorFilter is not supported by this drawwable.");
    }
}
