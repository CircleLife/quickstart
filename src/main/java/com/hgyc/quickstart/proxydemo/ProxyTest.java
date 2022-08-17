package com.hgyc.quickstart.proxydemo;

import org.apache.juli.logging.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {
        //jdk8（不包含8）之前，输出代理类
//        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        //jdk8(包含8）之后，输出代理类
        System.setProperty("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");

        StudentService studentProxy = LogFactory.getProxy(new StudentServiceImpl());
        studentProxy.learn("Chinese");
        TeacherService teacherProxy = LogFactory.getProxy(new TeacherServiceImpl());
        teacherProxy.teach("Chinese");
        TeacherService userProxy = LogFactory.getProxy(new UserServiceImpl());
        userProxy.study("Chinese");

    }
}
