// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.a.a;
import android.support.v4.view.ap;
import android.support.v4.view.bb;
import android.support.v4.view.q;
import android.support.v4.view.v;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v4.widget:
//            m, n, p, au, 
//            o, r, l, k

public class DrawerLayout extends ViewGroup
{

    static final l a;
    private static final int b[] = {
        0x10100b3
    };
    private static final boolean c;
    private boolean A;
    private final k d;
    private int e;
    private int f;
    private float g;
    private Paint h;
    private final au i;
    private final au j;
    private final r k;
    private final r l;
    private int m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private o t;
    private float u;
    private float v;
    private Drawable w;
    private Drawable x;
    private Drawable y;
    private Object z;

    private void a(View view, boolean flag)
    {
        int j1 = getChildCount();
        int i1 = 0;
        while (i1 < j1) 
        {
            View view1 = getChildAt(i1);
            if (!flag && !g(view1) || flag && view1 == view)
            {
                bb.b(view1, 1);
            } else
            {
                bb.b(view1, 4);
            }
            i1++;
        }
    }

    static String b(int i1)
    {
        if ((i1 & 3) == 3)
        {
            return "LEFT";
        }
        if ((i1 & 5) == 5)
        {
            return "RIGHT";
        } else
        {
            return Integer.toHexString(i1);
        }
    }

    static int[] c()
    {
        return b;
    }

    private boolean d()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((p)getChildAt(i1).getLayoutParams()).c)
            {
                return true;
            }
        }

        return false;
    }

    private boolean e()
    {
        return f() != null;
    }

    private View f()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (g(view) && j(view))
            {
                return view;
            }
        }

        return null;
    }

    static boolean k(View view)
    {
        return m(view);
    }

    private static boolean l(View view)
    {
        boolean flag1 = false;
        view = view.getBackground();
        boolean flag = flag1;
        if (view != null)
        {
            flag = flag1;
            if (view.getOpacity() == -1)
            {
                flag = true;
            }
        }
        return flag;
    }

    private static boolean m(View view)
    {
        return bb.c(view) != 4 && bb.c(view) != 2;
    }

    public int a(View view)
    {
        int i1 = e(view);
        if (i1 == 3)
        {
            return p;
        }
        if (i1 == 5)
        {
            return q;
        } else
        {
            return 0;
        }
    }

    View a()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (((p)view.getLayoutParams()).d)
            {
                return view;
            }
        }

        return null;
    }

    View a(int i1)
    {
        int j1 = android.support.v4.view.q.a(i1, bb.e(this));
        int k1 = getChildCount();
        for (i1 = 0; i1 < k1; i1++)
        {
            View view = getChildAt(i1);
            if ((e(view) & 7) == (j1 & 7))
            {
                return view;
            }
        }

        return null;
    }

    public void a(int i1, int j1)
    {
        j1 = android.support.v4.view.q.a(j1, bb.e(this));
        if (j1 == 3)
        {
            p = i1;
        } else
        if (j1 == 5)
        {
            q = i1;
        }
        if (i1 != 0)
        {
            au au1;
            if (j1 == 3)
            {
                au1 = i;
            } else
            {
                au1 = j;
            }
            au1.e();
        }
        i1;
        JVM INSTR tableswitch 1 2: default 60
    //                   1 98
    //                   2 82;
           goto _L1 _L2 _L3
_L1:
        View view;
        return;
_L3:
        if ((view = a(j1)) != null)
        {
            h(view);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ((view = a(j1)) != null)
        {
            i(view);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    void a(int i1, int j1, View view)
    {
        p p1;
        boolean flag = true;
        int k1 = i.a();
        int l1 = j.a();
        i1 = ((flag) ? 1 : 0);
        if (k1 != 1)
        {
            if (l1 == 1)
            {
                i1 = ((flag) ? 1 : 0);
            } else
            if (k1 == 2 || l1 == 2)
            {
                i1 = 2;
            } else
            {
                i1 = 0;
            }
        }
        if (view == null || j1 != 0) goto _L2; else goto _L1
_L1:
        p1 = (p)view.getLayoutParams();
        if (p1.b != 0.0F) goto _L4; else goto _L3
_L3:
        b(view);
_L2:
        if (i1 != m)
        {
            m = i1;
            if (t != null)
            {
                t.a(i1);
            }
        }
        return;
_L4:
        if (p1.b == 1.0F)
        {
            c(view);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    void a(View view, float f1)
    {
        if (t != null)
        {
            t.a(view, f1);
        }
    }

    void a(boolean flag)
    {
        int k1 = getChildCount();
        int i1 = 0;
        boolean flag1 = false;
        while (i1 < k1) 
        {
            View view = getChildAt(i1);
            p p1 = (p)view.getLayoutParams();
            int j1 = ((flag1) ? 1 : 0);
            if (g(view))
            {
                if (flag && !p1.c)
                {
                    j1 = ((flag1) ? 1 : 0);
                } else
                {
                    j1 = view.getWidth();
                    if (a(view, 3))
                    {
                        flag1 |= i.a(view, -j1, view.getTop());
                    } else
                    {
                        flag1 |= j.a(view, getWidth(), view.getTop());
                    }
                    p1.c = false;
                    j1 = ((flag1) ? 1 : 0);
                }
            }
            i1++;
            flag1 = j1;
        }
        k.a();
        l.a();
        if (flag1)
        {
            invalidate();
        }
    }

    boolean a(View view, int i1)
    {
        return (e(view) & i1) == i1;
    }

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, i1, layoutparams);
        if (a() != null || g(view))
        {
            bb.b(view, 4);
        } else
        {
            bb.b(view, 1);
        }
        if (!c)
        {
            bb.a(view, d);
        }
    }

    public void b()
    {
        a(false);
    }

    void b(View view)
    {
        p p1 = (p)view.getLayoutParams();
        if (p1.d)
        {
            p1.d = false;
            if (t != null)
            {
                t.b(view);
            }
            a(view, false);
            if (hasWindowFocus())
            {
                view = getRootView();
                if (view != null)
                {
                    view.sendAccessibilityEvent(32);
                }
            }
        }
    }

    void b(View view, float f1)
    {
        p p1 = (p)view.getLayoutParams();
        if (f1 == p1.b)
        {
            return;
        } else
        {
            p1.b = f1;
            a(view, f1);
            return;
        }
    }

    void c(View view)
    {
        p p1 = (p)view.getLayoutParams();
        if (!p1.d)
        {
            p1.d = true;
            if (t != null)
            {
                t.a(view);
            }
            a(view, true);
            view.requestFocus();
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof p) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
        int j1 = getChildCount();
        float f1 = 0.0F;
        for (int i1 = 0; i1 < j1; i1++)
        {
            f1 = Math.max(f1, ((p)getChildAt(i1).getLayoutParams()).b);
        }

        g = f1;
        if (i.a(true) | j.a(true))
        {
            bb.b(this);
        }
    }

    float d(View view)
    {
        return ((p)view.getLayoutParams()).b;
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        int i1;
        int j1;
        int k1;
        int i2;
        int i3;
        int j3;
        int k3;
        boolean flag1;
        i3 = getHeight();
        flag1 = f(view);
        k1 = 0;
        boolean flag = false;
        i1 = getWidth();
        j3 = canvas.save();
        j1 = i1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        k3 = getChildCount();
        i2 = 0;
        k1 = ((flag) ? 1 : 0);
_L2:
        if (i2 >= k3)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        View view1 = getChildAt(i2);
        if (view1 == view || view1.getVisibility() != 0 || !l(view1) || !g(view1))
        {
            break; /* Loop/switch isn't completed */
        }
        int k2;
        if (view1.getHeight() < i3)
        {
            k2 = k1;
            j1 = i1;
        } else
        {
label0:
            {
                if (!a(view1, 3))
                {
                    break label0;
                }
                j1 = view1.getRight();
                float f1;
                int j2;
                int l2;
                boolean flag2;
                if (j1 <= k1)
                {
                    j1 = k1;
                }
                k2 = j1;
                j1 = i1;
            }
        }
_L3:
        i2++;
        i1 = j1;
        k1 = k2;
        if (true) goto _L2; else goto _L1
        l2 = view1.getLeft();
        j1 = l2;
        k2 = k1;
        if (l2 < i1) goto _L3; else goto _L1
_L1:
        j1 = i1;
        k2 = k1;
          goto _L3
        canvas.clipRect(k1, 0, i1, getHeight());
        j1 = i1;
        flag2 = super.drawChild(canvas, view, l1);
        canvas.restoreToCount(j3);
        if (g > 0.0F && flag1)
        {
            i1 = (int)((float)((f & 0xff000000) >>> 24) * g);
            j2 = f;
            h.setColor(i1 << 24 | j2 & 0xffffff);
            canvas.drawRect(k1, 0.0F, j1, getHeight(), h);
        } else
        {
            if (w != null && a(view, 3))
            {
                i1 = w.getIntrinsicWidth();
                j1 = view.getRight();
                k1 = i.b();
                f1 = Math.max(0.0F, Math.min((float)j1 / (float)k1, 1.0F));
                w.setBounds(j1, view.getTop(), i1 + j1, view.getBottom());
                w.setAlpha((int)(255F * f1));
                w.draw(canvas);
                return flag2;
            }
            if (x != null && a(view, 5))
            {
                i1 = x.getIntrinsicWidth();
                j1 = view.getLeft();
                k1 = getWidth();
                j2 = j.b();
                f1 = Math.max(0.0F, Math.min((float)(k1 - j1) / (float)j2, 1.0F));
                x.setBounds(j1 - i1, view.getTop(), j1, view.getBottom());
                x.setAlpha((int)(255F * f1));
                x.draw(canvas);
                return flag2;
            }
        }
        return flag2;
    }

    int e(View view)
    {
        return android.support.v4.view.q.a(((p)view.getLayoutParams()).a, bb.e(this));
    }

    boolean f(View view)
    {
        return ((p)view.getLayoutParams()).a == 0;
    }

    boolean g(View view)
    {
        return (android.support.v4.view.q.a(((p)view.getLayoutParams()).a, bb.e(view)) & 7) != 0;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new p(-1, -1);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new p(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof p)
        {
            return new p((p)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new p((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new p(layoutparams);
        }
    }

    public void h(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a sliding drawer").toString());
        }
        if (o)
        {
            p p1 = (p)view.getLayoutParams();
            p1.b = 1.0F;
            p1.d = true;
            a(view, true);
        } else
        if (a(view, 3))
        {
            i.a(view, 0, view.getTop());
        } else
        {
            j.a(view, getWidth() - view.getWidth(), view.getTop());
        }
        invalidate();
    }

    public void i(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a sliding drawer").toString());
        }
        if (o)
        {
            view = (p)view.getLayoutParams();
            view.b = 0.0F;
            view.d = false;
        } else
        if (a(view, 3))
        {
            i.a(view, -view.getWidth(), view.getTop());
        } else
        {
            j.a(view, getWidth(), view.getTop());
        }
        invalidate();
    }

    public boolean j(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a drawer").toString());
        }
        return ((p)view.getLayoutParams()).b > 0.0F;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        o = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        o = true;
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (A && y != null)
        {
            int i1 = a.a(z);
            if (i1 > 0)
            {
                y.setBounds(0, 0, getWidth(), i1);
                y.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag1 = false;
        i1 = ap.a(motionevent);
        flag2 = i.a(motionevent);
        flag3 = j.a(motionevent);
        i1;
        JVM INSTR tableswitch 0 3: default 60
    //                   0 96
    //                   1 196
    //                   2 165
    //                   3 196;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        boolean flag = false;
_L8:
        if (flag2 | flag3 || flag || d() || s)
        {
            flag1 = true;
        }
        return flag1;
_L2:
        float f1;
        float f2;
        f1 = motionevent.getX();
        f2 = motionevent.getY();
        u = f1;
        v = f2;
        if (g <= 0.0F) goto _L6; else goto _L5
_L5:
        motionevent = i.d((int)f1, (int)f2);
        if (motionevent == null || !f(motionevent)) goto _L6; else goto _L7
_L7:
        flag = true;
_L10:
        r = false;
        s = false;
          goto _L8
_L4:
        if (!i.d(3)) goto _L1; else goto _L9
_L9:
        k.a();
        l.a();
        flag = false;
          goto _L8
_L3:
        a(true);
        r = false;
        s = false;
          goto _L1
_L6:
        flag = false;
          goto _L10
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4 && e())
        {
            android.support.v4.view.v.b(keyevent);
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            keyevent = f();
            if (keyevent != null && a(keyevent) == 0)
            {
                b();
            }
            return keyevent != null;
        } else
        {
            return super.onKeyUp(i1, keyevent);
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int k2;
        int l2;
        n = true;
        k2 = k1 - i1;
        l2 = getChildCount();
        k1 = 0;
_L2:
        View view;
        if (k1 >= l2)
        {
            break MISSING_BLOCK_LABEL_450;
        }
        view = getChildAt(k1);
        if (view.getVisibility() != 8)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        k1++;
        if (true) goto _L2; else goto _L1
_L1:
        p p1;
label0:
        {
            p1 = (p)view.getLayoutParams();
            if (!f(view))
            {
                break label0;
            }
            view.layout(p1.leftMargin, p1.topMargin, p1.leftMargin + view.getMeasuredWidth(), p1.topMargin + view.getMeasuredHeight());
        }
          goto _L3
        int i2;
        int i3;
        int j3;
        i3 = view.getMeasuredWidth();
        j3 = view.getMeasuredHeight();
        float f1;
        boolean flag1;
        if (a(view, 3))
        {
            i1 = -i3;
            i2 = (int)((float)i3 * p1.b) + i1;
            f1 = (float)(i3 + i2) / (float)i3;
        } else
        {
            i2 = k2 - (int)((float)i3 * p1.b);
            f1 = (float)(k2 - i2) / (float)i3;
        }
        if (f1 != p1.b)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p1.a & 0x70;
        JVM INSTR lookupswitch 2: default 216
    //                   16: 360
    //                   80: 320;
           goto _L4 _L5 _L6
_L5:
        break MISSING_BLOCK_LABEL_360;
_L4:
        view.layout(i2, p1.topMargin, i3 + i2, j3 + p1.topMargin);
_L7:
        if (flag1)
        {
            b(view, f1);
        }
        int j2;
        int k3;
        if (p1.b > 0.0F)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        if (view.getVisibility() != i1)
        {
            view.setVisibility(i1);
        }
          goto _L3
_L6:
        i1 = l1 - j1;
        view.layout(i2, i1 - p1.bottomMargin - view.getMeasuredHeight(), i3 + i2, i1 - p1.bottomMargin);
          goto _L7
        k3 = l1 - j1;
        j2 = (k3 - j3) / 2;
        if (j2 < p1.topMargin)
        {
            i1 = p1.topMargin;
        } else
        {
            i1 = j2;
            if (j2 + j3 > k3 - p1.bottomMargin)
            {
                i1 = k3 - p1.bottomMargin - j3;
            }
        }
        view.layout(i2, i1, i3 + i2, j3 + i1);
          goto _L7
        n = false;
        o = false;
        return;
          goto _L3
    }

    protected void onMeasure(int i1, int j1)
    {
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        i2 = 300;
        l2 = android.view.View.MeasureSpec.getMode(i1);
        k2 = android.view.View.MeasureSpec.getMode(j1);
        l1 = android.view.View.MeasureSpec.getSize(i1);
        j2 = android.view.View.MeasureSpec.getSize(j1);
        if (l2 != 0x40000000) goto _L2; else goto _L1
_L1:
        int k1 = l1;
        if (k2 == 0x40000000) goto _L3; else goto _L2
_L2:
        if (!isInEditMode()) goto _L5; else goto _L4
_L4:
        if (l2 != 0x80000000) goto _L7; else goto _L6
_L6:
        k1 = l1;
_L11:
        if (k2 == 0x80000000)
        {
            l1 = j2;
            i2 = k1;
            break MISSING_BLOCK_LABEL_84;
        }
        l1 = i2;
        i2 = k1;
          goto _L8
_L7:
        k1 = l1;
        if (l2 == 0)
        {
            k1 = 300;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (k2 == 0) goto _L9; else goto _L3
_L3:
        l1 = j2;
        i2 = k1;
          goto _L9
_L5:
        throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
_L9:
        setMeasuredDimension(i2, l1);
        if (z != null && bb.m(this))
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        k2 = bb.e(this);
        l2 = getChildCount();
        j2 = 0;
        while (j2 < l2) 
        {
            View view = getChildAt(j2);
            if (view.getVisibility() != 8)
            {
                p p1 = (p)view.getLayoutParams();
                if (k1 != 0)
                {
                    int i3 = android.support.v4.view.q.a(p1.a, k2);
                    if (bb.m(view))
                    {
                        a.a(view, z, i3);
                    } else
                    {
                        a.a(p1, z, i3);
                    }
                }
                if (f(view))
                {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i2 - p1.leftMargin - p1.rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l1 - p1.topMargin - p1.bottomMargin, 0x40000000));
                } else
                if (g(view))
                {
                    int j3 = e(view) & 7;
                    if ((0 & j3) != 0)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Child drawer has absolute gravity ").append(b(j3)).append(" but this ").append("DrawerLayout").append(" already has a ").append("drawer view along that edge").toString());
                    }
                    view.measure(getChildMeasureSpec(i1, e + p1.leftMargin + p1.rightMargin, p1.width), getChildMeasureSpec(j1, p1.topMargin + p1.bottomMargin, p1.height));
                } else
                {
                    throw new IllegalStateException((new StringBuilder()).append("Child ").append(view).append(" at index ").append(j2).append(" does not have a valid layout_gravity - must be Gravity.LEFT, ").append("Gravity.RIGHT or Gravity.NO_GRAVITY").toString());
                }
            }
            j2++;
        }
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).a != 0)
        {
            View view = a(((SavedState) (parcelable)).a);
            if (view != null)
            {
                h(view);
            }
        }
        a(((SavedState) (parcelable)).b, 3);
        a(((SavedState) (parcelable)).c, 5);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        View view = a();
        if (view != null)
        {
            savedstate.a = ((p)view.getLayoutParams()).a;
        }
        savedstate.b = p;
        savedstate.c = q;
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        i.b(motionevent);
        j.b(motionevent);
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 3: default 56
    //                   0 58
    //                   1 90
    //                   2 56
    //                   3 204;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return true;
_L2:
        float f1 = motionevent.getX();
        float f3 = motionevent.getY();
        u = f1;
        v = f3;
        r = false;
        s = false;
        return true;
_L3:
        float f2;
        float f4;
        f4 = motionevent.getX();
        f2 = motionevent.getY();
        motionevent = i.d((int)f4, (int)f2);
        if (motionevent == null || !f(motionevent)) goto _L6; else goto _L5
_L5:
        int i1;
        f4 -= u;
        f2 -= v;
        i1 = i.d();
        if (f4 * f4 + f2 * f2 >= (float)(i1 * i1)) goto _L6; else goto _L7
_L7:
        motionevent = a();
        if (motionevent == null) goto _L6; else goto _L8
_L8:
        boolean flag;
        if (a(motionevent) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L10:
        a(flag);
        r = false;
        return true;
_L4:
        a(true);
        r = false;
        s = false;
        return true;
_L6:
        flag = true;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        super.requestDisallowInterceptTouchEvent(flag);
        r = flag;
        if (flag)
        {
            a(true);
        }
    }

    public void requestLayout()
    {
        if (!n)
        {
            super.requestLayout();
        }
    }

    public void setDrawerListener(o o1)
    {
        t = o1;
    }

    public void setDrawerLockMode(int i1)
    {
        a(i1, 3);
        a(i1, 5);
    }

    public void setScrimColor(int i1)
    {
        f = i1;
        invalidate();
    }

    public void setStatusBarBackground(int i1)
    {
        Drawable drawable;
        if (i1 != 0)
        {
            drawable = android.support.v4.a.a.a(getContext(), i1);
        } else
        {
            drawable = null;
        }
        y = drawable;
    }

    public void setStatusBarBackground(Drawable drawable)
    {
        y = drawable;
    }

    public void setStatusBarBackgroundColor(int i1)
    {
        y = new ColorDrawable(i1);
    }

    static 
    {
        boolean flag = true;
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            flag = false;
        }
        c = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new m();
        } else
        {
            a = new n();
        }
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.support.v4.widget.q();
        int a;
        int b;
        int c;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(a);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            a = 0;
            b = 0;
            c = 0;
            a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
            a = 0;
            b = 0;
            c = 0;
        }
    }

}
