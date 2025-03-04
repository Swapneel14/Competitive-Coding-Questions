import java.util.Scanner;

public class CoinGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int tst= sc.nextInt();
        for(int i=1;i<=tst;i++){
            int len= sc.nextInt();
            StringBuilder game= new StringBuilder();
            for(int j=0;j<len;j++){
                char ch= sc.next().charAt(0);
                

                game.append(ch);
            }
            char t='U';
            int u = occur(game,t);
            if(u%2==0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        sc.close();
    }
    public static int occur(StringBuilder sb,char target){
        int count=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)==target){
                count++;
            }
        }
        return count;
    }

}
