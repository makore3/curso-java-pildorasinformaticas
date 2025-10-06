public class UsoCoches {

    public static void main(String[] args) {

        Coche renault = new Coche();

        renault.alto = 1520.3;
        renault.arrancar();
        renault.setPeso(1250.3);

        Coche mazda = new Coche();

        mazda.setColor("blanco");
        mazda.setRuedas(3);
        mazda.girar();
        mazda.setPeso(1350.2);

        /*
        System.out.println("El mazda tiene: " + mazda.getRuedas() + " ruedas.");
        System.out.println("El renault tiene: " + renault.getRuedas() + " ruedas.");
         */
        System.out.println("El mazda es de color: " + mazda.getColor() + ".");
    }
}
