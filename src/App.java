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
        
        // Pido al usuario que introduzca sus datos (Atributos del objeto p1 de clase Persona).
        System.out.println("Introduzca el nombre: ");
        String nombre = lector.nextLine();

        /* Escribo los datos introducidos por el usuario, en los atributos del objeto p1.
        Como los atributos son privados, utilizo los métodos setter de la clase Persona. */
        p1.setNombre(nombre);
            
    }
}

