public class Library {
    Book b1;
    Book b2;
    Book b3;
    public Library(Book b1,Book b2,Book b3){
        this.b1=b1;
        this.b2=b2;
        this.b3=b3;
    }
    public Book largestBook(){
        if(this.b1.pages>this.b2.pages && this.b1.pages>this.b3.pages){
            return b1;
        }else if(this.b2.pages>this.b1.pages && this.b2.pages>this.b3.pages){
            return b2;
        }
        return b3;
    }
    public void shuffleBooks(){
        Book temp=this.b1;
        Book temp2=this.b2;
        this.b1=temp2;
        this.b2=temp;
    }
    public String toString(){
        return "Book 1:" +" "+this.b1+"Book 2:" +" "+this.b2+"Book 3:" +" "+this.b3;
    }
}
