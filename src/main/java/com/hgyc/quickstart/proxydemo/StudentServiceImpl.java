package com.hgyc.quickstart.proxydemo;

public class StudentServiceImpl implements StudentService{
    @Override
    public void learn(String subject) {
        System.out.println("learning " + subject);
    }
}
