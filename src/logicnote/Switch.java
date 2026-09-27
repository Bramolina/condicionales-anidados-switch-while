package logicnote;

public class Switch {

    public static void main(String[] args){

        System.out.println("Seleccione " +
                "1. cuenta de ahorro \n"+
                "2. Credito\n"+
                "3. Inversion\n"+
                "4. Mis datos");

        int option=ValidadorDeTipos.validarEnteros();

        System.out.println("Opcion: " + option);

        switch (option){
            case 1 :
                System.out.println("Cuenta de ahorrosSSS");
                break;
            case 2 :
                System.out.println("Credito");
                break;
            case 3:
                System.out.println("Inversion");
                break;
            case 4:
                System.out.println("Mis datosSSS");
                break;
            default:
                System.out.println("Ingrese una opcion valida");
        }
    }
}
