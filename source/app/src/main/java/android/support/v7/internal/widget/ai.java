// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.app.d;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            aj, af, ag

class ai
    implements android.view.View.OnClickListener
{

    final af a;

    private ai(af af1)
    {
        a = af1;
        super();
    }

    ai(af af1, ag ag)
    {
        this(af1);
    }

    public void onClick(View view)
    {
        ((aj)view).b().e();
        int j = af.a(a).getChildCount();
        int i = 0;
        while (i < j) 
        {
            View view1 = af.a(a).getChildAt(i);
            boolean flag;
            if (view1 == view)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view1.setSelected(flag);
            i++;
        }
    }
}
