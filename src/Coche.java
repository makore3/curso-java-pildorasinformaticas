public class Coche {

    // Método constructor
    public Coche() {
        ancho = 5;
        alto = 5;
        peso = 5;
        ruedas = 4;
        color = "gris";
    }

    // Variables
    private double ancho;
    public double alto;
    private double peso;
    private int ruedas;
    private String color;

    // Métodos
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    public void setRuedas(int r) {
        if(r<3 || r>8) {
            System.out.println("El nro de ruedas no puede ser ese");
        } else {
            ruedas = r;
        }
    }

    public int getRuedas() {
        return ruedas;
    }

    void arrancar() {

    }
    void frenar() {

    }
    void girar() {

    }


}
