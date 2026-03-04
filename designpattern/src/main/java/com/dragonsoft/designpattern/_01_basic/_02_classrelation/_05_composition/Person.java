package com.dragonsoft.designpattern._01_basic._02_classrelation._05_composition;

public class Person {
    //组合关系，Person和Head是无法分开的
    private Head head = new Head();
    //组合关系，Person和Leg是无法分开的
    private Leg leg = new Leg();
}
