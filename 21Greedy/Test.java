public class Test {
  public static boolean searchMatrix(int matrix[][], int key) {
    int i = 0;
    int row = matrix.length;
    int col = matrix[0].length - 1;
    while (i < row && col >= 0) {
      if (matrix[i][col] == key) {
        
      } else if (matrix[i][col] > key) {
        col--;
      } else {
        i++;
      }
    }
  }
  public static void main(String[] args) {
    int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
    int key = 7;
    searchMatrix(arr, key);
  }
}