// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.a.l;
import android.support.v7.internal.b.a;
import android.util.AttributeSet;
import android.widget.TextView;

public class v extends TextView
{

    public v(Context context)
    {
        this(context, null);
    }

    public v(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public v(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        attributeset = context.obtainStyledAttributes(attributeset, l.CompatTextView, i, 0);
        boolean flag = attributeset.getBoolean(l.CompatTextView_textAllCaps, false);
        attributeset.recycle();
        if (flag)
        {
            setTransformationMethod(new a(context));
        }
    }
}
