// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//            bm, bh, ca

class bn extends bm
{

    bn()
    {
    }

    public Notification a(bh bh1)
    {
        Notification notification = bh1.B;
        notification.setLatestEventInfo(bh1.a, bh1.b, bh1.c, bh1.d);
        notification = ca.a(notification, bh1.a, bh1.b, bh1.c, bh1.d, bh1.e);
        if (bh1.j > 0)
        {
            notification.flags = notification.flags | 0x80;
        }
        return notification;
    }
}
