package logicnote;

public class MetodoConReturn {
    public static void main(String[] args) {
       int resultado = sumarDosNumeros(100,400);
        System.out.println("El resultado de la suma es: "+resultado);
    }

    public static int sumarDosNumeros(int num1, int num2){

        int resultado=num1  + num2;
        return resultado;
    }

}
