// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import java.util.ArrayList;

final class ad extends ThreadLocal
{

    ad()
    {
    }

    protected ArrayList a()
    {
        return new ArrayList();
    }

    protected Object initialValue()
    {
        return a();
    }
}
