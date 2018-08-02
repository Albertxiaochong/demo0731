package com.example.demo0731.demo0801;

public class Demo01 {
    public static void main(String[] args) {
        Demo02.staticHello(); // static hello world 1
        Demo02.staticHello(); // static hello world 2

        Demo02 demo02 = new Demo02();
        //代码块 hello world
        //构造函数 hello world

        demo02.hello(); // hello world count: 1 staticCount : 3
        demo02.hello(); // hello world count: 2 staticCount : 4
    }
}
