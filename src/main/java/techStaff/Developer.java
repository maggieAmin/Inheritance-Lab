package techStaff;

import staff.Employee;

public class Developer extends Employee {
    private String name;
    private Integer niNumber;
    private double salary;

    public Developer(String name, Integer niNumber, double salary){
        super(name, niNumber, salary);
    }


//    public String getName() {
//        return this.name;
//    }
//
//    public double getSalary() {
//        return this.salary;
//    }
//
//    public Integer getNiNumber() {
//        return this.niNumber;
//    }
}
