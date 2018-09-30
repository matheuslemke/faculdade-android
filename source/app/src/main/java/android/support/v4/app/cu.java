// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.a.a;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            cy, cx, cv, au, 
//            cw

public class cu
    implements Iterable
{

    private static final cw a;
    private final ArrayList b = new ArrayList();
    private final Context c;

    private cu(Context context)
    {
        c = context;
    }

    public static cu a(Context context)
    {
        return new cu(context);
    }

    public cu a(Activity activity)
    {
        Object obj = null;
        if (activity instanceof cv)
        {
            obj = ((cv)activity).a();
        }
        if (obj == null)
        {
            activity = android.support.v4.app.au.a(activity);
        } else
        {
            activity = ((Activity) (obj));
        }
        if (activity != null)
        {
            ComponentName componentname = activity.getComponent();
            obj = componentname;
            if (componentname == null)
            {
                obj = activity.resolveActivity(c.getPackageManager());
            }
            a(((ComponentName) (obj)));
            a(((Intent) (activity)));
        }
        return this;
    }

    public cu a(ComponentName componentname)
    {
        int i = b.size();
        try
        {
            componentname = android.support.v4.app.au.a(c, componentname);
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(componentname);
        }
        if (componentname == null)
        {
            break; /* Loop/switch isn't completed */
        }
        b.add(i, componentname);
        componentname = android.support.v4.app.au.a(c, componentname.getComponent());
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_17;
_L1:
        return this;
    }

    public cu a(Intent intent)
    {
        b.add(intent);
        return this;
    }

    public void a()
    {
        a(((Bundle) (null)));
    }

    public void a(Bundle bundle)
    {
        if (b.isEmpty())
        {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent aintent[] = (Intent[])b.toArray(new Intent[b.size()]);
        aintent[0] = (new Intent(aintent[0])).addFlags(0x1000c000);
        if (!android.support.v4.a.a.a(c, aintent, bundle))
        {
            bundle = new Intent(aintent[aintent.length - 1]);
            bundle.addFlags(0x10000000);
            c.startActivity(bundle);
        }
    }

    public Iterator iterator()
    {
        return b.iterator();
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new cy();
        } else
        {
            a = new cx();
        }
    }
}
