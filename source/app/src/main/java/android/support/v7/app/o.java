// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.os.Parcel;

final class o
    implements android.os.Parcelable.Creator
{

    o()
    {
    }

    public ActionBarActivityDelegateBase.PanelFeatureState.SavedState a(Parcel parcel)
    {
        return ActionBarActivityDelegateBase.PanelFeatureState.SavedState.a(parcel);
    }

    public ActionBarActivityDelegateBase.PanelFeatureState.SavedState[] a(int i)
    {
        return new ActionBarActivityDelegateBase.PanelFeatureState.SavedState[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
