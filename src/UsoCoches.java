public class UsoCoches {

    public static void main(String[] args) {

        Coche renault = new Coche();

        renault.alto = 1520.3;
        renault.arrancar();

        Coche mazda = new Coche();

        mazda.setColor("blanco");
        mazda.setRuedas(3);
        mazda.girar();

        /*
        System.out.println("El mazda tiene: " + mazda.getRuedas() + " ruedas.");
        System.out.println("El renault tiene: " + renault.getRuedas() + " ruedas.");
         */
        System.out.println("El mazda es de color: " + mazda.getColor() + ".");
    }
}
