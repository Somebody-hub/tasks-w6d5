package model;

public class Manager extends Employee{
    private double manageBudget;

    public Manager(int id, String name, double salary, double manageBudget) {
        super(id, name, salary);
        this.manageBudget = manageBudget;
    }

    public double getManageBudget() {
        return manageBudget;
    }

    public void setManageBudget(double manageBudget) {
        this.manageBudget = manageBudget;
    }
}
