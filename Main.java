package Yes;

public class Main {
    public static void main(String[] args) {
        
ClientesDatos P1 = new ClienteNormal(
    "Elver", 67, "Elver.galarga67@gmail.com", 3103674167L, "Catatumbo Street #67", 67
);


ClientesDatos P2 = new ClienteRarito(
"Rosa", 41, "Rosa.melano41@gmail.com", 3412674169L, "Ciudad Gotica complejo LegoShitty", 41, "Lactosa"
);



P1.mostratInformacion();
P1.atender();
P2.mostratInformacion();
P2.atender();



P1.welcoming();
P2.welcoming();
    }
}
