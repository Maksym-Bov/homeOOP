package libary;

public class Books {
    private  String nameBook;
    private  String typeBook;
    private  String authorBook;


    public Books(String nameBook, String typeBook, String authorBook) {
        this.nameBook = nameBook;
        this.typeBook = typeBook;
        this.authorBook = authorBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getTypeBook() {
        return typeBook;
    }

    public void setTypeBook(String typeBook) {
        this.typeBook = typeBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }
}
