// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.aa;
import com.a.a.ae;
import com.a.a.af;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.a.a.b.a:
//            f

public final class e extends ae
{

    public static final af a = new f();
    private final DateFormat b;
    private final DateFormat c = DateFormat.getDateTimeInstance(2, 2);
    private final DateFormat d = a();

    public e()
    {
        b = DateFormat.getDateTimeInstance(2, 2, Locale.US);
    }

    private static DateFormat a()
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpledateformat;
    }

    private Date a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        Date date = c.parse(s);
        s = date;
_L1:
        this;
        JVM INSTR monitorexit ;
        return s;
        ParseException parseexception;
        parseexception;
        parseexception = b.parse(s);
        s = parseexception;
          goto _L1
        parseexception;
        parseexception = d.parse(s);
        s = parseexception;
          goto _L1
        parseexception;
        throw new aa(s, parseexception);
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public Date a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        } else
        {
            return a(a1.h());
        }
    }

    public volatile void a(d d1, Object obj)
    {
        a(d1, (Date)obj);
    }

    public void a(d d1, Date date)
    {
        this;
        JVM INSTR monitorenter ;
        if (date != null) goto _L2; else goto _L1
_L1:
        d1.f();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d1.b(b.format(date));
        if (true) goto _L4; else goto _L3
_L3:
        d1;
        throw d1;
    }

    public Object b(a a1)
    {
        return a(a1);
    }

}
