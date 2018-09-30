// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;


// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            dg

class dh
    implements Runnable
{

    final dg a;

    dh(dg dg1)
    {
        a = dg1;
        super();
    }

    public void run()
    {
        dg.a(a, false);
    }
}
