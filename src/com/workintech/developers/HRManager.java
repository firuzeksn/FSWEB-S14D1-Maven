package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[5];
        this.midDevelopers = new MidDeveloper[5];
        this.seniorDevelopers = new SeniorDeveloper[5];
    }

    @Override
    public void work() {
        System.out.println(getName() + " HR Manager starts to working");
    }

    public void addEmployee(int index, JuniorDeveloper dev) {
        add(juniorDevelopers, index, dev);
    }

    public void addEmployee(int index, MidDeveloper dev) {
        add(midDevelopers, index, dev);
    }

    public void addEmployee(int index, SeniorDeveloper dev) {
        add(seniorDevelopers, index, dev);
    }

    private void add(Employee[] array, int index, Employee dev) {
        try {
            if (array[index] == null) {
                array[index] = dev;
            } else {
                System.out.println("Index is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + index);
        }
    }
}