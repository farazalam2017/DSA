/* Question 2 : Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your
method. */
import java.util.*;
public class ProblemOne {
  public static boolean isEven(int num) {
    if (num % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to check for even or odd:- ");
    int num= sc.nextInt();
    System.out.println(isEven(num));
    sc.close();
  }
}
