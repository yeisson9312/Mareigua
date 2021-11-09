package PruebaMereigua;

public class Diparador {



    public static void main(String[] args) {
        // TODO code application logic here
        Punto1 x = new Punto1();
        System.out.println("Punto 1 ");
         x.recorridoDeNumeros();
        System.out.println(" -----------------------  ");

        int[] array_enteros = {1, 2, 3, 4, 5, 8, 9, 87, 108, 843, 846, 2027, 456};
        
        Punto2 y = new  Punto2();
        System.out.println("Punto 2 ");
        System.out.println(y.enteroMayot(array_enteros));
        
        System.out.println(" -----------------------  ");
        System.out.println("Punto 3 ");
        Punto3 z = new Punto3();
        System.out.println(z.revertirCadena("Yo soy yeisson en este lugar"));
        
    }

    
    
    
    
}
