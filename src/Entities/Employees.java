package Entities;

public class Employees {
    private Integer id;
    private String Name;
    private Double salary;
    public Employees(Integer id, String Name, Double salary) {
        this.id = id;
        this.Name = Name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100.0;
    }

    @Override
    public String toString() {
        return id
                + ", "
                + Name
                + ", "
                + String.format("%.2f", salary);
    }
}
