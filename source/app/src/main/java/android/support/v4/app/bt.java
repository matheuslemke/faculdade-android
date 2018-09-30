// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//            by, cn

class bt
{

    public static void a(android.app.Notification.Builder builder, by by1)
    {
        android.app.Notification.Action.Builder builder1 = new android.app.Notification.Action.Builder(by1.a(), by1.b(), by1.c());
        if (by1.f() != null)
        {
            android.app.RemoteInput aremoteinput[] = cn.a(by1.f());
            int j = aremoteinput.length;
            for (int i = 0; i < j; i++)
            {
                builder1.addRemoteInput(aremoteinput[i]);
            }

        }
        if (by1.d() != null)
        {
            builder1.addExtras(by1.d());
        }
        builder.addAction(builder1.build());
    }
}
