import java.util.*;

public class Sum {
  public static void sum(int a, int b) {
    int sum = a + b;
    System.out.println("Sum is:-  " + sum);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sum(a, b);
    sc.close();
  }
}
