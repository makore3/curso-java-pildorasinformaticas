public class Coche {

    // Constructor Method
    public Coche() {
        ruedas = 4;
        color = "gris";
        pesoBase = 1350.25;
        peso = pesoBase;
        precioBase = 15650.25;
        precio = precioBase;
    }

    // Variables
    private double ancho;
    private double alto;
    private double peso;
    private double pesoBase;
    private int ruedas;
    private String color;
    private boolean climatizador;
    private boolean asientosCuero;
    private double precioBase;

    // Methods
    public String isClimatizador() {
        if (climatizador) {
            return "El coche incorpora climatizador";
        } else {
            return "El coche incorpora aire acondicionado";
        }
    }

    public void setClimatizador(String climatizador) {
        if (climatizador.equalsIgnoreCase("si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
        setPrecio();
        setPeso();
    }

    public String isAsientosCuero() {
        if (climatizador) {
            return "El coche tiene asientos de cuero";
        } else {
            return "El coche no tiene asientos de cuero";
        }
    }

    public void setAsientosCuero(String asientosCuero) {
        if (asientosCuero.equalsIgnoreCase("si")) {
            this.asientosCuero = true;
        } else {
            this.asientosCuero = false;
        }
        setPrecio();
        setPeso();
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecio() {
        return precio;
    }

    private void setPrecio() {
        if (asientosCuero) {
            precioBase += 3500;
        }
        if (climatizador) {
            precioBase += 3250.20;
        }
        precio = precioBase;
    }

    private double precio;

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

    private void setPeso() {
        if (asientosCuero) {
            pesoBase += 50;
        }
        if (climatizador) {
            pesoBase += 70;
        }
        peso = pesoBase;
    }

    public double getPesoBase() {
        return pesoBase;
    }

    public void setPesoBase(double pesoBase) {
        this.pesoBase = pesoBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRuedas(int ruedas) {
        if (ruedas < 3 || ruedas > 8) {
            System.out.println("El nro de ruedas no puede ser ese");
        } else {
            this.ruedas = ruedas;
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
