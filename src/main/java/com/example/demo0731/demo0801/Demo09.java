package com.example.demo0731.demo0801;

public class Demo09 {
    public static void main(String[] args) {
        new Demo091().new Demo092();
    }
}

class Demo091 {
    Demo091() {
        System.out.println("Demo091 构造方法");
    }

    static {
        System.out.println("Demo091 静态代码块");
    }

    class Demo092 {
        Demo092() {
            System.out.println("Demo092 构造方法");
        }
    }
}

