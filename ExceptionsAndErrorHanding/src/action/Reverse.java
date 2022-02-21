package action;
import java.util.Scanner;

public class Reverse {
/*(Напишите программу для переворачивания строки,изменив расположение символов в строке
задом наперёд без использования встроенных в String функций.*/
    public  void reverseString (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text for reverse, please");
        String text = scanner.next();
        String result = "";
        for(int i = 0; i < text.length(); i++) {
            result = text.charAt(i) + result;
        }
        System.out.print(result);
    }
}
