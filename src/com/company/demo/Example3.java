package com.company.demo;


// Objects which are reassigned are eligible for garbage collection
public class Example3 {

    public static void main(String[] args) {
        Example3 obj1 = new Example3();
        Example3 obj2 = new Example3();

        obj1 = obj2;

        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Example3.finalize");
    }
}
