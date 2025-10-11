package oop;

public class Tests {

    public static void main(String[] args) {

        final Employees worker1 = new Employees("Jorge");
        final Employees worker2 = new Employees("Ricardo");

        worker1.setDepartment("Human Resources");
        // worker2.setName("Tilín");

        System.out.println(worker1.toString());
        System.out.println(worker2.toString());
    }
}

class Employees{

    // Constructor Method
    public Employees(String name) {
        this.name = name;
        department = "Operations";
    }

    // Methods
    public void setDepartment(String department) {
        this.department = department;
    }

    /*
    public void setName(String name) {
        this.name = name;
    }
     */

    @Override
    public String toString() {
        return "El nombre es: " + name + " y la sección es: " + department;
    }

    // Variables
    private final String name;
    private String department;
}
