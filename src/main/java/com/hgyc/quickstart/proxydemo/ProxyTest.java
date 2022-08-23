package com.hgyc.quickstart.proxydemo;

import net.sf.cglib.core.DebuggingClassWriter;

public class ProxyTest {

    public static void main(String[] args) {
        //jdk8（不包含8）之前，输出代理类
        // System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        //jdk8(包含8）之后，输出代理类
        System.setProperty("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        //查看cglib的class文件
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code_java\\com\\sun\\proxy");

        StudentService studentProxy = LogFactory.getProxy(new StudentServiceImpl());
        studentProxy.learn("Chinese");
        TeacherService teacherProxy = LogFactory.getProxy(new TeacherServiceImpl());
        teacherProxy.teach("Chinese");
        TeacherService userProxy = LogFactory.getProxy(new UserServiceImpl());
        userProxy.study("Chinese");

        StudentService cglibStudentProxy = CglibLogFactory.getProxy(new StudentServiceImpl());
        cglibStudentProxy.learn("Englist");

    }

}
