package pe.edu.utp.fersys.modelo.persona;

/**
 * Abstrae los datos comunes que comparten clientes y usuarios del sistema.
 */
public abstract class Persona {
    private int idPersona;
    private String dni;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String correo;
    private String direccion;

    /**
     * Inicializa la informacion personal reutilizada por las clases hijas.
     */
    public Persona(int idPersona, String dni, String nombres, String apellidos,
                   String telefono, String correo, String direccion) {
        this.idPersona = idPersona;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    /**
     * Devuelve el nombre completo para evitar duplicar formato en subclases.
     */
    public String obtenerNombreCompleto() {
        return nombres + " " + apellidos;
    }

    /**
     * Obliga a cada tipo de persona a definir su propia salida basica.
     */
    public abstract void mostrarInformacionBasica();
}
