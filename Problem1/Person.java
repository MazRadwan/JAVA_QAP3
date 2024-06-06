package Problem1;

/**
 * Person
 */
public class Person {

    protected String myName;
    protected int myAge;
    protected String myGender;

    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }
    public String getName() {
        return myName;
    }
    public void setName(String name) {
        myName = name;
    }
    public int getAge() {
        return myAge;
    }
    public void setGender(String gender){
        myGender = gender;
    }
    public String getGender(){
        return myGender;
    }
    public String toString() {
        return myName + ",  age: " + myAge + ", gender: " + myGender;
    }
}