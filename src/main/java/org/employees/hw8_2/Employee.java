package org.employees.hw8_2;

public class Employee {
    protected String name;
    protected int baseSalary;
//    public static final int MINIMAL_AGE = 18;
    public static final int MINIMAL_AGE;
    public static final int MAX_AGE;
    public static final String WARNING;
    static {
        MINIMAL_AGE = 18;
        MAX_AGE = 65;
        WARNING = "Age of the employee can be from " + MINIMAL_AGE + " to " + MAX_AGE;
    }

    public Employee (String name, int baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return baseSalary;
    }
    public int getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
}
