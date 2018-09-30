// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.e;

import android.content.res.Resources;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;

// Referenced classes of package com.clawdyvan.agendaestudantepro.e:
//            i, o

class n
    implements android.view.View.OnClickListener
{

    final i a;

    n(i j)
    {
        a = j;
        super();
    }

    public void onClick(View view)
    {
        Object obj = (TableRow)view;
        String s = ((TextView)((TableRow) (obj)).getChildAt(0)).getText().toString();
        obj = ((TextView)((TableRow) (obj)).getChildAt(1)).getText().toString();
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(view.getContext());
        builder.setTitle((new StringBuilder()).append(s).append(" - ").append(((String) (obj))).toString());
        builder.setIcon(0x7f02006a);
        builder.setItems(a.l().getStringArray(0x7f050007), new o(this, ((String) (obj)), view));
        builder.show();
    }
}
