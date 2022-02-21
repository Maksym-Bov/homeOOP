package init;
import login.Login;

public class Main {
    public static void main(String[] args){
        Login login = new Login();
        String passwordDB = "1";
        String nameDB = "Maksym";
        try{
            login.login(nameDB,passwordDB);
        } catch (Exception e) {
            e.printStackTrace();
        }
        login.login(nameDB,passwordDB);
    }

}

