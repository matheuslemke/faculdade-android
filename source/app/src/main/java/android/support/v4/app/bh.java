// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            bc, bj, bs

public class bh
{

    Notification A;
    Notification B;
    public ArrayList C;
    Context a;
    CharSequence b;
    CharSequence c;
    PendingIntent d;
    PendingIntent e;
    RemoteViews f;
    Bitmap g;
    CharSequence h;
    int i;
    int j;
    boolean k;
    boolean l;
    bs m;
    CharSequence n;
    int o;
    int p;
    boolean q;
    String r;
    boolean s;
    String t;
    ArrayList u;
    boolean v;
    String w;
    Bundle x;
    int y;
    int z;

    public bh(Context context)
    {
        k = true;
        u = new ArrayList();
        v = false;
        y = 0;
        z = 0;
        B = new Notification();
        a = context;
        B.when = System.currentTimeMillis();
        B.audioStreamType = -1;
        j = 0;
        C = new ArrayList();
    }

    private void a(int i1, boolean flag)
    {
        if (flag)
        {
            Notification notification = B;
            notification.flags = notification.flags | i1;
            return;
        } else
        {
            Notification notification1 = B;
            notification1.flags = notification1.flags & ~i1;
            return;
        }
    }

    protected static CharSequence c(CharSequence charsequence)
    {
        while (charsequence == null || charsequence.length() <= 5120) 
        {
            return charsequence;
        }
        return charsequence.subSequence(0, 5120);
    }

    public Notification a()
    {
        return bc.a().a(this);
    }

    public bh a(int i1)
    {
        B.icon = i1;
        return this;
    }

    public bh a(PendingIntent pendingintent)
    {
        d = pendingintent;
        return this;
    }

    public bh a(Uri uri, int i1)
    {
        B.sound = uri;
        B.audioStreamType = i1;
        return this;
    }

    public bh a(CharSequence charsequence)
    {
        b = c(charsequence);
        return this;
    }

    public bh a(boolean flag)
    {
        a(16, flag);
        return this;
    }

    public bh b(CharSequence charsequence)
    {
        c = c(charsequence);
        return this;
    }
}
