package com.company;

public class Main {

    public static void main(String[] args) {

        Class cl = new Class();
        Class cl1 = new Class(4,"Java", new int[]{456,654,75,});

        System.out.println(cl1.getNumber());
        System.out.println(cl1.getWord());
        System.out.println(cl1);
    }
}
