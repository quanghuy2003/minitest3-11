package model;

public class Staff {
    private String name;
    private String type;
    private boolean status;
    private double salary;

    public Staff() {
    }

    public Staff(String name, String type, boolean status, double salary) {
        this.name = name;
        this.type = type;
        this.status = status;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("|%-12s|%-12s|%-12s|%-20f",getName(), getType(),isStatus(),getSalary());
    }
}
