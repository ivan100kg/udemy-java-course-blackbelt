package com.github.ivan100kg.javablackbelt.lesson9.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {
    static final long serialVersionUID = 3;
    String name;
    String familyName;
    String department;
    transient double salary;
    Car car;

    public Employee(String name, String familyName, String department, double salary, Car car) {
        this.name = name;
        this.familyName = familyName;
        this.department = department;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
