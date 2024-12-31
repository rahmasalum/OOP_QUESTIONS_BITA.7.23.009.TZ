public class BookTest{
    public static void main(String[]args){
        Book[] book=new Book[30];
        for(int H=0;H<30;H++){   
            book[H]=new Book("book" + H, H, "Author" + H,"publisher" + H);
            System.out.println(book[H].getBookInfo());
        }
    }
}