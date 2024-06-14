public class AlertaPantalla {
    private String nombre;
    private String mensaje;
    private String numero;

    public AlertaPantalla(String mensaje, String nombre, String numero) {
        this.mensaje = mensaje;
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
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
