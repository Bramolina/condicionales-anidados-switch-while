package logicnote;

public class While {

    public static void main(String[] args){

        System.out.println("Escena: he venido a negociar");

        String negociar ="no";
        String negociar1="si";


        while (negociar1.equals("si")){
            System.out.println("Socio he venido a negociar");

            negociar = ValidadorDeTipos.validarString();

        }
        while (negociar.equals("no")){

            System.out.println("Socio he venido a negociar");

            negociar = ValidadorDeTipos.validarString();

        }
    }

}
