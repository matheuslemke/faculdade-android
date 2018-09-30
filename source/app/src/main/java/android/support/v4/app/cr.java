// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            cp

class cr
{

    static Bundle a(cp cp1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", cp1.a());
        bundle.putCharSequence("label", cp1.b());
        bundle.putCharSequenceArray("choices", cp1.c());
        bundle.putBoolean("allowFreeFormInput", cp1.d());
        bundle.putBundle("extras", cp1.e());
        return bundle;
    }

    static Bundle[] a(cp acp[])
    {
        if (acp == null)
        {
            return null;
        }
        Bundle abundle[] = new Bundle[acp.length];
        for (int i = 0; i < acp.length; i++)
        {
            abundle[i] = a(acp[i]);
        }

        return abundle;
    }
}
