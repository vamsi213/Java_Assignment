public class Emp {
    private String name;
    private double salary;
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        salary = salary;
    }
    public Emp(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Emp(Emp source){
        this.name = source.name;
        this.salary =source.salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
