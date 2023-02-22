package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, Integer niNumber, Integer salary, String deptName){
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public double raiseSalary() {
        return 0;
    }

    public String getDeptName() {
        return deptName;
    }
}
