package com.hgyc.quickstart.proxydemo;

public class TeacherServiceImpl implements TeacherService{

    @Override
    public void teach(String subject) {
        System.out.println("teaching " + subject);
    }

    @Override
    public void study(String subject) {
        System.out.println("studying " + subject);
    }
}
