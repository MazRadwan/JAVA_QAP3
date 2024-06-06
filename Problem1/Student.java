package Problem1;

public class Student extends Person{
    protected String myIdNum;
    protected double myGPA;

    public Student(String name, int age,String gender, String idNum, double gpa){
        // use the super class' constructor
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }
    public String getIdNum(){
        return myIdNum; 
    }
    public void setIdNum(String idNum){
        myIdNum = idNum;
    }
    public double getGPA(){
        return myGPA;
    }
    public void setGPA(double gpa){
        myGPA = gpa;
    }
    public String toString(){
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
    
}
