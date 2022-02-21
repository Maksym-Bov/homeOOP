package action;

import java.util.Scanner;

public class Replace {
/*(
Написать программу, которая заменяет в исходной строке все буквы а на @.
Буквы о на ноль. Выводит новую строку на экран.
Добавить обработку длины строки,максимальная длина 30 символов.
Строка может состоять из нескольких слов и любых символов*/
    public  void replaceLetterOnSymbol(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text for replace  o = 0 and a = @, please");
        String text = scanner.next();
        text = (text.length() <= 30) ? text.replace('o','0').replace('a','@'):"Length text more 30";
        System.out.println(text);
    }
}
