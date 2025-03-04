import java.util.Scanner;

public class MakeEqualAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tst = sc.nextInt();

        for (int i = 1; i <= tst; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];

            // Reading the array elements
            for (int k = 0; k < n; k++) {
                a[k] = sc.nextInt();
            }

            // Initializing pointers
            int low = 0;
            int high = n - 1;

            // Traverse from both ends of the array
            while (low <= high) {
                // If a[low] is the same as a[low+1], move low forward
                if (low < high && a[low] == a[low + 1]) {
                    low++;
                }
                // If a[high] is the same as a[high-1], move high backward
                else if (low < high && a[high] == a[high - 1]) {
                    high--;
                }
                // If a[low] is not equal to a[low+1] and a[high] is not equal to a[high-1],
                // break
                else {
                    break;
                }
            }

            // Output the result based on the updated pointers
            if (low >= high) {
                System.out.println(0);
            } else if (a[low] == a[high]) {
                System.out.println(high - low - 1);
            } else if (low == 0 || high == n - 1) {
                System.out.println(high - low);

            } else if (high == low + 1) {
                int ans = Math.max(low, n - high);
                System.out.println(n - ans);

            } else {
                int ans = Math.max(low, n - high);
                System.out.println(n - ans - 1);
            }
        }

        sc.close();
    }
}
