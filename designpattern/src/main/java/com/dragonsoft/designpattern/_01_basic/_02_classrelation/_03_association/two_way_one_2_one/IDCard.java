package com.dragonsoft.designpattern._01_basic._02_classrelation._03_association.two_way_one_2_one;
//因为Person中有IDCard成员变量，而中IDCard也有Person成员变量，所以这是双向一对一关系
public class IDCard {
    private Person person;
}
