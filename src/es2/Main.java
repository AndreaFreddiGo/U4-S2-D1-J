package es2;

import es2.exceptions.NumberEqualToZeroException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fuelExercise();
    }

    public static void fuelExercise() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero di km percorsi: ");
        int km = scanner.nextInt();
        System.out.println("Inserisci il numero di litri di carburante consumati: ");
        int liters = scanner.nextInt();
        if (liters == 0) try {
            throw new NumberEqualToZeroException();
        } catch (NumberEqualToZeroException e) {
            System.out.println(e.getMessage());
            return;
        }
        int consumption = km / liters;
        System.out.println("Il consumo medio è di " + consumption + " km/l");
        scanner.close();
    }
}
