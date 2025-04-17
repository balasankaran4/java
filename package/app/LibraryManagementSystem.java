package app;
import library.books.Book;
import library.users.Student;
import library.users.Staff;
import library.trancation.Transaction;
public class LibraryManagementSystem {
    public static void main(String []args){
        Book book1=new Book("java Programing","Herbert Schildt");
        Book book2=new Book("Object Oriented programing","Herbet");
        Student std=new Student("Alice",1001);
        Staff st=new Staff("Gopal","CSBS","ksrct004");
        Transaction tran=new Transaction();

        book1.display();
        tran.issue(book1,std);
        book1.display();

        tran.returnBook(book2);
        book2.display();

        book2.display();
        tran.issued(book2,st);
        book1.display();

    }
}
