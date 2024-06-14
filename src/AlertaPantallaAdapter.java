public class AlertaPantallaAdapter implements Cliente{
    private AlertaPantalla alerta;

    public AlertaPantallaAdapter(AlertaPantalla alerta) {
        this.alerta = alerta;

    }

   AlertaPantalla alerta1 =new AlertaPantalla("Hola","Diego","75787971");

    @Override
    public void revisarInformacion(Object datosUsuario) {
        (alerta1.getMensaje().equals(alerta.getMensaje())&&
                alerta1.getNombre().equals(alerta.getNombre())&&
                alerta1.getNumero().equals(alerta.getNumero();

        System.out.println("Los datos del pasaporte son correctos");



    }
}
