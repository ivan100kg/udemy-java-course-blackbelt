package com.github.ivan100kg.javablackbelt.lesson10;

public class PrintfEx {
    static void employeeInfo(Employee emp) {
        // %[flags][width][.precision]datatype_specifier
        System.out.printf("%03d\t%-7s\t%,.2f\n", emp.id, emp.name, emp.salary * (1 + emp.bonus));
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Ivan", "Bond", 78000, 14);
        Employee emp2 = new Employee(2,"Egor", "Crud", 12000, 7);
        Employee emp3 = new Employee(3,"Ilya", "Dry", 32000, 12);

        employeeInfo(emp1);
        employeeInfo(emp2);
        employeeInfo(emp3);

        String s = String.format("%03d\t%-3s\t%,.2f\n", 1, "Hi", 3.14);
        System.out.println(s);
    }
}


class Employee {
    int id;
    String name;
    String surname;
    double salary;
    double bonus;

    public Employee(int id, String name, String surname, double salary, double bonus) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonus = bonus;
    }
}