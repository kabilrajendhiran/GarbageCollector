package com.company.demo;

// Objects which had references to each other but not having scope of execution
// then those objects are called are Island of Isolation and those objects are
// eligible for Garbage Collection

public class Example2 {
    Example2 gcExample;
    public static void main(String[] args) {
        Example2 obj1 = new Example2();
        Example2 obj2 = new Example2();

        obj1.gcExample = obj2;
        obj2.gcExample = obj1;

        obj1 = null;
        obj2 = null;

        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("GCExample.finalize");
    }
}
