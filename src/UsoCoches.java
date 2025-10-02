public class UsoCoches {

    public static void main(String[] args) {

        Coche renault = new Coche();

        renault.alto = 1520.3;
        renault.arrancar();

        Coche mazda = new Coche();

        mazda.color = "azul";
        mazda.setRuedas(4820);
        mazda.girar();

        System.out.println("El coche tiene: " + mazda.getRuedas());
    }
}
