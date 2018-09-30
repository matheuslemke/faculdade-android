// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.Context;
import java.io.File;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            aw, ar

class ax
    implements Runnable
{

    final aw a;

    ax(aw aw1)
    {
        a = aw1;
        super();
    }

    public void run()
    {
        File file = ar.a(a.a, "AutoCopy");
        if (file == null)
        {
            ar.b(a.a, "Error: Delete error");
            return;
        } else
        {
            ar.c(a.a);
            ar.b(a.a, String.format(ar.b(a.a).getString(0x7f0b0022), new Object[] {
                file.getName().replace(".aeb", "")
            }));
            ar.b(a.a, ar.b(a.a).getString(0x7f0b002f));
            return;
        }
    }
}
