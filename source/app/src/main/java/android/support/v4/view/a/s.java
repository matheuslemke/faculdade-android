// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

// Referenced classes of package android.support.v4.view.a:
//            t

final class s extends AccessibilityNodeProvider
{

    final t a;

    s(t t1)
    {
        a = t1;
        super();
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i)
    {
        return (AccessibilityNodeInfo)a.a(i);
    }

    public List findAccessibilityNodeInfosByText(String s1, int i)
    {
        return a.a(s1, i);
    }

    public boolean performAction(int i, int j, Bundle bundle)
    {
        return a.a(i, j, bundle);
    }
}
