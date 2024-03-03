/* Problem Statement
 * Given a "2*n" floor and tiles of size "2*1", count number of ways to tile given floor using "2*1" tile. A tile can be placed horizontally or vertically.
 * 
 */
public class TilingProblem {
  public static int tilingProblem(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    return tilingProblem(n - 1)+tilingProblem(n - 2);
  }
  public static void main(String[] args) {
    System.out.println(tilingProblem(3));
  }
}
