package com.example.demo0731.demo0801;

import java.lang.reflect.Field;

public class Demo07 {
    public static void main(String[] args) throws ClassNotFoundException {
        Demo03 demo03 = new Demo03();
        Class<?> cls = demo03.getClass();
        Field[] fields = cls.getFields();
        for (Field field:fields) {
            field.getName();
            field.isAccessible();
            field.setAccessible(true);
            field.getModifiers();
            field.getDeclaredAnnotations();
        }

        Class.forName("com.example.demo0731.demo0801");
    }
}
