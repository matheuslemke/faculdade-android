// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.internal.view.c;
import android.support.v7.internal.view.d;
import android.support.v7.internal.widget.NativeActionModeAwareLayout;
import android.support.v7.internal.widget.ad;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            ActionBarActivityDelegateBase, f

class q extends ActionBarActivityDelegateBase
    implements ad
{

    private NativeActionModeAwareLayout k;

    q(f f1)
    {
        super(f1);
    }

    public ActionMode a(View view, android.view.ActionMode.Callback callback)
    {
        view = b(new d(view.getContext(), callback));
        if (view != null)
        {
            return new c(a, view);
        } else
        {
            return null;
        }
    }

    boolean a(int i, KeyEvent keyevent)
    {
        return false;
    }

    void o()
    {
        k = (NativeActionModeAwareLayout)a.findViewById(0x1020002);
        if (k != null)
        {
            k.setActionModeForChildListener(this);
        }
    }
}
