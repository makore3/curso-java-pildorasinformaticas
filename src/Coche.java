public class Coche {

    // Variables
    private double ancho;
    private double alto;
    private double peso;

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

    public void setColor(String color) {
        this.color = color;
    }

    private String color;
    private int ruedas;

    // Métodos
    public void setRuedas(int r) {
        if(r<3 || r>4) {
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
