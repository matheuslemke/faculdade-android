// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.a;

import com.a.a.ae;
import com.a.a.d.a;
import com.a.a.d.c;
import com.a.a.d.d;
import com.a.a.u;
import java.net.URI;
import java.net.URISyntaxException;

final class aj extends ae
{

    aj()
    {
    }

    public URI a(a a1)
    {
        if (a1.f() != c.i) goto _L2; else goto _L1
_L1:
        a1.j();
_L4:
        return null;
_L2:
        a1 = a1.h();
        if ("null".equals(a1)) goto _L4; else goto _L3
_L3:
        a1 = new URI(a1);
        return a1;
        a1;
        throw new u(a1);
    }

    public volatile void a(d d1, Object obj)
    {
        a(d1, (URI)obj);
    }

    public void a(d d1, URI uri)
    {
        if (uri == null)
        {
            uri = null;
        } else
        {
            uri = uri.toASCIIString();
        }
        d1.b(uri);
    }

    public Object b(a a1)
    {
        return a(a1);
    }
}
