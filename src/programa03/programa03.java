
package programa03;

import java.util.Scanner; // Importación de la clase Scanner

public class programa03 {
    // método principal
    public static void main(String args[]){
        // declarar variables
        String vendedor;
        double sm, pT, c;
        int vt1, vt2, vt3;

        Scanner lectura = new Scanner(System.in);
        // entrada de datos
        System.out.print("Nombre de Vendedor:");
        vendedor = lectura.next();

        System.out.print("Sueldo Mensual:");
        sm = lectura.nextDouble();

        System.out.print("Venta 1:");
        vt1 = lectura.nextInt();

        System.out.print("Venta 2:");
        vt2 = lectura.nextInt();

        System.out.print("Venta 3:");
        vt3 = lectura.nextInt();

        // proceso de datos
        c = (vt1 + vt2 + vt3) * 0.10;
        pT = sm + c;

        // salida de datos
        System.out.println("La comisión de la venta es: " + c);
        System.out.println("El sueldo mensual del vendedor es: " + pT);
        
                // Mensaje adicional corregido
        System.out.println("Hola Mundo");

        // Cerrar el Scanner
        lectura.close();
    }
}
