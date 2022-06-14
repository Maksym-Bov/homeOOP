package action;


import java.awt.print.PrinterException;
import java.util.Scanner;

public class Armstrong {
    /*
    Число Армстронга это число, значение которого равно сумме цифр, из
которых оно состоит, возведенных в степень, равную количеству цифр в этом числе. Как пример - число 371:
371 = 3*3*3 + 7*7*7 + 1*1*1 = 27 + 343 + 1 = 371
    * */
    public void armstrongNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for verification Armstrong number");
        String response = null;
        try {
            int number = scanner.nextInt();
            int numberCount =number;
            int firstNumber = number;
            int count = 0, result = 0;
            while (numberCount != 0) {
                count++;
                numberCount /= 10;
            }
            for(int i = 0; i <= count; i++){
                int num = number % 10;
                result += Math.pow(num,count);
                number /= 10;
            }
            response = (result == firstNumber) ? "Number " + firstNumber + " is Armstrong" : "Number " + firstNumber + " is not Armstrong";
            System.out.println(response);
        }catch (Exception exception){
            exception.printStackTrace();
        }
        finally {
            System.out.println(response);
        }

    }
}
