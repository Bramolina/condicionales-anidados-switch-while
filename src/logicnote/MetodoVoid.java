package logicnote;

public class MetodoVoid {

    public static void main(String[] args){
        saludarPorElNombre("Juan");

        sumarDosNumeros(500,200);


    }

    public static void saludarPorElNombre(String nombre){
        System.out.println("Hola "+ nombre);
    }

    public static void sumarDosNumeros(int num1,int num2){
        int resultado=num1+num2;
        System.out.println("Resultado = "+ resultado);

    }

}
