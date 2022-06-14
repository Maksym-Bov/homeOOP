package login;
import selects.SelectAction;
import java.util.Scanner;

public class Login {
  SelectAction  selectAction = new SelectAction();

public   void  login(String nameDB, String passwordDB ){
        Scanner scanner = new Scanner(System.in);
        int lengthPassword = 30;
        int lengthPasswordLogin = 8;
        int selectNumber;
        String passwordLogin;
        String nameLogin;
        boolean checkNamePassword = false;
        try{
        do  {
                System.out.println("Enter your name: ");
                nameLogin = scanner.next();
                System.out.println("Enter your password: ");
                passwordLogin = scanner.next();
                lengthPasswordLogin = passwordLogin.length();

            if (lengthPassword < lengthPasswordLogin){

                System.out.println("Error length password");
            }
            else {

                if(nameDB.equals(nameLogin)  &&  passwordDB.equals(passwordLogin) ){

                    checkNamePassword = false;
                    System.out.println("1.Even number");
                    System.out.println("2.Armstrong");
                    System.out.println("3.Reverse");
                    System.out.println("4.Fibonacci");
                    System.out.println("5.Replace");
                    selectNumber = scanner.nextInt();
                    selectAction.selectAction(selectNumber);

                }
                else {
                    checkNamePassword = true;
                    System.out.println("Error password or name");
                }
            }

        } while (lengthPassword < lengthPasswordLogin || checkNamePassword);}catch (Exception exception){
            exception.printStackTrace();
        }

    }
}
