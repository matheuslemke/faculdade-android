// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.d.d;
import com.a.a.r;
import com.a.a.t;
import com.a.a.v;
import com.a.a.w;
import com.a.a.y;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.a.a.b.a:
//            j

public final class i extends d
{

    private static final Writer a = new j();
    private static final y b = new y("closed");
    private final List c = new ArrayList();
    private String d;
    private t e;

    public i()
    {
        super(a);
        e = v.a;
    }

    private void a(t t1)
    {
        if (d != null)
        {
            if (!t1.j() || i())
            {
                ((w)j()).a(d, t1);
            }
            d = null;
            return;
        }
        if (c.isEmpty())
        {
            e = t1;
            return;
        }
        t t2 = j();
        if (t2 instanceof r)
        {
            ((r)t2).a(t1);
            return;
        } else
        {
            throw new IllegalStateException();
        }
    }

    private t j()
    {
        return (t)c.get(c.size() - 1);
    }

    public d a(long l)
    {
        a(((t) (new y(Long.valueOf(l)))));
        return this;
    }

    public d a(Number number)
    {
        if (number == null)
        {
            return f();
        }
        if (!g())
        {
            double d1 = number.doubleValue();
            if (Double.isNaN(d1) || Double.isInfinite(d1))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("JSON forbids NaN and infinities: ").append(number).toString());
            }
        }
        a(((t) (new y(number))));
        return this;
    }

    public d a(String s)
    {
        if (c.isEmpty() || d != null)
        {
            throw new IllegalStateException();
        }
        if (j() instanceof w)
        {
            d = s;
            return this;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public d a(boolean flag)
    {
        a(((t) (new y(Boolean.valueOf(flag)))));
        return this;
    }

    public t a()
    {
        if (!c.isEmpty())
        {
            throw new IllegalStateException((new StringBuilder()).append("Expected one JSON element but was ").append(c).toString());
        } else
        {
            return e;
        }
    }

    public d b()
    {
        r r1 = new r();
        a(r1);
        c.add(r1);
        return this;
    }

    public d b(String s)
    {
        if (s == null)
        {
            return f();
        } else
        {
            a(new y(s));
            return this;
        }
    }

    public d c()
    {
        if (c.isEmpty() || d != null)
        {
            throw new IllegalStateException();
        }
        if (j() instanceof r)
        {
            c.remove(c.size() - 1);
            return this;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public void close()
    {
        if (!c.isEmpty())
        {
            throw new IOException("Incomplete document");
        } else
        {
            c.add(b);
            return;
        }
    }

    public d d()
    {
        w w1 = new w();
        a(w1);
        c.add(w1);
        return this;
    }

    public d e()
    {
        if (c.isEmpty() || d != null)
        {
            throw new IllegalStateException();
        }
        if (j() instanceof w)
        {
            c.remove(c.size() - 1);
            return this;
        } else
        {
            throw new IllegalStateException();
        }
    }

    public d f()
    {
        a(v.a);
        return this;
    }

    public void flush()
    {
    }

}
