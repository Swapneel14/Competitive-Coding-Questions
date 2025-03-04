import java.util.Scanner;

public class HalloumiBoxes  {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int t= sc.nextInt();
        
        for(int i=1;i<=t;i++){

        
            int n= sc.nextInt();
            int k= sc.nextInt();
            int[] arr= new int[n];
            for(int x=0;x<n;x++){
                arr[x]=sc.nextInt();
            }
            if(k==1){
                int f=0;
                for(int m=0;m<n-1;m++){
                   if(arr[m]<=arr[m+1]){
                    f++;
                   }
                }
                   if(f==n-1){
                    System.out.println("YES");
                   }
                   else{
                    System.out.println("NO");
                   }
                  
                
            }
            else{
                System.out.println("YES");
            }
        }
    
    }
}

