import java.util.*;

public class InbuiltSort {
  public static void printArray(int arr[]){
    for(int i= 0; i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String[] args) {
    int arr[] = { 32, 21, 21, 2, 21, 2, 4, };
    Arrays.sort(arr);
    printArray(arr);
  }

}
