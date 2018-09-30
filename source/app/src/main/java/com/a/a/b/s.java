// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import com.a.a.a.c;
import com.a.a.a.d;
import com.a.a.ae;
import com.a.a.af;
import com.a.a.b;
import com.a.a.c.a;
import com.a.a.j;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.a.a.b:
//            t

public final class s
    implements af, Cloneable
{

    public static final s a = new s();
    private double b;
    private int c;
    private boolean d;
    private boolean e;
    private List f;
    private List g;

    public s()
    {
        b = -1D;
        c = 136;
        d = true;
        f = Collections.emptyList();
        g = Collections.emptyList();
    }

    private boolean a(c c1)
    {
        return c1 == null || c1.a() <= b;
    }

    private boolean a(c c1, d d1)
    {
        return a(c1) && a(d1);
    }

    private boolean a(d d1)
    {
        return d1 == null || d1.a() > b;
    }

    private boolean a(Class class1)
    {
        return !java/lang/Enum.isAssignableFrom(class1) && (class1.isAnonymousClass() || class1.isLocalClass());
    }

    private boolean b(Class class1)
    {
        return class1.isMemberClass() && !c(class1);
    }

    private boolean c(Class class1)
    {
        return (class1.getModifiers() & 8) != 0;
    }

    public ae a(j j, a a1)
    {
        Class class1 = a1.a();
        boolean flag = a(class1, true);
        boolean flag1 = a(class1, false);
        if (!flag && !flag1)
        {
            return null;
        } else
        {
            return new t(this, flag1, flag, j, a1);
        }
    }

    protected s a()
    {
        s s1;
        try
        {
            s1 = (s)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new AssertionError();
        }
        return s1;
    }

    public boolean a(Class class1, boolean flag)
    {
        if (b != -1D && !a((c)class1.getAnnotation(com/a/a/a/c), (d)class1.getAnnotation(com/a/a/a/d)))
        {
            return true;
        }
        if (!d && b(class1))
        {
            return true;
        }
        if (a(class1))
        {
            return true;
        }
        Object obj;
        if (flag)
        {
            obj = f;
        } else
        {
            obj = g;
        }
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            if (((com.a.a.a)((Iterator) (obj)).next()).a(class1))
            {
                return true;
            }
        }

        return false;
    }

    public boolean a(Field field, boolean flag)
    {
label0:
        {
            if ((c & field.getModifiers()) != 0)
            {
                return true;
            }
            if (b != -1D && !a((c)field.getAnnotation(com/a/a/a/c), (d)field.getAnnotation(com/a/a/a/d)))
            {
                return true;
            }
            if (field.isSynthetic())
            {
                return true;
            }
            if (e)
            {
                com.a.a.a.a a1 = (com.a.a.a.a)field.getAnnotation(com/a/a/a/a);
                if (a1 == null || (flag ? !a1.a() : !a1.b()))
                {
                    return true;
                }
            }
            if (!d && b(field.getType()))
            {
                return true;
            }
            if (a(field.getType()))
            {
                return true;
            }
            Object obj;
            if (flag)
            {
                obj = f;
            } else
            {
                obj = g;
            }
            if (((List) (obj)).isEmpty())
            {
                break label0;
            }
            field = new b(field);
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
            } while (!((com.a.a.a)((Iterator) (obj)).next()).a(field));
            return true;
        }
        return false;
    }

    protected Object clone()
    {
        return a();
    }

}
