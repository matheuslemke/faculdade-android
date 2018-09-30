// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.f.m;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            q, w, r, as, 
//            Fragment, a, c, s, 
//            t, u

public class p extends Activity
{

    final Handler a = new q(this);
    final w b = new w();
    final t c = new r(this);
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    m l;
    as m;

    public p()
    {
    }

    private static String a(View view)
    {
        byte byte0;
        byte byte1;
        StringBuilder stringbuilder;
        byte1 = 70;
        byte0 = 46;
        stringbuilder = new StringBuilder(128);
        stringbuilder.append(view.getClass().getName());
        stringbuilder.append('{');
        stringbuilder.append(Integer.toHexString(System.identityHashCode(view)));
        stringbuilder.append(' ');
        view.getVisibility();
        JVM INSTR lookupswitch 3: default 100
    //                   0: 523
    //                   4: 534
    //                   8: 545;
           goto _L1 _L2 _L3 _L4
_L1:
        stringbuilder.append('.');
_L11:
        char c1;
        Object obj;
        String s1;
        int i1;
        if (view.isFocusable())
        {
            c1 = 'F';
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        if (view.isEnabled())
        {
            c1 = 'E';
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        if (view.willNotDraw())
        {
            c1 = '.';
        } else
        {
            c1 = 'D';
        }
        stringbuilder.append(c1);
        if (view.isHorizontalScrollBarEnabled())
        {
            c1 = 'H';
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        if (view.isVerticalScrollBarEnabled())
        {
            c1 = 'V';
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        if (view.isClickable())
        {
            c1 = 'C';
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        if (view.isLongClickable())
        {
            c1 = 'L';
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        stringbuilder.append(' ');
        if (view.isFocused())
        {
            c1 = byte1;
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        if (view.isSelected())
        {
            c1 = 'S';
        } else
        {
            c1 = '.';
        }
        stringbuilder.append(c1);
        c1 = byte0;
        if (view.isPressed())
        {
            c1 = 'P';
        }
        stringbuilder.append(c1);
        stringbuilder.append(' ');
        stringbuilder.append(view.getLeft());
        stringbuilder.append(',');
        stringbuilder.append(view.getTop());
        stringbuilder.append('-');
        stringbuilder.append(view.getRight());
        stringbuilder.append(',');
        stringbuilder.append(view.getBottom());
        i1 = view.getId();
        if (i1 == -1) goto _L6; else goto _L5
_L5:
        stringbuilder.append(" #");
        stringbuilder.append(Integer.toHexString(i1));
        obj = view.getResources();
        if (i1 == 0 || obj == null) goto _L6; else goto _L7
_L7:
        0xff000000 & i1;
        JVM INSTR lookupswitch 2: default 436
    //                   16777216: 616
    //                   2130706432: 610;
           goto _L8 _L9 _L10
_L8:
        view = ((Resources) (obj)).getResourcePackageName(i1);
_L12:
        s1 = ((Resources) (obj)).getResourceTypeName(i1);
        obj = ((Resources) (obj)).getResourceEntryName(i1);
        stringbuilder.append(" ");
        stringbuilder.append(view);
        stringbuilder.append(":");
        stringbuilder.append(s1);
        stringbuilder.append("/");
        stringbuilder.append(((String) (obj)));
_L6:
        stringbuilder.append("}");
        return stringbuilder.toString();
_L2:
        stringbuilder.append('V');
          goto _L11
_L3:
        stringbuilder.append('I');
          goto _L11
_L4:
        stringbuilder.append('G');
          goto _L11
_L10:
        view = "app";
          goto _L12
_L9:
        view = "android";
          goto _L12
        view;
          goto _L6
    }

    private void a(String s1, PrintWriter printwriter, View view)
    {
        printwriter.print(s1);
        if (view != null) goto _L2; else goto _L1
_L1:
        printwriter.println("null");
_L4:
        return;
_L2:
        printwriter.println(a(view));
        if (view instanceof ViewGroup)
        {
            view = (ViewGroup)view;
            int j1 = view.getChildCount();
            if (j1 > 0)
            {
                s1 = (new StringBuilder()).append(s1).append("  ").toString();
                int i1 = 0;
                while (i1 < j1) 
                {
                    a(s1, printwriter, view.getChildAt(i1));
                    i1++;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    as a(String s1, boolean flag, boolean flag1)
    {
        if (l == null)
        {
            l = new m();
        }
        as as1 = (as)l.get(s1);
        if (as1 == null)
        {
            if (flag1)
            {
                as1 = new as(s1, this, flag);
                l.put(s1, as1);
            }
            return as1;
        } else
        {
            as1.a(this);
            return as1;
        }
    }

    public void a(Fragment fragment)
    {
    }

    public void a(Fragment fragment, Intent intent, int i1)
    {
        if (i1 == -1)
        {
            super.startActivityForResult(intent, -1);
            return;
        }
        if ((0xffff0000 & i1) != 0)
        {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        } else
        {
            super.startActivityForResult(intent, (fragment.p + 1 << 16) + (0xffff & i1));
            return;
        }
    }

    void a(String s1)
    {
        if (l != null)
        {
            as as1 = (as)l.get(s1);
            if (as1 != null && !as1.g)
            {
                as1.h();
                l.remove(s1);
            }
        }
    }

    void a(boolean flag)
    {
        if (!g)
        {
            g = true;
            h = flag;
            a.removeMessages(1);
            e();
        }
    }

    protected boolean a(View view, Menu menu)
    {
        return super.onPreparePanel(0, view, menu);
    }

    public void a_()
    {
        android.support.v4.app.a.b(this);
    }

    protected void b()
    {
        b.o();
    }

    public Object c()
    {
        return null;
    }

    public void d()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            android.support.v4.app.c.a(this);
            return;
        } else
        {
            i = true;
            return;
        }
    }

    public void dump(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as1[])
    {
        if (android.os.Build.VERSION.SDK_INT < 11);
        printwriter.print(s1);
        printwriter.print("Local FragmentActivity ");
        printwriter.print(Integer.toHexString(System.identityHashCode(this)));
        printwriter.println(" State:");
        String s2 = (new StringBuilder()).append(s1).append("  ").toString();
        printwriter.print(s2);
        printwriter.print("mCreated=");
        printwriter.print(d);
        printwriter.print("mResumed=");
        printwriter.print(e);
        printwriter.print(" mStopped=");
        printwriter.print(f);
        printwriter.print(" mReallyStopped=");
        printwriter.println(g);
        printwriter.print(s2);
        printwriter.print("mLoadersStarted=");
        printwriter.println(k);
        if (m != null)
        {
            printwriter.print(s1);
            printwriter.print("Loader Manager ");
            printwriter.print(Integer.toHexString(System.identityHashCode(m)));
            printwriter.println(":");
            m.a((new StringBuilder()).append(s1).append("  ").toString(), filedescriptor, printwriter, as1);
        }
        b.a(s1, filedescriptor, printwriter, as1);
        printwriter.print(s1);
        printwriter.println("View Hierarchy:");
        a((new StringBuilder()).append(s1).append("  ").toString(), printwriter, getWindow().getDecorView());
    }

    void e()
    {
        if (k)
        {
            k = false;
            if (m != null)
            {
                if (!h)
                {
                    m.c();
                } else
                {
                    m.d();
                }
            }
        }
        b.r();
    }

    public u f()
    {
        return b;
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        b.k();
        int k1 = i1 >> 16;
        if (k1 != 0)
        {
            k1--;
            if (b.f == null || k1 < 0 || k1 >= b.f.size())
            {
                Log.w("FragmentActivity", (new StringBuilder()).append("Activity result fragment index out of range: 0x").append(Integer.toHexString(i1)).toString());
                return;
            }
            Fragment fragment = (Fragment)b.f.get(k1);
            if (fragment == null)
            {
                Log.w("FragmentActivity", (new StringBuilder()).append("Activity result no fragment exists for index: 0x").append(Integer.toHexString(i1)).toString());
                return;
            } else
            {
                fragment.a(0xffff & i1, j1, intent);
                return;
            }
        } else
        {
            super.onActivityResult(i1, j1, intent);
            return;
        }
    }

    public void onBackPressed()
    {
        if (!b.e())
        {
            a_();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        b.a(configuration);
    }

    protected void onCreate(Bundle bundle)
    {
        b.a(this, c, null);
        if (getLayoutInflater().getFactory() == null)
        {
            getLayoutInflater().setFactory(this);
        }
        super.onCreate(bundle);
        s s1 = (s)getLastNonConfigurationInstance();
        if (s1 != null)
        {
            l = s1.e;
        }
        if (bundle != null)
        {
            android.os.Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            w w1 = b;
            if (s1 != null)
            {
                bundle = s1.d;
            } else
            {
                bundle = null;
            }
            w1.a(parcelable, bundle);
        }
        b.l();
    }

    public boolean onCreatePanelMenu(int i1, Menu menu)
    {
        if (i1 == 0)
        {
            boolean flag = super.onCreatePanelMenu(i1, menu);
            boolean flag1 = b.a(menu, getMenuInflater());
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                return flag | flag1;
            } else
            {
                return true;
            }
        } else
        {
            return super.onCreatePanelMenu(i1, menu);
        }
    }

    public View onCreateView(String s1, Context context, AttributeSet attributeset)
    {
        View view;
        if (!"fragment".equals(s1))
        {
            view = super.onCreateView(s1, context, attributeset);
        } else
        {
            View view1 = b.onCreateView(s1, context, attributeset);
            view = view1;
            if (view1 == null)
            {
                return super.onCreateView(s1, context, attributeset);
            }
        }
        return view;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        a(false);
        b.t();
        if (m != null)
        {
            m.h();
        }
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (android.os.Build.VERSION.SDK_INT < 5 && i1 == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        b.u();
    }

    public boolean onMenuItemSelected(int i1, MenuItem menuitem)
    {
        if (super.onMenuItemSelected(i1, menuitem))
        {
            return true;
        }
        switch (i1)
        {
        default:
            return false;

        case 0: // '\0'
            return b.a(menuitem);

        case 6: // '\006'
            return b.b(menuitem);
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        b.k();
    }

    public void onPanelClosed(int i1, Menu menu)
    {
        i1;
        JVM INSTR tableswitch 0 0: default 20
    //                   0 27;
           goto _L1 _L2
_L1:
        super.onPanelClosed(i1, menu);
        return;
_L2:
        b.b(menu);
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected void onPause()
    {
        super.onPause();
        e = false;
        if (a.hasMessages(2))
        {
            a.removeMessages(2);
            b();
        }
        b.p();
    }

    protected void onPostResume()
    {
        super.onPostResume();
        a.removeMessages(2);
        b();
        b.g();
    }

    public boolean onPreparePanel(int i1, View view, Menu menu)
    {
        if (i1 == 0 && menu != null)
        {
            if (i)
            {
                i = false;
                menu.clear();
                onCreatePanelMenu(i1, menu);
            }
            return a(view, menu) | b.a(menu);
        } else
        {
            return super.onPreparePanel(i1, view, menu);
        }
    }

    protected void onResume()
    {
        super.onResume();
        a.sendEmptyMessage(2);
        e = true;
        b.g();
    }

    public final Object onRetainNonConfigurationInstance()
    {
        int j1 = 0;
        if (f)
        {
            a(true);
        }
        Object obj = c();
        ArrayList arraylist = b.i();
        boolean flag1;
        if (l != null)
        {
            int k1 = l.size();
            as aas[] = new as[k1];
            for (int i1 = k1 - 1; i1 >= 0; i1--)
            {
                aas[i1] = (as)l.c(i1);
            }

            boolean flag = false;
            do
            {
                flag1 = flag;
                if (j1 >= k1)
                {
                    break;
                }
                as as1 = aas[j1];
                if (as1.g)
                {
                    flag = true;
                } else
                {
                    as1.h();
                    l.remove(as1.d);
                }
                j1++;
            } while (true);
        } else
        {
            flag1 = false;
        }
        if (arraylist == null && !flag1 && obj == null)
        {
            return null;
        } else
        {
            s s1 = new s();
            s1.a = null;
            s1.b = obj;
            s1.c = null;
            s1.d = arraylist;
            s1.e = l;
            return s1;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        android.os.Parcelable parcelable = b.j();
        if (parcelable != null)
        {
            bundle.putParcelable("android:support:fragments", parcelable);
        }
    }

    protected void onStart()
    {
        super.onStart();
        f = false;
        g = false;
        a.removeMessages(1);
        if (!d)
        {
            d = true;
            b.m();
        }
        b.k();
        b.g();
        if (!k)
        {
            k = true;
            int i1;
            if (m != null)
            {
                m.b();
            } else
            if (!j)
            {
                m = a("(root)", k, false);
                if (m != null && !m.f)
                {
                    m.b();
                }
            }
            j = true;
        }
        b.n();
        if (l != null)
        {
            int k1 = l.size();
            as aas[] = new as[k1];
            for (i1 = k1 - 1; i1 >= 0; i1--)
            {
                aas[i1] = (as)l.c(i1);
            }

            for (int j1 = 0; j1 < k1; j1++)
            {
                as as1 = aas[j1];
                as1.e();
                as1.g();
            }

        }
    }

    protected void onStop()
    {
        super.onStop();
        f = true;
        a.sendEmptyMessage(1);
        b.q();
    }

    public void startActivityForResult(Intent intent, int i1)
    {
        if (i1 != -1 && (0xffff0000 & i1) != 0)
        {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        } else
        {
            super.startActivityForResult(intent, i1);
            return;
        }
    }
}
