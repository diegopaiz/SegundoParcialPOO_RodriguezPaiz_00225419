public class CorreoAdapter implements Cliente {
    private Correo correo;

    public CorreoAdapter(Correo correo) {
        this.correo = correo;
    }

    Correo correo1 = new Correo("Paiz", "diegopaiz1@hotmail.com","Diego","78757975");

    @Override
    public void revisarInformacion(Object datosUsuario) {
        if(correo1.getApellido().equals(correo.getApellido())&&
                correo1.getCorreo().equals(correo.getCorreo())&&
                correo1.getNombre().equals(correo.getNombre())&&
                correo1.getNumero().equals(correo.getNumero()))
               {
                   System.out.println("Los datos del pasaporte son correctos");
               }

        }

    }

