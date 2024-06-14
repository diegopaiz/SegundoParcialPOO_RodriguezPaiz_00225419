public class Correo {
    private String nombre;
    private String apellido;
    private String correo;
    private String numero;

    public Correo(String apellido, String correo, String nombre, String numero) {
        this.apellido = apellido;
        this.correo = correo;
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
