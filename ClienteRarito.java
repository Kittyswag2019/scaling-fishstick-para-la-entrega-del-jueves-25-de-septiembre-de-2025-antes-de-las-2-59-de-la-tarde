package Yes;

public class ClienteRarito extends ClientesDatos {
    private String Alergias;

public ClienteRarito (String nombre, int edad, String correo, long numeroTelefono, String direccion, int peso, String Alergias){
super(nombre, edad, correo, numeroTelefono, direccion, peso);
this.Alergias = Alergias;
}
@Override
    public void mostratInformacion() {
        System.out.println("Ay companero ese cliente mas raro tiene dizque una alergia, mirale el documento: " + nombre + ", "
                + edad + " años, " + numeroTelefono + ", " + correo + ", " + direccion + ", " + peso + "Kg, " + "alergia a la " + Alergias);
    }
@Override
    public void atender() {
        System.out.println("Atendiendo a este cliente mas raro con el nombre " + nombre + " y con un peso de " + peso + "Kg");
    }

}
