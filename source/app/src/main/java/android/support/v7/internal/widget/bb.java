// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ListPopupWindow;
import android.widget.Spinner;
import java.lang.reflect.Field;

// Referenced classes of package android.support.v7.internal.widget:
//            bc

public class bb extends Spinner
{

    private static final int a[] = {
        0x10100d4, 0x1010176
    };

    public bb(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010081);
    }

    public bb(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = bc.a(context, attributeset, a, i, 0);
        setBackgroundDrawable(context.a(0));
        if (!context.d(1)) goto _L2; else goto _L1
_L1:
        attributeset = context.a(1);
        if (android.os.Build.VERSION.SDK_INT < 16) goto _L4; else goto _L3
_L3:
        setPopupBackgroundDrawable(attributeset);
_L2:
        context.b();
        return;
_L4:
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a(this, attributeset);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private static void a(Spinner spinner, Drawable drawable)
    {
        try
        {
            Field field = android/widget/Spinner.getDeclaredField("mPopup");
            field.setAccessible(true);
            spinner = ((Spinner) (field.get(spinner)));
            if (spinner instanceof ListPopupWindow)
            {
                ((ListPopupWindow)spinner).setBackgroundDrawable(drawable);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Spinner spinner)
        {
            spinner.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Spinner spinner)
        {
            spinner.printStackTrace();
        }
    }

}
