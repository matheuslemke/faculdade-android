// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            ac, y

class ae
    implements Runnable
{

    final ac a;

    private ae(ac ac1)
    {
        a = ac1;
        super();
    }

    ae(ac ac1, y y)
    {
        this(ac1);
    }

    public void run()
    {
        ac.b(a);
    }
}
