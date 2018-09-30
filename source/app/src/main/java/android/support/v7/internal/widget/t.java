// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;


// Referenced classes of package android.support.v7.internal.widget:
//            n, o

class t
    implements Runnable
{

    final n a;

    private t(n n1)
    {
        a = n1;
        super();
    }

    t(n n1, o o)
    {
        this(n1);
    }

    public void run()
    {
        if (a.u)
        {
            if (a.getAdapter() != null)
            {
                a.post(this);
            }
            return;
        } else
        {
            n.b(a);
            return;
        }
    }
}
