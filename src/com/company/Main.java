package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        float a=0;
        float suma = 0;

        do{
            System.out.println("Iveskite skaiciu");
            a=scanner.nextFloat();
            suma +=a;
        }
        while (a !=0);
        System.out.println("Suma yra: " +suma);

    }
}
