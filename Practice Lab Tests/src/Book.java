public class Book {
    String title;
    int pages;
    static int totalBooks;
    public Book(String title,int pages){
        this.title=title;
        this.pages=pages;
        totalBooks++;
    }
    public String toString(){
        return "Book title:"+" "+this.title+" "+"pages: " + " "+this.pages;
    }
}
