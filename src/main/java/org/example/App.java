package org.example;
import java.util.Scanner;

public class App
{
    static final float COVERAGE = 350;
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter length of room:");
        float length = scnr.nextInt();
        System.out.println("Please enter width of room:");
        float width = scnr.nextInt();

        float area = length * width;
        float gallon = (int) Math.ceil(area / COVERAGE);

        System.out.format("you will need to purchase " + gallon + " of paint to cover " + area + " square feet");


    }
}
