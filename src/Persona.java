// Importo las clases para compilar y validad expresiones regulares.
import java.util.regex.Pattern;
import java.util.Scanner;
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

    
}
