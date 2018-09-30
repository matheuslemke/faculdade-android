// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.util.Comparator;

// Referenced classes of package android.support.v4.view:
//            ch

class co
    implements Comparator
{

    co()
    {
    }

    public int a(View view, View view1)
    {
        view = (ch)view.getLayoutParams();
        view1 = (ch)view1.getLayoutParams();
        if (((ch) (view)).a != ((ch) (view1)).a)
        {
            return !((ch) (view)).a ? -1 : 1;
        } else
        {
            return ((ch) (view)).e - ((ch) (view1)).e;
        }
    }

    public int compare(Object obj, Object obj1)
    {
        return a((View)obj, (View)obj1);
    }
}
