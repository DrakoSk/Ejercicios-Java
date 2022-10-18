
package boleta;

import java.util.Scanner;


public class Boleta {

    
    public static void main(String[] args) {
        System.out.println("----------- BOLETA --------");
        Scanner tem = new Scanner(System.in);
        String nomb;
        
        System.out.println("Ingrese su nombre: ");
        nomb = tem.nextLine();
        
        // PRODUCTO COMPRADO
        Scanner Prod=new Scanner(System.in);
        String Nombre;
        double Precio;
        int Cantidad = 0;
        double Subtotal;
        double Total;
        double Impuesto;
        double IGV=0.18;
        double Descuelto=0.1;
        System.out.println("Que producto sea comprar?");
        Nombre=Prod.next();
        System.out.println("Cula es el precio unitario del producto; "+Nombre+"?");
        Precio=Prod.nextDouble();
        Subtotal=Precio*Cantidad;
        Impuesto=Subtotal*IGV;
        Total=Subtotal+Impuesto;
        if (Total>5000){
            double Total12 = (Total)-Total*Descuelto;
            System.out.println("""
                               -----------FACTURA-----------
                               Producto;""" +Nombre
                    + "\nPrecio; "+Precio
                    +"\nCantidad comprada; "+Cantidad
                    + "\nSubtotal; "+Subtotal
                    + "\nImpuesto; "+Impuesto
                    + "\nTotal; "+Total
                    + "\nDescuento; "+(Total*Descuelto)
                    +"\nTotal a pagar; "+Total12);
            
        }else{
            System.out.println("""
                               -----------FACTURA-----------
                               Producto;""" +Nombre
                    + "\nPrecio; "+Precio
                    +"\nCantidad comprada; "+Cantidad
                    + "\nSubtotal; "+Subtotal
                    + "\nImpuesto; "+Impuesto
                    + "\nTotal; "+Total);
        
        }
        
 
        
    }
    
}
