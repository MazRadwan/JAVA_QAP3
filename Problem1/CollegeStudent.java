package Problem1;

public class CollegeStudent extends Student{
    private String major; //Electical Engineering, Communications, undecided, etc.
    private int year; // FROSH=1, SOPH=2, JUNIOR=3, SENIOR=4

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major){
        super(name, age, gender, idNum, gpa); // inheretance from Student class
        this.year = year;
        this.major = major;
    }
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String toString(){
        return super.toString() + ", year: " + year + ", major: " + major;
    }

    
}
