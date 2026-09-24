package logicnote;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Scanner;

public class Array {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] names= {"Maria","Luisa","Juan"};
        int [] ages= new int[4];

        //Vamos a mandar valores al array

        ages[0]=23;
        ages[1]=26;
        ages[2]=34;
        ages[3]=19;

        // Si quiero imprimir puedo llamar la variable con la posicion

        System.out.println("Posicion 1: "+ages[0]);
        System.out.println("Posicion 2: "+ages[1]);
        System.out.println("Posicion 3: "+ages[2]);
        System.out.println("Posicion 4: "+ages[3]);

        //Podemos usar scanner para capturar datos desde la consola

        double[] salaries = new double[3];

        System.out.println("Ingrese salario 1 :");
        salaries[0] = sc.nextDouble();
        System.out.println("Ingrese salario 2 :");
        salaries[1] = sc.nextDouble();
        System.out.println("Ingrese salario 3 :");
        salaries[2] = sc.nextDouble();
        System.out.println(salaries[0] + "\n" +
                salaries[1]+"\n"+
                salaries[2]);










    }
}
