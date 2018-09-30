// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a;
import android.support.v7.a.b;
import android.support.v7.a.f;
import android.util.TypedValue;

// Referenced classes of package android.support.v7.internal.widget:
//            ay, ba, av

public class ax
{

    static final android.graphics.PorterDuff.Mode a;
    private static final String b = android/support/v7/internal/widget/ax.getSimpleName();
    private static final ay c = new ay(6);
    private static final int d[];
    private static final int e[];
    private static final int f[];
    private static final int g[];
    private static final int h[];
    private final Context i;
    private final Resources j;
    private final TypedValue k = new TypedValue();
    private ColorStateList l;
    private ColorStateList m;
    private ColorStateList n;

    public ax(Context context)
    {
        i = context;
        j = new ba(context.getResources(), this);
    }

    private ColorStateList a()
    {
        if (l == null)
        {
            int i1 = b(b.colorControlNormal);
            int j1 = b(b.colorControlActivated);
            int k1 = c(b.colorControlNormal);
            int ai[] = {
                0x10100a1
            };
            int ai1[] = new int[0];
            l = new ColorStateList(new int[][] {
                new int[] {
                    0xfefeff62
                }, new int[] {
                    0x101009c
                }, new int[] {
                    0x10102fe
                }, new int[] {
                    0x10100a7
                }, new int[] {
                    0x10100a0
                }, ai, ai1
            }, new int[] {
                k1, j1, j1, j1, j1, j1, i1
            });
        }
        return l;
    }

    public static Drawable a(Context context, int i1)
    {
        if (d(i1))
        {
            return (new ax(context)).a(i1);
        } else
        {
            return android.support.v4.a.a.a(context, i1);
        }
    }

    private static boolean a(int ai[], int i1)
    {
        boolean flag1 = false;
        int k1 = ai.length;
        int j1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j1 < k1)
                {
                    if (ai[j1] != i1)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            j1++;
        } while (true);
    }

    private ColorStateList b()
    {
        if (n == null)
        {
            int ai[] = {
                0xfefeff62
            };
            int i1 = a(0x1010030, 0.1F);
            int ai1[] = {
                0x10100a0
            };
            int j1 = a(b.colorControlActivated, 0.3F);
            int k1 = a(0x1010030, 0.3F);
            n = new ColorStateList(new int[][] {
                ai, ai1, new int[0]
            }, new int[] {
                i1, j1, k1
            });
        }
        return n;
    }

    private ColorStateList c()
    {
        if (m == null)
        {
            int ai[] = {
                0xfefeff62
            };
            int i1 = c(b.colorSwitchThumbNormal);
            int j1 = b(b.colorControlActivated);
            int k1 = b(b.colorSwitchThumbNormal);
            m = new ColorStateList(new int[][] {
                ai, new int[] {
                    0x10100a0
                }, new int[0]
            }, new int[] {
                i1, j1, k1
            });
        }
        return m;
    }

    private static boolean d(int i1)
    {
        return a(f, i1) || a(d, i1) || a(e, i1) || a(g, i1) || a(h, i1);
    }

    int a(int i1, float f1)
    {
        i1 = b(i1);
        return i1 & 0xffffff | Math.round((float)Color.alpha(i1) * f1) << 24;
    }

    public Drawable a(int i1)
    {
        Drawable drawable = android.support.v4.a.a.a(i, i1);
        if (drawable != null)
        {
            if (a(g, i1))
            {
                return new av(drawable, a());
            }
            if (i1 == f.abc_switch_track_mtrl_alpha)
            {
                return new av(drawable, b());
            }
            if (i1 == f.abc_switch_thumb_material)
            {
                return new av(drawable, c(), android.graphics.PorterDuff.Mode.MULTIPLY);
            }
            if (a(h, i1))
            {
                return j.getDrawable(i1);
            }
            a(i1, drawable);
        }
        return drawable;
    }

    void a(int i1, Drawable drawable)
    {
        Object obj;
        int j1;
        boolean flag;
        if (a(d, i1))
        {
            i1 = b.colorControlNormal;
            obj = null;
            flag = true;
            j1 = -1;
        } else
        if (a(e, i1))
        {
            i1 = b.colorControlActivated;
            obj = null;
            flag = true;
            j1 = -1;
        } else
        if (a(f, i1))
        {
            obj = android.graphics.PorterDuff.Mode.MULTIPLY;
            flag = true;
            j1 = -1;
            i1 = 0x1010031;
        } else
        if (i1 == f.abc_list_divider_mtrl_alpha)
        {
            i1 = 0x1010030;
            j1 = Math.round(40.8F);
            obj = null;
            flag = true;
        } else
        {
            j1 = -1;
            i1 = 0;
            obj = null;
            flag = false;
        }
        if (flag)
        {
            android.graphics.PorterDuff.Mode mode = ((android.graphics.PorterDuff.Mode) (obj));
            if (obj == null)
            {
                mode = a;
            }
            i1 = b(i1);
            obj = c.a(i1, mode);
            if (obj == null)
            {
                obj = new PorterDuffColorFilter(i1, mode);
                c.a(i1, mode, ((PorterDuffColorFilter) (obj)));
            }
            drawable.setColorFilter(((android.graphics.ColorFilter) (obj)));
            if (j1 != -1)
            {
                drawable.setAlpha(j1);
            }
        }
    }

    int b(int i1)
    {
        if (i.getTheme().resolveAttribute(i1, k, true))
        {
            if (k.type >= 16 && k.type <= 31)
            {
                return k.data;
            }
            if (k.type == 3)
            {
                return j.getColor(k.resourceId);
            }
        }
        return 0;
    }

    int c(int i1)
    {
        i.getTheme().resolveAttribute(0x1010033, k, true);
        return a(i1, k.getFloat());
    }

    static 
    {
        a = android.graphics.PorterDuff.Mode.SRC_IN;
        d = (new int[] {
            f.abc_ic_ab_back_mtrl_am_alpha, f.abc_ic_go_search_api_mtrl_alpha, f.abc_ic_search_api_mtrl_alpha, f.abc_ic_commit_search_api_mtrl_alpha, f.abc_ic_clear_mtrl_alpha, f.abc_ic_menu_share_mtrl_alpha, f.abc_ic_menu_copy_mtrl_am_alpha, f.abc_ic_menu_cut_mtrl_alpha, f.abc_ic_menu_selectall_mtrl_alpha, f.abc_ic_menu_paste_mtrl_am_alpha, 
            f.abc_ic_menu_moreoverflow_mtrl_alpha, f.abc_ic_voice_search_api_mtrl_alpha, f.abc_textfield_search_default_mtrl_alpha, f.abc_textfield_default_mtrl_alpha
        });
        e = (new int[] {
            f.abc_textfield_activated_mtrl_alpha, f.abc_textfield_search_activated_mtrl_alpha, f.abc_cab_background_top_mtrl_alpha
        });
        f = (new int[] {
            f.abc_popup_background_mtrl_mult, f.abc_cab_background_internal_bg, f.abc_menu_hardkey_panel_mtrl_mult
        });
        g = (new int[] {
            f.abc_edit_text_material, f.abc_tab_indicator_material, f.abc_textfield_search_material, f.abc_spinner_mtrl_am_alpha, f.abc_btn_check_material, f.abc_btn_radio_material
        });
        h = (new int[] {
            f.abc_cab_background_top_material
        });
    }
}
