package com.example.demo0731.demo0801;

/**
 * 类与对象
 */
public interface Demo05 {
    public void hello();
}

class Demo051 implements Demo05 {
    public void hello() {
        System.out.println("Demo051");
    }
}

class Demo052 implements Demo05 {
    public void hello() {
        System.out.println("Demo052");
    }
}

class Demo05main {
    public static void main(String[] args) {
        Demo05 demo05 = new Demo051();
        demo05.hello(); // Demo051
//        Demo05 demo05 = new Demo052();
//        demo05.hello(); // Demo052
    }
}