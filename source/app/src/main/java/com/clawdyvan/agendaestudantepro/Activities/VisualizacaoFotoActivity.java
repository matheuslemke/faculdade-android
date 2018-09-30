// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.clawdyvan.agendaestudantepro.Util.c;
import com.clawdyvan.agendaestudantepro.Util.m;
import java.io.File;

// Referenced classes of package com.clawdyvan.agendaestudantepro.Activities:
//            j, k, m, CameraActivity

public class VisualizacaoFotoActivity extends Activity
{

    private WebView a;
    private RelativeLayout b;
    private LinearLayout c;
    private boolean d;
    private m e;
    private android.view.View.OnClickListener f;
    private android.view.View.OnClickListener g;
    private android.view.View.OnClickListener h;

    public VisualizacaoFotoActivity()
    {
        f = new j(this);
        g = new k(this);
        h = new com.clawdyvan.agendaestudantepro.Activities.m(this);
    }

    private void a()
    {
        Intent intent = new Intent(this, com/clawdyvan/agendaestudantepro/Activities/CameraActivity);
        if (!e.b().equals(""))
        {
            intent.putExtra("Foto", e.d());
        }
        startActivityForResult(intent, 1);
    }

    static void a(VisualizacaoFotoActivity visualizacaofotoactivity)
    {
        visualizacaofotoactivity.a();
    }

    private void a(String s)
    {
        d();
        a.loadUrl((new StringBuilder()).append("file://").append(s).toString());
    }

    private void a(boolean flag)
    {
        if (!getIntent().getExtras().containsKey("apenasVisualizacao"))
        {
            c.removeAllViews();
            android.view.LayoutInflater layoutinflater = getLayoutInflater();
            ImageButton imagebutton;
            if (flag)
            {
                imagebutton = com.clawdyvan.agendaestudantepro.Util.c.b(layoutinflater);
            } else
            {
                imagebutton = com.clawdyvan.agendaestudantepro.Util.c.a(layoutinflater);
            }
            imagebutton.setOnClickListener(f);
            c.addView(imagebutton);
            imagebutton = com.clawdyvan.agendaestudantepro.Util.c.c(layoutinflater);
            imagebutton.setOnClickListener(g);
            c.addView(imagebutton);
            imagebutton = com.clawdyvan.agendaestudantepro.Util.c.d(layoutinflater);
            imagebutton.setOnClickListener(h);
            c.addView(imagebutton);
        }
    }

    static m b(VisualizacaoFotoActivity visualizacaofotoactivity)
    {
        return visualizacaofotoactivity.e;
    }

    private void b()
    {
        if (!e.b().equals(e.a()))
        {
            e.c();
        }
    }

    private void c()
    {
        if (!e.b().equals(""))
        {
            a(e.b());
            a(true);
        } else
        {
            if (!e.a().equals(""))
            {
                if (e.e().exists())
                {
                    a(e.a());
                    a(true);
                    return;
                }
                Toast.makeText(this, "Foto n\343o encontrada!", 0).show();
                if (getIntent().getExtras().containsKey("apenasVisualizacao"))
                {
                    finish();
                }
                a(false);
                return;
            }
            if (!d)
            {
                d = true;
                a();
                return;
            }
        }
    }

    private void d()
    {
        WebSettings websettings = a.getSettings();
        websettings.setBuiltInZoomControls(true);
        websettings.setUseWideViewPort(true);
        websettings.setLoadWithOverviewMode(true);
    }

    protected void onActivityResult(int i, int l, Intent intent)
    {
        if (l == -1)
        {
            e.a((File)intent.getSerializableExtra("Foto"));
            a(e.b());
            a(true);
        } else
        if (e.b().equals("") && e.a().equals(""))
        {
            finish();
            return;
        }
    }

    public void onBackPressed()
    {
        b();
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001b);
        a = (WebView)findViewById(0x7f090044);
        a.setBackgroundColor(0);
        c = new LinearLayout(this);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        b = (RelativeLayout)findViewById(0x7f090043);
        b.addView(c);
        layoutparams.addRule(12);
        layoutparams.addRule(9);
        c.setLayoutParams(layoutparams);
        if (bundle != null)
        {
            e = (m)bundle.getSerializable("fotoHandler");
            d = bundle.getBoolean("chamouCamera");
        } else
        {
            e = (m)getIntent().getSerializableExtra("fotoHandler");
        }
        c();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putSerializable("fotoHandler", e);
        bundle.putBoolean("chamouCamera", d);
        super.onSaveInstanceState(bundle);
    }
}
