// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.clawdyvan.agendaestudantepro.Activities.MainActivity;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Util:
//            d

public class t
{

    public static int a(int i)
    {
        return (int)((float)i * Resources.getSystem().getDisplayMetrics().density);
    }

    public static int a(Activity activity)
    {
        return b(activity).heightPixels;
    }

    public static int a(Context context)
    {
        return MainActivity.b(context).a();
    }

    public static void a(Context context, TextView textview)
    {
        try
        {
            textview.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/Legendum.ttf"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static void a(View view)
    {
        MainActivity.b(view.getContext()).a(view);
    }

    private static DisplayMetrics b(Activity activity)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        return displaymetrics;
    }
}
