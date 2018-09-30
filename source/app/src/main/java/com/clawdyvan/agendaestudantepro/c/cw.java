// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;


// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            cv

class cw
    implements Runnable
{

    final cv a;

    cw(cv cv1)
    {
        a = cv1;
        super();
    }

    public void run()
    {
        cv.a(a, false);
    }
}
