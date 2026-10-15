package logicnote.exercices;

import java.util.Scanner;

public class RecorrerUnArrayUsandoWhileConNombre {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = new String[4];
        int[] ages = new int[4];

        int i = 0;

        while (i < 4) {
            System.out.println("Ingrese su nombre " + (i + 1));
            name[i] = sc.nextLine();

            System.out.println("Ingrese su edad " + (i + 1));
            ages[i] = sc.nextInt();
            sc.nextLine();

            i++;
        }

        int j = 0;

        while (j < 4) {
            System.out.println("Nombre " + (j + 1) + ": " + name[j]);
            System.out.println("Edad " + (j + 1) + ": " + ages[j]);

            j++;
        }

        sc.close();
    }
}