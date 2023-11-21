// Importo las clases para compilar y validad expresiones regulares.
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Persona {

    // Atributos de la clase Persona (tienen que ser private para que no puedan ser modificadas fuera de su clase).
    private String nombre;
    private String apellidos;
    private int edad;
    private String email;
    private String dni;
    private String telefono;
    private String fechaNacimiento;

    /* Constructor por defecto (sin parámetros, deja vacíos los atributos cuando al instanciar un nuevo objeto,
    no se especifica el valor de algún atributo). */
    public Persona() {
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
        this.email = "";
        this.dni = "";
        this.telefono = "";
        this.fechaNacimiento = "";
    }

    /* Constructor por parámetros. */
    public Persona(String nombre, String apellidos, int edad, String email, String dni, String telefono, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
        this.dni = dni;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Métodos getter y setter. Necesarios para leer y escribir atributos privados de esta clase desde otra clase.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //* Método personalizado para la validación del email.

    public boolean validadorEmail() {

        /* Patrón REGEX (explicación detallada):

            ^ - Inicio del String
            () - Debe cumplirse todo lo que contenga
            ([a-zA-Z0-9_-]|\\.){1,64} - (Usuario) Puede contener de 1 a 64 mayúsculas, minúsculas, dígitos, '_', '-' o puntos
            [@] - A continuación tiene que haber una @
            ([a-zA-Z0-9_-]|\\.){1,64} - (Organización) Puede contener de 1 a 255 mayúsculas, minúsculas, dígitos, '_', '-' o puntos
            [\\.] - A continuación tiene que haber un punto
            ([a-zA-Z]{2,4}) - (Dominio) Puede contener de 1 a 4 letras
            $ - Final del String
        */
        final String PATRON = "^(([a-zA-Z0-9_-]|\\.){1,64}[@]([a-zA-Z0-9_-]|\\.){1,255}[\\.]([a-zA-Z]{2,4}))$";
        // Utilizo el email introducido para su validación.       
        String email = this.email;

        // Compilo el patrón, comparo el email introducido con el patrón y guardo el resultado en boolean emailOK.
        Pattern p = Pattern.compile(PATRON);
        Matcher m = p.matcher(email);
        boolean emailOk = m.matches();

        // Registro el resultado de la validación en boolean emailComprobado.
        if ((emailOk)) {
            return(true);
        }
        else {
            return(false);
        }
    }

        //* Método personalizado para la validación del DNI.

        public boolean validadorDni() {

            // Secuencia preestablecida para la letra del DNI español:
        final String SECUENCIA = "TRWAGMYFPDXBNJZSQVHLCKE";

        /* Explicación del patrón REGEX:
            ^ - Comienzo de String
            () - Ha de cumplirse todo lo que contenga
            [\\d]{8} - Debe haber una sucesión de 8 dígitos cualesquera
            [T|R|W|A...] - Debe haber una de estas letras mayúsculas
            $ - Fin del String
         */
        
        // Patrón REGEX
        final String PATRON = "^([\\d]{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E])$";

        // Utilizo el DNI introducido para su validación.       
        String dni = this.dni;
        
        // Para evitar una excepción en caso de que el DNI introducido tenga menos de 9 caracteres:
        if (dni.length() < 9) {
            return(false);
        }

        // Selecciona los números del String dni y los convierte en un entero con el método parseInt
        String dniSinLetra = dni.substring(0,8);
        int numeroDni = Integer.parseInt(dniSinLetra);

        /* Ahora puedo aplicar el algoritmo de Luhn para calcular la letra equivalente al número del DNI:
        1º - Calculo el resto de dividir el número entre 23 y lo guardo en la variable int resto.
        2º - Con el método charAt, obtengo en la variable char letra, la letra de la secuencia
        cuya posición coincida con el valor de int resto. */
        int resto = numeroDni % 23;
        char letra = SECUENCIA.charAt(resto);


        //* Verificación del patrón REGEX.

        // Compilo el patrón con el método compile de la Clase Pattern.
        Pattern p = Pattern.compile(PATRON);

        // Compruebo que el dni introducido respeta el patrón, con la Clase Matcher.
        Matcher m = p.matcher(dni);

        // Guardo en boolean dniOk el resultado de la comprobación.
        boolean dniOk = m.matches();


        // Verificación de DNI (formato y letra). Avisa si la letra no corresponde con el número.
        if ((dniOk == true) && (dni.charAt(8) == letra)) {
            return(true);
        }
        else {
            return(false);
        }
        

    }
    
}
