package logicnote;


public class ComprasSystem {

    String productos[]= new String[5];
    Double [] precios = new Double[5];

    public static void main(String[] args){
        menuCompras();
    }

    public void agregarProductos(){
        int i=0;
        while (i < productos.length){
            System.out.print("Ingrese el nombre del producto "+ (i+1)+ ": ");
            productos[i] = ValidadorDeTipos.validarString();
            i++;
        }
        System.out.println("Productos agregados correctamente. ");

    }

    public void agregarPrecios(){
        int i=0;
        while(i< precios.length){
            System.out.print("Ingrese el precio del producto "+ (i+1) +": ");
            precios[i]=ValidadorDeTipos.validarDouble();
            i++;
        }
        System.out.println("Precios agregados correctamente.");
    }

    public void mostrarProducto(){
        int i=0;
        System.out.println("Lista de productos");
        while (i< productos.length){
            if (productos[i] != null){
                System.out.println((i+1)+": "+productos[i]);
            }
            i++;
        }

    }

    public void mostrarPrecio(){
        int i=0;
        System.out.println("Lista de precios");
        while (i< precios.length){
            if (precios[i] != null) {
                System.out.println((i+1)+". $ "+precios[i]);
            }
            i++;
        }

    }

    public double calcularTotal(){
        double total=0;
        int i=0;
        while (i< precios.length){
            if (precios[i] !=null){
                total+=precios[i];
            }
            i++;
        }
        return total;
    }

    public static void menuCompras(){
        ComprasSystem sistema= new ComprasSystem();
        int option=0;

        while (option !=6){
            System.out.println("\n MENU DE COMPRAS");
            System.out.println("1. Agregar productos");
            System.out.println("2. Agregar precios");
            System.out.println("3. Mostrar productos");
            System.out.println("4. Mostrar Precios");
            System.out.println("5. Calcular total");
            System.out.println("6. Salir");
            System.out.println("Elija una opcion: ");
            option=ValidadorDeTipos.validarEnteros();

            switch (option) {
                case 1:
                    sistema.agregarProductos();
                    break;

                case 2:
                    sistema.agregarPrecios();
                    break;

                case 3:
                    sistema.mostrarProducto();
                    break;

                case 4:
                    sistema.mostrarPrecio();
                    break;

                case 5:
                    System.out.println("Total de la compra: $"+ sistema.calcularTotal());
                    break;

                case 6:
                    System.out.println("Hasta pronto!!");
                    break;

                default:
                    System.out.println("Opcion no valida, intente de nuevo.");
            }
        }
    }
}
