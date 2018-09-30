// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Activities;

import android.app.Activity;
import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.Toast;
import java.io.File;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Activities:
//            c, d, a

public class CameraActivity extends Activity
{

    private SurfaceView a;
    private SurfaceHolder b;
    private Camera c;
    private File d;
    private android.hardware.Camera.PictureCallback e;
    private android.view.SurfaceHolder.Callback f;

    public CameraActivity()
    {
        e = new c(this);
        f = new d(this);
    }

    static SurfaceView a(CameraActivity cameraactivity)
    {
        return cameraactivity.a;
    }

    static File a(CameraActivity cameraactivity, File file)
    {
        cameraactivity.d = file;
        return file;
    }

    static android.hardware.Camera.PictureCallback b(CameraActivity cameraactivity)
    {
        return cameraactivity.e;
    }

    static Camera c(CameraActivity cameraactivity)
    {
        return cameraactivity.c;
    }

    static File d(CameraActivity cameraactivity)
    {
        return cameraactivity.d;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030017);
        bundle = getIntent().getExtras();
        if (bundle != null && bundle.containsKey("Foto"))
        {
            d = (File)getIntent().getExtras().getSerializable("Foto");
        }
        a = (SurfaceView)findViewById(0x7f09003f);
        b = a.getHolder();
        b.addCallback(f);
        b.setType(3);
        a.setOnClickListener(new a(this));
    }

    protected void onStart()
    {
        try
        {
            c = Camera.open();
            Toast.makeText(this, getString(0x7f0b008d), 0).show();
        }
        catch (Exception exception)
        {
            Toast.makeText(this, getString(0x7f0b001c), 0).show();
            finish();
        }
        super.onStart();
    }

    protected void onStop()
    {
        if (c != null)
        {
            c.stopPreview();
            c.release();
            c = null;
        }
        super.onStop();
    }
}
