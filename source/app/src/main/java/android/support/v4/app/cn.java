// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.RemoteInput;

// Referenced classes of package android.support.v4.app:
//            cp

class cn
{

    static RemoteInput[] a(cp acp[])
    {
        if (acp == null)
        {
            return null;
        }
        RemoteInput aremoteinput[] = new RemoteInput[acp.length];
        for (int i = 0; i < acp.length; i++)
        {
            cp cp1 = acp[i];
            aremoteinput[i] = (new android.app.RemoteInput.Builder(cp1.a())).setLabel(cp1.b()).setChoices(cp1.c()).setAllowFreeFormInput(cp1.d()).addExtras(cp1.e()).build();
        }

        return aremoteinput;
    }
}
