// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.WindowInsets;

// Referenced classes of package android.support.v4.view:
//            dj, au

final class bn
    implements android.view.View.OnApplyWindowInsetsListener
{

    final au a;

    bn(au au1)
    {
        a = au1;
        super();
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
    {
        windowinsets = new dj(windowinsets);
        return ((dj)a.a(view, windowinsets)).e();
    }
}
