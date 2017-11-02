<<<<<<< HEAD

package calculadora;


public class Main {


    public static void main(String[] args) {
       
        
        
        
        
        
        
        
        
        
    }
    
=======
package calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Que quiere hacer:");
            System.out.println("1.-Sumar");
            System.out.println("2.-Restar");
            System.out.println("3.-Multiplicar");
            System.out.println("4.-Dividir");
            System.out.println("5.-Salir");
            int op = Integer.parseInt(scan.nextLine());
            if (op == 1) {
                System.out.println("");
            }
            if (op == 2) {

            }
            if (op == 3) {

                System.out.println("Ingrese numero 1: ");
                int numSumauno = Integer.parseInt(scan.nextLine());
                System.out.println("Ingrese numero 2: ");
                int numSumados = Integer.parseInt(scan.nextLine());
                c.multi(numSumauno, numSumados);
            }
            if (op == 4) {

            }
            if (op == 5) {

            }
        }

    }

>>>>>>> bdb600ad4cf89f27a80af0a878ad2c8b0d9a986f
}
