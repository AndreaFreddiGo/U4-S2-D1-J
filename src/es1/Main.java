package es1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        arrayExercise();

    }

    public static void arrayExercise() {
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = random.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero da 1 a 10: ");
        int number = scanner.nextInt();
        if (number == 0) {
            scanner.close();
            return;
        } else if (number < 1 || number > 10) {
            System.out.println("Il numero inserito non è valido");
            return;
        } else System.out.println("Inserisci ora un numero da 1 a 5 per definirne la posizione nell'array: ");
        int position = scanner.nextInt();
        if (position < 1 || position > 5) {
            System.out.println("Il numero inserito non è valido");
            scanner.close();
            return;
}
        array[position - 1] = number;
        System.out.println(Arrays.toString(array));
    }
}