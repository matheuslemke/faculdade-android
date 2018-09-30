// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.support.v4.f.a;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            ai, j, w, Fragment, 
//            aj, cs, i, g, 
//            ao, h, t, f

final class e extends ai
    implements Runnable
{

    final w a;
    i b;
    i c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    boolean k;
    boolean l;
    String m;
    boolean n;
    int o;
    int p;
    CharSequence q;
    int r;
    CharSequence s;
    ArrayList t;
    ArrayList u;

    public e(w w1)
    {
        l = true;
        o = -1;
        a = w1;
    }

    private j a(SparseArray sparsearray, SparseArray sparsearray1, boolean flag)
    {
        boolean flag4 = false;
        j j1 = new j(this);
        j1.d = new View(a.o);
        int i1 = 0;
        boolean flag1 = false;
        int l1;
        boolean flag3;
        do
        {
            l1 = ((flag4) ? 1 : 0);
            flag3 = flag1;
            if (i1 >= sparsearray.size())
            {
                break;
            }
            if (a(sparsearray.keyAt(i1), j1, flag, sparsearray, sparsearray1))
            {
                flag1 = true;
            }
            i1++;
        } while (true);
        while (l1 < sparsearray1.size()) 
        {
            int k1 = sparsearray1.keyAt(l1);
            boolean flag2 = flag3;
            if (sparsearray.get(k1) == null)
            {
                flag2 = flag3;
                if (a(k1, j1, flag, sparsearray, sparsearray1))
                {
                    flag2 = true;
                }
            }
            l1++;
            flag3 = flag2;
        }
        sparsearray = j1;
        if (!flag3)
        {
            sparsearray = null;
        }
        return sparsearray;
    }

    static a a(e e1, j j1, boolean flag, Fragment fragment)
    {
        return e1.a(j1, flag, fragment);
    }

    private a a(j j1, Fragment fragment, boolean flag)
    {
        a a2 = new a();
        a a1 = a2;
        if (t != null)
        {
            android.support.v4.app.aj.a(a2, fragment.r());
            if (flag)
            {
                a2.a(u);
                a1 = a2;
            } else
            {
                a1 = a(t, u, a2);
            }
        }
        if (flag)
        {
            if (fragment.ah != null)
            {
                fragment.ah.a(u, a1);
            }
            a(j1, a1, false);
            return a1;
        }
        if (fragment.ai != null)
        {
            fragment.ai.a(u, a1);
        }
        b(j1, a1, false);
        return a1;
    }

    private a a(j j1, boolean flag, Fragment fragment)
    {
        a a1 = b(j1, fragment, flag);
        if (flag)
        {
            if (fragment.ai != null)
            {
                fragment.ai.a(u, a1);
            }
            a(j1, a1, true);
            return a1;
        }
        if (fragment.ah != null)
        {
            fragment.ah.a(u, a1);
        }
        b(j1, a1, true);
        return a1;
    }

    private static a a(ArrayList arraylist, ArrayList arraylist1, a a1)
    {
        if (a1.isEmpty())
        {
            return a1;
        }
        a a2 = new a();
        int j1 = arraylist.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = (View)a1.get(arraylist.get(i1));
            if (view != null)
            {
                a2.put(arraylist1.get(i1), view);
            }
        }

        return a2;
    }

    private static Object a(Fragment fragment, Fragment fragment1, boolean flag)
    {
        if (fragment == null || fragment1 == null)
        {
            return null;
        }
        if (flag)
        {
            fragment = ((Fragment) (fragment1.C()));
        } else
        {
            fragment = ((Fragment) (fragment.B()));
        }
        return android.support.v4.app.aj.a(fragment);
    }

    private static Object a(Fragment fragment, boolean flag)
    {
        if (fragment == null)
        {
            return null;
        }
        if (flag)
        {
            fragment = ((Fragment) (fragment.A()));
        } else
        {
            fragment = ((Fragment) (fragment.x()));
        }
        return android.support.v4.app.aj.a(fragment);
    }

    private static Object a(Object obj, Fragment fragment, ArrayList arraylist, a a1)
    {
        Object obj1 = obj;
        if (obj != null)
        {
            obj1 = android.support.v4.app.aj.a(obj, fragment.r(), arraylist, a1);
        }
        return obj1;
    }

    private void a(int i1, Fragment fragment, String s1, int j1)
    {
        fragment.C = a;
        if (s1 != null)
        {
            if (fragment.I != null && !s1.equals(fragment.I))
            {
                throw new IllegalStateException((new StringBuilder()).append("Can't change tag of fragment ").append(fragment).append(": was ").append(fragment.I).append(" now ").append(s1).toString());
            }
            fragment.I = s1;
        }
        if (i1 != 0)
        {
            if (fragment.G != 0 && fragment.G != i1)
            {
                throw new IllegalStateException((new StringBuilder()).append("Can't change container ID of fragment ").append(fragment).append(": was ").append(fragment.G).append(" now ").append(i1).toString());
            }
            fragment.G = i1;
            fragment.H = i1;
        }
        s1 = new i();
        s1.c = j1;
        s1.d = fragment;
        a(((i) (s1)));
    }

    static void a(e e1, j j1, int i1, Object obj)
    {
        e1.a(j1, i1, obj);
    }

    static void a(e e1, j j1, Fragment fragment, Fragment fragment1, boolean flag, a a1)
    {
        e1.a(j1, fragment, fragment1, flag, a1);
    }

    static void a(e e1, a a1, j j1)
    {
        e1.a(a1, j1);
    }

    private void a(j j1, int i1, Object obj)
    {
        if (a.g != null)
        {
            int k1 = 0;
            while (k1 < a.g.size()) 
            {
                Fragment fragment = (Fragment)a.g.get(k1);
                if (fragment.S != null && fragment.R != null && fragment.H == i1)
                {
                    if (fragment.J)
                    {
                        if (!j1.b.contains(fragment.S))
                        {
                            android.support.v4.app.aj.a(obj, fragment.S, true);
                            j1.b.add(fragment.S);
                        }
                    } else
                    {
                        android.support.v4.app.aj.a(obj, fragment.S, false);
                        j1.b.remove(fragment.S);
                    }
                }
                k1++;
            }
        }
    }

    private void a(j j1, Fragment fragment, Fragment fragment1, boolean flag, a a1)
    {
        if (flag)
        {
            j1 = fragment1.ah;
        } else
        {
            j1 = fragment.ah;
        }
        if (j1 != null)
        {
            j1.b(new ArrayList(a1.keySet()), new ArrayList(a1.values()), null);
        }
    }

    private void a(j j1, a a1, boolean flag)
    {
        int i1;
        int k1;
        if (u == null)
        {
            i1 = 0;
        } else
        {
            i1 = u.size();
        }
        k1 = 0;
        while (k1 < i1) 
        {
            String s1 = (String)t.get(k1);
            Object obj = (View)a1.get((String)u.get(k1));
            if (obj != null)
            {
                obj = android.support.v4.app.aj.a(((View) (obj)));
                if (flag)
                {
                    a(j1.a, s1, ((String) (obj)));
                } else
                {
                    a(j1.a, ((String) (obj)), s1);
                }
            }
            k1++;
        }
    }

    private void a(j j1, View view, Object obj, Fragment fragment, Fragment fragment1, boolean flag, ArrayList arraylist)
    {
        view.getViewTreeObserver().addOnPreDrawListener(new g(this, view, obj, arraylist, j1, flag, fragment, fragment1));
    }

    private static void a(j j1, ArrayList arraylist, ArrayList arraylist1)
    {
        if (arraylist != null)
        {
            for (int i1 = 0; i1 < arraylist.size(); i1++)
            {
                String s1 = (String)arraylist.get(i1);
                String s2 = (String)arraylist1.get(i1);
                a(j1.a, s1, s2);
            }

        }
    }

    private void a(a a1, j j1)
    {
        if (u != null && !a1.isEmpty())
        {
            a1 = (View)a1.get(u.get(0));
            if (a1 != null)
            {
                j1.c.a = a1;
            }
        }
    }

    private static void a(a a1, String s1, String s2)
    {
        if (s1 == null || s2 == null || s1.equals(s2)) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L6:
        if (i1 >= a1.size())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!s1.equals(a1.c(i1))) goto _L4; else goto _L3
_L3:
        a1.a(i1, s2);
_L2:
        return;
_L4:
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
        a1.put(s1, s2);
        return;
    }

    private static void a(SparseArray sparsearray, Fragment fragment)
    {
        if (fragment != null)
        {
            int i1 = fragment.H;
            if (i1 != 0 && !fragment.q() && fragment.o() && fragment.r() != null && sparsearray.get(i1) == null)
            {
                sparsearray.put(i1, fragment);
            }
        }
    }

    private void a(View view, j j1, int i1, Object obj)
    {
        view.getViewTreeObserver().addOnPreDrawListener(new h(this, view, j1, i1, obj));
    }

    private boolean a(int i1, j j1, boolean flag, SparseArray sparsearray, SparseArray sparsearray1)
    {
        ViewGroup viewgroup = (ViewGroup)a.p.a(i1);
        if (viewgroup == null)
        {
            return false;
        }
        Object obj1 = (Fragment)sparsearray1.get(i1);
        Object obj4 = (Fragment)sparsearray.get(i1);
        Object obj2 = a(((Fragment) (obj1)), flag);
        Object obj3 = a(((Fragment) (obj1)), ((Fragment) (obj4)), flag);
        Object obj5 = b(((Fragment) (obj4)), flag);
        if (obj2 == null && obj3 == null && obj5 == null)
        {
            return false;
        }
        sparsearray = null;
        ArrayList arraylist = new ArrayList();
        if (obj3 != null)
        {
            Object obj = a(j1, ((Fragment) (obj4)), flag);
            if (((a) (obj)).isEmpty())
            {
                arraylist.add(j1.d);
            } else
            {
                arraylist.addAll(((a) (obj)).values());
            }
            if (flag)
            {
                sparsearray1 = ((Fragment) (obj4)).ah;
            } else
            {
                sparsearray1 = ((Fragment) (obj1)).ah;
            }
            sparsearray = ((SparseArray) (obj));
            if (sparsearray1 != null)
            {
                sparsearray1.a(new ArrayList(((a) (obj)).keySet()), new ArrayList(((a) (obj)).values()), null);
                sparsearray = ((SparseArray) (obj));
            }
        }
        sparsearray1 = new ArrayList();
        obj = a(obj5, ((Fragment) (obj4)), ((ArrayList) (sparsearray1)), ((a) (sparsearray)));
        if (u != null && sparsearray != null)
        {
            sparsearray = (View)sparsearray.get(u.get(0));
            if (sparsearray != null)
            {
                if (obj != null)
                {
                    android.support.v4.app.aj.a(obj, sparsearray);
                }
                if (obj3 != null)
                {
                    android.support.v4.app.aj.a(obj3, sparsearray);
                }
            }
        }
        sparsearray = new f(this, ((Fragment) (obj1)));
        if (obj3 != null)
        {
            a(j1, ((View) (viewgroup)), obj3, ((Fragment) (obj1)), ((Fragment) (obj4)), flag, arraylist);
        }
        obj4 = new ArrayList();
        obj5 = new a();
        if (flag)
        {
            flag = ((Fragment) (obj1)).E();
        } else
        {
            flag = ((Fragment) (obj1)).D();
        }
        obj1 = android.support.v4.app.aj.a(obj2, obj, obj3, flag);
        if (obj1 != null)
        {
            android.support.v4.app.aj.a(obj2, obj3, viewgroup, sparsearray, j1.d, j1.c, j1.a, ((ArrayList) (obj4)), ((java.util.Map) (obj5)), arraylist);
            a(((View) (viewgroup)), j1, i1, obj1);
            android.support.v4.app.aj.a(obj1, j1.d, true);
            a(j1, i1, obj1);
            android.support.v4.app.aj.a(viewgroup, obj1);
            android.support.v4.app.aj.a(viewgroup, j1.d, obj2, ((ArrayList) (obj4)), obj, sparsearray1, obj3, arraylist, obj1, j1.b, ((java.util.Map) (obj5)));
        }
        return obj1 != null;
    }

    private a b(j j1, Fragment fragment, boolean flag)
    {
        a a1;
label0:
        {
            a1 = new a();
            fragment = fragment.r();
            j1 = a1;
            if (fragment != null)
            {
                j1 = a1;
                if (t != null)
                {
                    android.support.v4.app.aj.a(a1, fragment);
                    if (!flag)
                    {
                        break label0;
                    }
                    j1 = a(t, u, a1);
                }
            }
            return j1;
        }
        a1.a(u);
        return a1;
    }

    private static Object b(Fragment fragment, boolean flag)
    {
        if (fragment == null)
        {
            return null;
        }
        if (flag)
        {
            fragment = ((Fragment) (fragment.y()));
        } else
        {
            fragment = ((Fragment) (fragment.z()));
        }
        return android.support.v4.app.aj.a(fragment);
    }

    private void b(j j1, a a1, boolean flag)
    {
        int k1 = a1.size();
        int i1 = 0;
        while (i1 < k1) 
        {
            String s1 = (String)a1.b(i1);
            String s2 = android.support.v4.app.aj.a((View)a1.c(i1));
            if (flag)
            {
                a(j1.a, s1, s2);
            } else
            {
                a(j1.a, s2, s1);
            }
            i1++;
        }
    }

    private void b(SparseArray sparsearray, Fragment fragment)
    {
        if (fragment != null)
        {
            int i1 = fragment.H;
            if (i1 != 0)
            {
                sparsearray.put(i1, fragment);
            }
        }
    }

    private void b(SparseArray sparsearray, SparseArray sparsearray1)
    {
        if (a.p.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        i i1 = b;
_L12:
        if (i1 == null) goto _L1; else goto _L3
_L3:
        i1.c;
        JVM INSTR tableswitch 1 7: default 76
    //                   1 86
    //                   2 99
    //                   3 218
    //                   4 230
    //                   5 242
    //                   6 255
    //                   7 267;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L4:
        break; /* Loop/switch isn't completed */
_L11:
        break MISSING_BLOCK_LABEL_267;
_L13:
        i1 = i1.a;
          goto _L12
_L5:
        b(sparsearray1, i1.d);
          goto _L13
_L6:
        Fragment fragment = i1.d;
        Fragment fragment1;
        if (a.g != null)
        {
            int j1 = 0;
label0:
            do
            {
label1:
                {
                    fragment1 = fragment;
                    if (j1 >= a.g.size())
                    {
                        break label0;
                    }
                    Fragment fragment2 = (Fragment)a.g.get(j1);
                    if (fragment != null)
                    {
                        fragment1 = fragment;
                        if (fragment2.H != fragment.H)
                        {
                            break label1;
                        }
                    }
                    if (fragment2 == fragment)
                    {
                        fragment1 = null;
                    } else
                    {
                        a(sparsearray, fragment2);
                        fragment1 = fragment;
                    }
                }
                j1++;
                fragment = fragment1;
            } while (true);
        } else
        {
            fragment1 = fragment;
        }
        b(sparsearray1, fragment1);
          goto _L13
_L7:
        a(sparsearray, i1.d);
          goto _L13
_L8:
        a(sparsearray, i1.d);
          goto _L13
_L9:
        b(sparsearray1, i1.d);
          goto _L13
_L10:
        a(sparsearray, i1.d);
          goto _L13
        b(sparsearray1, i1.d);
          goto _L13
    }

    int a(boolean flag)
    {
        if (n)
        {
            throw new IllegalStateException("commit already called");
        }
        if (android.support.v4.app.w.a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("Commit: ").append(this).toString());
            a("  ", ((FileDescriptor) (null)), new PrintWriter(new android.support.v4.f.e("FragmentManager")), ((String []) (null)));
        }
        n = true;
        if (k)
        {
            o = a.a(this);
        } else
        {
            o = -1;
        }
        a.a(this, flag);
        return o;
    }

    public ai a()
    {
        if (k)
        {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        } else
        {
            l = false;
            return this;
        }
    }

    public ai a(int i1, int j1, int k1, int l1)
    {
        e = i1;
        f = j1;
        g = k1;
        h = l1;
        return this;
    }

    public ai a(int i1, Fragment fragment)
    {
        a(i1, fragment, ((String) (null)), 1);
        return this;
    }

    public ai a(int i1, Fragment fragment, String s1)
    {
        a(i1, fragment, s1, 1);
        return this;
    }

    public ai a(Fragment fragment)
    {
        i i1 = new i();
        i1.c = 3;
        i1.d = fragment;
        a(i1);
        return this;
    }

    public ai a(Fragment fragment, String s1)
    {
        a(0, fragment, s1, 1);
        return this;
    }

    public ai a(String s1)
    {
        if (!l)
        {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        } else
        {
            k = true;
            m = s1;
            return this;
        }
    }

    public j a(boolean flag, j j1, SparseArray sparsearray, SparseArray sparsearray1)
    {
        j j2;
        int i1;
        int k1;
        int l1;
        int i2;
        if (android.support.v4.app.w.a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("popFromBackStack: ").append(this).toString());
            a("  ", ((FileDescriptor) (null)), new PrintWriter(new android.support.v4.f.e("FragmentManager")), ((String []) (null)));
        }
        if (j1 == null)
        {
label0:
            {
                if (sparsearray.size() == 0)
                {
                    j2 = j1;
                    if (sparsearray1.size() == 0)
                    {
                        break label0;
                    }
                }
                j2 = a(sparsearray, sparsearray1, true);
            }
        } else
        {
            j2 = j1;
            if (!flag)
            {
                a(j1, u, t);
                j2 = j1;
            }
        }
        a(-1);
        if (j2 != null)
        {
            i1 = 0;
        } else
        {
            i1 = j;
        }
        if (j2 != null)
        {
            k1 = 0;
        } else
        {
            k1 = i;
        }
        j1 = c;
_L10:
        if (j1 == null)
        {
            break MISSING_BLOCK_LABEL_538;
        }
        if (j2 != null)
        {
            l1 = 0;
        } else
        {
            l1 = ((i) (j1)).g;
        }
        if (j2 != null)
        {
            i2 = 0;
        } else
        {
            i2 = ((i) (j1)).h;
        }
        ((i) (j1)).c;
        JVM INSTR tableswitch 1 7: default 184
    //                   1 276
    //                   2 310
    //                   3 399
    //                   4 422
    //                   5 451
    //                   6 480
    //                   7 509;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_509;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown cmd: ").append(((i) (j1)).c).toString());
_L2:
        sparsearray = ((i) (j1)).d;
        sparsearray.Q = i2;
        a.a(sparsearray, w.c(k1), i1);
_L11:
        j1 = ((i) (j1)).b;
        if (true) goto _L10; else goto _L9
_L9:
        sparsearray = ((i) (j1)).d;
        if (sparsearray != null)
        {
            sparsearray.Q = i2;
            a.a(sparsearray, w.c(k1), i1);
        }
        if (((i) (j1)).i != null)
        {
            i2 = 0;
            while (i2 < ((i) (j1)).i.size()) 
            {
                sparsearray = (Fragment)((i) (j1)).i.get(i2);
                sparsearray.Q = l1;
                a.a(sparsearray, false);
                i2++;
            }
        }
          goto _L11
_L4:
        sparsearray = ((i) (j1)).d;
        sparsearray.Q = l1;
        a.a(sparsearray, false);
          goto _L11
_L5:
        sparsearray = ((i) (j1)).d;
        sparsearray.Q = l1;
        a.c(sparsearray, w.c(k1), i1);
          goto _L11
_L6:
        sparsearray = ((i) (j1)).d;
        sparsearray.Q = i2;
        a.b(sparsearray, w.c(k1), i1);
          goto _L11
_L7:
        sparsearray = ((i) (j1)).d;
        sparsearray.Q = l1;
        a.e(sparsearray, w.c(k1), i1);
          goto _L11
        sparsearray = ((i) (j1)).d;
        sparsearray.Q = l1;
        a.d(sparsearray, w.c(k1), i1);
          goto _L11
        if (flag)
        {
            a.a(a.n, w.c(k1), i1, true);
            j2 = null;
        }
        if (o >= 0)
        {
            a.b(o);
            o = -1;
        }
        return j2;
    }

    void a(int i1)
    {
        if (k)
        {
            if (android.support.v4.app.w.a)
            {
                Log.v("FragmentManager", (new StringBuilder()).append("Bump nesting in ").append(this).append(" by ").append(i1).toString());
            }
            i j1 = b;
            while (j1 != null) 
            {
                if (j1.d != null)
                {
                    Fragment fragment = j1.d;
                    fragment.B = fragment.B + i1;
                    if (android.support.v4.app.w.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder()).append("Bump nesting of ").append(j1.d).append(" to ").append(j1.d.B).toString());
                    }
                }
                if (j1.i != null)
                {
                    for (int k1 = j1.i.size() - 1; k1 >= 0; k1--)
                    {
                        Fragment fragment1 = (Fragment)j1.i.get(k1);
                        fragment1.B = fragment1.B + i1;
                        if (android.support.v4.app.w.a)
                        {
                            Log.v("FragmentManager", (new StringBuilder()).append("Bump nesting of ").append(fragment1).append(" to ").append(fragment1.B).toString());
                        }
                    }

                }
                j1 = j1.a;
            }
        }
    }

    void a(i i1)
    {
        if (b == null)
        {
            c = i1;
            b = i1;
        } else
        {
            i1.b = c;
            c.a = i1;
            c = i1;
        }
        i1.e = e;
        i1.f = f;
        i1.g = g;
        i1.h = h;
        d = d + 1;
    }

    public void a(SparseArray sparsearray, SparseArray sparsearray1)
    {
        if (a.p.a()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        i i1 = b;
_L12:
        if (i1 == null) goto _L1; else goto _L3
_L3:
        i1.c;
        JVM INSTR tableswitch 1 7: default 72
    //                   1 80
    //                   2 91
    //                   3 151
    //                   4 163
    //                   5 175
    //                   6 186
    //                   7 198;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L4:
        break; /* Loop/switch isn't completed */
_L11:
        break MISSING_BLOCK_LABEL_198;
_L13:
        i1 = i1.a;
          goto _L12
_L5:
        a(sparsearray, i1.d);
          goto _L13
_L6:
        if (i1.i != null)
        {
            for (int j1 = i1.i.size() - 1; j1 >= 0; j1--)
            {
                b(sparsearray1, (Fragment)i1.i.get(j1));
            }

        }
        a(sparsearray, i1.d);
          goto _L13
_L7:
        b(sparsearray1, i1.d);
          goto _L13
_L8:
        b(sparsearray1, i1.d);
          goto _L13
_L9:
        a(sparsearray, i1.d);
          goto _L13
_L10:
        b(sparsearray1, i1.d);
          goto _L13
        a(sparsearray, i1.d);
          goto _L13
    }

    public void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        a(s1, printwriter, true);
    }

    public void a(String s1, PrintWriter printwriter, boolean flag)
    {
        i i1;
        String s3;
        int j1;
        if (flag)
        {
            printwriter.print(s1);
            printwriter.print("mName=");
            printwriter.print(m);
            printwriter.print(" mIndex=");
            printwriter.print(o);
            printwriter.print(" mCommitted=");
            printwriter.println(n);
            if (i != 0)
            {
                printwriter.print(s1);
                printwriter.print("mTransition=#");
                printwriter.print(Integer.toHexString(i));
                printwriter.print(" mTransitionStyle=#");
                printwriter.println(Integer.toHexString(j));
            }
            if (e != 0 || f != 0)
            {
                printwriter.print(s1);
                printwriter.print("mEnterAnim=#");
                printwriter.print(Integer.toHexString(e));
                printwriter.print(" mExitAnim=#");
                printwriter.println(Integer.toHexString(f));
            }
            if (g != 0 || h != 0)
            {
                printwriter.print(s1);
                printwriter.print("mPopEnterAnim=#");
                printwriter.print(Integer.toHexString(g));
                printwriter.print(" mPopExitAnim=#");
                printwriter.println(Integer.toHexString(h));
            }
            if (p != 0 || q != null)
            {
                printwriter.print(s1);
                printwriter.print("mBreadCrumbTitleRes=#");
                printwriter.print(Integer.toHexString(p));
                printwriter.print(" mBreadCrumbTitleText=");
                printwriter.println(q);
            }
            if (r != 0 || s != null)
            {
                printwriter.print(s1);
                printwriter.print("mBreadCrumbShortTitleRes=#");
                printwriter.print(Integer.toHexString(r));
                printwriter.print(" mBreadCrumbShortTitleText=");
                printwriter.println(s);
            }
        }
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_823;
        }
        printwriter.print(s1);
        printwriter.println("Operations:");
        s3 = (new StringBuilder()).append(s1).append("    ").toString();
        i1 = b;
        j1 = 0;
_L13:
        if (i1 == null) goto _L2; else goto _L1
_L1:
        i1.c;
        JVM INSTR tableswitch 0 7: default 424
    //                   0 702
    //                   1 710
    //                   2 718
    //                   3 726
    //                   4 734
    //                   5 742
    //                   6 750
    //                   7 758;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_758;
_L3:
        String s2 = (new StringBuilder()).append("cmd=").append(i1.c).toString();
_L12:
        printwriter.print(s1);
        printwriter.print("  Op #");
        printwriter.print(j1);
        printwriter.print(": ");
        printwriter.print(s2);
        printwriter.print(" ");
        printwriter.println(i1.d);
        if (flag)
        {
            if (i1.e != 0 || i1.f != 0)
            {
                printwriter.print(s1);
                printwriter.print("enterAnim=#");
                printwriter.print(Integer.toHexString(i1.e));
                printwriter.print(" exitAnim=#");
                printwriter.println(Integer.toHexString(i1.f));
            }
            if (i1.g != 0 || i1.h != 0)
            {
                printwriter.print(s1);
                printwriter.print("popEnterAnim=#");
                printwriter.print(Integer.toHexString(i1.g));
                printwriter.print(" popExitAnim=#");
                printwriter.println(Integer.toHexString(i1.h));
            }
        }
        if (i1.i != null && i1.i.size() > 0)
        {
            int k1 = 0;
            while (k1 < i1.i.size()) 
            {
                printwriter.print(s3);
                if (i1.i.size() == 1)
                {
                    printwriter.print("Removed: ");
                } else
                {
                    if (k1 == 0)
                    {
                        printwriter.println("Removed:");
                    }
                    printwriter.print(s3);
                    printwriter.print("  #");
                    printwriter.print(k1);
                    printwriter.print(": ");
                }
                printwriter.println(i1.i.get(k1));
                k1++;
            }
        }
        break MISSING_BLOCK_LABEL_807;
_L4:
        s2 = "NULL";
          goto _L12
_L5:
        s2 = "ADD";
          goto _L12
_L6:
        s2 = "REPLACE";
          goto _L12
_L7:
        s2 = "REMOVE";
          goto _L12
_L8:
        s2 = "HIDE";
          goto _L12
_L9:
        s2 = "SHOW";
          goto _L12
_L10:
        s2 = "DETACH";
          goto _L12
        s2 = "ATTACH";
          goto _L12
        i1 = i1.a;
        j1++;
          goto _L13
_L2:
    }

    public int b()
    {
        return a(false);
    }

    public ai b(int i1, Fragment fragment)
    {
        return b(i1, fragment, ((String) (null)));
    }

    public ai b(int i1, Fragment fragment, String s1)
    {
        if (i1 == 0)
        {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        } else
        {
            a(i1, fragment, s1, 2);
            return this;
        }
    }

    public ai b(Fragment fragment)
    {
        i i1 = new i();
        i1.c = 6;
        i1.d = fragment;
        a(i1);
        return this;
    }

    public int c()
    {
        return a(true);
    }

    public ai c(Fragment fragment)
    {
        i i1 = new i();
        i1.c = 7;
        i1.d = fragment;
        a(i1);
        return this;
    }

    public String d()
    {
        return m;
    }

    public boolean e()
    {
        return d == 0;
    }

    public void run()
    {
        if (android.support.v4.app.w.a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("Run: ").append(this).toString());
        }
        if (k && o < 0)
        {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        a(1);
        Fragment fragment;
        Object obj;
        i i1;
        Fragment fragment1;
        Fragment fragment2;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            SparseArray sparsearray = new SparseArray();
            obj = new SparseArray();
            b(sparsearray, ((SparseArray) (obj)));
            obj = a(sparsearray, ((SparseArray) (obj)), false);
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            j1 = 0;
        } else
        {
            j1 = j;
        }
        if (obj != null)
        {
            k1 = 0;
        } else
        {
            k1 = i;
        }
        i1 = b;
        if (i1 == null)
        {
            break MISSING_BLOCK_LABEL_700;
        }
        if (obj != null)
        {
            l1 = 0;
        } else
        {
            l1 = i1.e;
        }
        if (obj != null)
        {
            i2 = 0;
        } else
        {
            i2 = i1.f;
        }
        i1.c;
        JVM INSTR tableswitch 1 7: default 184
    //                   1 251
    //                   2 279
    //                   3 570
    //                   4 596
    //                   5 622
    //                   6 648
    //                   7 674;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_674;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown cmd: ").append(i1.c).toString());
_L2:
        fragment = i1.d;
        fragment.Q = l1;
        a.a(fragment, false);
_L12:
        i1 = i1.a;
        if (true) goto _L10; else goto _L9
_L10:
        break MISSING_BLOCK_LABEL_120;
_L9:
        fragment = i1.d;
        if (a.g != null)
        {
            j2 = 0;
label0:
            do
            {
label1:
                {
                    fragment1 = fragment;
                    if (j2 >= a.g.size())
                    {
                        break label0;
                    }
                    fragment2 = (Fragment)a.g.get(j2);
                    if (android.support.v4.app.w.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder()).append("OP_REPLACE: adding=").append(fragment).append(" old=").append(fragment2).toString());
                    }
                    if (fragment != null)
                    {
                        fragment1 = fragment;
                        if (fragment2.H != fragment.H)
                        {
                            break label1;
                        }
                    }
                    if (fragment2 == fragment)
                    {
                        i1.d = null;
                        fragment1 = null;
                    } else
                    {
                        if (i1.i == null)
                        {
                            i1.i = new ArrayList();
                        }
                        i1.i.add(fragment2);
                        fragment2.Q = i2;
                        if (k)
                        {
                            fragment2.B = fragment2.B + 1;
                            if (android.support.v4.app.w.a)
                            {
                                Log.v("FragmentManager", (new StringBuilder()).append("Bump nesting of ").append(fragment2).append(" to ").append(fragment2.B).toString());
                            }
                        }
                        a.a(fragment2, k1, j1);
                        fragment1 = fragment;
                    }
                }
                j2++;
                fragment = fragment1;
            } while (true);
        } else
        {
            fragment1 = fragment;
        }
        if (fragment1 != null)
        {
            fragment1.Q = l1;
            a.a(fragment1, false);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        fragment = i1.d;
        fragment.Q = i2;
        a.a(fragment, k1, j1);
        continue; /* Loop/switch isn't completed */
_L5:
        fragment = i1.d;
        fragment.Q = i2;
        a.b(fragment, k1, j1);
        continue; /* Loop/switch isn't completed */
_L6:
        fragment = i1.d;
        fragment.Q = l1;
        a.c(fragment, k1, j1);
        continue; /* Loop/switch isn't completed */
_L7:
        fragment = i1.d;
        fragment.Q = i2;
        a.d(fragment, k1, j1);
        continue; /* Loop/switch isn't completed */
        fragment = i1.d;
        fragment.Q = l1;
        a.e(fragment, k1, j1);
        if (true) goto _L12; else goto _L11
_L11:
        a.a(a.n, k1, j1, true);
        if (k)
        {
            a.b(this);
        }
        return;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("BackStackEntry{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (o >= 0)
        {
            stringbuilder.append(" #");
            stringbuilder.append(o);
        }
        if (m != null)
        {
            stringbuilder.append(" ");
            stringbuilder.append(m);
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
