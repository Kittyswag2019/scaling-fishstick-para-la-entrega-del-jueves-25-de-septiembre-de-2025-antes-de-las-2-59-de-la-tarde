package Yes;

public abstract class ClientesDatos {
     protected String nombre;
    protected int edad;
    protected String correo;
    protected long numeroTelefono;
    protected String direccion;
    protected int peso;




     public ClientesDatos(String nombre, int edad, String correo, long numeroTelefono, String direccion, int peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
        this.peso = peso;
}

public abstract void mostratInformacion();
public abstract void atender();

public void welcoming(){
    System.out.println("Hey unc!, im " + nombre + " encantanding de estar con vosotros!");
}
 }

