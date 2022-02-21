package action;

public class Fibonacci {
/*Рассчитать первых 20 чисел Фиббоначии вывести их на экран
* */
    public  void firstFiftyNumber (){
        int a = 0,b = 1,c;
        for(int i = 3; i < 23; i++){
            c = a + b;
            System.out.println(c);
            a = b ;
            b = c;
        }

    }
}
