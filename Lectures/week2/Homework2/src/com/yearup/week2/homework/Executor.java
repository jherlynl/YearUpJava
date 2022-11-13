package com.yearup.week2.homework;

import java.util.*;

public class Executor extends SolarSystemPlanet {
    static Scanner sc = new Scanner(System.in);
    private static SolarSystemPlanet sol = new SolarSystemPlanet();

    public static void main(String[] args) {
        do {
            String planet = getPlanetName();
            double radius = getPlanetRadius();
            // calc area of planet
            Planet plan = new Planet();
            double area = plan.calcArea(radius, radius);

            String star = sol.getStar();
            printStarAndArea(star, area);
            displayPosition(sol.getPosition(planet));


        } while (promptUserAgain() == true);

        System.out.println("Thanks for using our planet application. Goodbye!");

    }

    public static String getPlanetName() {
        System.out.println("Enter the planet name: ");
        return sc.next();
    }

    public static double getPlanetRadius() {
        System.out.println("Enter the planet radius: ");
        return sc.nextDouble();
    }

    public static void printArea(double r) {
        System.out.println("Area of the planet is: " + r);
    }

    public static void displayPosition(int pos) {
        System.out.println("The position of the planet is: " + pos);
    }

    public static void printStarAndArea(String star, double area) {
        System.out.println(star);
        printArea(area);
    }

    public static boolean promptUserAgain() {

        System.out.println("Do you want to check details for any other planet? yes or no: ");
        String userDecision = sc.next();
        if (userDecision.toLowerCase().equals("yes")) {
            return true;
        }
        return false;
    }
}
