// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Interpolator;

final class av
    implements Interpolator
{

    av()
    {
    }

    public float getInterpolation(float f)
    {
        f--;
        return f * (f * f * f * f) + 1.0F;
    }
}