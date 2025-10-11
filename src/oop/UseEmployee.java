package oop;

import java.util.Date;
import java.util.GregorianCalendar;

public class UseEmployee {
    public static void main(String[] args) {

        /*
        Employee employee1 = new Employee("Paco Gómez", 85000, 1990, 12,17);
        Employee employee2 = new Employee("Ana Pérez", 90000, 2001, 4,8);
        Employee employee3 = new Employee("María Díaz", 70000, 2005, 7,23);

        employee1.increaseSalary(5);
        employee2.increaseSalary(5);
        employee3.increaseSalary(5);
        System.out.println("Nombre: " + employee1.getName() + " Salario: " + employee1.getSalary() + " Fecha de alta en la empresa: " + employee1.getContractStart());
        System.out.println("Nombre: " + employee2.getName() + " Salario: " + employee2.getSalary() + " Fecha de alta en la empresa: " + employee2.getContractStart());
        System.out.println("Nombre: " + employee3.getName() + " Salario: " + employee3.getSalary() + " Fecha de alta en la empresa: " + employee3.getContractStart());
        */

        Employee[] myEmployees = new Employee[3];

        myEmployees[0] = new Employee("Paco Gómez", 85000, 1990, 12,17);
        myEmployees[1] = new Employee("Ana Pérez", 90000, 2001, 4,8);
        myEmployees[2] = new Employee("María Díaz", 70000, 2005, 7,23);

        /*
        for(int i = 0; i < myEmployees.length; i++) {
            myEmployees[i].increaseSalary(5);
        }
         */

        // For Each
        for(Employee e: myEmployees) {
            e.increaseSalary(5);
        }

        /*
        for(int i = 0; i < myEmployees.length; i++) {
            System.out.println("Nombre: " + myEmployees[i].getName() + " Salario: " + myEmployees[i].getSalary() + " Fecha de alta en la empresa: " + myEmployees[i].getContractStart());
        }
         */

        // For Each
        for(Employee e: myEmployees) {
            System.out.println("Nombre: " + e.getName() + " Salario: " + e.getSalary() + " Fecha de alta en la empresa: " + e.getContractStart());
        }
    }
}

class Employee {

    // Constructor Method
    public Employee(String nam, double sal, int year, int month, int day) {
        name = nam;
        salary = sal;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        contractStart = calendar.getTime();
    }

    // Methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getContractStart() {
        return contractStart;
    }

    public void increaseSalary(double percentage) {
        double increment = salary * percentage / 100;
        salary += increment;
    }

    // Variables
    private String name;
    private double salary;
    private Date contractStart;
}
