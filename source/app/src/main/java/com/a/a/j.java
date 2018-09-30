// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import com.a.a.b.a.a;
import com.a.a.b.a.c;
import com.a.a.b.a.e;
import com.a.a.b.a.k;
import com.a.a.b.a.m;
import com.a.a.b.a.p;
import com.a.a.b.a.t;
import com.a.a.b.a.v;
import com.a.a.b.a.y;
import com.a.a.b.af;
import com.a.a.b.ag;
import com.a.a.b.f;
import com.a.a.b.s;
import com.a.a.d.d;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.a.a:
//            c, ab, k, l, 
//            o, m, u, aa, 
//            n, af, ae, p, 
//            v, s, z, i, 
//            t

public final class j
{

    final com.a.a.s a;
    final z b;
    private final ThreadLocal c;
    private final Map d;
    private final List e;
    private final f f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;

    public j()
    {
        this(s.a, ((i) (com.a.a.c.a)), Collections.emptyMap(), false, false, false, true, false, false, com.a.a.ab.a, Collections.emptyList());
    }

    j(s s1, i i1, Map map, boolean flag, boolean flag1, boolean flag2, boolean flag3, 
            boolean flag4, boolean flag5, ab ab1, List list)
    {
        c = new ThreadLocal();
        d = Collections.synchronizedMap(new HashMap());
        a = new com.a.a.k(this);
        b = new l(this);
        f = new f(map);
        g = flag;
        i = flag2;
        h = flag3;
        j = flag4;
        map = new ArrayList();
        map.add(y.Q);
        map.add(m.a);
        map.add(s1);
        map.addAll(list);
        map.add(y.x);
        map.add(y.m);
        map.add(y.g);
        map.add(y.i);
        map.add(y.k);
        map.add(y.a(Long.TYPE, java/lang/Long, a(ab1)));
        map.add(y.a(Double.TYPE, java/lang/Double, a(flag5)));
        map.add(y.a(Float.TYPE, java/lang/Float, b(flag5)));
        map.add(y.r);
        map.add(y.t);
        map.add(y.z);
        map.add(y.B);
        map.add(y.a(java/math/BigDecimal, y.v));
        map.add(y.a(java/math/BigInteger, y.w));
        map.add(y.D);
        map.add(y.F);
        map.add(y.J);
        map.add(y.O);
        map.add(y.H);
        map.add(y.d);
        map.add(e.a);
        map.add(y.M);
        map.add(v.a);
        map.add(t.a);
        map.add(y.K);
        map.add(a.a);
        map.add(y.R);
        map.add(y.b);
        map.add(new c(f));
        map.add(new k(f, flag1));
        map.add(new p(f, i1, s1));
        e = Collections.unmodifiableList(map);
    }

    private ae a(ab ab1)
    {
        if (ab1 == com.a.a.ab.a)
        {
            return y.n;
        } else
        {
            return new o(this);
        }
    }

    private ae a(boolean flag)
    {
        if (flag)
        {
            return y.p;
        } else
        {
            return new com.a.a.m(this);
        }
    }

    private d a(Writer writer)
    {
        if (i)
        {
            writer.write(")]}'\n");
        }
        writer = new d(writer);
        if (j)
        {
            writer.c("  ");
        }
        writer.d(g);
        return writer;
    }

    private void a(double d1)
    {
        if (Double.isNaN(d1) || Double.isInfinite(d1))
        {
            throw new IllegalArgumentException((new StringBuilder()).append(d1).append(" is not a valid double value as per JSON specification. To override this").append(" behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.").toString());
        } else
        {
            return;
        }
    }

    static void a(j j1, double d1)
    {
        j1.a(d1);
    }

    private static void a(Object obj, com.a.a.d.a a1)
    {
        if (obj != null)
        {
            try
            {
                if (a1.f() != com.a.a.d.c.j)
                {
                    throw new u("JSON document was not fully consumed.");
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new aa(((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new u(((Throwable) (obj)));
            }
        }
    }

    private ae b(boolean flag)
    {
        if (flag)
        {
            return y.o;
        } else
        {
            return new n(this);
        }
    }

    public ae a(com.a.a.af af1, com.a.a.c.a a1)
    {
        Iterator iterator = e.iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            Object obj = (com.a.a.af)iterator.next();
            if (!flag)
            {
                if (obj == af1)
                {
                    flag = true;
                }
            } else
            {
                obj = ((com.a.a.af) (obj)).a(this, a1);
                if (obj != null)
                {
                    return ((ae) (obj));
                }
            }
        }
        throw new IllegalArgumentException((new StringBuilder()).append("GSON cannot serialize ").append(a1).toString());
    }

    public ae a(com.a.a.c.a a1)
    {
        Object obj = (ae)d.get(a1);
        if (obj == null) goto _L2; else goto _L1
_L1:
        return ((ae) (obj));
_L2:
        Object obj1;
        Object obj2;
        boolean flag;
        obj1 = (Map)c.get();
        flag = false;
        if (obj1 == null)
        {
            obj1 = new HashMap();
            c.set(obj1);
            flag = true;
        }
        obj2 = (com.a.a.p)((Map) (obj1)).get(a1);
        obj = obj2;
        if (obj2 != null) goto _L1; else goto _L3
_L3:
        Iterator iterator;
        obj = new com.a.a.p();
        ((Map) (obj1)).put(a1, obj);
        iterator = e.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_184;
            }
            obj2 = ((com.a.a.af)iterator.next()).a(this, a1);
        } while (obj2 == null);
        ((com.a.a.p) (obj)).a(((ae) (obj2)));
        d.put(a1, obj2);
        ((Map) (obj1)).remove(a1);
        obj = obj2;
        if (!flag) goto _L1; else goto _L4
_L4:
        c.remove();
        return ((ae) (obj2));
        throw new IllegalArgumentException((new StringBuilder()).append("GSON cannot handle ").append(a1).toString());
        Exception exception;
        exception;
        ((Map) (obj1)).remove(a1);
        if (flag)
        {
            c.remove();
        }
        throw exception;
    }

    public ae a(Class class1)
    {
        return a(com.a.a.c.a.b(class1));
    }

    public Object a(com.a.a.d.a a1, Type type)
    {
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = a1.p();
        a1.a(true);
        a1.f();
        flag = false;
        type = ((Type) (a(com.a.a.c.a.a(type)).b(a1)));
        a1.a(flag1);
        return type;
        type;
        if (flag)
        {
            a1.a(flag1);
            return null;
        }
        throw new aa(type);
        type;
        a1.a(flag1);
        throw type;
        type;
        throw new aa(type);
        type;
        throw new aa(type);
    }

    public Object a(Reader reader, Type type)
    {
        reader = new com.a.a.d.a(reader);
        type = ((Type) (a(((com.a.a.d.a) (reader)), type)));
        a(type, ((com.a.a.d.a) (reader)));
        return type;
    }

    public Object a(String s1, Class class1)
    {
        s1 = ((String) (a(s1, ((Type) (class1)))));
        return af.a(class1).cast(s1);
    }

    public Object a(String s1, Type type)
    {
        if (s1 == null)
        {
            return null;
        } else
        {
            return a(((Reader) (new StringReader(s1))), type);
        }
    }

    public String a(com.a.a.t t1)
    {
        StringWriter stringwriter = new StringWriter();
        a(t1, ((Appendable) (stringwriter)));
        return stringwriter.toString();
    }

    public String a(Object obj)
    {
        if (obj == null)
        {
            return a(((com.a.a.t) (com.a.a.v.a)));
        } else
        {
            return a(obj, ((Type) (obj.getClass())));
        }
    }

    public String a(Object obj, Type type)
    {
        StringWriter stringwriter = new StringWriter();
        a(obj, type, ((Appendable) (stringwriter)));
        return stringwriter.toString();
    }

    public void a(com.a.a.t t1, d d1)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag = d1.g();
        d1.b(true);
        flag1 = d1.h();
        d1.c(h);
        flag2 = d1.i();
        d1.d(g);
        ag.a(t1, d1);
        d1.b(flag);
        d1.c(flag1);
        d1.d(flag2);
        return;
        t1;
        throw new u(t1);
        t1;
        d1.b(flag);
        d1.c(flag1);
        d1.d(flag2);
        throw t1;
    }

    public void a(com.a.a.t t1, Appendable appendable)
    {
        try
        {
            a(t1, a(ag.a(appendable)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.a.a.t t1)
        {
            throw new RuntimeException(t1);
        }
    }

    public void a(Object obj, Type type, d d1)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        type = a(com.a.a.c.a.a(type));
        flag = d1.g();
        d1.b(true);
        flag1 = d1.h();
        d1.c(h);
        flag2 = d1.i();
        d1.d(g);
        type.a(d1, obj);
        d1.b(flag);
        d1.c(flag1);
        d1.d(flag2);
        return;
        obj;
        throw new u(((Throwable) (obj)));
        obj;
        d1.b(flag);
        d1.c(flag1);
        d1.d(flag2);
        throw obj;
    }

    public void a(Object obj, Type type, Appendable appendable)
    {
        try
        {
            a(obj, type, a(ag.a(appendable)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new u(((Throwable) (obj)));
        }
    }

    public String toString()
    {
        return (new StringBuilder("{serializeNulls:")).append(g).append("factories:").append(e).append(",instanceCreators:").append(f).append("}").toString();
    }
}
