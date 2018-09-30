// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.c;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.clawdyvan.agendaestudantepro.Activities.MainActivity;
import com.clawdyvan.agendaestudantepro.Activities.VisualizacaoFotoActivity;
import com.clawdyvan.agendaestudantepro.Util.a;
import com.clawdyvan.agendaestudantepro.Util.e;
import com.clawdyvan.agendaestudantepro.Util.m;
import com.clawdyvan.agendaestudantepro.Util.n;
import com.clawdyvan.agendaestudantepro.Util.u;
import com.clawdyvan.agendaestudantepro.b.b;
import com.clawdyvan.agendaestudantepro.b.d;
import com.clawdyvan.agendaestudantepro.b.g;
import java.io.File;

// Referenced classes of package com.clawdyvan.agendaestudantepro.c:
//            j, k, g, l, 
//            m, o, p, q, 
//            r, h, s, i, 
//            t

public class f extends Fragment
{

    private final String a = "btData";
    private View aA;
    private boolean aB;
    private android.view.View.OnClickListener aC;
    private android.view.View.OnClickListener aD;
    private TextView aj;
    private Button ak;
    private Button al;
    private Button am;
    private Button an;
    private Button ao;
    private Button ap;
    private ImageButton aq;
    private int ar;
    private n as;
    private n at;
    private b au;
    private boolean av;
    private String aw[];
    private String ax[];
    private m ay;
    private d az;
    private final String b = "btHora";
    private final String c = "timeMillis";
    private final String d = "edicao";
    private String e[];
    private TextView f;
    private TextView g;
    private EditText h;
    private EditText i;

    public f()
    {
        aC = new j(this);
        aD = new k(this);
    }

    static int a(f f1, int i1)
    {
        f1.ar = i1;
        return i1;
    }

    private String a(n n1)
    {
        return String.format("%s, %d %s %d", new Object[] {
            ax[n1.g() - 1], Integer.valueOf(n1.d()), aw[n1.e()], Integer.valueOf(n1.f())
        });
    }

    static String a(f f1, n n1)
    {
        return f1.a(n1);
    }

    private boolean a()
    {
        boolean flag;
        if (!u.a(al.getText().toString()))
        {
            az.a(null);
        } else
        {
            az.a(new g(as.c(), as.b()));
        }
        if (!u.a(ak.getText().toString()))
        {
            aj.setTextColor(0xffff0000);
            flag = false;
        } else
        {
            aj.setTextColor(0xff000000);
            az.a(new b(as.f(), as.e() + 1, as.d()));
            flag = true;
        }
        az.c(i.getText().toString());
        if (!u.a(h.getText().toString()))
        {
            h.requestFocus();
            g.setTextColor(0xffff0000);
            flag = false;
        } else
        {
            g.setTextColor(0xff000000);
            az.b(h.getText().toString());
        }
        if (aq.getTag().equals("x"))
        {
            az.a(at.h());
            az.a(true);
            return flag;
        } else
        {
            az.a(false);
            return flag;
        }
    }

    static boolean a(f f1, boolean flag)
    {
        f1.aB = flag;
        return flag;
    }

    static String[] a(f f1)
    {
        return f1.e;
    }

    static int b(f f1)
    {
        return f1.ar;
    }

    private void b()
    {
        ay.c();
    }

    static d c(f f1)
    {
        return f1.az;
    }

    private void c(Bundle bundle)
    {
        ak.setText(bundle.getString("btData"));
        al.setText(bundle.getString("btHora"));
        as.a(bundle.getLong("timeMillis"));
        av = bundle.getBoolean("edicao");
        az = com.clawdyvan.agendaestudantepro.Util.e.c(bundle.getBundle("Evento"));
        ar = az.a();
        f.setText(e[ar - 1]);
        ay = (m)bundle.getSerializable("fotoHandler");
        if (bundle.containsKey("lembreteCalendar"))
        {
            at = (n)bundle.getSerializable("lembreteCalendar");
            aq.setTag(bundle.getString("tag"));
            if (aq.getTag().equals("x"))
            {
                aq.setImageResource(0x7f020052);
                am.setVisibility(0);
                an.setVisibility(0);
                am.setText(a(at));
                an.setText(String.format("%02dh%02d", new Object[] {
                    Integer.valueOf(at.c()), Integer.valueOf(at.b())
                }));
            }
        }
    }

    static TextView d(f f1)
    {
        return f1.f;
    }

    static n e(f f1)
    {
        return f1.as;
    }

    static Button f(f f1)
    {
        return f1.ak;
    }

    static n g(f f1)
    {
        return f1.at;
    }

    static boolean h(f f1)
    {
        return f1.a();
    }

    static m i(f f1)
    {
        return f1.ay;
    }

    static boolean j(f f1)
    {
        return f1.av;
    }

    private void l(Bundle bundle)
    {
        ar = bundle.getInt("Tipo");
        f.setText(e[ar - 1]);
        if (!bundle.containsKey("_id")) goto _L2; else goto _L1
_L1:
        az = com.clawdyvan.agendaestudantepro.Util.e.c(bundle);
        h.setText(az.c());
        i.setText(az.d());
        as.a(az.e().a(), az.e().b() - 1, az.e().c());
        ak.setText(a(as));
        if (az.f() != null)
        {
            as.b(az.f().b());
            as.a(az.f().c());
            al.setText(az.f().d().replace(':', 'h'));
        }
        if (az.h() > 0L)
        {
            at = new n(az.h());
            am.setText(a(at));
            an.setText(String.format("%02dh%02d", new Object[] {
                Integer.valueOf(at.c()), Integer.valueOf(at.b())
            }));
            if (az.i())
            {
                am.setVisibility(0);
                an.setVisibility(0);
                aq.setTag("x");
                aq.setImageResource(0x7f020052);
            }
        }
        if (!az.b().equals("")) goto _L4; else goto _L3
_L3:
        bundle = new File(az.g());
        az.d("");
        if (bundle.exists())
        {
            File file = com.clawdyvan.agendaestudantepro.Util.a.a(String.valueOf(System.currentTimeMillis()));
            com.clawdyvan.agendaestudantepro.Util.a.a(file, bundle);
            ay.b(file.getAbsolutePath());
            ay.a(ay.b());
        }
_L6:
        return;
_L4:
        av = true;
        ay.a(az.g());
        return;
_L2:
        az = new d();
        az.a(ar);
        if (bundle.containsKey("Data"))
        {
            au = new b(bundle.getString("Data"));
            as.a(au.a(), au.b() - 1, au.c());
            ak.setText(a(as));
        }
        if (bundle.containsKey("Hora"))
        {
            bundle = (g)bundle.getSerializable("Hora");
            as.b(bundle.b());
            as.a(bundle.c());
            al.setText(bundle.d().replace(':', 'h'));
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(bundle);
        aA = layoutinflater.inflate(0x7f030029, viewgroup, false);
        g = (TextView)aA.findViewById(0x7f090049);
        h = (EditText)aA.findViewById(0x7f09007f);
        i = (EditText)aA.findViewById(0x7f090084);
        aj = (TextView)aA.findViewById(0x7f09004a);
        ak = (Button)aA.findViewById(0x7f090082);
        al = (Button)aA.findViewById(0x7f090083);
        am = (Button)aA.findViewById(0x7f090087);
        an = (Button)aA.findViewById(0x7f090088);
        aq = (ImageButton)aA.findViewById(0x7f090086);
        f = (TextView)aA.findViewById(0x7f09007e);
        e = l().getStringArray(0x7f050008);
        aw = l().getStringArray(0x7f050001);
        ax = l().getStringArray(0x7f050000);
        ak.setOnClickListener(new com.clawdyvan.agendaestudantepro.c.g(this));
        al.setOnClickListener(new l(this));
        f.setOnClickListener(new com.clawdyvan.agendaestudantepro.c.m(this));
        aA.findViewById(0x7f090085).setOnClickListener(new o(this));
        aA.findViewById(0x7f090086).setOnClickListener(new p(this));
        am.setOnClickListener(new q(this));
        an.setOnClickListener(new r(this));
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            ao = (Button)aA.findViewById(0x7f09007b);
            ap = (Button)aA.findViewById(0x7f09007c);
        } else
        {
            ao = (Button)aA.findViewById(0x7f09007c);
            ap = (Button)aA.findViewById(0x7f09007b);
        }
        ao.setText(a(0x7f0b007c));
        ao.setOnClickListener(aC);
        ap.setText(a(0x7f0b001d));
        ap.setOnClickListener(aD);
        as = new n();
        ay = new m();
        if (bundle == null) goto _L2; else goto _L1
_L1:
        c(bundle);
_L4:
        MainActivity.b(k()).a(aA);
        return aA;
_L2:
        layoutinflater = j();
        if (layoutinflater != null)
        {
            l(layoutinflater);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(int i1, int j1, Intent intent)
    {
        k();
        if (j1 == -1)
        {
            ay = (m)intent.getSerializableExtra("fotoHandler");
        }
    }

    public void btDataLembreteOnClick(View view)
    {
        (new DatePickerDialog(k(), new h(this, view), at.f(), at.e(), at.d())).show();
    }

    public void btDataOnClick(View view)
    {
        (new DatePickerDialog(k(), new s(this), as.f(), as.e(), as.d())).show();
    }

    public void btFotoOnClick(View view)
    {
        if ("mounted".equals(Environment.getExternalStorageState()))
        {
            view = new Intent(k(), com/clawdyvan/agendaestudantepro/Activities/VisualizacaoFotoActivity);
            view.putExtra("fotoHandler", ay);
            a(view, 1);
            return;
        } else
        {
            Toast.makeText(k(), a(0x7f0b001e), 1).show();
            return;
        }
    }

    public void btHoraLembreteOnClick(View view)
    {
        (new TimePickerDialog(k(), new i(this, view), at.c(), at.b(), true)).show();
    }

    public void btHoraOnClick(View view)
    {
        (new TimePickerDialog(k(), new t(this, view), as.c(), as.b(), true)).show();
    }

    public void e()
    {
        if (!aB)
        {
            b();
        }
        super.e();
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putString("btData", ak.getText().toString());
        bundle.putString("btHora", al.getText().toString());
        bundle.putLong("timeMillis", as.h());
        bundle.putBoolean("edicao", av);
        bundle.putBundle("Evento", com.clawdyvan.agendaestudantepro.Util.e.a(az));
        bundle.putSerializable("fotoHandler", ay);
        if (at != null)
        {
            bundle.putSerializable("lembreteCalendar", at);
            bundle.putString("tag", (String)aq.getTag());
        }
    }

    public void imbLembreteOnClick(View view)
    {
        if (at == null)
        {
            at = new n(as.h());
            at.b(as.c());
            at.a(as.b());
        }
        if (view.getTag().equals("+"))
        {
            AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
            AlphaAnimation alphaanimation2 = new AlphaAnimation(0.0F, 1.0F);
            alphaanimation.setDuration(200L);
            alphaanimation2.setDuration(400L);
            am.setVisibility(0);
            an.setVisibility(0);
            am.clearAnimation();
            am.startAnimation(alphaanimation);
            an.clearAnimation();
            an.startAnimation(alphaanimation2);
            am.setText(a(at));
            an.setText(String.format("%02dh%02d", new Object[] {
                Integer.valueOf(at.c()), Integer.valueOf(at.b())
            }));
            view.setTag("x");
            ((ImageButton)view).setImageResource(0x7f020052);
            return;
        } else
        {
            AlphaAnimation alphaanimation1 = new AlphaAnimation(1.0F, 0.0F);
            AlphaAnimation alphaanimation3 = new AlphaAnimation(1.0F, 0.0F);
            alphaanimation1.setDuration(200L);
            alphaanimation3.setDuration(400L);
            am.setVisibility(4);
            an.setVisibility(4);
            am.clearAnimation();
            am.startAnimation(alphaanimation3);
            an.clearAnimation();
            an.startAnimation(alphaanimation1);
            view.setTag("+");
            ((ImageButton)view).setImageResource(0x7f02005a);
            return;
        }
    }
}
