// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;


// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            da

class db
    implements Runnable
{

    final da a;

    db(da da1)
    {
        a = da1;
        super();
    }

    public void run()
    {
        da.a(a, false);
    }
}
