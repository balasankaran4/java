package library.users;
public class Student {
    private String name;
    private int roll;

    public Student(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    public void display(){
        System.out.println("Student name :"+name);
        System.out.println("Roll Number:"+roll);
    }
}
