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
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package com.a.a.b.a:
//            w

public final class v extends ae
{

    public static final af a = new w();
    private final DateFormat b = new SimpleDateFormat("hh:mm:ss a");

    public v()
    {
    }

    public Time a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a1.f() != c.i) goto _L2; else goto _L1
_L1:
        a1.j();
        a1 = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return a1;
_L2:
        a1 = new Time(b.parse(a1.h()).getTime());
        if (true) goto _L4; else goto _L3
_L3:
        a1;
        throw new aa(a1);
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public volatile void a(d d1, Object obj)
    {
        a(d1, (Time)obj);
    }

    public void a(d d1, Time time)
    {
        this;
        JVM INSTR monitorenter ;
        if (time != null) goto _L2; else goto _L1
_L1:
        time = null;
_L4:
        d1.b(time);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        time = b.format(time);
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
