package com.dragonsoft.designpattern._01_basic._01_principles._05_d_dependency_inversion;

public class DependenceDeliver3Test {
    public static void main(String[] args) {
        A3 a3 = new A4();
        a3.fun();
    }
}
class A3 {
    public void fun(){
        System.out.println("吃之前先喝水......");
        System.out.println("吃....");
    }
}
class A4 extends A3{
    @Override
    public void fun(){
        System.out.println("吃....");
        System.out.println("吃之后吃水果....");
    }
}