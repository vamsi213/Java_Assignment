package oops1;

public class Employee {

    String name;
    int id;

    public Employee(String name, int id){
        
        this.name = name;
        this.id = id;
    }

    public void Employeeinfo(){
        System.out.println("Employee name : " + this.name);
        System.out.println("Employee id: " + this.id);
    }
    
}

class FactoryEmployee extends Employee{

    int bus_no;
    boolean emp_boards;

    public FactoryEmployee(String name, int id, int bus_no, boolean emp_boards){

        super(name, id);
        this.bus_no = bus_no;
        this.emp_boards = emp_boards;
    }

    public void FactoryEmployeeInfo(){

        Employeeinfo();
        System.out.println("Employee bus no : " + this.bus_no);
        System.out.println("Employee board bus : " + (this.emp_boards ? true : false));
    }
    public static void main(String[] args) {
        
        FactoryEmployee e1 = new FactoryEmployee("Vamsi", 213, 117, false);
        e1.FactoryEmployeeInfo();
    }
}
