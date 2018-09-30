// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.util.Log;
import com.b.b.a;
import com.b.b.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.b.a:
//            y, d

class aa extends y
{

    d h;
    float i;
    private a j;

    public transient aa(c c1, float af[])
    {
        super(c1, null);
        a(af);
        if (c1 instanceof a)
        {
            j = (a)b;
        }
    }

    public transient aa(String s, float af[])
    {
        super(s, null);
        a(af);
    }

    public y a()
    {
        return e();
    }

    void a(float f)
    {
        i = h.b(f);
    }

    void a(Class class1)
    {
        if (b != null)
        {
            return;
        } else
        {
            super.a(class1);
            return;
        }
    }

    public transient void a(float af[])
    {
        super.a(af);
        h = (d)e;
    }

    void b(Object obj)
    {
        if (j != null)
        {
            j.a(obj, i);
        } else
        {
            if (b != null)
            {
                b.a(obj, Float.valueOf(i));
                return;
            }
            if (c != null)
            {
                try
                {
                    g[0] = Float.valueOf(i);
                    c.invoke(obj, g);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.e("PropertyValuesHolder", ((InvocationTargetException) (obj)).toString());
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.e("PropertyValuesHolder", ((IllegalAccessException) (obj)).toString());
                }
                return;
            }
        }
    }

    public Object clone()
    {
        return e();
    }

    Object d()
    {
        return Float.valueOf(i);
    }

    public aa e()
    {
        aa aa1 = (aa)super.a();
        aa1.h = (d)aa1.e;
        return aa1;
    }
}
