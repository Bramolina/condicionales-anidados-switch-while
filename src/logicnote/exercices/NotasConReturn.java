package logicnote.exercices;

public class NotasConReturn {
    public static void main(String[] args) {

        double promedioNota=notasEstudiante(3.5,4.5,5.0);
        System.out.println("Promedio de notas: "+promedioNota);



    }

    public static double notasEstudiante(double nota1, double nota2, double nota3){
        double promedioNota = (nota1+nota2+nota3)/3;
        return promedioNota;
    }

}
