// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.a;
import android.support.v4.app.au;
import android.support.v4.app.cu;
import android.support.v4.app.cv;
import android.support.v4.app.p;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            g, a

public class f extends p
    implements cv
{

    private g n;

    public f()
    {
    }

    private g j()
    {
        if (n == null)
        {
            n = android.support.v7.app.g.a(this);
        }
        return n;
    }

    public Intent a()
    {
        return au.a(this);
    }

    public void a(cu cu1)
    {
        cu1.a(this);
    }

    public void a(android.support.v7.c.a a1)
    {
    }

    void a(View view)
    {
        super.setContentView(view);
    }

    boolean a(int k, Menu menu)
    {
        return super.onCreatePanelMenu(k, menu);
    }

    boolean a(int k, View view, Menu menu)
    {
        return super.onPreparePanel(k, view, menu);
    }

    public boolean a(Intent intent)
    {
        return au.a(this, intent);
    }

    protected boolean a(View view, Menu menu)
    {
        return j().a(view, menu);
    }

    public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        j().b(view, layoutparams);
    }

    void b(int k, Menu menu)
    {
        super.onPanelClosed(k, menu);
    }

    public void b(Intent intent)
    {
        au.b(this, intent);
    }

    public void b(cu cu1)
    {
    }

    public void b(android.support.v7.c.a a1)
    {
    }

    boolean b(View view, Menu menu)
    {
        return super.a(view, menu);
    }

    boolean c(int k, Menu menu)
    {
        return super.onMenuOpened(k, menu);
    }

    public void d()
    {
        j().g();
    }

    public android.support.v7.app.a g()
    {
        return j().b();
    }

    public MenuInflater getMenuInflater()
    {
        return j().d();
    }

    public boolean h()
    {
        Object obj = a();
        if (obj != null)
        {
            if (a(((Intent) (obj))))
            {
                obj = cu.a(this);
                a(((cu) (obj)));
                b(((cu) (obj)));
                ((cu) (obj)).a();
                try
                {
                    android.support.v4.app.a.a(this);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    finish();
                }
            } else
            {
                b(((Intent) (obj)));
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void i()
    {
    }

    public void invalidateOptionsMenu()
    {
        j().g();
    }

    public void onBackPressed()
    {
        if (!j().h())
        {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        j().a(configuration);
    }

    public final void onContentChanged()
    {
        j().i();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        j().a(bundle);
    }

    public boolean onCreatePanelMenu(int k, Menu menu)
    {
        return j().c(k, menu);
    }

    public View onCreatePanelView(int k)
    {
        if (k == 0)
        {
            return j().b(k);
        } else
        {
            return super.onCreatePanelView(k);
        }
    }

    public View onCreateView(String s, Context context, AttributeSet attributeset)
    {
        View view = super.onCreateView(s, context, attributeset);
        if (view != null)
        {
            return view;
        } else
        {
            return j().a(s, context, attributeset);
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        j().l();
    }

    public boolean onKeyDown(int k, KeyEvent keyevent)
    {
        if (super.onKeyDown(k, keyevent))
        {
            return true;
        } else
        {
            return j().a(k, keyevent);
        }
    }

    public boolean onKeyShortcut(int k, KeyEvent keyevent)
    {
        return j().b(k, keyevent);
    }

    public final boolean onMenuItemSelected(int k, MenuItem menuitem)
    {
        if (super.onMenuItemSelected(k, menuitem))
        {
            return true;
        }
        android.support.v7.app.a a1 = g();
        if (menuitem.getItemId() == 0x102002c && a1 != null && (a1.b() & 4) != 0)
        {
            return h();
        } else
        {
            return false;
        }
    }

    public boolean onMenuOpened(int k, Menu menu)
    {
        return j().b(k, menu);
    }

    public void onPanelClosed(int k, Menu menu)
    {
        j().a(k, menu);
    }

    protected void onPostResume()
    {
        super.onPostResume();
        j().f();
    }

    public boolean onPreparePanel(int k, View view, Menu menu)
    {
        return j().a(k, view, menu);
    }

    protected void onStop()
    {
        super.onStop();
        j().e();
    }

    protected void onTitleChanged(CharSequence charsequence, int k)
    {
        super.onTitleChanged(charsequence, k);
        j().a(charsequence);
    }

    public void setContentView(int k)
    {
        j().a(k);
    }

    public void setContentView(View view)
    {
        j().a(view);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        j().a(view, layoutparams);
    }
}
