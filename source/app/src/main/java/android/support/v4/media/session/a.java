// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Parcel;

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    public MediaSessionCompat.Token a(Parcel parcel)
    {
        return new MediaSessionCompat.Token(parcel.readParcelable(null));
    }

    public MediaSessionCompat.Token[] a(int i)
    {
        return new MediaSessionCompat.Token[i];
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
