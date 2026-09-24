package logicnote.exercices;

public class CasoDoWhileContadorErrores {
    public static void main(String[] args){

        int contador=0;

        do {
            contador++;
            System.out.println("se equivoco"+contador);

        }while (contador <3);
    }
}

