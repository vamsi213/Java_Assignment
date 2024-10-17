package oops1;

public class Student {

    private int admin_no;
    private String stu_name;
    private String course_joined;
    private double fees_paid;

    private final double java_fee = 10000;
    private final double python_fee = 7500; 

    public Student(int admin_no, String stu_name, String course_joined, double fees_paid) {
        this.admin_no = admin_no;
        this.stu_name = stu_name;
        this.course_joined = (course_joined == null || course_joined.isEmpty()) ? "JAVA": course_joined.toUpperCase();
        this.fees_paid = fees_paid;
    }

    public Student(int admin_no, String stu_name) {
        this(admin_no, stu_name, "JAVA", 0);
    }

    public double getTotalFee(){
        if (course_joined.equals("JAVA")){
            return java_fee;
        }
        else if (course_joined.equals("python")){
            return python_fee;
        }
        else{
            return 0;
        }
    }

    public double getDue(){
        return getTotalFee() - fees_paid;
    }

    public double getFeesPaid(){
        return fees_paid;
    }

    public void payment(double amount){

        if (amount > 0) {
            fees_paid += amount;
            System.out.println("Total fees paid now: " + fees_paid);
        }
        else{

            System.out.println("Invalid Payment");
        }


    }

    public static void main(String[] args) {
        
        Student s1 = new Student(213,"vamsi", "python", 7500);
        System.out.println(s1.admin_no + " "  + s1.course_joined + " " + s1.fees_paid);

        Student s2 = new Student(101,"Krishna");
        System.out.println(s2.course_joined + " " + s2.getTotalFee());
    }


    
    
}
