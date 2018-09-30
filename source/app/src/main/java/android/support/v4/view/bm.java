// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            bn, au

class bm
{

    public static void a(View view)
    {
        view.requestApplyInsets();
    }

    public static void a(View view, float f)
    {
        view.setElevation(f);
    }

    public static void a(View view, au au)
    {
        view.setOnApplyWindowInsetsListener(new bn(au));
    }
}
