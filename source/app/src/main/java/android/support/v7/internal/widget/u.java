// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.support.v7.a.l;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.internal.widget:
//            bc

public class u extends PopupWindow
{

    private final boolean a;

    public u(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = bc.a(context, attributeset, l.PopupWindow, i, 0);
        a = context.a(l.PopupWindow_overlapAnchor, false);
        setBackgroundDrawable(context.a(l.PopupWindow_android_popupBackground));
        context.b();
    }

    public void showAsDropDown(View view, int i, int j)
    {
        int k = j;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            k = j;
            if (a)
            {
                k = j - view.getHeight();
            }
        }
        super.showAsDropDown(view, i, k);
    }

    public void showAsDropDown(View view, int i, int j, int k)
    {
        int i1 = j;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            i1 = j;
            if (a)
            {
                i1 = j - view.getHeight();
            }
        }
        super.showAsDropDown(view, i, i1, k);
    }

    public void update(View view, int i, int j, int k, int i1)
    {
        if (android.os.Build.VERSION.SDK_INT < 21 && a)
        {
            j -= view.getHeight();
        }
        super.update(view, i, j, k, i1);
    }
}
