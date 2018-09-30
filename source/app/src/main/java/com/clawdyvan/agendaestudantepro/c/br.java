// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.os.AsyncTask;
import java.util.Map;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            bp

class br extends AsyncTask
{

    final bp a;

    br(bp bp1)
    {
        a = bp1;
        super();
    }

    protected transient Map a(Void avoid[])
    {
        return bp.a(a);
    }

    protected void a(Map map)
    {
        bp.a(a, map);
        super.onPostExecute(map);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Map)obj);
    }
}
