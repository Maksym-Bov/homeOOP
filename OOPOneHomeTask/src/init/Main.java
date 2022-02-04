package init;

import libary.Books;
import libary.Reader;

public class Main {

    public static void main (String[] args){

        Reader reader = new Reader("Олег","Петров","Адамович",1,"Техник","",3809855);
        Books books1 = new Books("Ring","Приключения","Толкин");
        Books books2 = new Books("Help","Энциклопедия","Барабаров");
        Books books3 = new Books("Dog","Энциклопедия","Альт");
        Books books4 = new Books("English","Словарь","Борн");
        Books books5 = new Books("Coin","Приключения","Колт");
        Books books6 = new Books("Bit","Словарь","Рик");

    }

}
