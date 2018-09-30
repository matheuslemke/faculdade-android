// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.graphics.drawable.Drawable;
import android.support.v7.app.d;
import android.support.v7.app.e;
import android.support.v7.internal.widget.af;
import android.view.View;

// Referenced classes of package android.support.v7.internal.a:
//            b

public class g extends d
{

    final b a;
    private e b;
    private Drawable c;
    private CharSequence d;
    private CharSequence e;
    private int f;
    private View g;

    public g(b b1)
    {
        a = b1;
        super();
        f = -1;
    }

    public int a()
    {
        return f;
    }

    public d a(e e1)
    {
        b = e1;
        return this;
    }

    public d a(CharSequence charsequence)
    {
        d = charsequence;
        if (f >= 0)
        {
            android.support.v7.internal.a.b.l(a).b(f);
        }
        return this;
    }

    public void a(int i)
    {
        f = i;
    }

    public Drawable b()
    {
        return c;
    }

    public CharSequence c()
    {
        return d;
    }

    public View d()
    {
        return g;
    }

    public void e()
    {
        a.a(this);
    }

    public CharSequence f()
    {
        return e;
    }

    public e g()
    {
        return b;
    }
}
