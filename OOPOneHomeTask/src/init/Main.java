package init;

import libary.Books;
import libary.Reader;

public class Main {

    public static void main (String[] args){

        Reader reader = new Reader();

        Books books1 = new Books("Ring","Толкин");
        Books books3 = new Books("Dog","Альт");
        Books books4 = new Books("English","Борн");
        System.out.println("Take books");
        reader.takeBook(5);
        reader.takeBook("Ring","Dog","English");
        reader.takeBook(books1,books3,books4);
        System.out.println("Return books");
        reader.returnBook(1);
        reader.returnBook("Ring","Dog","English");
        reader.returnBook(books1,books3,books4);

    }

}
