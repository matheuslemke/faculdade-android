// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.clawdyvan.agendaestudantepro.Util;

import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

public class a
{

    public static File a(String s)
    {
        return a("/ADA_EventFiles/", s, ".jpg");
    }

    public static File a(String s, String s1)
    {
        File file;
        file = new File(b(), (new StringBuilder()).append(s1).append(".aeb").toString());
        s1 = null;
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(new FileOutputStream(file));
        s1 = objectoutputstream;
        objectoutputstream.writeObject(s);
        objectoutputstream.close();
        return file;
        s;
        s1 = null;
_L4:
        throw s;
        s;
_L2:
        s1.close();
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
        s;
        s1 = objectoutputstream;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static File a(String s, String s1, String s2)
    {
        s = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory()).append(s).toString());
        s.mkdirs();
        return new File(s, (new StringBuilder()).append(s1).append(s2).toString());
    }

    public static File a(byte abyte0[], File file)
    {
        FileOutputStream fileoutputstream = new FileOutputStream(file);
        fileoutputstream.write(abyte0);
        fileoutputstream.close();
        return file;
    }

    public static String a(File file)
    {
        Object obj1 = null;
        Object obj = new ObjectInputStream(new FileInputStream(file));
        file = ((File) (obj));
        obj1 = (String)((ObjectInputStream) (obj)).readObject();
        ((ObjectInputStream) (obj)).close();
        return ((String) (obj1));
        obj1;
        file = null;
_L4:
        throw obj1;
        obj1;
        obj = file;
        file = ((File) (obj1));
_L2:
        ((ObjectInputStream) (obj)).close();
        throw file;
        file;
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        file = ((File) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static List a()
    {
        return Arrays.asList(b().listFiles());
    }

    public static void a(File file, File file1)
    {
        byte abyte0[];
        file1 = new FileInputStream(file1);
        file = new FileOutputStream(file);
        abyte0 = new byte[1024];
_L1:
        int i = file1.read(abyte0);
label0:
        {
            if (i <= 0)
            {
                break label0;
            }
            try
            {
                file.write(abyte0, 0, i);
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return;
            }
        }
          goto _L1
        file1.close();
        file.close();
        return;
    }

    public static File b()
    {
        File file = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/ADA_EventFiles/").append("backup").toString());
        file.mkdirs();
        return file;
    }
}
