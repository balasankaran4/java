package library.users;
public class Staff {
    private String name;
    private String Dept;
    private String Id;

    public Staff(String name,String Dept,String Id){
        this.name=name;
        this.Dept=Dept;
        this.Id=Id;
    }

    public void display(){
        System.out.println("Name       :"+name);
        System.out.println("Id         :"+Id);
        System.out.println("Department :"+Dept);
    }

}
