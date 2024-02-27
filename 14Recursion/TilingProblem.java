/* Problem Statement
 * Given a "2*n" floor and tiles of size "2*1", count number of ways to tile given floor using "2*1" tile. A tile can be placed horizontally or vertically.
 * 
 */
public class TilingProblem {
  public static int tilingProblem(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    int fnm1 = tilingProblem(n - 1);
    int fnm2 = tilingProblem(n - 2);
    int totalWays = fnm1 + fnm2;
    return totalWays;
  }
  public static void main(String[] args) {
    System.out.println(tilingProblem(4));
  }
}