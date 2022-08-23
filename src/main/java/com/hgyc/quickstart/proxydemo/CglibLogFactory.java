package com.hgyc.quickstart.proxydemo;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.awt.*;
import java.lang.reflect.Method;

public class CglibLogFactory {

    public static <T>T getProxy(Object target){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("cglib before...");
                methodProxy.invokeSuper(o, objects);
                System.out.println("cglib after...");
                return null;
            }
        });
        return (T)enhancer.create();
    }
}
