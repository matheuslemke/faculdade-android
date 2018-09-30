// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            bf, bq

class bg extends bf
{

    bg()
    {
    }

    public int a(int j, int k, int l)
    {
        return bq.a(j, k, l);
    }

    long a()
    {
        return bq.a();
    }

    public void a(View view, int j, Paint paint)
    {
        bq.a(view, j, paint);
    }

    public void a(View view, Paint paint)
    {
        a(view, e(view), paint);
        view.invalidate();
    }

    public void b(View view, float f)
    {
        bq.a(view, f);
    }

    public void c(View view, float f)
    {
        bq.b(view, f);
    }

    public void d(View view, float f)
    {
        bq.c(view, f);
    }

    public int e(View view)
    {
        return bq.a(view);
    }

    public void e(View view, float f)
    {
        bq.d(view, f);
    }

    public int h(View view)
    {
        return bq.b(view);
    }

    public float i(View view)
    {
        return bq.c(view);
    }

    public void n(View view)
    {
        bq.d(view);
    }
}
