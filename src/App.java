/* Tarea Tema 5
Añade los atributos teléfono, email, fechaNac a la clase Persona realizada en clase y añade
los métodos de validación realizados en la tarea anterior con expresiones regulares.

Realiza un main para crear los objetos necesarios y mostrar sus atributos para comprobar el
correcto funcionamiento de los métodos de validación.

Añade también el atributo DNI. Se validará que el usuario introduzca 8 dígitos y una letra:
Que sean 8 dígitos será validado mediante una expresión regular.
La letra será calculada con un método calcularLetra sin expresiones regulares.

NOTA:
Si los atributos no cumplen con la validación, se quedarán vacíos. En caso contrario con su
valor validado correspondiente.
 */

//Importación de la clase Scanner:
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Instancia un nuevo objeto (p1) de la clase Persona.
        Persona p1 = new Persona(null, null, 0, null, null, null, null);

        // Inicializo el lector.
        Scanner lector = new Scanner(System.in);
        
        /* Pido al usuario que introduzca sus datos (Atributos del objeto p1 de clase Persona).

        Escribo los datos introducidos por el usuario, en los atributos del objeto p1.
        Como los atributos son privados, utilizo los métodos setter de la clase Persona.
        
        Utilizo los métodos de validación para el email, el DNI, el teléfono y la fecha de nacimiento.
        */
        System.out.println("Introduzca el nombre: ");
        String nombre = lector.nextLine();
        p1.setNombre(nombre);

        System.out.println("Introduzca los apellidos: ");
        String apellidos = lector.nextLine();
        p1.setApellidos(apellidos);

        System.out.println("Introduzca la edad: ");
        int edad = lector.nextInt();
        p1.setEdad(edad);

        // Bucle que se repite hasta que se introduzca un email válido.
        do {
            System.out.println("Introduzca el email: ");
            String email = lector.next();   // El método nextLine no funciona aquí, desconozco el motivo. El método next sí.
            p1.setEmail(email);

            // Avisa si el email no es válido.
            if (p1.validadorEmail() == false)
            System.out.println("El email no es válido.");
        }
        while (p1.validadorEmail() == false);

        // Mismo bucle para el DNI.
        do {
            System.out.println("Introduzca el DNI: ");
            String dni = lector.next();
            p1.setDni(dni);

            // Avisa si el DNI no es válido.
            if (p1.validadorDni() == false)
            System.out.println("El DNI no es válido.");
            }
        while (p1.validadorDni() == false);

        System.out.println("Introduzca el teléfono (debe empezar por el prefijo +34): ");
        String telefono = lector.next();
        p1.setTelefono(telefono);

        System.out.println("Introduzca la fecha de nacimiento (el formato debe ser dd/mm/aaaa): ");
        String fechaNacimiento = lector.next();
        p1.setFechaNacimiento(fechaNacimiento);

        
        
        
       lector.close(); 
    }
}

