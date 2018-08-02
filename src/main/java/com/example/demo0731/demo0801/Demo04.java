package com.example.demo0731.demo0801;

/**
 * 类与对象
 */
public class Demo04 {
    public void hello() {
        System.out.println("Demo04 hello world");
    }
}

class Demo041 extends Demo04 {

    public void hello() {
        System.out.println("Demo041 hello world");
    }
}

class Demo04main {
    public static void main(String[] args) {
        new Demo041().hello();
    }
}