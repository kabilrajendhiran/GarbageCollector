package com.company.demo;


// Object created inside method are eligible for garbage collection
// after the execution of method is finished
public class Example4 {

    public static void main(String[] args) {
        Example4 example4 = new Example4();
        example4.myMethod();

        System.gc();
    }

    public void myMethod()
    {
        Example4 example4 = new Example4();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Example4.finalize");
    }
}
