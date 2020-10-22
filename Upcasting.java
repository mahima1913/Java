package com.company;

class c1 {
    int a;
    int b;
}

class c2 extends c1 {
    int c;
}

public class Upcasting {
    public static void main(String[] args) {
     c2 c = new c2();
     c.a = 12;
     c.b = 19;
     c.c = c.a + c.b;
        System.out.println(c.c);
    }
}
