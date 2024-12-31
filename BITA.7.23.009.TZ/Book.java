public class Book{
    private String  BookName;
    private int ISBN;
    private String AuthorName;
    private String Publisher;
    public Book(String BookName,int ISBN,String AuthorName,String Publisher){
        this.BookName=BookName;
        this.ISBN=ISBN;
        this.AuthorName=AuthorName;
        this.Publisher=Publisher;
    }
    public void mutatorBookName(String BookName){
        this.BookName=BookName;
    }
    public void mutatorISBN(int ISBN){
        this.ISBN=ISBN;
    }
    public void mutatorAuthorName(String AuthorName){
        this.AuthorName=AuthorName;
    }
    public void mutatorPublisher(String Publisher){
        this.Publisher=Publisher;
    }
    public String accessorBookName(){
        return BookName;
    }
    public int accessorISBN(){
        return ISBN;
    }
    public String accessorAuthorName(){
        return AuthorName;
    }
    public String accessorPublisher(){
        return Publisher;
    }
    public String getBookInfo(){
        return "The book name is " + BookName + " ISBN number is " + ISBN + " THe Author Name is " + AuthorName + "and the Publisher " + Publisher;
    }
}