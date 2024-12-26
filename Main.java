package org.example;

public class Main {
    public static void main(String[] args) {
        Max test = new Max(1,2,3,4);
        Max test1 = new Max(1,2,7,4);
        Max test2 = new Max(1,8,3,4);
        Max test3 = new Max(7,2,11,4);
        test.maximum();
        test2.maximum();
        test3.maximum();
        test1.maximum();
    }
}