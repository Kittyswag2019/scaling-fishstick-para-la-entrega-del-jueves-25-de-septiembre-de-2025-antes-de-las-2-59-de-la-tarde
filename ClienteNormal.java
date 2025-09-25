package Yes;

public class ClienteNormal extends ClientesDatos {

    public ClienteNormal(String nombre, int edad, String correo, long numeroTelefono, String direccion, int peso) {
        super(nombre, edad, correo, numeroTelefono, direccion, peso);
    }

    @Override
    public void mostratInformacion() {
        System.out.println("La informacion correspondiente al registro del cliente normal es la siguiente: " + nombre
                + ", " + edad + " años, " + numeroTelefono + ", " + correo + ", " + direccion + ", " + peso + "Kg");
    }

    @Override
    public void atender() {
        System.out.println(
                "Atendiendo a " + nombre + " con un peso correspondiente de  " + peso + "Kg" + " con la mejor actitud");
    }

}
