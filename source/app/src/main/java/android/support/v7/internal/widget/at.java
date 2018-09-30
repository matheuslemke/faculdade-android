// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;

// Referenced classes of package android.support.v7.internal.widget:
//            bc, ax

public class at extends CheckBox
{

    private static final int a[] = {
        0x1010107
    };
    private final ax b;

    public at(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101006c);
    }

    public at(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = bc.a(context, attributeset, a, i, 0);
        setButtonDrawable(context.a(0));
        context.b();
        b = context.c();
    }

    public void setButtonDrawable(int i)
    {
        setButtonDrawable(b.a(i));
    }

}
