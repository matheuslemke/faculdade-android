// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            t, q, ao, s

class r
    implements t
{

    final RectF a = new RectF();

    r()
    {
    }

    private ao i(q q1)
    {
        return (ao)q1.getBackground();
    }

    public float a(q q1)
    {
        return i(q1).c();
    }

    ao a(Context context, int j, float f1, float f2, float f3)
    {
        return new ao(context.getResources(), j, f1, f2, f3);
    }

    public void a()
    {
        ao.c = new s(this);
    }

    public void a(q q1, float f1)
    {
        i(q1).a(f1);
        f(q1);
    }

    public void a(q q1, int j)
    {
        i(q1).a(j);
    }

    public void a(q q1, Context context, int j, float f1, float f2, float f3)
    {
        context = a(context, j, f1, f2, f3);
        context.a(q1.getPreventCornerOverlap());
        q1.setBackgroundDrawable(context);
        f(q1);
    }

    public float b(q q1)
    {
        return i(q1).d();
    }

    public void b(q q1, float f1)
    {
        i(q1).c(f1);
        f(q1);
    }

    public float c(q q1)
    {
        return i(q1).e();
    }

    public void c(q q1, float f1)
    {
        i(q1).b(f1);
    }

    public float d(q q1)
    {
        return i(q1).a();
    }

    public float e(q q1)
    {
        return i(q1).b();
    }

    public void f(q q1)
    {
        Rect rect = new Rect();
        i(q1).a(rect);
        ((View)q1).setMinimumHeight((int)Math.ceil(c(q1)));
        ((View)q1).setMinimumWidth((int)Math.ceil(b(q1)));
        q1.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void g(q q1)
    {
    }

    public void h(q q1)
    {
        i(q1).a(q1.getPreventCornerOverlap());
        f(q1);
    }
}
