// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

// Referenced classes of package android.support.v7.internal.widget:
//            bc

public class aw extends EditText
{

    private static final int a[] = {
        0x10100d4
    };

    public aw(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101006e);
    }

    public aw(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = bc.a(context, attributeset, a, i, 0);
        setBackgroundDrawable(context.a(0));
        context.b();
    }

}
