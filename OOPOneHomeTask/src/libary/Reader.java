package libary;

import java.util.Arrays;

public class Reader {

    private String firstName = "Олег" ;
    private String lastName = "Петров";
    private String middleName = "Адамович";
    private int numberReader = 1;
    private String faculty = "Техник";
    private String birthdayReader = "22 січня 1998" ;
    private int phoneNumberReader = 3809855 ;

    private String getFirstLetter(String word){
        return word.substring(0,1) + '.';
    }
    String  firstLetterLastName = getFirstLetter(lastName);
    String  firstLetterMiddleName = getFirstLetter(middleName);

    public void takeBook(int countBook){
        System.out.println(firstName + " " + firstLetterLastName  + firstLetterMiddleName + " " + " взял книги:  " + countBook);
    }
    public void takeBook(String...booksName){
        String arr = Arrays.toString(booksName);
        arr = arr.toString().replaceAll("^\\[|]$", "");
        System.out.println(firstName + " " + firstLetterLastName  + firstLetterMiddleName + " " + " взял книги:  " + arr );
    }

    public void takeBook(Books books1, Books books3, Books books4) {
        String nameBook = books1.getNameBook() + ", " + books3.getNameBook() + ", " + books4.getNameBook();
        System.out.println(firstName + " " + firstLetterLastName  + firstLetterMiddleName + " " + " взял книги:  " + nameBook);
    }
    public void returnBook(int countBook){
        System.out.println(firstName + " " + firstLetterLastName  + firstLetterMiddleName + " " + " взял книги:  " + countBook);
    }
    public void returnBook(String...booksName){
        String arr = Arrays.toString(booksName);
        arr = arr.toString().replaceAll("^\\[|]$", "");
        System.out.println(firstName + " " + firstLetterLastName  + firstLetterMiddleName + " " + " взял книги:  " + arr );
    }

    public void returnBook(Books books1, Books books3, Books books4) {
        String nameBook = books1.getNameBook() + ", " + books3.getNameBook() + ", " + books4.getNameBook();
        System.out.println(firstName + " " + firstLetterLastName  + firstLetterMiddleName + " " + " взял книги:  " + nameBook);
    }
}
