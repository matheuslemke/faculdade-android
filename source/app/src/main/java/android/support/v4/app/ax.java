// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;

// Referenced classes of package android.support.v4.app:
//            aw, ay

class ax extends aw
{

    ax()
    {
    }

    public Intent a(Activity activity)
    {
        Intent intent1 = ay.a(activity);
        Intent intent = intent1;
        if (intent1 == null)
        {
            intent = b(activity);
        }
        return intent;
    }

    public String a(Context context, ActivityInfo activityinfo)
    {
        String s1 = ay.a(activityinfo);
        String s = s1;
        if (s1 == null)
        {
            s = super.a(context, activityinfo);
        }
        return s;
    }

    public boolean a(Activity activity, Intent intent)
    {
        return ay.a(activity, intent);
    }

    Intent b(Activity activity)
    {
        return super.a(activity);
    }

    public void b(Activity activity, Intent intent)
    {
        ay.b(activity, intent);
    }
}
