package management;


public class Director extends Manager {

    private double budget;

    public Director(String name, Integer niNumber, Integer salary, String deptName, double budget){
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

}
