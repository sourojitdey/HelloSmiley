import java.util.*;

public class ReverseArray {
         public static void main(String args[]) {
                  Scanner sc = new Scanner(System.in);
                  System.out.println("enter the size");
                  int size = sc.nextInt();
                  System.out.println("enter.." + size + "..elements");
                  int numbers[] = new int[size];
                  for (int i = 0; i < size; i++) {
                           numbers[i] = sc.nextInt();
                  }
                  System.out.println("elemnts are::");
                  for (int num : numbers) {
                           System.out.println(num + " ");
                  }
                  int length = numbers.length;
                  for (int i = 0; i < length / 2; i++) {
                           int temp = numbers[i];
                           numbers[i] = numbers[length - i - 1];
                           numbers[length - i - 1] = temp;
                  }
                  System.out.println("reversed Array::");
                  for (int num : numbers) {
                           System.out.println(num + " ");
                  }

         }

}
