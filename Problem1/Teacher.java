package Problem1;

public class Teacher extends Person{
    private String subject; //computer science, chemistry English, etc.
    private double salary;

    public Teacher(String name, int age, String gender, String subject, double salary){
        super(name, age, gender); // inheretance from Person class
        this.subject = subject;
        this.salary = salary;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String toString(){
        return super.toString() + ", subject: " + subject + ", salary: " + salary;
    }
}
