package com.hgyc.quickstart.proxydemo;

public class UserServiceImpl implements StudentService, TeacherService{
    @Override
    public void learn(String subject) {
        System.out.println("user learing " + subject);
    }

    @Override
    public void teach(String subject) {
        System.out.println("user teaching " + subject);
    }

    @Override
    public void study(String subject) {
        System.out.println("user studying " + subject);
    }
}
