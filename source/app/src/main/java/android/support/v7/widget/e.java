// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.a;
import android.support.v7.a.b;
import android.support.v7.internal.widget.TintImageView;

// Referenced classes of package android.support.v7.widget:
//            k, f, ActionMenuPresenter

class e extends TintImageView
    implements k
{

    final ActionMenuPresenter a;
    private final float b[] = new float[2];

    public e(ActionMenuPresenter actionmenupresenter, Context context)
    {
        a = actionmenupresenter;
        super(context, null, b.actionOverflowButtonStyle);
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setOnTouchListener(new f(this, this, actionmenupresenter));
    }

    public boolean c()
    {
        return false;
    }

    public boolean d()
    {
        return false;
    }

    public boolean performClick()
    {
        if (super.performClick())
        {
            return true;
        } else
        {
            playSoundEffect(0);
            a.c();
            return true;
        }
    }

    protected boolean setFrame(int i, int j, int l, int i1)
    {
        boolean flag = super.setFrame(i, j, l, i1);
        Drawable drawable = getDrawable();
        Drawable drawable1 = getBackground();
        if (drawable != null && drawable1 != null)
        {
            float af[] = b;
            af[0] = drawable.getBounds().centerX();
            getImageMatrix().mapPoints(af);
            i = (int)af[0] - getWidth() / 2;
            android.support.v4.b.a.a.a(drawable1, i, 0, getWidth() + i, getHeight());
        }
        return flag;
    }
}
