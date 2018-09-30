// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.f.d;
import android.support.v4.f.m;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//            n, w, m, ct, 
//            as, p, cs, u

public class Fragment
    implements ComponentCallbacks, android.view.View.OnCreateContextMenuListener
{

    private static final m a = new m();
    static final Object j = new Object();
    boolean A;
    int B;
    w C;
    p D;
    w E;
    Fragment F;
    int G;
    int H;
    String I;
    boolean J;
    boolean K;
    boolean L;
    boolean M;
    boolean N;
    boolean O;
    boolean P;
    int Q;
    ViewGroup R;
    View S;
    View T;
    boolean U;
    boolean V;
    as W;
    boolean X;
    boolean Y;
    Object Z;
    Object aa;
    Object ab;
    Object ac;
    Object ad;
    Object ae;
    Boolean af;
    Boolean ag;
    cs ah;
    cs ai;
    int k;
    View l;
    int m;
    Bundle n;
    SparseArray o;
    int p;
    String q;
    Bundle r;
    Fragment s;
    int t;
    int u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;

    public Fragment()
    {
        k = 0;
        p = -1;
        t = -1;
        O = true;
        V = true;
        Z = null;
        aa = j;
        ab = null;
        ac = j;
        ad = null;
        ae = j;
        ah = null;
        ai = null;
    }

    public static Fragment a(Context context, String s1)
    {
        return a(context, s1, ((Bundle) (null)));
    }

    public static Fragment a(Context context, String s1, Bundle bundle)
    {
        Class class1;
        Class class2;
        try
        {
            class2 = (Class)a.get(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new n((new StringBuilder()).append("Unable to instantiate fragment ").append(s1).append(": make sure class name exists, is public, and has an").append(" empty constructor that is public").toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new n((new StringBuilder()).append("Unable to instantiate fragment ").append(s1).append(": make sure class name exists, is public, and has an").append(" empty constructor that is public").toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new n((new StringBuilder()).append("Unable to instantiate fragment ").append(s1).append(": make sure class name exists, is public, and has an").append(" empty constructor that is public").toString(), context);
        }
        class1 = class2;
        if (class2 != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        class1 = context.getClassLoader().loadClass(s1);
        a.put(s1, class1);
        context = (Fragment)class1.newInstance();
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        bundle.setClassLoader(context.getClass().getClassLoader());
        context.r = bundle;
        return context;
    }

    static boolean b(Context context, String s1)
    {
        Class class1;
        Class class2;
        boolean flag;
        try
        {
            class2 = (Class)a.get(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        class1 = class2;
        if (class2 != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        class1 = context.getClassLoader().loadClass(s1);
        a.put(s1, class1);
        flag = android/support/v4/app/Fragment.isAssignableFrom(class1);
        return flag;
    }

    public Object A()
    {
        if (ac == j)
        {
            return z();
        } else
        {
            return ac;
        }
    }

    public Object B()
    {
        return ad;
    }

    public Object C()
    {
        if (ae == j)
        {
            return B();
        } else
        {
            return ae;
        }
    }

    public boolean D()
    {
        if (ag == null)
        {
            return true;
        } else
        {
            return ag.booleanValue();
        }
    }

    public boolean E()
    {
        if (af == null)
        {
            return true;
        } else
        {
            return af.booleanValue();
        }
    }

    void F()
    {
        E = new w();
        E.a(D, new android.support.v4.app.m(this), this);
    }

    void G()
    {
        if (E != null)
        {
            E.k();
            E.g();
        }
        P = false;
        f();
        if (!P)
        {
            throw new ct((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onStart()").toString());
        }
        if (E != null)
        {
            E.n();
        }
        if (W != null)
        {
            W.g();
        }
    }

    void H()
    {
        if (E != null)
        {
            E.k();
            E.g();
        }
        P = false;
        s();
        if (!P)
        {
            throw new ct((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onResume()").toString());
        }
        if (E != null)
        {
            E.o();
            E.g();
        }
    }

    void I()
    {
        onLowMemory();
        if (E != null)
        {
            E.u();
        }
    }

    void J()
    {
        if (E != null)
        {
            E.p();
        }
        P = false;
        t();
        if (!P)
        {
            throw new ct((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onPause()").toString());
        } else
        {
            return;
        }
    }

    void K()
    {
        if (E != null)
        {
            E.q();
        }
        P = false;
        g();
        if (!P)
        {
            throw new ct((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onStop()").toString());
        } else
        {
            return;
        }
    }

    void L()
    {
label0:
        {
            if (E != null)
            {
                E.r();
            }
            if (X)
            {
                X = false;
                if (!Y)
                {
                    Y = true;
                    W = D.a(q, X, false);
                }
                if (W != null)
                {
                    if (D.h)
                    {
                        break label0;
                    }
                    W.c();
                }
            }
            return;
        }
        W.d();
    }

    void M()
    {
        if (E != null)
        {
            E.s();
        }
        P = false;
        h();
        if (!P)
        {
            throw new ct((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onDestroyView()").toString());
        }
        if (W != null)
        {
            W.f();
        }
    }

    void N()
    {
        if (E != null)
        {
            E.t();
        }
        P = false;
        u();
        if (!P)
        {
            throw new ct((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onDestroy()").toString());
        } else
        {
            return;
        }
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return null;
    }

    public Animation a(int i1, boolean flag, int j1)
    {
        return null;
    }

    public final String a(int i1)
    {
        return l().getString(i1);
    }

    public void a(int i1, int j1, Intent intent)
    {
    }

    final void a(int i1, Fragment fragment)
    {
        p = i1;
        if (fragment != null)
        {
            q = (new StringBuilder()).append(fragment.q).append(":").append(p).toString();
            return;
        } else
        {
            q = (new StringBuilder()).append("android:fragment:").append(p).toString();
            return;
        }
    }

    public void a(Activity activity)
    {
        P = true;
    }

    public void a(Activity activity, AttributeSet attributeset, Bundle bundle)
    {
        P = true;
    }

    public void a(Intent intent)
    {
        if (D == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(this).append(" not attached to Activity").toString());
        } else
        {
            D.a(this, intent, -1);
            return;
        }
    }

    public void a(Intent intent, int i1)
    {
        if (D == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(this).append(" not attached to Activity").toString());
        } else
        {
            D.a(this, intent, i1);
            return;
        }
    }

    void a(Configuration configuration)
    {
        onConfigurationChanged(configuration);
        if (E != null)
        {
            E.a(configuration);
        }
    }

    public void a(Bundle bundle)
    {
        P = true;
    }

    public void a(SavedState savedstate)
    {
        if (p >= 0)
        {
            throw new IllegalStateException("Fragment already active");
        }
        if (savedstate != null && savedstate.a != null)
        {
            savedstate = savedstate.a;
        } else
        {
            savedstate = null;
        }
        n = savedstate;
    }

    public void a(Menu menu)
    {
    }

    public void a(Menu menu, MenuInflater menuinflater)
    {
    }

    public void a(View view, Bundle bundle)
    {
    }

    public void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as1[])
    {
        printwriter.print(s1);
        printwriter.print("mFragmentId=#");
        printwriter.print(Integer.toHexString(G));
        printwriter.print(" mContainerId=#");
        printwriter.print(Integer.toHexString(H));
        printwriter.print(" mTag=");
        printwriter.println(I);
        printwriter.print(s1);
        printwriter.print("mState=");
        printwriter.print(k);
        printwriter.print(" mIndex=");
        printwriter.print(p);
        printwriter.print(" mWho=");
        printwriter.print(q);
        printwriter.print(" mBackStackNesting=");
        printwriter.println(B);
        printwriter.print(s1);
        printwriter.print("mAdded=");
        printwriter.print(v);
        printwriter.print(" mRemoving=");
        printwriter.print(w);
        printwriter.print(" mResumed=");
        printwriter.print(x);
        printwriter.print(" mFromLayout=");
        printwriter.print(y);
        printwriter.print(" mInLayout=");
        printwriter.println(z);
        printwriter.print(s1);
        printwriter.print("mHidden=");
        printwriter.print(J);
        printwriter.print(" mDetached=");
        printwriter.print(K);
        printwriter.print(" mMenuVisible=");
        printwriter.print(O);
        printwriter.print(" mHasMenu=");
        printwriter.println(N);
        printwriter.print(s1);
        printwriter.print("mRetainInstance=");
        printwriter.print(L);
        printwriter.print(" mRetaining=");
        printwriter.print(M);
        printwriter.print(" mUserVisibleHint=");
        printwriter.println(V);
        if (C != null)
        {
            printwriter.print(s1);
            printwriter.print("mFragmentManager=");
            printwriter.println(C);
        }
        if (D != null)
        {
            printwriter.print(s1);
            printwriter.print("mActivity=");
            printwriter.println(D);
        }
        if (F != null)
        {
            printwriter.print(s1);
            printwriter.print("mParentFragment=");
            printwriter.println(F);
        }
        if (r != null)
        {
            printwriter.print(s1);
            printwriter.print("mArguments=");
            printwriter.println(r);
        }
        if (n != null)
        {
            printwriter.print(s1);
            printwriter.print("mSavedFragmentState=");
            printwriter.println(n);
        }
        if (o != null)
        {
            printwriter.print(s1);
            printwriter.print("mSavedViewState=");
            printwriter.println(o);
        }
        if (s != null)
        {
            printwriter.print(s1);
            printwriter.print("mTarget=");
            printwriter.print(s);
            printwriter.print(" mTargetRequestCode=");
            printwriter.println(u);
        }
        if (Q != 0)
        {
            printwriter.print(s1);
            printwriter.print("mNextAnim=");
            printwriter.println(Q);
        }
        if (R != null)
        {
            printwriter.print(s1);
            printwriter.print("mContainer=");
            printwriter.println(R);
        }
        if (S != null)
        {
            printwriter.print(s1);
            printwriter.print("mView=");
            printwriter.println(S);
        }
        if (T != null)
        {
            printwriter.print(s1);
            printwriter.print("mInnerView=");
            printwriter.println(S);
        }
        if (l != null)
        {
            printwriter.print(s1);
            printwriter.print("mAnimatingAway=");
            printwriter.println(l);
            printwriter.print(s1);
            printwriter.print("mStateAfterAnimating=");
            printwriter.println(m);
        }
        if (W != null)
        {
            printwriter.print(s1);
            printwriter.println("Loader Manager:");
            W.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as1);
        }
        if (E != null)
        {
            printwriter.print(s1);
            printwriter.println((new StringBuilder()).append("Child ").append(E).append(":").toString());
            E.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as1);
        }
    }

    public boolean a(MenuItem menuitem)
    {
        return false;
    }

    public LayoutInflater b(Bundle bundle)
    {
        bundle = D.getLayoutInflater().cloneInContext(D);
        n();
        bundle.setFactory(E.v());
        return bundle;
    }

    View b(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (E != null)
        {
            E.k();
        }
        return a(layoutinflater, viewgroup, bundle);
    }

    public void b(Menu menu)
    {
    }

    boolean b(Menu menu, MenuInflater menuinflater)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        if (!J)
        {
            boolean flag = flag2;
            if (N)
            {
                flag = flag2;
                if (O)
                {
                    flag = true;
                    a(menu, menuinflater);
                }
            }
            flag1 = flag;
            if (E != null)
            {
                flag1 = flag | E.a(menu, menuinflater);
            }
        }
        return flag1;
    }

    public boolean b(MenuItem menuitem)
    {
        return false;
    }

    public void c(boolean flag)
    {
    }

    boolean c(Menu menu)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        if (!J)
        {
            boolean flag = flag2;
            if (N)
            {
                flag = flag2;
                if (O)
                {
                    flag = true;
                    a(menu);
                }
            }
            flag1 = flag;
            if (E != null)
            {
                flag1 = flag | E.a(menu);
            }
        }
        return flag1;
    }

    boolean c(MenuItem menuitem)
    {
        while (!J && (N && O && a(menuitem) || E != null && E.a(menuitem))) 
        {
            return true;
        }
        return false;
    }

    public void d(Bundle bundle)
    {
        P = true;
    }

    void d(Menu menu)
    {
        if (!J)
        {
            if (N && O)
            {
                b(menu);
            }
            if (E != null)
            {
                E.b(menu);
            }
        }
    }

    public void d(boolean flag)
    {
        if (N != flag)
        {
            N = flag;
            if (o() && !q())
            {
                D.d();
            }
        }
    }

    boolean d(MenuItem menuitem)
    {
        while (!J && (b(menuitem) || E != null && E.b(menuitem))) 
        {
            return true;
        }
        return false;
    }

    public void e()
    {
        P = true;
    }

    public void e(Bundle bundle)
    {
    }

    public void e(boolean flag)
    {
        if (O != flag)
        {
            O = flag;
            if (N && o() && !q())
            {
                D.d();
            }
        }
    }

    public final boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public void f()
    {
        P = true;
        if (!X)
        {
            X = true;
            if (!Y)
            {
                Y = true;
                W = D.a(q, X, false);
            }
            if (W != null)
            {
                W.b();
            }
        }
    }

    final void f(Bundle bundle)
    {
        if (o != null)
        {
            T.restoreHierarchyState(o);
            o = null;
        }
        P = false;
        h(bundle);
        if (!P)
        {
            throw new ct((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onViewStateRestored()").toString());
        } else
        {
            return;
        }
    }

    public void f(boolean flag)
    {
        if (!V && flag && k < 4)
        {
            C.b(this);
        }
        V = flag;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        U = flag;
    }

    public void g()
    {
        P = true;
    }

    public void g(Bundle bundle)
    {
        if (p >= 0)
        {
            throw new IllegalStateException("Fragment already active");
        } else
        {
            r = bundle;
            return;
        }
    }

    public void h()
    {
        P = true;
    }

    public void h(Bundle bundle)
    {
        P = true;
    }

    public final int hashCode()
    {
        return super.hashCode();
    }

    void i(Bundle bundle)
    {
        if (E != null)
        {
            E.k();
        }
        P = false;
        a(bundle);
        if (!P)
        {
            throw new ct((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onCreate()").toString());
        }
        if (bundle != null)
        {
            bundle = bundle.getParcelable("android:support:fragments");
            if (bundle != null)
            {
                if (E == null)
                {
                    F();
                }
                E.a(bundle, null);
                E.l();
            }
        }
    }

    final boolean i()
    {
        return B > 0;
    }

    public final Bundle j()
    {
        return r;
    }

    void j(Bundle bundle)
    {
        if (E != null)
        {
            E.k();
        }
        P = false;
        d(bundle);
        if (!P)
        {
            throw new ct((new StringBuilder()).append("Fragment ").append(this).append(" did not call through to super.onActivityCreated()").toString());
        }
        if (E != null)
        {
            E.m();
        }
    }

    public final p k()
    {
        return D;
    }

    void k(Bundle bundle)
    {
        e(bundle);
        if (E != null)
        {
            Parcelable parcelable = E.j();
            if (parcelable != null)
            {
                bundle.putParcelable("android:support:fragments", parcelable);
            }
        }
    }

    public final Resources l()
    {
        if (D == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Fragment ").append(this).append(" not attached to Activity").toString());
        } else
        {
            return D.getResources();
        }
    }

    public final u m()
    {
        return C;
    }

    public final u n()
    {
        if (E != null) goto _L2; else goto _L1
_L1:
        F();
        if (k < 5) goto _L4; else goto _L3
_L3:
        E.o();
_L2:
        return E;
_L4:
        if (k >= 4)
        {
            E.n();
        } else
        if (k >= 2)
        {
            E.m();
        } else
        if (k >= 1)
        {
            E.l();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final boolean o()
    {
        return D != null && v;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        P = true;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        k().onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    public void onLowMemory()
    {
        P = true;
    }

    public final boolean p()
    {
        return K;
    }

    public final boolean q()
    {
        return J;
    }

    public View r()
    {
        return S;
    }

    public void s()
    {
        P = true;
    }

    public void t()
    {
        P = true;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        android.support.v4.f.d.a(this, stringbuilder);
        if (p >= 0)
        {
            stringbuilder.append(" #");
            stringbuilder.append(p);
        }
        if (G != 0)
        {
            stringbuilder.append(" id=0x");
            stringbuilder.append(Integer.toHexString(G));
        }
        if (I != null)
        {
            stringbuilder.append(" ");
            stringbuilder.append(I);
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    public void u()
    {
        P = true;
        if (!Y)
        {
            Y = true;
            W = D.a(q, X, false);
        }
        if (W != null)
        {
            W.h();
        }
    }

    void v()
    {
        p = -1;
        q = null;
        v = false;
        w = false;
        x = false;
        y = false;
        z = false;
        A = false;
        B = 0;
        C = null;
        E = null;
        D = null;
        G = 0;
        H = 0;
        I = null;
        J = false;
        K = false;
        M = false;
        W = null;
        X = false;
        Y = false;
    }

    public void w()
    {
    }

    public Object x()
    {
        return Z;
    }

    public Object y()
    {
        if (aa == j)
        {
            return x();
        } else
        {
            return aa;
        }
    }

    public Object z()
    {
        return ab;
    }


    private class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new o();
        final Bundle a;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeBundle(a);
        }


        SavedState(Bundle bundle)
        {
            a = bundle;
        }

        SavedState(Parcel parcel, ClassLoader classloader)
        {
            a = parcel.readBundle();
            if (classloader != null && a != null)
            {
                a.setClassLoader(classloader);
            }
        }
    }

}
