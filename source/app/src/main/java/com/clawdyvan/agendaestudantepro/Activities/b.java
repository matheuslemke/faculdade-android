// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Activities;

import android.hardware.Camera;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Activities:
//            a, CameraActivity

class b
    implements android.hardware.Camera.AutoFocusCallback
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public void onAutoFocus(boolean flag, Camera camera)
    {
        camera.takePicture(null, null, CameraActivity.b(a.a));
    }
}
