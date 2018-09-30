// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Activities;

import android.hardware.Camera;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Activities:
//            CameraActivity

class d
    implements android.view.SurfaceHolder.Callback
{

    final CameraActivity a;

    d(CameraActivity cameraactivity)
    {
        a = cameraactivity;
        super();
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
        android.hardware.Camera.Parameters parameters = CameraActivity.c(a).getParameters();
        parameters.setJpegQuality(100);
        android.hardware.Camera.Size size = (android.hardware.Camera.Size)parameters.getSupportedPictureSizes().get(0);
        parameters.setPictureSize(size.width, size.height);
        CameraActivity.c(a).setParameters(parameters);
        try
        {
            CameraActivity.c(a).setPreviewDisplay(surfaceholder);
        }
        // Misplaced declaration of an exception variable
        catch (SurfaceHolder surfaceholder) { }
        CameraActivity.c(a).startPreview();
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
    }
}
