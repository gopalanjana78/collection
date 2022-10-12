package com.LE.Gopal;

public class Main {
    public static void main(String[] args) {
        Anonymous lambda = (int a) -> System.out.println(a);
        lambda.printNum(88);
    }
}
