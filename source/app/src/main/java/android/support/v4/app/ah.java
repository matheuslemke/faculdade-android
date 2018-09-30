// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            Fragment

final class ah
{

    private final String a;
    private final Class b;
    private final Bundle c;
    private Fragment d;

    static Fragment a(ah ah1)
    {
        return ah1.d;
    }

    static Fragment a(ah ah1, Fragment fragment)
    {
        ah1.d = fragment;
        return fragment;
    }

    static String b(ah ah1)
    {
        return ah1.a;
    }

    static Class c(ah ah1)
    {
        return ah1.b;
    }

    static Bundle d(ah ah1)
    {
        return ah1.c;
    }
}
