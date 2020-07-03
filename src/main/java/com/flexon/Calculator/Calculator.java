package com.flexon.Calculator;

public class Calculator {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        double res1 = c.add(5, .35);
        System.out.println(res1);
        double res2 = c.minus(6, 1.0);
        System.out.println(res2);
        double res3 = c.multiply(6, 2.2);
        System.out.println(res3);
        double res4 = c.divide(6, 3.1);
        System.out.println(res4);
    }

    private double add(double a, double b){
        return a + b;
    }

    private double minus(double a, double b){
        return a - b;
    }

    private double multiply(double a, double b){
        return a * b;
    }

    private double divide(double a, double b){
        if (b == 0){
            System.out.println("divisor can not be 0");
            return 0;
        }else{
            return a / b;
        }

    }
}
