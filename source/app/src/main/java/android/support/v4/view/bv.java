// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.ViewConfiguration;

// Referenced classes of package android.support.v4.view:
//            bz

class bv
    implements bz
{

    bv()
    {
    }

    public int a(ViewConfiguration viewconfiguration)
    {
        return viewconfiguration.getScaledTouchSlop();
    }

    public boolean b(ViewConfiguration viewconfiguration)
    {
        return true;
    }
}
