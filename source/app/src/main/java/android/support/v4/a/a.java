// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

// Referenced classes of package android.support.v4.a:
//            b, d, c

public class a
{

    public static final Drawable a(Context context, int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return b.a(context, i);
        } else
        {
            return context.getResources().getDrawable(i);
        }
    }

    public static boolean a(Context context, Intent aintent[], Bundle bundle)
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 16)
        {
            d.a(context, aintent, bundle);
            return true;
        }
        if (i >= 11)
        {
            c.a(context, aintent);
            return true;
        } else
        {
            return false;
        }
    }
}
