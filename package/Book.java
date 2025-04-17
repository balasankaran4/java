package library.books;
public class Book {
    private String title;
    private String author;
    private boolean available;
    private int copies=10;

    public Book (String title,String author){
        this.title=title;
        this.author=author;
    }
    public boolean available(){
        if(copies==0){
            return false;
        }
        else{
            return true;
        }
    }
    public void borrow(){
    copies =copies-1;
    }
    public void returnBook(){
        copies+=copies;
    }
    public void display(){
        System.out.println("Title  :"+title);
        System.out.println("Author :"+author);
        System.out.println("Available:"+available);
        System.out.println("Copies Avgailable  :"+copies);
    }
}