import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KeepItBeautifu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int tst= sc.nextInt();
        int min =Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        
        for(int i=1;i<=tst;i++){
            List<Integer> ans = new ArrayList<>();
            int m= sc.nextInt();
            int arr[]=new int[m];
            for(int j=0;j<m;j++){
                int x= sc.nextInt();
                if(x>=max){
                    max=x;
                    ans.add(1);
                }
                else if(x<=min){
                    min=x;
                    ans.add(1);
                }
                else{
                    ans.add(0);
                }

            }
            System.out.println(ans);
        }
    }
    
}
