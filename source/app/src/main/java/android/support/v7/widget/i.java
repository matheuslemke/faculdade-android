// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Parcel;

final class i
    implements android.os.Parcelable.Creator
{

    i()
    {
    }

    public ActionMenuPresenter.SavedState a(Parcel parcel)
    {
        return new ActionMenuPresenter.SavedState(parcel);
    }

    public ActionMenuPresenter.SavedState[] a(int j)
    {
        return new ActionMenuPresenter.SavedState[j];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int j)
    {
        return a(j);
    }
}
