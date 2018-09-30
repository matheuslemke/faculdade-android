// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.f.d;
import android.support.v4.f.n;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            aq, at, p

class as extends aq
{

    static boolean a = false;
    final n b = new n();
    final n c = new n();
    final String d;
    p e;
    boolean f;
    boolean g;

    as(String s, p p, boolean flag)
    {
        d = s;
        e = p;
        f = flag;
    }

    void a(p p)
    {
        e = p;
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as1[])
    {
        boolean flag = false;
        if (b.b() > 0)
        {
            printwriter.print(s);
            printwriter.println("Active Loaders:");
            String s1 = (new StringBuilder()).append(s).append("    ").toString();
            for (int i = 0; i < b.b(); i++)
            {
                at at1 = (at)b.b(i);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(b.a(i));
                printwriter.print(": ");
                printwriter.println(at1.toString());
                at1.a(s1, filedescriptor, printwriter, as1);
            }

        }
        if (c.b() > 0)
        {
            printwriter.print(s);
            printwriter.println("Inactive Loaders:");
            String s2 = (new StringBuilder()).append(s).append("    ").toString();
            for (int j = ((flag) ? 1 : 0); j < c.b(); j++)
            {
                at at2 = (at)c.b(j);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(c.a(j));
                printwriter.print(": ");
                printwriter.println(at2.toString());
                at2.a(s2, filedescriptor, printwriter, as1);
            }

        }
    }

    public boolean a()
    {
        int j = b.b();
        int i = 0;
        boolean flag1 = false;
        while (i < j) 
        {
            at at1 = (at)b.b(i);
            boolean flag;
            if (at1.h && !at1.f)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 |= flag;
            i++;
        }
        return flag1;
    }

    void b()
    {
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("Starting in ").append(this).toString());
        }
        if (f)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder()).append("Called doStart when already started: ").append(this).toString(), runtimeexception);
        } else
        {
            f = true;
            int i = b.b() - 1;
            while (i >= 0) 
            {
                ((at)b.b(i)).a();
                i--;
            }
        }
    }

    void c()
    {
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("Stopping in ").append(this).toString());
        }
        if (!f)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder()).append("Called doStop when not started: ").append(this).toString(), runtimeexception);
            return;
        }
        for (int i = b.b() - 1; i >= 0; i--)
        {
            ((at)b.b(i)).e();
        }

        f = false;
    }

    void d()
    {
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("Retaining in ").append(this).toString());
        }
        if (!f)
        {
            RuntimeException runtimeexception = new RuntimeException("here");
            runtimeexception.fillInStackTrace();
            Log.w("LoaderManager", (new StringBuilder()).append("Called doRetain when not started: ").append(this).toString(), runtimeexception);
        } else
        {
            g = true;
            f = false;
            int i = b.b() - 1;
            while (i >= 0) 
            {
                ((at)b.b(i)).b();
                i--;
            }
        }
    }

    void e()
    {
        if (g)
        {
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("Finished Retaining in ").append(this).toString());
            }
            g = false;
            for (int i = b.b() - 1; i >= 0; i--)
            {
                ((at)b.b(i)).c();
            }

        }
    }

    void f()
    {
        for (int i = b.b() - 1; i >= 0; i--)
        {
            ((at)b.b(i)).k = true;
        }

    }

    void g()
    {
        for (int i = b.b() - 1; i >= 0; i--)
        {
            ((at)b.b(i)).d();
        }

    }

    void h()
    {
        if (!g)
        {
            if (a)
            {
                Log.v("LoaderManager", (new StringBuilder()).append("Destroying Active in ").append(this).toString());
            }
            for (int i = b.b() - 1; i >= 0; i--)
            {
                ((at)b.b(i)).f();
            }

            b.c();
        }
        if (a)
        {
            Log.v("LoaderManager", (new StringBuilder()).append("Destroying Inactive in ").append(this).toString());
        }
        for (int j = c.b() - 1; j >= 0; j--)
        {
            ((at)c.b(j)).f();
        }

        c.c();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("LoaderManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        android.support.v4.f.d.a(e, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

}
