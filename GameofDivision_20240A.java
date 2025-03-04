import java.util.Scanner;

public class GameofDivision_20240A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of test cases
        
        int t = scanner.nextInt();

        // Loop through each test case
        while (t-- > 0) {
            // Get the length of the array and integer k for the current test case
            
            int n = scanner.nextInt();
            
            int k = scanner.nextInt();

            // Get the array elements
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            // Call the method to check if the first player can win
           int ans= canWin(a, k);
           if(ans==0){
            System.out.println("NO");
           }
           else{
            System.out.println("YES");
            System.out.println(ans);
           }
        }

        scanner.close();  // Close the scanner
    }

    // Method to check if the first player can win
    public static int canWin(int[] a, int k) {
        int n = a.length;

        // Try each index i as a choice for the first player
        for (int i = 0; i < n; i++) {
            boolean canWin = true;
            // Try all other indices j for the second player
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    // Check if |ai - aj| % k == 0
                    if (Math.abs(a[i] - a[j]) % k == 0) {
                        canWin = false;
                        break; // If we find any j that makes the second player win, break
                    }
                }
            }
            // If there's a valid choice for the first player to win, return the index
            if (canWin) {
                return (i+1);
                 // +1 for 1-based indexing
            }
        }

        // If no valid index is found, the second player will win
        return 0;
    }
}

