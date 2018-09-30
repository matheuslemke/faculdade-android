// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.CustomViews.ColorPicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.clawdyvan.agendaestudantepro.CustomViews.ColorPicker:
//            g, a, h

public class ColorPickerView extends View
{

    private static float f = 1.0F;
    private boolean A;
    private int B;
    private int C;
    private RectF D;
    private RectF E;
    private RectF F;
    private RectF G;
    private a H;
    private Point I;
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private h g;
    private Paint h;
    private Paint i;
    private Paint j;
    private Paint k;
    private Paint l;
    private Paint m;
    private Paint n;
    private Shader o;
    private Shader p;
    private Shader q;
    private Shader r;
    private g s;
    private int t;
    private float u;
    private float v;
    private float w;
    private String x;
    private int y;
    private int z;

    public ColorPickerView(Context context)
    {
        this(context, null);
    }

    public ColorPickerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ColorPickerView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = 30F;
        b = 20F;
        c = 10F;
        d = 5F;
        e = 2.0F;
        t = 255;
        u = 360F;
        v = 0.0F;
        w = 0.0F;
        x = null;
        y = 0xffbdbdbd;
        z = 0xff6e6e6e;
        A = false;
        B = 0;
        I = null;
        a(attributeset);
    }

    private Point a(float f1)
    {
        RectF rectf = F;
        float f2 = rectf.height();
        Point point = new Point();
        point.y = (int)((f2 - (f1 * f2) / 360F) + rectf.top);
        point.x = (int)rectf.left;
        return point;
    }

    private Point a(float f1, float f2)
    {
        RectF rectf = E;
        float f3 = rectf.height();
        float f4 = rectf.width();
        Point point = new Point();
        point.x = (int)(f4 * f1 + rectf.left);
        point.y = (int)(rectf.top + f3 * (1.0F - f2));
        return point;
    }

    private Point a(int i1)
    {
        RectF rectf = G;
        float f1 = rectf.width();
        Point point = new Point();
        point.x = (int)((f1 - ((float)i1 * f1) / 255F) + rectf.left);
        point.y = (int)rectf.top;
        return point;
    }

    private void a()
    {
        h = new Paint();
        i = new Paint();
        j = new Paint();
        k = new Paint();
        l = new Paint();
        m = new Paint();
        n = new Paint();
        i.setStyle(android.graphics.Paint.Style.STROKE);
        i.setStrokeWidth(f * 2.0F);
        i.setAntiAlias(true);
        k.setColor(y);
        k.setStyle(android.graphics.Paint.Style.STROKE);
        k.setStrokeWidth(f * 2.0F);
        k.setAntiAlias(true);
        m.setColor(0xff1c1c1c);
        m.setTextSize(14F * f);
        m.setAntiAlias(true);
        m.setTextAlign(android.graphics.Paint.Align.CENTER);
        m.setFakeBoldText(true);
    }

    private void a(Canvas canvas)
    {
        Object obj = E;
        n.setColor(z);
        canvas.drawRect(D.left, D.top, 1.0F + ((RectF) (obj)).right, 1.0F + ((RectF) (obj)).bottom, n);
        if (o == null)
        {
            o = new LinearGradient(((RectF) (obj)).left, ((RectF) (obj)).top, ((RectF) (obj)).left, ((RectF) (obj)).bottom, -1, 0xff000000, android.graphics.Shader.TileMode.CLAMP);
        }
        if (s == null || s.c != u)
        {
            if (s == null)
            {
                s = new g(this, null);
            }
            if (s.b == null)
            {
                s.b = Bitmap.createBitmap((int)((RectF) (obj)).width(), (int)((RectF) (obj)).height(), android.graphics.Bitmap.Config.ARGB_8888);
            }
            if (s.a == null)
            {
                s.a = new Canvas(s.b);
            }
            int i1 = Color.HSVToColor(new float[] {
                u, 1.0F, 1.0F
            });
            p = new LinearGradient(((RectF) (obj)).left, ((RectF) (obj)).top, ((RectF) (obj)).right, ((RectF) (obj)).top, -1, i1, android.graphics.Shader.TileMode.CLAMP);
            ComposeShader composeshader = new ComposeShader(o, p, android.graphics.PorterDuff.Mode.MULTIPLY);
            h.setShader(composeshader);
            s.a.drawRect(0.0F, 0.0F, s.b.getWidth(), s.b.getHeight(), h);
            s.c = u;
        }
        canvas.drawBitmap(s.b, null, ((RectF) (obj)), null);
        obj = a(v, w);
        i.setColor(0xff000000);
        canvas.drawCircle(((Point) (obj)).x, ((Point) (obj)).y, d - 1.0F * f, i);
        i.setColor(0xffdddddd);
        canvas.drawCircle(((Point) (obj)).x, ((Point) (obj)).y, d, i);
    }

    private void a(AttributeSet attributeset)
    {
        A = false;
        x = "Texto1";
        y = Color.parseColor("#88373636");
        z = Color.parseColor("#88373636");
        f = getContext().getResources().getDisplayMetrics().density;
        d = d * f;
        e = e * f;
        a = a * f;
        b = b * f;
        c = c * f;
        C = b();
        a();
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    private boolean a(MotionEvent motionevent)
    {
        boolean flag = true;
        if (I == null)
        {
            return false;
        }
        int i1 = I.x;
        int j1 = I.y;
        if (F.contains(i1, j1))
        {
            B = 1;
            u = b(motionevent.getY());
        } else
        if (E.contains(i1, j1))
        {
            B = 0;
            motionevent = b(motionevent.getX(), motionevent.getY());
            v = motionevent[0];
            w = motionevent[1];
        } else
        if (G != null && G.contains(i1, j1))
        {
            B = 2;
            t = b((int)motionevent.getX());
        } else
        {
            flag = false;
        }
        return flag;
    }

    private float b(float f1)
    {
        RectF rectf = F;
        float f2 = rectf.height();
        if (f1 < rectf.top)
        {
            f1 = 0.0F;
        } else
        if (f1 > rectf.bottom)
        {
            f1 = f2;
        } else
        {
            f1 -= rectf.top;
        }
        return 360F - (f1 * 360F) / f2;
    }

    private int b()
    {
        return (int)(Math.max(Math.max(d, e), 1.0F * f) * 1.5F);
    }

    private int b(int i1)
    {
        RectF rectf = G;
        int j1 = (int)rectf.width();
        if ((float)i1 < rectf.left)
        {
            i1 = 0;
        } else
        if ((float)i1 > rectf.right)
        {
            i1 = j1;
        } else
        {
            i1 -= (int)rectf.left;
        }
        return 255 - (i1 * 255) / j1;
    }

    private void b(Canvas canvas)
    {
        RectF rectf = F;
        n.setColor(z);
        canvas.drawRect(rectf.left - 1.0F, rectf.top - 1.0F, rectf.right + 1.0F, 1.0F + rectf.bottom, n);
        if (q == null)
        {
            q = new LinearGradient(0.0F, 0.0F, 0.0F, rectf.height(), c(), null, android.graphics.Shader.TileMode.CLAMP);
            j.setShader(q);
        }
        canvas.drawRect(rectf, j);
        float f1 = (4F * f) / 2.0F;
        Point point = a(u);
        RectF rectf1 = new RectF();
        rectf1.left = rectf.left - e;
        rectf1.right = rectf.right + e;
        rectf1.top = (float)point.y - f1;
        rectf1.bottom = f1 + (float)point.y;
        canvas.drawRoundRect(rectf1, 2.0F, 2.0F, k);
    }

    private float[] b(float f1, float f2)
    {
        float f5 = 0.0F;
        RectF rectf = E;
        float f3 = rectf.width();
        float f4 = rectf.height();
        if (f1 < rectf.left)
        {
            f1 = 0.0F;
        } else
        if (f1 > rectf.right)
        {
            f1 = f3;
        } else
        {
            f1 -= rectf.left;
        }
        if (f2 < rectf.top)
        {
            f2 = f5;
        } else
        if (f2 > rectf.bottom)
        {
            f2 = f4;
        } else
        {
            f2 -= rectf.top;
        }
        return (new float[] {
            f1 * (1.0F / f3), 1.0F - f2 * (1.0F / f4)
        });
    }

    private void c(Canvas canvas)
    {
        if (!A || G == null || H == null)
        {
            return;
        }
        RectF rectf = G;
        n.setColor(z);
        canvas.drawRect(rectf.left - 1.0F, rectf.top - 1.0F, rectf.right + 1.0F, 1.0F + rectf.bottom, n);
        H.draw(canvas);
        float af[] = new float[3];
        af[0] = u;
        af[1] = v;
        af[2] = w;
        int i1 = Color.HSVToColor(af);
        int j1 = Color.HSVToColor(0, af);
        r = new LinearGradient(rectf.left, rectf.top, rectf.right, rectf.top, i1, j1, android.graphics.Shader.TileMode.CLAMP);
        l.setShader(r);
        canvas.drawRect(rectf, l);
        if (x != null && !x.equals(""))
        {
            canvas.drawText(x, rectf.centerX(), rectf.centerY() + f * 4F, m);
        }
        float f1 = (f * 4F) / 2.0F;
        Point point = a(t);
        RectF rectf1 = new RectF();
        rectf1.left = (float)point.x - f1;
        rectf1.right = f1 + (float)point.x;
        rectf1.top = rectf.top - e;
        rectf1.bottom = rectf.bottom + e;
        canvas.drawRoundRect(rectf1, 2.0F, 2.0F, k);
    }

    private int[] c()
    {
        int ai[] = new int[361];
        int j1 = ai.length - 1;
        for (int i1 = 0; j1 >= 0; i1++)
        {
            ai[i1] = Color.HSVToColor(new float[] {
                (float)j1, 1.0F, 1.0F
            });
            j1--;
        }

        return ai;
    }

    private void d()
    {
        RectF rectf = D;
        float f3 = rectf.left;
        float f4 = rectf.top;
        float f2 = rectf.bottom - 1.0F;
        float f5 = rectf.right;
        float f6 = c;
        float f7 = a;
        float f1 = f2;
        if (A)
        {
            f1 = f2 - (b + c);
        }
        E = new RectF(f3 + 1.0F, f4 + 1.0F, f5 - 1.0F - f6 - f7, f1);
    }

    private void e()
    {
        RectF rectf = D;
        float f2 = rectf.right;
        float f3 = a;
        float f4 = rectf.top;
        float f5 = rectf.bottom;
        float f1;
        if (A)
        {
            f1 = c + b;
        } else
        {
            f1 = 0.0F;
        }
        F = new RectF((f2 - f3) + 1.0F, f4 + 1.0F, rectf.right - 1.0F, f5 - 1.0F - f1);
    }

    private void f()
    {
        if (!A)
        {
            return;
        } else
        {
            RectF rectf = D;
            float f1 = rectf.left;
            float f2 = rectf.bottom;
            float f3 = b;
            float f4 = rectf.bottom;
            G = new RectF(f1 + 1.0F, (f2 - f3) + 1.0F, rectf.right - 1.0F, f4 - 1.0F);
            H = new a((int)(5F * f));
            H.setBounds(Math.round(G.left), Math.round(G.top), Math.round(G.right), Math.round(G.bottom));
            return;
        }
    }

    private int getPreferredHeight()
    {
        int j1 = (int)(200F * f);
        int i1 = j1;
        if (A)
        {
            i1 = (int)((float)j1 + (c + b));
        }
        return i1;
    }

    private int getPreferredWidth()
    {
        return (int)((float)(int)(200F * f) + a + c);
    }

    public void a(int i1, boolean flag)
    {
        int j1 = Color.alpha(i1);
        int k1 = Color.red(i1);
        int l1 = Color.blue(i1);
        i1 = Color.green(i1);
        float af[] = new float[3];
        Color.RGBToHSV(k1, i1, l1, af);
        t = j1;
        u = af[0];
        v = af[1];
        w = af[2];
        if (flag && g != null)
        {
            g.c(Color.HSVToColor(t, new float[] {
                u, v, w
            }));
        }
        invalidate();
    }

    public String getAlphaSliderText()
    {
        return x;
    }

    public int getBorderColor()
    {
        return z;
    }

    public int getColor()
    {
        return Color.HSVToColor(t, new float[] {
            u, v, w
        });
    }

    public float getDrawingOffset()
    {
        return (float)C;
    }

    public int getSliderTrackerColor()
    {
        return y;
    }

    protected void onDraw(Canvas canvas)
    {
        if (D.width() <= 0.0F || D.height() <= 0.0F)
        {
            return;
        } else
        {
            a(canvas);
            b(canvas);
            c(canvas);
            return;
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        int i2;
        int k2;
        i2 = android.view.View.MeasureSpec.getMode(i1);
        k2 = android.view.View.MeasureSpec.getMode(j1);
        k1 = android.view.View.MeasureSpec.getSize(i1);
        l1 = android.view.View.MeasureSpec.getSize(j1);
        if (i2 != 0x40000000 && k2 != 0x40000000) goto _L2; else goto _L1
_L1:
        if (i2 != 0x40000000 || k2 == 0x40000000) goto _L4; else goto _L3
_L3:
        j1 = (int)((float)k1 - c - a);
        i1 = j1;
        if (A)
        {
            i1 = (int)((float)j1 + (c + b));
        }
        if (i1 > l1)
        {
            j1 = k1;
            i1 = l1;
        } else
        {
            j1 = k1;
        }
_L6:
        setMeasuredDimension(j1, i1);
        return;
_L4:
        i1 = l1;
        j1 = k1;
        if (k2 == 0x40000000)
        {
            i1 = l1;
            j1 = k1;
            if (i2 != 0x40000000)
            {
                j1 = (int)((float)l1 + c + a);
                i1 = j1;
                if (A)
                {
                    i1 = (int)((float)j1 - (c - b));
                }
                j1 = i1;
                if (i1 > k1)
                {
                    j1 = k1;
                }
                i1 = l1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        int l2 = (int)((float)l1 + c + a);
        int j2 = (int)((float)k1 - c - a);
        j1 = j2;
        i1 = l2;
        if (A)
        {
            i1 = (int)((float)l2 - (c + b));
            j1 = (int)((float)j2 + (c + b));
        }
        if (i1 <= k1)
        {
            j1 = i1;
            i1 = l1;
        } else
        if (j1 <= l1)
        {
            i1 = j1;
            j1 = k1;
        } else
        {
            i1 = 0;
            j1 = 0;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        D = new RectF();
        D.left = C + getPaddingLeft();
        D.right = i1 - C - getPaddingRight();
        D.top = C + getPaddingTop();
        D.bottom = j1 - C - getPaddingBottom();
        o = null;
        p = null;
        q = null;
        r = null;
        d();
        e();
        f();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 91
    //                   1 130
    //                   2 121;
           goto _L1 _L2 _L3 _L4
_L3:
        break MISSING_BLOCK_LABEL_130;
_L1:
        boolean flag = false;
_L5:
        if (flag)
        {
            if (g != null)
            {
                g.c(Color.HSVToColor(t, new float[] {
                    u, v, w
                }));
            }
            invalidate();
            return true;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
_L2:
        I = new Point((int)motionevent.getX(), (int)motionevent.getY());
        flag = a(motionevent);
          goto _L5
_L4:
        flag = a(motionevent);
          goto _L5
        I = null;
        flag = a(motionevent);
          goto _L5
    }

    public boolean onTrackballEvent(MotionEvent motionevent)
    {
        float f1;
        float f2;
        float f3;
        float f4;
        f1 = 0.0F;
        f2 = 0.0F;
        f4 = motionevent.getX();
        f3 = motionevent.getY();
        if (motionevent.getAction() != 2) goto _L2; else goto _L1
_L1:
        B;
        JVM INSTR tableswitch 0 2: default 56
    //                   0 117
    //                   1 202
    //                   2 243;
           goto _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_243;
_L2:
        int i1 = 0;
_L6:
        if (i1 != 0)
        {
            if (g != null)
            {
                g.c(Color.HSVToColor(t, new float[] {
                    u, v, w
                }));
            }
            invalidate();
            return true;
        } else
        {
            return super.onTrackballEvent(motionevent);
        }
_L3:
        f4 = v + f4 / 50F;
        f3 = w - f3 / 50F;
        if (f4 < 0.0F)
        {
            f1 = 0.0F;
        } else
        {
            f1 = f4;
            if (f4 > 1.0F)
            {
                f1 = 1.0F;
            }
        }
        if (f3 >= 0.0F)
        {
            if (f3 > 1.0F)
            {
                f2 = 1.0F;
            } else
            {
                f2 = f3;
            }
        }
        v = f1;
        w = f2;
        i1 = 1;
          goto _L6
_L4:
        f2 = u - f3 * 10F;
        if (f2 >= 0.0F)
        {
            if (f2 > 360F)
            {
                f1 = 360F;
            } else
            {
                f1 = f2;
            }
        }
        u = f1;
        i1 = 1;
          goto _L6
        if (!A || G == null)
        {
            i1 = 0;
        } else
        {
            int j1 = (int)((float)t - f4 * 10F);
            if (j1 < 0)
            {
                i1 = 0;
            } else
            {
                i1 = j1;
                if (j1 > 255)
                {
                    i1 = 255;
                }
            }
            t = i1;
            i1 = 1;
        }
          goto _L6
    }

    public void setAlphaSliderText(int i1)
    {
        setAlphaSliderText(getContext().getString(i1));
    }

    public void setAlphaSliderText(String s1)
    {
        x = s1;
        invalidate();
    }

    public void setAlphaSliderVisible(boolean flag)
    {
        if (A != flag)
        {
            A = flag;
            o = null;
            p = null;
            q = null;
            r = null;
            requestLayout();
        }
    }

    public void setBorderColor(int i1)
    {
        z = i1;
        invalidate();
    }

    public void setColor(int i1)
    {
        a(i1, false);
    }

    public void setOnColorChangedListener(h h1)
    {
        g = h1;
    }

    public void setSliderTrackerColor(int i1)
    {
        y = i1;
        k.setColor(y);
        invalidate();
    }

}
