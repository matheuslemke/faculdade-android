// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

// Referenced classes of package com.a.a.b:
//            b

final class c
    implements Serializable, GenericArrayType
{

    private final Type a;

    public c(Type type)
    {
        a = b.d(type);
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof GenericArrayType) && b.a(this, (GenericArrayType)obj);
    }

    public Type getGenericComponentType()
    {
        return a;
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append(b.f(a)).append("[]").toString();
    }
}
