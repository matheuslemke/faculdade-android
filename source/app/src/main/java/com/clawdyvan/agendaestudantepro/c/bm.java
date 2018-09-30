// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            bh, bn

class bm
    implements android.widget.AdapterView.OnItemLongClickListener
{

    final bh a;

    bm(bh bh1)
    {
        a = bh1;
        super();
    }

    public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = new android.app.AlertDialog.Builder(view.getContext());
        adapterview.setItems(a.l().getStringArray(0x7f050003), new bn(this, i));
        adapterview.show();
        return true;
    }
}
