

class Book{
    private String title;
    private String author;
    private double price;
    Book(){
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
    Book(String title,String author){
        this();
        this.title = title;
        this.author = author;
    }
    Book(String title,String author,double price){
        this(title,author);
        this.price = price;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(double price){
        if(price<0){
            System.out.println("Invalid price");
            return;
        }
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void printBook(){
        System.out.println("Title: "+title+", Author: "+author+", price: "+price);
    }
}


public class BookTest {
    public static void main(String [] args){
        Book onebook = new Book();
        onebook.printBook();
        Book secondbook = new Book("howtorich","Rabindranath");
        secondbook.printBook();
        Book thirdbook = new Book("Tregic genius","Shakspeare",209.5);
        thirdbook.printBook();
    }
}
