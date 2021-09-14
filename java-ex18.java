/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Drew Butler
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celius to Fahrenhiet.");
        String units = myObj.nextLine();

        System.out.print("Your choice: " + units);

        if (units.equals("C")) {
            System.out.print("\nPlease enter the temperature in Fahrenheit: ");
            int degreesF = myObj2.nextInt();

            int Celsius = (degreesF - 32) * 5 / 9;

            System.out.print("The temperature in Celsius is " + Celsius);


        } else {
            System.out.print("\nPlease enter the temperature in Celsius: ");
            int degreesC = myObj2.nextInt();

            int Fahrenheit = (degreesC * 9 / 5) + 32;

            System.out.print("The temperature in Fahrenheit is " + Fahrenheit);

        }
        
        myObj.close();
    }
}