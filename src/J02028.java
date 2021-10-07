import java.util.HashMap;
import java.util.Scanner;

public class J02028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long test = sc.nextLong();
        while (test-->0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long[] arr = new long[(int) (n+5)];
            for(long i=0; i<n; i++){
                arr[(int) i] = sc.nextLong();
            }
            System.out.println(
                    Solution.subarraySum(arr, n, k)>0?
                            "YES":"NO"
            );
        }
    }
}
class Solution {
    public static long subarraySum(long[] nums, long n, long k) {
        if (nums == null || nums.length == 0) return 0;
        long sum = 0;
        long count = 0;
        HashMap<Long, Long> map = new HashMap<>();
        for (long i = 0; i < n; i++) {
            sum += nums[(int) i];
            if (sum == k) {
                count++;
            }
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0L) + 1);
        }
        return count;
    }
}