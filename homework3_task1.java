//Пусть дан произвольный список целых чисел, удалить из него четные числа.
import java.util.ArrayList;
import java.util.Random;

public class homework3_task1 {
    public static void main (String [] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(50));
        }
    System.out.println("Произвольный список целых чисел: \n " + numbers);
    
    for (int i = numbers.size() - 1; i >= 0; i-- ) {
        int N = numbers.get(i) % 2;
        if (N == 0) {
            numbers.remove(i);
            
        }
    }
        System.out.println("Список без четных чисел : \n " + numbers);
} 
}