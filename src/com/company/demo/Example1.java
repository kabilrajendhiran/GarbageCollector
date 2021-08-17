package com.company.demo;

// Objects which are assigned as null after initialization are eligible for Garbage Collection
public class Example1 {

    public static void main(String[] args) {

        Example1 obj1 = new Example1();
        obj1 = null;
        System.gc();

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Example1.finalize");
    }
}
