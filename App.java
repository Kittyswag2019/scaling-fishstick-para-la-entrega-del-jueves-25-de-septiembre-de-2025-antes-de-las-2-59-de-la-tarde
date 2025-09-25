public class App {
    public static void main(String[] args) throws Exception {
    

 Ingredientes queso = new IngredienteLacteo("Queso", "Proteína y calcio", 250, 100, "cabra", 30 );
        Ingredientes zanahoria = new IngredienteVegetal("Zanahoria", "Vitamina A y fibra", 40, 80, "naranja");
        Ingredientes carne = new IngredienteCarnico("Carne de res", "Proteína y hierro", 500, 200, "Vaca", "Lomo");

        
        queso.mostrarInfo();
        zanahoria.mostrarInfo();
        carne.mostrarInfo();


        
        queso.preparar();      
        zanahoria.preparar();  
        carne.preparar();     


    }
    }