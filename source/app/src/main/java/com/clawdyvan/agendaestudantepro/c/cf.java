// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            ce

class cf
    implements android.view.View.OnClickListener
{

    final ce a;

    cf(ce ce1)
    {
        a = ce1;
        super();
    }

    public void onClick(View view)
    {
        a.a(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.clawdyvan.agendaestudantepro")));
    }
}
