// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.app.Dialog;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.l;
import android.support.v4.app.p;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            cf

public class ce extends l
{

    public ce()
    {
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        c().getWindow().getAttributes().windowAnimations = 0x7f0c00e9;
        layoutinflater = layoutinflater.inflate(0x7f030024, null);
        viewgroup = (EditText)layoutinflater.findViewById(0x7f090068);
        try
        {
            viewgroup.setTypeface(Typeface.createFromAsset(k().getAssets(), "fonts/Legendum.ttf"));
        }
        // Misplaced declaration of an exception variable
        catch (ViewGroup viewgroup) { }
        layoutinflater.findViewById(0x7f090069).setOnClickListener(new cf(this));
        return layoutinflater;
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        a(1, 0);
    }

    public void t()
    {
        a();
        super.t();
    }
}
