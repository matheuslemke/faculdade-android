// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Activities;

import android.content.Intent;
import android.hardware.Camera;
import com.clawdyvan.agendaestudantepro.Util.a;
import java.io.IOException;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Activities:
//            CameraActivity

class c
    implements android.hardware.Camera.PictureCallback
{

    final CameraActivity a;

    c(CameraActivity cameraactivity)
    {
        a = cameraactivity;
        super();
    }

    public void onPictureTaken(byte abyte0[], Camera camera)
    {
        long l = System.currentTimeMillis();
        try
        {
            if (CameraActivity.d(a) == null)
            {
                com.clawdyvan.agendaestudantepro.Activities.CameraActivity.a(a, com.clawdyvan.agendaestudantepro.Util.a.a(String.valueOf(l)));
            }
            com.clawdyvan.agendaestudantepro.Util.a.a(abyte0, CameraActivity.d(a));
            abyte0 = new Intent();
            abyte0.putExtra("Foto", CameraActivity.d(a));
            a.setResult(-1, abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            a.finish();
            return;
        }
        finally
        {
            a.finish();
        }
        a.finish();
        return;
        throw abyte0;
    }
}
