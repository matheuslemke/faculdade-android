// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.b.a;

import android.graphics.drawable.Drawable;

class h
{

    public static void a(Drawable drawable, boolean flag)
    {
        drawable.setAutoMirrored(flag);
    }

    public static boolean a(Drawable drawable)
    {
        return drawable.isAutoMirrored();
    }
}
