package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите два целых числа");
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("Calculator.sum (x,y)" + Calculator.sum(x,y));
        System.out.println("Calculator.sum (x,y)" + Calculator.diff(x,y));
    }
}