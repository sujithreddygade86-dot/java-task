package com.exceptions.in;

class CarStopped extends Exception {

    public CarStopped(String message) {
        super(message);
    }
}

class CarPuncture extends Exception {

    public CarPuncture(String message) {
        super(message);
    }
}

class CarHeat extends Exception {

    public CarHeat(String message) {
        super(message);
    }
}

public class CarTest {

    public static void stop(String value) {

        try {

            if (value.equalsIgnoreCase("stop")) {
                throw new CarStopped("Car is stopped");
            }

            System.out.println("Car not stalled");

        } catch (CarStopped e) {

            System.out.println("CarStopped: " + e.getMessage());
        }
    }

    public static void puncture(String value) {

        try {

            if (value.equalsIgnoreCase("puncture")) {
                throw new CarPuncture("Car is Punctured");
            }

            System.out.println("Car not punctured");

        } catch (CarPuncture e) {

            System.out.println("CarPuncture: " + e.getMessage());
        }
    }

    public static void carHeat(int temperature) {

        try {

            if (temperature > 50) {
                throw new CarHeat("Car is heated more than 50 degrees");
            }

            System.out.println("Car not stalled");

        } catch (CarHeat e) {

            System.out.println("CarHeat: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        System.out.println("Test Case 1");
        stop("stop");

        System.out.println();

        System.out.println("Test Case 2");
        puncture("puncture");

        System.out.println();

        System.out.println("Test Case 3");
        carHeat(60);
    }
}