package com.example.demo0731.demo0801;

public class Demo08 {
    // 变量 （Field）
    String a = "wangqing";

    // 方法(method)
    void demo() {

    }

    public static void main(String[] args) {

        ClassLoader classLoader = new Demo08().getClass().getClassLoader();
        ClassLoader classLoaderParent =  classLoader.getParent();
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}