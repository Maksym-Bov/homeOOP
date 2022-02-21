package selects;

import action.*;

import java.util.Scanner;

public class SelectAction {

        Replace replaceLetterOnSymbol = new Replace();
        Reverse reverseStrings = new Reverse();
        Fibonacci fibonacci = new Fibonacci();
        EvenNumber evenNumber = new EvenNumber();
        Armstrong armstrong = new Armstrong();

    public void  selectAction(int numberTask){
        Scanner scanner = new Scanner(System.in);
        int selectNumber;
        if(numberTask == 1){
            evenNumber.determinesNumberEvenOrNotEven();
        }
        else if(numberTask == 4){
            fibonacci.firstFiftyNumber();
        }
        else if(numberTask == 3){
            reverseStrings.reverseString();
        }
        else if(numberTask == 5){

            replaceLetterOnSymbol.replaceLetterOnSymbol();
        }
        else if(numberTask == 2){
            armstrong.armstrongNumber();
        }
        else {
            System.out.println("Error number, can you repeat");
            selectNumber = scanner.nextInt();
            selectAction(selectNumber);
        }
    }
}
