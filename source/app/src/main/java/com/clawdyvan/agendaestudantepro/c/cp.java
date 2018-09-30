// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;


// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            co

class cp
    implements Runnable
{

    final co a;

    cp(co co1)
    {
        a = co1;
        super();
    }

    public void run()
    {
        co.a(a, false);
    }
}
