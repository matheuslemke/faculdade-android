// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            bl, bk, br, bq, 
//            bp, bo, bn, bm, 
//            bd, ba, bg, cd, 
//            bi, bf, bj, bb, 
//            bs

public class bc
{

    private static final bj a;

    static bj a()
    {
        return a;
    }

    static void a(ba ba1, ArrayList arraylist)
    {
        b(ba1, arraylist);
    }

    static void a(bb bb, bs bs)
    {
        b(bb, bs);
    }

    private static void b(ba ba1, ArrayList arraylist)
    {
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); ba1.a((bd)arraylist.next())) { }
    }

    private static void b(bb bb, bs bs)
    {
        if (bs != null)
        {
            if (bs instanceof bg)
            {
                bs = (bg)bs;
                cd.a(bb, ((bg) (bs)).d, ((bg) (bs)).f, ((bg) (bs)).e, ((bg) (bs)).a);
            } else
            {
                if (bs instanceof bi)
                {
                    bs = (bi)bs;
                    cd.a(bb, ((bi) (bs)).d, ((bi) (bs)).f, ((bi) (bs)).e, ((bi) (bs)).a);
                    return;
                }
                if (bs instanceof bf)
                {
                    bs = (bf)bs;
                    cd.a(bb, ((bf) (bs)).d, ((bf) (bs)).f, ((bf) (bs)).e, ((bf) (bs)).a, ((bf) (bs)).b, ((bf) (bs)).c);
                    return;
                }
            }
        }
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new bl();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            a = new bk();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            a = new br();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new bq();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new bp();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new bo();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            a = new bn();
        } else
        {
            a = new bm();
        }
    }
}
