// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            ContentFrameLayout, ad

public class NativeActionModeAwareLayout extends ContentFrameLayout
{

    private ad a;

    public NativeActionModeAwareLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void setActionModeForChildListener(ad ad1)
    {
        a = ad1;
    }

    public ActionMode startActionModeForChild(View view, android.view.ActionMode.Callback callback)
    {
        if (a != null)
        {
            return a.a(view, callback);
        } else
        {
            return super.startActionModeForChild(view, callback);
        }
    }
}
