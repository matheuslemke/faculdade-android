// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.clawdyvan.agendaestudantepro.Util.e;
import com.clawdyvan.agendaestudantepro.Util.t;
import com.clawdyvan.agendaestudantepro.b.c;
import com.clawdyvan.agendaestudantepro.b.f;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            ag, ah

public class af extends Fragment
{

    private EditText a;
    private c aj;
    private f ak;
    private boolean al;
    private View am;
    private android.view.View.OnClickListener an;
    private android.view.View.OnClickListener ao;
    private TextView b;
    private EditText c;
    private TextView d;
    private EditText e;
    private EditText f;
    private EditText g;
    private Button h;
    private Button i;

    public af()
    {
        an = new ag(this);
        ao = new ah(this);
    }

    private boolean a()
    {
        boolean flag = true;
        ak.c(g.getText().toString());
        ak.b(f.getText().toString());
        try
        {
            ak.b(Float.parseFloat(e.getText().toString()));
            d.setTextColor(0xff000000);
        }
        catch (Exception exception)
        {
            e.requestFocus();
            d.setTextColor(0xffff0000);
            flag = false;
        }
        try
        {
            ak.a(Float.parseFloat(c.getText().toString()));
            b.setTextColor(0xff000000);
        }
        catch (Exception exception1)
        {
            c.requestFocus();
            b.setTextColor(0xffff0000);
            flag = false;
        }
        ak.a(aj);
        return flag;
    }

    static boolean a(af af1)
    {
        return af1.a();
    }

    static boolean b(af af1)
    {
        return af1.al;
    }

    static f c(af af1)
    {
        return af1.ak;
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(bundle);
        am = layoutinflater.inflate(0x7f03002b, viewgroup, false);
        a = (EditText)am.findViewById(0x7f09008d);
        b = (TextView)am.findViewById(0x7f09004e);
        c = (EditText)am.findViewById(0x7f090092);
        d = (TextView)am.findViewById(0x7f09004f);
        e = (EditText)am.findViewById(0x7f090093);
        f = (EditText)am.findViewById(0x7f09007f);
        g = (EditText)am.findViewById(0x7f090084);
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            h = (Button)am.findViewById(0x7f09007b);
            i = (Button)am.findViewById(0x7f09007c);
        } else
        {
            h = (Button)am.findViewById(0x7f09007c);
            i = (Button)am.findViewById(0x7f09007b);
        }
        h.setText(a(0x7f0b007c));
        h.setOnClickListener(an);
        i.setText(a(0x7f0b001d));
        i.setOnClickListener(ao);
        layoutinflater = j();
        if (layoutinflater != null)
        {
            if (layoutinflater.containsKey("Disciplina"))
            {
                ak = com.clawdyvan.agendaestudantepro.Util.e.d(layoutinflater);
                aj = ak.f();
                c.setText(String.valueOf(ak.b()));
                e.setText(String.valueOf(ak.c()));
                f.setText(ak.d());
                g.setText(ak.e());
                al = true;
            } else
            {
                aj = com.clawdyvan.agendaestudantepro.Util.e.a(layoutinflater);
                ak = new f();
                e.setText("1");
            }
            a.setText(aj.c());
        }
        t.a(am);
        return am;
    }
}
