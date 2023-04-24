/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое 
из этого списка. Collections.max()*/
import java.util.ArrayList;


public class homework3_task2 {
    public static void main (String [] args){
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(10);
        number.add(25);
        number.add(48);
        number.add(24);
        number.add(2);
        number.add(50);
        System.out.println(number);

        int min = number.get(0);
        int max = number.get(0);
        int sum = 0 ;
        for (int i = 0; i < number.size(); i++) {
            int res = number.get(i);
            if (res < min) {
             min = res;
            }
            if (res > max) {
             max = res;
            }
            sum += res;

        }
        double averages = (double) sum / number.size();
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + averages);
    }
}