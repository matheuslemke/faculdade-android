// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.internal.widget.ax;
import android.support.v7.internal.widget.bc;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;

// Referenced classes of package android.support.v7.widget:
//            SearchView, aq

public class d extends AutoCompleteTextView
{

    private final int a[] = {
        0x1010176
    };
    private int b;
    private SearchView c;
    private final ax d;

    public boolean enoughToFilter()
    {
        return b <= 0 || super.enoughToFilter();
    }

    protected void onFocusChanged(boolean flag, int i, Rect rect)
    {
        super.onFocusChanged(flag, i, rect);
        c.d();
    }

    public boolean onKeyPreIme(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            if (keyevent.getAction() == 0 && keyevent.getRepeatCount() == 0)
            {
                android.view.AutoComplete autocomplete = getKeyDispatcherState();
                if (autocomplete != null)
                {
                    autocomplete.Tracking(keyevent, this);
                }
                return true;
            }
            if (keyevent.getAction() == 1)
            {
                android.view.AutoComplete autocomplete1 = getKeyDispatcherState();
                if (autocomplete1 != null)
                {
                    autocomplete1.eUpEvent(keyevent);
                }
                if (keyevent.isTracking() && !keyevent.isCanceled())
                {
                    c.clearFocus();
                    SearchView.a(c, false);
                    return true;
                }
            }
        }
        return super.onKeyPreIme(i, keyevent);
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        if (flag && c.hasFocus() && getVisibility() == 0)
        {
            ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
            if (SearchView.a(getContext()))
            {
                SearchView.a.a(this, true);
            }
        }
    }

    public void performCompletion()
    {
    }

    protected void replaceText(CharSequence charsequence)
    {
    }

    public void setDropDownBackgroundResource(int i)
    {
        setDropDownBackgroundDrawable(d.a(i));
    }

    void setSearchView(SearchView searchview)
    {
        c = searchview;
    }

    public void setThreshold(int i)
    {
        super.setThreshold(i);
        b = i;
    }

    public (Context context)
    {
        this(context, null);
    }

    public <init>(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101006b);
    }

    public <init>(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = getThreshold();
        context = bc.a(context, attributeset, a, i, 0);
        if (context.d(0))
        {
            setDropDownBackgroundDrawable(context.a(0));
        }
        context.b();
        d = context.c();
    }
}
