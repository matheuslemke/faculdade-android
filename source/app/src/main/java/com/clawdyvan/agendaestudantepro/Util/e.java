// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Util;

import android.os.Bundle;
import com.clawdyvan.agendaestudantepro.b.b;
import com.clawdyvan.agendaestudantepro.b.c;
import com.clawdyvan.agendaestudantepro.b.d;
import com.clawdyvan.agendaestudantepro.b.f;
import com.clawdyvan.agendaestudantepro.b.g;

public class e
{

    public static Bundle a(c c1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("_id", c1.a());
        bundle.putString("Nome", c1.b());
        bundle.putString("Abreviacao", c1.c());
        bundle.putString("NomeProfessor", c1.d());
        bundle.putString("EmailProfessor", c1.e());
        bundle.putInt("Cor", c1.f());
        return bundle;
    }

    public static Bundle a(d d1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("_id", d1.b());
        bundle.putInt("Tipo", d1.a());
        bundle.putString("Data", d1.e().d());
        if (d1.f() != null)
        {
            bundle.putInt("Hora", d1.f().e());
        }
        bundle.putString("Titulo", d1.c());
        bundle.putString("Descricao", d1.d());
        bundle.putString("Foto", d1.g());
        bundle.putLong("LembreteMs", d1.h());
        bundle.putBoolean("LembreteAtivado", d1.i());
        bundle.putBoolean("eventoConcluido", d1.j());
        return bundle;
    }

    public static Bundle a(com.clawdyvan.agendaestudantepro.b.e e1)
    {
        Bundle bundle = new Bundle();
        bundle.putBundle("Disciplina", a(e1.c()));
        bundle.putString("_id", e1.a());
        bundle.putInt("DiaSemana", e1.b());
        bundle.putInt("HoraInicio", e1.d().e());
        if (e1.e() != null)
        {
            bundle.putInt("HoraFim", e1.e().e());
        }
        bundle.putString("Sala", e1.f());
        return bundle;
    }

    public static Bundle a(f f1)
    {
        Bundle bundle = new Bundle();
        bundle.putBundle("Disciplina", a(f1.f()));
        bundle.putString("_id", f1.a());
        bundle.putFloat("NotaObtida", f1.b());
        bundle.putFloat("Peso", f1.c());
        bundle.putString("Titulo", f1.d());
        bundle.putString("Descricao", f1.e());
        return bundle;
    }

    public static c a(Bundle bundle)
    {
        c c1 = new c();
        c1.a(bundle.getString("_id"));
        c1.b(bundle.getString("Nome"));
        c1.c(bundle.getString("Abreviacao"));
        c1.d(bundle.getString("NomeProfessor"));
        c1.e(bundle.getString("EmailProfessor"));
        c1.a(bundle.getInt("Cor"));
        return c1;
    }

    public static com.clawdyvan.agendaestudantepro.b.e b(Bundle bundle)
    {
        com.clawdyvan.agendaestudantepro.b.e e1 = new com.clawdyvan.agendaestudantepro.b.e();
        e1.a(bundle.getString("_id"));
        e1.a(bundle.getInt("DiaSemana"));
        e1.a(a(bundle.getBundle("Disciplina")));
        e1.d().c(bundle.getInt("HoraInicio"));
        int i = bundle.getInt("HoraFim", -1);
        if (i != -1)
        {
            e1.e().c(i);
        } else
        {
            e1.b(null);
        }
        e1.b(bundle.getString("Sala"));
        return e1;
    }

    public static d c(Bundle bundle)
    {
        d d1 = new d();
        d1.a(bundle.getString("_id"));
        d1.a(bundle.getInt("Tipo"));
        d1.e().a(bundle.getString("Data"));
        int i = bundle.getInt("Hora", -1);
        if (i != -1)
        {
            d1.f().c(i);
        } else
        {
            d1.a(null);
        }
        d1.b(bundle.getString("Titulo"));
        d1.c(bundle.getString("Descricao"));
        d1.d(bundle.getString("Foto"));
        d1.a(bundle.getLong("LembreteMs"));
        d1.a(bundle.getBoolean("LembreteAtivado"));
        d1.b(bundle.getBoolean("eventoConcluido"));
        return d1;
    }

    public static f d(Bundle bundle)
    {
        f f1 = new f();
        f1.a(a(bundle.getBundle("Disciplina")));
        f1.a(bundle.getString("_id"));
        f1.a(bundle.getFloat("NotaObtida"));
        f1.b(bundle.getFloat("Peso"));
        f1.b(bundle.getString("Titulo"));
        f1.c(bundle.getString("Descricao"));
        return f1;
    }
}
