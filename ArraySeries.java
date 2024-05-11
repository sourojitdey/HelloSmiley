import java.util.*;

public class ArraySeries {
         public static void main(String args[]) {
                  Scanner sc = new Scanner(System.in);
                  System.out.println("enter the size::");
                  int size = sc.nextInt();
                  System.out.println("enter...." + size + "....elements::");
                  int sou[] = new int[size];
                  for (int i = 0; i < size; i++) {
                           sou[i] = sc.nextInt();
                  }
                  for (int i = 0; i < sou[i]; i++) {
                           System.out.println(" " + sou[i]);
                  }
                  int max = 0;
                  for (int i = 0; i < size; i++) {
                           if (sou[i] > max) {
                                    System.out.println("the max number is::" + max);
                           }
                  }
         }
}
