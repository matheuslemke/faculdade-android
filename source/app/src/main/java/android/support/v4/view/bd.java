// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.WeakHashMap;

// Referenced classes of package android.support.v4.view:
//            bl, cp, a, au

class bd
    implements bl
{

    WeakHashMap a;

    bd()
    {
        a = null;
    }

    public int a(int i1, int j1, int k1)
    {
        return View.resolveSize(i1, j1);
    }

    long a()
    {
        return 10L;
    }

    public void a(View view)
    {
    }

    public void a(View view, float f1)
    {
    }

    public void a(View view, int i1, int j1, int k1, int l1)
    {
        view.invalidate(i1, j1, k1, l1);
    }

    public void a(View view, int i1, Paint paint)
    {
    }

    public void a(View view, Paint paint)
    {
    }

    public void a(View view, a a1)
    {
    }

    public void a(View view, au au)
    {
    }

    public void a(View view, Runnable runnable)
    {
        view.postDelayed(runnable, a());
    }

    public void a(View view, Runnable runnable, long l1)
    {
        view.postDelayed(runnable, a() + l1);
    }

    public boolean a(View view, int i1)
    {
        return false;
    }

    public int b(View view)
    {
        return 2;
    }

    public void b(View view, float f1)
    {
    }

    public void b(View view, int i1)
    {
    }

    public void c(View view)
    {
        view.invalidate();
    }

    public void c(View view, float f1)
    {
    }

    public int d(View view)
    {
        return 0;
    }

    public void d(View view, float f1)
    {
    }

    public int e(View view)
    {
        return 0;
    }

    public void e(View view, float f1)
    {
    }

    public int f(View view)
    {
        return 0;
    }

    public boolean g(View view)
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

    public int h(View view)
    {
        return 0;
    }

    public float i(View view)
    {
        return 0.0F;
    }

    public int j(View view)
    {
        return 0;
    }

    public cp k(View view)
    {
        return new cp(view);
    }

    public int l(View view)
    {
        return 0;
    }

    public boolean m(View view)
    {
        return false;
    }

    public void n(View view)
    {
    }
}
