package collections.arraylist;
import java.util.ArrayList;
import java.util.List;

public class example1 {
    public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(3);
        numbers.add(5);
        numbers.add(9);
        for(Integer number:numbers) {
            System.out.print(number);
        }
        numbers.remove(3);
        for(Integer number:numbers) {
            System.out.println(number); //if you want to remove the element from middle or first index the speed will be decreased
        }
    }
}
