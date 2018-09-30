// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//            w, p

class z
    implements Runnable
{

    final int a;
    final int b;
    final w c;

    z(w w1, int i, int j)
    {
        c = w1;
        a = i;
        b = j;
        super();
    }

    public void run()
    {
        c.a(c.o.a, null, a, b);
    }
}
