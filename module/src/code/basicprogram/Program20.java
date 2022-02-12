package code.basicprogram;

public class Program20 {
    public static void main(String[] args) {
        int i =0;
        while(i++<5){
            System.out.println(i);
        }
        int endPoint = i-1;
        System.out.println("postfix loop is runs " + endPoint + " times");
         i =0;
         while (++i<5) {
             System.out.println(i);
         }
         endPoint = i -1;
        System.out.println("prefix loop is runs " + endPoint + " times");
    }
}
