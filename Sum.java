import java.util.*;

class Sum {
         public static void main(String arg[]) {
                  Scanner sc = new Scanner(System.in);

                  System.out.println("enter the number:");
                  int number = sc.nextInt();
                  System.out.println("enter  " + number + "  elements");
                  int ar[] = new int[number];
                  for (int i = 0; i < number; i++) {
                           ar[i] = sc.nextInt();
                  }
                  int sum = 0;
                  for (int i = 0; i < number; i++) {
                           sum = sum + ar[i];
                  }
                  System.out.println("the result is: " + sum);

         }
}