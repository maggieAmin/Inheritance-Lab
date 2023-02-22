package staff;

public abstract class Employee {
    private String name;
    private Integer niNumber;
    private double salary;



    public Employee(String name, Integer niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public Integer getNiNumber() {
        return this.niNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public double raiseSalary(double amount){
        return this.salary += amount;
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
