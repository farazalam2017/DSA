public class Merge {
  public static void MergeSort(int arr[], int si, int ei) {
    if (si >= ei) {
      return;
    }
    int mid = si + (ei - si) / 2;
    MergeSort(arr, si, mid);//left part
    MergeSort(arr, mid + 1, ei);//right part
    merge(arr, si, mid, ei);
  }

  public static void merge(int arr[], int si, int mid, int ei) {
    //left(0,3)=4, right(4,6)=3-> 6-0+1, as array is zero based
    int temp[] = new int[ei - si + 1];
    int i = si;//left part
    int j = mid + 1;//right part
    int k = 0;//temp arr
    while (i <= mid && j <= ei) {
      if (arr[i] < arr[j]) {
        temp[k] = arr[i];
        i++;
      } else {
        temp[k] = arr[j];
        j++;
      }
      k++;
    }
    //if something left in left part
    while (i <= mid) {
      temp[k++] = arr[i++];
    }
    //right part
    while (j <= ei) {
      temp[k++] = arr[j++];
    }
    //copy temp to original array
    for (k = 0, i=si; k < temp.length; k++, i++) {
      arr[i] = temp[k];
    }
  }
  public static void printArray(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int arr[] = { 6, 3, 9, 5, 2, 8 };
    MergeSort(arr, 0, arr.length - 1);
    printArray(arr);
  }
}
