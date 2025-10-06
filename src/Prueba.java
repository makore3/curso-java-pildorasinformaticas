public class Prueba {

    public static void main(String[] args) {
        // Ejemplo Tutor
        Clase1 obj=new Clase1();

        int num=5;

        obj.duplicar(num);

        System.out.println("Valor de num= " + num);
    }
}

class Clase1{

    void duplicar(int x) {
        x=x*2;

        System.out.println("Valor de x= " + x);
    }
}
