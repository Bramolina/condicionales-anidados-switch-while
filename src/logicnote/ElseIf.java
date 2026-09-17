package logicnote;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su peso:");
        float peso = entrada.nextFloat();

        System.out.println("Ingrese su estatura:");
        float estatura = entrada.nextFloat();

        float imc = Math.round (peso / (estatura * estatura));


        if (imc < 18.5) {
            System.out.println("Bajo peso " + imc);

        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Peso normal " + imc );
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Sobre peso " + imc);
        } else System.out.println("Imc "+imc+"Corresponde a obesidad ");
    }
}