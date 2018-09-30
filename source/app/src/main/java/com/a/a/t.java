// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import com.a.a.b.ag;
import com.a.a.d.d;
import java.io.IOException;
import java.io.StringWriter;

// Referenced classes of package com.a.a:
//            r, w, y, v

public abstract class t
{

    public t()
    {
    }

    public Number a()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String b()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double c()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public long d()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int e()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean f()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean g()
    {
        return this instanceof r;
    }

    public boolean h()
    {
        return this instanceof w;
    }

    public boolean i()
    {
        return this instanceof y;
    }

    public boolean j()
    {
        return this instanceof v;
    }

    public w k()
    {
        if (h())
        {
            return (w)this;
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Not a JSON Object: ").append(this).toString());
        }
    }

    public r l()
    {
        if (g())
        {
            return (r)this;
        } else
        {
            throw new IllegalStateException("This is not a JSON Array.");
        }
    }

    public y m()
    {
        if (i())
        {
            return (y)this;
        } else
        {
            throw new IllegalStateException("This is not a JSON Primitive.");
        }
    }

    Boolean n()
    {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString()
    {
        Object obj;
        try
        {
            obj = new StringWriter();
            d d1 = new d(((java.io.Writer) (obj)));
            d1.b(true);
            ag.a(this, d1);
            obj = ((StringWriter) (obj)).toString();
        }
        catch (IOException ioexception)
        {
            throw new AssertionError(ioexception);
        }
        return ((String) (obj));
    }
}
