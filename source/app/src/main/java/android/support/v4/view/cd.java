// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.animation.Interpolator;

final class cd
    implements Interpolator
{

    cd()
    {
    }

    public float getInterpolation(float f)
    {
        f--;
        return f * (f * f * f * f) + 1.0F;
    }
}
