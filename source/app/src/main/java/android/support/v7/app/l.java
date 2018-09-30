// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateBase

class l
    implements Runnable
{

    final ActionBarActivityDelegateBase a;

    l(ActionBarActivityDelegateBase actionbaractivitydelegatebase)
    {
        a = actionbaractivitydelegatebase;
        super();
    }

    public void run()
    {
        a.i.showAtLocation(a.h, 55, 0, 0);
    }
}
