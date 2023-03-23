import java.util.Scanner;

public class RegistroUsuario {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String usuario = "usuario";
        String contrasenia = "contrasenia";
        
        int intentos = 2;
        
        while (intentos > 0) {
            System.out.println("Ingrese usuario: ");
            String usuarioIngresado = sc.nextLine();
            System.out.println("Ingrese contraseña: ");
            String contraseniaIngresada = sc.nextLine();
            
            if (usuarioIngresado.equals(usuario) && contraseniaIngresada.equals(contrasenia)) {
                System.out.println("¡Bienvenido al sistema de registro de usuarios!");
                
                System.out.println("Ingrese su nombre: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese su apellido: ");
                String apellido = sc.nextLine();
                System.out.println("Ingrese su edad: ");
                int edad = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer de entrada después de leer la edad
                System.out.println("Ingrese su DNI: ");
                String dni = sc.nextLine();
                
                if (edad >= 18) {
                    System.out.println("Registro exitoso:");
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Apellido: " + apellido);
                    System.out.println("Edad: " + edad);
                    System.out.println("DNI: " + dni);
                } else {
                    System.out.println("Debe ser mayor de edad para registrarse.");
                }
                
                break; // Salir del bucle while
            } else {
                System.out.println("Usuario o contraseña incorrectos.");
                intentos--;
            }
        }
        
        if (intentos == 0) {
            System.out.println("Ha superado el número máximo de intentos. Adiós.");
        }
        
        sc.close();
    }

}
