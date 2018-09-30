// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.CustomViews;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustonTextViewForGridView extends TextView
{

    public CustonTextViewForGridView(Context context)
    {
        super(context);
    }

    public CustonTextViewForGridView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public CustonTextViewForGridView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public CustonTextViewForGridView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, i);
    }
}
