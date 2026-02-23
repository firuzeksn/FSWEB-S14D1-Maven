package com.workintech.developers;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() + 10000);
        System.out.println(getName() + " senior developer starts to working");
    }
}