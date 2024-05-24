import java.util.Scanner;

public class MainExample {

    public static void main(String[] args) {
        String phrase = "Java — це універсальна мова програмування.";

        // Printing phrase using for loop
        System.out.println("Друк фрази за допомогою циклу for:");
        for (int i = 0; i < 50; i++) {
            System.out.println((i + 1) + ". " + phrase);
        }

        // Printing phrase using while loop
        System.out.println("\nДрук фрази за допомогою циклу for:");
        int j = 0;
        while (j < 50) {
            System.out.println((j + 1) + ". " + phrase);
            j++;
        }

        // Printing hours and minutes using for loop
        System.out.println("\nДрук годин і хвилин за допомогою циклу for:");
        for (int h = 0; h <= 2; h++) {
            for (int m = 0; m < 60; m++) {
                System.out.printf("%d h %d min%n", h, m);
            }
        }

        // Printing hours and minutes using while loop
        System.out.println("\nДрук годин і хвилин за допомогою циклу for:");
        int hWhile = 0;
        while (hWhile <= 2) {
            int mWhile = 0;
            while (mWhile < 60) {
                System.out.printf("%d h %d min%n", hWhile, mWhile);
                mWhile++;
            }
            hWhile++;
        }

        // Printing hours, minutes, and seconds using for loop
        System.out.println("\nДрук годин, хвилин і секунд за допомогою циклу for:");
        for (int h = 0; h <= 2; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    System.out.printf("%d h %d min %d sec%n", h, m, s);
                }
            }
        }

        // Tabulating a function in a given range
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть нижню межу: ");
        double lowerLimit = scanner.nextDouble();

        System.out.print("Введіть верхню межу: ");
        double upperLimit = scanner.nextDouble();

        int countInRange = 0;

        // Using while loop
        System.out.println("\nЗначення функції за допомогою циклу while:");
        double x = lowerLimit;
        while (x <= upperLimit) {
            double y = 3 * Math.sin(Math.cbrt(3)) + 0.35 * x - 3.8;
            if (y >= 0 && y <= 10) {
                System.out.printf("f(%f) = %f%n", x, y);
                countInRange++;
            }
            x += 0.1;
        }

        // Using for loop
        System.out.println("\nЗначення функції з використанням циклу for:");
        for (x = lowerLimit; x <= upperLimit; x += 0.1) {
            double y = 3 * Math.sin(Math.cbrt(3)) + 0.35 * x - 3.8;
            if (y >= 0 && y <= 10) {
                System.out.printf("f(%f) = %f%n", x, y);
                countInRange++;
            }
        }

        if (countInRange == 0) {
            System.out.println("\nУ вказаному діапазоні не знайдено значень функції.");
        }

        scanner.close();
    }
}