// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.Context;
import android.widget.AdapterView;
import com.a.a.j;
import com.clawdyvan.agendaestudantepro.Util.a;
import java.io.File;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            ay, ar

class az
    implements Runnable
{

    final AdapterView a;
    final int b;
    final ay c;

    az(ay ay1, AdapterView adapterview, int i)
    {
        c = ay1;
        a = adapterview;
        b = i;
        super();
    }

    public void run()
    {
        Object obj1 = (File)a.getItemAtPosition(b);
        Object obj = com.clawdyvan.agendaestudantepro.c.ar.a(c.a, "AutoCopy");
        if (obj == null)
        {
            ar.b(c.a, "Error: Backup before restoring not created");
            return;
        }
        try
        {
            ar.c(c.a);
            obj1 = com.clawdyvan.agendaestudantepro.Util.a.a(((File) (obj1)));
            obj1 = (com.clawdyvan.agendaestudantepro.b.a)(new j()).a(((String) (obj1)), com/clawdyvan/agendaestudantepro/b/a);
            com.clawdyvan.agendaestudantepro.c.ar.a(c.a, ((com.clawdyvan.agendaestudantepro.b.a) (obj1)));
        }
        catch (Exception exception1)
        {
            try
            {
                obj = com.clawdyvan.agendaestudantepro.Util.a.a(((File) (obj)));
                obj = (com.clawdyvan.agendaestudantepro.b.a)(new j()).a(((String) (obj)), com/clawdyvan/agendaestudantepro/b/a);
                com.clawdyvan.agendaestudantepro.c.ar.a(c.a, ((com.clawdyvan.agendaestudantepro.b.a) (obj)));
                ar.b(c.a, "Error: Restore error!");
                return;
            }
            catch (Exception exception)
            {
                ar.b(c.a, "Error: Fatal error");
            }
            return;
        }
        ar.b(c.a, String.format(ar.b(c.a).getString(0x7f0b0021), new Object[] {
            ((File) (obj)).getName().replace(".aeb", "")
        }));
        ar.b(c.a, ar.b(c.a).getString(0x7f0b0023));
    }
}
