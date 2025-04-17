package library.trancation;
import library.books.Book;
import library.users.Student;
import library.users.Staff;
public class Transaction {
    public void issue(Book book,Student std){
        if(book.available()){
            book.borrow();
            System.out.println("Book issued to :");
            std.display();
        }
        else {
            System.out.println("Book is Currently not Available");
        }
    }
    public void returnBooks(Book book){
        book.returnBook();
        System.out.println("Book has been returned");
    }

    public void issued(Book book,Staff st){
    if(book.available()){
            book.borrow();
            System.out.println("Book issued to :");
            st.display();
        }
        else {
            System.out.println("Book is Currently not Available");
        }
    }
    public void returnBook(Book book){
        book.returnBook();
        System.out.println("Book has been returned");
    }
}


