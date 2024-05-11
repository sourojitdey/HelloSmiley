import java.util.*;

public class ExceptionExample {
    public static void main(String artg[]) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number you want....>>");
            int a = sc.nextInt();
            System.out.println("enter the number you want>>>");
            int s = sc.nextInt();
            int c = a + s;
            System.out.println("the result is" + c);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Error!!!!!!");
        } finally {
            System.out.println("thanks for visit>>>>>");
        }
    }
}
