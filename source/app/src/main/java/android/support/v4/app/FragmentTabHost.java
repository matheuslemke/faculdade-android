// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.os.Parcelable;
import android.widget.TabHost;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            ah, u, ai, Fragment

public class FragmentTabHost extends TabHost
    implements android.widget.TabHost.OnTabChangeListener
{

    private final ArrayList a;
    private Context b;
    private u c;
    private int d;
    private android.widget.TabHost.OnTabChangeListener e;
    private ah f;
    private boolean g;

    private ai a(String s, ai ai1)
    {
        ah ah1 = null;
        for (int i = 0; i < a.size(); i++)
        {
            ah ah2 = (ah)a.get(i);
            if (ah.b(ah2).equals(s))
            {
                ah1 = ah2;
            }
        }

        if (ah1 == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("No tab known for tag ").append(s).toString());
        }
        s = ai1;
        if (f != ah1)
        {
            s = ai1;
            if (ai1 == null)
            {
                s = c.a();
            }
            if (f != null && ah.a(f) != null)
            {
                s.b(ah.a(f));
            }
            if (ah1 != null)
            {
                if (ah.a(ah1) == null)
                {
                    ah.a(ah1, Fragment.a(b, ah.c(ah1).getName(), ah.d(ah1)));
                    s.a(d, ah.a(ah1), ah.b(ah1));
                } else
                {
                    s.c(ah.a(ah1));
                }
            }
            f = ah1;
        }
        return s;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        String s = getCurrentTabTag();
        ai ai1 = null;
        int i = 0;
        while (i < a.size()) 
        {
            ah ah1 = (ah)a.get(i);
            ah.a(ah1, c.a(ah.b(ah1)));
            ai ai2 = ai1;
            if (ah.a(ah1) != null)
            {
                ai2 = ai1;
                if (!ah.a(ah1).p())
                {
                    if (ah.b(ah1).equals(s))
                    {
                        f = ah1;
                        ai2 = ai1;
                    } else
                    {
                        ai2 = ai1;
                        if (ai1 == null)
                        {
                            ai2 = c.a();
                        }
                        ai2.b(ah.a(ah1));
                    }
                }
            }
            i++;
            ai1 = ai2;
        }
        g = true;
        ai1 = a(s, ai1);
        if (ai1 != null)
        {
            ai1.b();
            c.b();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        g = false;
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        setCurrentTabByTag(((SavedState) (parcelable)).a);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = getCurrentTabTag();
        return savedstate;
    }

    public void onTabChanged(String s)
    {
        if (g)
        {
            ai ai1 = a(s, null);
            if (ai1 != null)
            {
                ai1.b();
            }
        }
        if (e != null)
        {
            e.onTabChanged(s);
        }
    }

    public void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener ontabchangelistener)
    {
        e = ontabchangelistener;
    }

    public void setup()
    {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new ag();
        String a;

        public String toString()
        {
            return (new StringBuilder()).append("FragmentTabHost.SavedState{").append(Integer.toHexString(System.identityHashCode(this))).append(" curTab=").append(a).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeString(a);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readString();
        }

        SavedState(Parcel parcel, af af)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
