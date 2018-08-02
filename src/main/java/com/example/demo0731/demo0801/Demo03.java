package com.example.demo0731.demo0801;

@Deprecated
public class Demo03 extends Demo02 {

    public String str = "wangqing";
    Demo03(){
        System.out.println("Demo03 构造函数");
    }

    static {
        System.out.println("Demo03 static 代码块");
    }

    {
        System.out.println("Demo03 代码块");
    }

    public void hello() {
        System.out.println("demo03 hello world");
    }
}

class Demo031 {
    public static void main(String[] args) {
        new Demo03().hello();
    }
}