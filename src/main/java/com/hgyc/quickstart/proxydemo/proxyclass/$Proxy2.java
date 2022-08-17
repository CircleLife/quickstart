package com.hgyc.quickstart.proxydemo.proxyclass;

import com.hgyc.quickstart.proxydemo.StudentService;
import com.hgyc.quickstart.proxydemo.TeacherService;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

/**
 * jdk生成的代理类样例
 */
public final class $Proxy2 extends Proxy implements StudentService, TeacherService {
    private static Method m1;
    private static Method m3;
    private static Method m2;
    private static Method m4;
    private static Method m5;
    private static Method m0;

    public $Proxy2(InvocationHandler var1) throws UndeclaredThrowableException {
        super(var1);
    }

    @Override
    public final boolean equals(Object var1)  throws UndeclaredThrowableException {
        try {
            return (Boolean)super.h.invoke(this, m1, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    @Override
    public final void learn(String var1) throws UndeclaredThrowableException {
        try {
            super.h.invoke(this, m3, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    @Override
    public final String toString() throws UndeclaredThrowableException {
        try {
            return (String)super.h.invoke(this, m2, (Object[])null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }

    @Override
    public final void study(String var1) throws UndeclaredThrowableException{
        try {
            super.h.invoke(this, m4, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    @Override
    public final void teach(String var1) throws UndeclaredThrowableException {
        try {
            super.h.invoke(this, m5, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    @Override
    public final int hashCode() throws UndeclaredThrowableException {
        try {
            return (Integer)super.h.invoke(this, m0, (Object[])null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }

    static {
        try {
            m1 = Class.forName("java.lang.Object").getMethod("equals", Class.forName("java.lang.Object"));
            m3 = Class.forName("com.hgyc.quickstart.proxydemo.StudentService").getMethod("learn", Class.forName("java.lang.String"));
            m2 = Class.forName("java.lang.Object").getMethod("toString");
            m4 = Class.forName("com.hgyc.quickstart.proxydemo.TeacherService").getMethod("study", Class.forName("java.lang.String"));
            m5 = Class.forName("com.hgyc.quickstart.proxydemo.TeacherService").getMethod("teach", Class.forName("java.lang.String"));
            m0 = Class.forName("java.lang.Object").getMethod("hashCode");
        } catch (NoSuchMethodException var2) {
            throw new NoSuchMethodError(var2.getMessage());
        } catch (ClassNotFoundException var3) {
            throw new NoClassDefFoundError(var3.getMessage());
        }
    }
}
