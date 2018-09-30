// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            k, e, i, Fragment, 
//            w

final class BackStackState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new k();
    final int a[];
    final int b;
    final int c;
    final String d;
    final int e;
    final int f;
    final CharSequence g;
    final int h;
    final CharSequence i;
    final ArrayList j;
    final ArrayList k;

    public BackStackState(Parcel parcel)
    {
        a = parcel.createIntArray();
        b = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readString();
        e = parcel.readInt();
        f = parcel.readInt();
        g = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        h = parcel.readInt();
        i = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        j = parcel.createStringArrayList();
        k = parcel.createStringArrayList();
    }

    public BackStackState(w w1, e e1)
    {
        w1 = e1.b;
        int l;
        int i1;
        for (l = 0; w1 != null; l = i1)
        {
            i1 = l;
            if (((i) (w1)).i != null)
            {
                i1 = l + ((i) (w1)).i.size();
            }
            w1 = ((i) (w1)).a;
        }

        a = new int[l + e1.d * 7];
        if (!e1.k)
        {
            throw new IllegalStateException("Not on back stack");
        }
        w1 = e1.b;
        l = 0;
        while (w1 != null) 
        {
            int ai[] = a;
            int j1 = l + 1;
            ai[l] = ((i) (w1)).c;
            ai = a;
            int k1 = j1 + 1;
            if (((i) (w1)).d != null)
            {
                l = ((i) (w1)).d.p;
            } else
            {
                l = -1;
            }
            ai[j1] = l;
            ai = a;
            l = k1 + 1;
            ai[k1] = ((i) (w1)).e;
            ai = a;
            j1 = l + 1;
            ai[l] = ((i) (w1)).f;
            ai = a;
            l = j1 + 1;
            ai[j1] = ((i) (w1)).g;
            ai = a;
            j1 = l + 1;
            ai[l] = ((i) (w1)).h;
            if (((i) (w1)).i != null)
            {
                int l1 = ((i) (w1)).i.size();
                int ai1[] = a;
                l = j1 + 1;
                ai1[j1] = l1;
                for (j1 = 0; j1 < l1;)
                {
                    a[l] = ((Fragment)((i) (w1)).i.get(j1)).p;
                    j1++;
                    l++;
                }

            } else
            {
                int ai2[] = a;
                l = j1 + 1;
                ai2[j1] = 0;
            }
            w1 = ((i) (w1)).a;
        }
        b = e1.i;
        c = e1.j;
        d = e1.m;
        e = e1.o;
        f = e1.p;
        g = e1.q;
        h = e1.r;
        i = e1.s;
        j = e1.t;
        k = e1.u;
    }

    public e a(w w1)
    {
        e e1 = new e(w1);
        int k1 = 0;
        for (int i1 = 0; i1 < a.length;)
        {
            i l = new i();
            int ai[] = a;
            int j1 = i1 + 1;
            l.c = ai[i1];
            if (w.a)
            {
                Log.v("FragmentManager", (new StringBuilder()).append("Instantiate ").append(e1).append(" op #").append(k1).append(" base fragment #").append(a[j1]).toString());
            }
            ai = a;
            i1 = j1 + 1;
            j1 = ai[j1];
            int i2;
            if (j1 >= 0)
            {
                l.d = (Fragment)w1.f.get(j1);
            } else
            {
                l.d = null;
            }
            ai = a;
            j1 = i1 + 1;
            l.e = ai[i1];
            ai = a;
            i1 = j1 + 1;
            l.f = ai[j1];
            ai = a;
            j1 = i1 + 1;
            l.g = ai[i1];
            ai = a;
            i1 = j1 + 1;
            l.h = ai[j1];
            ai = a;
            j1 = i1 + 1;
            i2 = ai[i1];
            i1 = j1;
            if (i2 > 0)
            {
                l.i = new ArrayList(i2);
                int l1 = 0;
                do
                {
                    i1 = j1;
                    if (l1 >= i2)
                    {
                        break;
                    }
                    if (w.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder()).append("Instantiate ").append(e1).append(" set remove fragment #").append(a[j1]).toString());
                    }
                    Fragment fragment = (Fragment)w1.f.get(a[j1]);
                    l.i.add(fragment);
                    l1++;
                    j1++;
                } while (true);
            }
            e1.a(l);
            k1++;
        }

        e1.i = b;
        e1.j = c;
        e1.m = d;
        e1.o = e;
        e1.k = true;
        e1.p = f;
        e1.q = g;
        e1.r = h;
        e1.s = i;
        e1.t = j;
        e1.u = k;
        e1.a(1);
        return e1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        parcel.writeIntArray(a);
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeString(d);
        parcel.writeInt(e);
        parcel.writeInt(f);
        TextUtils.writeToParcel(g, parcel, 0);
        parcel.writeInt(h);
        TextUtils.writeToParcel(i, parcel, 0);
        parcel.writeStringList(j);
        parcel.writeStringList(k);
    }

}
