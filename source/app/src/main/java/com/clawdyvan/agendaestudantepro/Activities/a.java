// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Activities;

import android.hardware.Camera;
import android.view.SurfaceView;
import android.view.View;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Activities:
//            CameraActivity, b

class a
    implements android.view.View.OnClickListener
{

    final CameraActivity a;

    a(CameraActivity cameraactivity)
    {
        a = cameraactivity;
        super();
    }

    public void onClick(View view)
    {
        CameraActivity.a(a).setOnClickListener(null);
        CameraActivity.c(a).autoFocus(new b(this));
    }
}
