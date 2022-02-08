package com.begginersGuide;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Your height in m: ");
        double height = in.nextDouble();

        System.out.println("Your Weight in kg: ");
        double weight = in.nextDouble();

        double BMI = weight/(height*height);
        System.out.println("Your BMI is: " + BMI);


    }
}
