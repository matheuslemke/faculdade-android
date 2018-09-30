// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.b.a;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

class i
{

    public static void a(Drawable drawable, float f, float f1)
    {
        drawable.setHotspot(f, f1);
    }

    public static void a(Drawable drawable, int j)
    {
        drawable.setTint(j);
    }

    public static void a(Drawable drawable, int j, int k, int l, int i1)
    {
        drawable.setHotspotBounds(j, k, l, i1);
    }

    public static void a(Drawable drawable, ColorStateList colorstatelist)
    {
        drawable.setTintList(colorstatelist);
    }

    public static void a(Drawable drawable, android.graphics.PorterDuff.Mode mode)
    {
        drawable.setTintMode(mode);
    }
}
