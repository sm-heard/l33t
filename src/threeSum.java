import java.util.ArrayList;
import java.util.List;

public class threeSum {

  public static void main(String[] args) {
    threeSum(new int[]{-1, 0, 1, 2, -1, -4});
  }

  public static List<List<Integer>> threeSum(int[] nums){

    ArrayList uniqueSums = new ArrayList<ArrayList<Integer>>();

    for (int i = 2; i < nums.length; i++) {
      for (int j = 1; j < i; j++) {
        for (int k = 0; k < j; k++) {
          if (nums[k] + nums[j] + nums[i] == 0) {
            ArrayList<Integer> sums = new ArrayList<>();
            sums.add(nums[k]);
            sums.add(nums[j]);
            sums.add(nums[i]);
            uniqueSums.add(sums);
          }
        }
      }
    }
    System.out.println(uniqueSums);

    return uniqueSums;
  }
}
