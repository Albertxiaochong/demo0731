package com.example.demo0731.demo0801;

public class Demo02 {
    int count = 1;
    static int staticCount = 1;

    Demo02() {
        System.out.println("Demo02 构造函数");
    }

    static {
        // 类加载，初始化时执行
        System.out.println("Demo02 static 代码块");
    }

    {
        // 对象初始化时执行
        System.out.println("Demo02 代码块");
    }

    public static void staticHello() {
        System.out.println("static hello world" + staticCount++);
    }

    public void hello() {
        System.out.println("hello world count: " + count++ + " staticCount : " + staticCount++);
    }
}
