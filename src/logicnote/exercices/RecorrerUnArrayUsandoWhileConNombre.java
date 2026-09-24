package logicnote.exercices;

import java.util.Scanner;

public class RecorrerUnArrayUsandoWhileConNombre {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String [] name = new String[4];

        String i = 0;

        while (i <4){
            System.out.println("Ingrese su nombres " + (i+1));
            name[i]= sc.nextInt();
            i++;
        }

        int j=0;
        while (j<7){
            System.out.println("Edad" + (j+1)+": " + ages[j]);
            j++;
        }




    }
}
